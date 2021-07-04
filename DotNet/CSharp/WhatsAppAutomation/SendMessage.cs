using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using System.Threading;

namespace WhatsAppAutomation
{
    class SendMessage
    {
        private int _contactNum;
        private readonly ChromeDriver _webDriver = new ChromeDriver();

        public void Send(List<ContactInfo> contactLst, ref System.Windows.Forms.Label lblCounter)
        {
            _webDriver.Manage().Timeouts().ImplicitWait = TimeSpan.FromSeconds(10);

            //open WhatsApp web
            _webDriver.Navigate().GoToUrl("https://web.whatsapp.com/");

            //wait till user scan QR code
            tryAgain:
            try
            {
                Console.Beep();

                //search for QR code & if not found jump to catch block, not found mean that user scan QR code
                _webDriver.FindElement(By.XPath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div[2]/div/canvas"));

                goto tryAgain;
            }

            catch (Exception)
            {
                foreach (var info in contactLst)
                {
                    if(info.ContactName == "" || info.MsgTxt == "")
                        continue;
                    SendMsgByContact(info.ContactName, info.MsgTxt);
                    
                    if(info.PhotoPath == "")
                        continue;
                    SendPhotoByContact(info.PhotoPath);
                    
                    lblCounter.Text = _contactNum + @" From " + contactLst.Count;
                }
            }
        }


        //method to send message by each person
        private void SendMsgByContact(string contactName, string msg)
        {
            try
            {
                //search for name
                var txtSearch = _webDriver.FindElement(By.XPath("//*[@id=\"side\"]/div[1]/div/label/div/div[2]"));
                txtSearch.SendKeys("");
                txtSearch.SendKeys(contactName);
                //press Enter
                txtSearch.SendKeys(Keys.Enter);

                //write message
                var txtMsgBox = _webDriver.FindElement(By.XPath("//*[@id=\"main\"]/footer/div[1]/div[2]/div/div[2]"));
                txtMsgBox.SendKeys(msg);
                //press Enter
                txtMsgBox.SendKeys(Keys.Enter);

                //increase contact_num
                _contactNum++;
            }

            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
        }


        //method send photos
        private void SendPhotoByContact(string photoPath)
        {
            try
            {
                //open menu of sending types
                _webDriver.FindElement(By.XPath("//*[@id=\"main\"]/footer/div[1]/div[1]/div[2]/div/div/span")).Click();
                
                //click on photo send icon
                _webDriver.FindElement(By.XPath("//*[@id=\"main\"]/footer/div[1]/div[1]/div[2]/div/span/div/div/ul/li[1]/button/span")).Click();
                
                //select photos by path
                CreateCodeFile(photoPath);

                //click send green arrow
                _webDriver.FindElement(By.XPath("//*[@id=\"app\"]/div/div/div[2]/div[2]/span/div/span/div/div/div[2]/span/div/div/span")).Click();
            }

            catch (Exception e)
            {
                Console.WriteLine(e);
            }
        }

        //method that create file.au3 in run time to handle local popup window that send photo
        private void CreateCodeFile(string path)
        {
            var strCode = new[]
            {
                "ControlFocus(\"Open\", \"\", \"Edit1\")",
                "ControlSetText(\"Open\", \"\", \"Edit1\", \"" + path + "\")",
                "ControlClick(\"Open\", \"\", \"Button1\")"
            };

            try
            {
                //create new file with extension au3
                var fs = new StreamWriter("SendPhoto.au3");

                //write code line by line
                foreach (var s in strCode)
                {
                    fs.WriteLine(s);
                }

                //save file
                fs.Close();

                //run code file
                Thread.Sleep(10000);
                new Process {StartInfo = new ProcessStartInfo("SendPhoto.au3") {UseShellExecute = true}}.Start();

                //delete file after process complete
                Thread.Sleep(10000);
                File.Delete("SendPhoto.au3");
            }

            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
        }
    }
}