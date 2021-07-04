Imports System.Net.Mail

Public Class MainForm
    Dim editID, delID, afterDelSel As Integer
    Dim editUser, editPass, editWeb, editLink, sendPass As String
    Dim dataTblUserName, dataTblWebsite As New DataTable

    'select rename and hide in DataGridview
    Function initCommands()
        SqlConn.selectRenAndHide(editDgv)
        SqlConn.selectRenAndHide(delDgv)

        'fill sendDgv
        sendDgv.DataSource = SqlConn.runDML("select * from accountTbl where websiteName = 'Gmail'")
        sendDgv.Columns(1).HeaderText = "User Name"
        sendDgv.Columns(3).HeaderText = "Website Name"
        sendDgv.Columns(0).Visible = False
        sendDgv.Columns(2).Visible = False
        sendDgv.Columns(4).Visible = False

        'fill findDgv
        findDgv.DataSource = SqlConn.runDML("select userName as [User Name], password,
                             websiteName as [Website Name], link as [Link] from accountTbl")
        findDgv.Columns(1).Visible = False
        refillListbox()

        BeEasy.clearTextboxs(findUserNameTb, findPasswordTb, findWebsiteTb, findLinkTb)
        BeEasy.clearTextboxs(addUserNameTb, addPasswordTb, addWebsiteTb, addLinkTb)
        BeEasy.clearTextboxs(editUserNameTb, editPasswordTb, editWebsiteTb, editLinkTb)
        BeEasy.clearTextboxs(delUserNameTb, delPasswordTb, delWebsiteTb, delLinkTb)
        BeEasy.clearTextboxs(sendFromTb, sendSubjectTb, sendToTb, sendAttFileNameTb)
    End Function

    'refill listboxs
    Function refillListbox()
        Try
            BeEasy.fillListBox(dataTblWebsite, findAccLb, "websiteName")
            BeEasy.fillListBox(dataTblWebsite, editAccLb, "websiteName")
            BeEasy.fillListBox(dataTblWebsite, delAccLb, "websiteName")

            'rechecked default radio buttons
            findByWebRb.Checked = True
            editByWebRb.Checked = True
            delByWebRb.Checked = True
        Catch ex As Exception
            MsgBox("listboxs cannot be updated",, "Error")
        End Try
    End Function

    '---------------------------------------------------------------------------------------------------

    'MAIN FORM LOAD
    Private Sub mainForm_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        'TODO: This line of code loads data into the 'MailDataSet.accountTbl' table. You can move, or remove it, as needed.
        SqlConn.connectDataBase()
        initCommands()
    End Sub

    '---------------------------------------------------------------------------------------------------

    'FIND TAB
    'show password checkbox
    Private Sub findShwPassCb_CheckedChanged(sender As Object, e As EventArgs) Handles findShwPassCb.CheckedChanged
        BeEasy.showPasswordCb(findShwPassCb, findPasswordTb)
    End Sub

    'fill listbox using User Name radio button
    Private Sub byUserRb_CheckedChanged(sender As Object, e As EventArgs) Handles findByUserRb.CheckedChanged
        Try
            BeEasy.fillListBox(dataTblUserName, findAccLb, "userName")
        Catch ex As Exception
        End Try
    End Sub

    'fill listbox using Website Name radio button
    Private Sub byWebRb_CheckedChanged(sender As Object, e As EventArgs) Handles findByWebRb.CheckedChanged
        Try
            BeEasy.fillListBox(dataTblWebsite, findAccLb, "websiteName")
        Catch ex As Exception
        End Try
    End Sub

    'filter findDgv using listbox
    Private Sub findAccLb_SelectedIndexChanged(sender As Object, e As EventArgs) Handles findAccLb.SelectedIndexChanged
        If (findByUserRb.Checked) Then
            findDgv.DataSource = SqlConn.runDML("select userName as [User Name], password,
                                 websiteName as [Website Name], link as [Link] from accountTbl
                                 where userName like '" & findAccLb.SelectedItem & "'")
            findDgv.Columns(1).Visible = False

        ElseIf (findByWebRb.Checked) Then
            findDgv.DataSource = SqlConn.runDML("select userName as [User Name], password,
                                 websiteName as [Website Name], link as [Link] from accountTbl
                                 where websiteName like '" & findAccLb.SelectedItem & "'")
            findDgv.Columns(1).Visible = False
        Else
            MsgBox("Cannot filter table using this selection",, "Error")
        End If
    End Sub

    'get selected cell from findDgv
    Private Sub findDgv_RowEnter(sender As Object, e As DataGridViewCellEventArgs) Handles findDgv.RowEnter
        findUserNameTb.Text = BeEasy.getSelectedFromDgv(findDgv, e, 0)
        findPasswordTb.Text = BeEasy.getSelectedFromDgv(findDgv, e, 1)
        findWebsiteTb.Text = BeEasy.getSelectedFromDgv(findDgv, e, 2)
        findLinkTb.Text = BeEasy.getSelectedFromDgv(findDgv, e, 3)
    End Sub

    'copy buttons
    Private Sub findUserCpyBtn_Click(sender As Object, e As EventArgs) Handles findUserCpyBtn.Click
        BeEasy.copyBtn(findUserNameTb)
    End Sub

    Private Sub findPassCpyBtn_Click(sender As Object, e As EventArgs) Handles findPassCpyBtn.Click
        BeEasy.copyBtn(findPasswordTb)
    End Sub

    Private Sub findWebCpyBtn_Click(sender As Object, e As EventArgs) Handles findWebCpyBtn.Click
        BeEasy.copyBtn(findWebsiteTb)
    End Sub

    Private Sub findLinkCpyBtn_Click(sender As Object, e As EventArgs) Handles findLinkCpyBtn.Click
        BeEasy.copyBtn(findLinkTb)
    End Sub

    'open link
    Private Sub openURL_Click(sender As Object, e As EventArgs) Handles openURL.Click
        If (findLinkTb.Text = "") Then
            MsgBox("There is no link to be opened",, "Error")
            Return
        End If

        Try
            Process.Start(findLinkTb.Text)
        Catch withoutWWW As Exception
            Try
                Process.Start("www." & findLinkTb.Text)
            Catch withWWW As Exception
                MsgBox("Cannot open this link",, "Error")
            End Try
        End Try

    End Sub

    '---------------------------------------------------------------------------------------------------

    'ADD TAB
    'show password checkbox
    Private Sub addShwPassCb_CheckedChanged(sender As Object, e As EventArgs) Handles addShwPassCb.CheckedChanged
        BeEasy.showPasswordCb(addShwPassCb, addPasswordTb)
    End Sub

    'include special chars
    Private Sub specRb_CheckedChanged(sender As Object, e As EventArgs) Handles specRb.CheckedChanged
        If (specRb.Checked) Then
            specCharLbl.Visible = True
            specCharTb.Visible = True
            specialCharCb.Visible = False
            specialCharCb.Checked = False
        Else
            specCharLbl.Visible = False
            specCharTb.Visible = False
            specialCharCb.Visible = True
            specCharTb.Text = ""
        End If
    End Sub

    'copy buttons
    Private Sub addUserCpyBtn_Click(sender As Object, e As EventArgs) Handles addUserCpyBtn.Click
        BeEasy.copyBtn(addUserNameTb)
    End Sub

    Private Sub addPassCpyBtn_Click(sender As Object, e As EventArgs) Handles addPassCpyBtn.Click
        BeEasy.copyBtn(addPasswordTb)
    End Sub

    Private Sub addWebCpyBtn_Click(sender As Object, e As EventArgs) Handles addWebCpyBtn.Click
        BeEasy.copyBtn(addWebsiteTb)
    End Sub

    Private Sub addLinkCpyBtn_Click(sender As Object, e As EventArgs) Handles addLinkCpyBtn.Click
        BeEasy.copyBtn(addLinkTb)
    End Sub

    'paste buttons
    Private Sub addUserPstBtn_Click(sender As Object, e As EventArgs) Handles addUserPstBtn.Click
        BeEasy.pasteBtn(addUserNameTb)
    End Sub

    Private Sub addPassPstBtn_Click(sender As Object, e As EventArgs) Handles addPassPstBtn.Click
        BeEasy.pasteBtn(addPasswordTb)
    End Sub

    Private Sub addWebPstBtn_Click(sender As Object, e As EventArgs) Handles addWebPstBtn.Click
        BeEasy.pasteBtn(addWebsiteTb)
    End Sub

    Private Sub addLinkPstBtn_Click(sender As Object, e As EventArgs) Handles addLinkPstBtn.Click
        BeEasy.pasteBtn(addLinkTb)
    End Sub

    'generate password button
    Private Sub genPassBtn_Click(sender As Object, e As EventArgs) Handles genPassBtn.Click
        Dim passlen As Integer = 8
        Dim chSet As Object = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ _"

        If (passLenTb.Text <> "") Then
            Try
                passlen = passLenTb.Text
            Catch ex As Exception
                MsgBox("Password Length Must be Number",, "Error")
                passLenTb.Text = ""
                Return
            End Try
        End If

        If (defRb.Checked And specialCharCb.Checked) Then
            chSet = chSet + "!@#$%^&*=-+/\()[]{}.:;'<>?|,"
        ElseIf (specRb.Checked) Then
            If (specCharTb.Text <> "") Then
                chSet = specCharTb.Text
            Else
                MsgBox("Enter Some characters in Special character Textbox",, "Error")
                Return
            End If
        End If

        addPasswordTb.Text = BeEasy.genRandPass(passlen, chSet)
    End Sub

    'add button
    Private Sub addBtn_Click(sender As Object, e As EventArgs) Handles addBtn.Click
        Dim autoNum As Integer = SqlConn.getAutoNum("accountTbl", "ID")

        If (addUserNameTb.Text = "" Or addPasswordTb.Text = "" Or addWebsiteTb.Text = "") Then
            MsgBox("Username , Password and Website Name are required",, "Error")
            Return
        End If

        If (SqlConn.userNameValidation(addUserNameTb.Text) = False) Then Return
        If (SqlConn.linkValidation(addLinkTb.Text) = False) Then Return

        SqlConn.runDDL("insert into accountTbl values
                (" & autoNum & "
                , '" & addUserNameTb.Text & "'
                , '" & addPasswordTb.Text & "'
                , '" & addWebsiteTb.Text & "'
                , '" & addLinkTb.Text & "')", "Done")

        initCommands()
    End Sub

    'clear button
    Private Sub addClrBtn_Click(sender As Object, e As EventArgs) Handles addClrBtn.Click
        BeEasy.clearTextboxs(addUserNameTb, addPasswordTb, addLinkTb, addWebsiteTb)
    End Sub

    '---------------------------------------------------------------------------------------------------

    'EDIT TAB
    'show password checkbox
    Private Sub editShwPassCb_CheckedChanged(sender As Object, e As EventArgs) Handles editShwPassCb.CheckedChanged
        BeEasy.showPasswordCb(editShwPassCb, editPasswordTb)
    End Sub

    'fill listbox in editDgv by user name
    Private Sub editByUserRb_CheckedChanged(sender As Object, e As EventArgs) Handles editByUserRb.CheckedChanged
        Try
            BeEasy.fillListBox(dataTblUserName, editAccLb, "userName")
        Catch ex As Exception
        End Try
    End Sub

    'fill listbox in editDgv by website name
    Private Sub editByWebRb_CheckedChanged(sender As Object, e As EventArgs) Handles editByWebRb.CheckedChanged
        Try
            BeEasy.fillListBox(dataTblWebsite, editAccLb, "websiteName")
        Catch ex As Exception
        End Try
    End Sub

    'filter editDgv using listbox
    Private Sub editAccLb_SelectedIndexChanged(sender As Object, e As EventArgs) Handles editAccLb.SelectedIndexChanged
        If (editByUserRb.Checked) Then
            editDgv.DataSource = SqlConn.runDML("select ID, userName as [User Name], password,
                                 websiteName as [Website Name], link as [Link] from accountTbl
                                 where userName like '" & editAccLb.SelectedItem & "'")
            editDgv.Columns(0).Visible = False
            editDgv.Columns(2).Visible = False

        ElseIf (editByWebRb.Checked) Then
            editDgv.DataSource = SqlConn.runDML("select ID, userName as [User Name], password,
                                 websiteName as [Website Name], link as [Link] from accountTbl
                                 where websiteName like '" & editAccLb.SelectedItem & "'")
            editDgv.Columns(0).Visible = False
            editDgv.Columns(2).Visible = False

        Else
            MsgBox("Cannot filter table using this selection",, "Error")
        End If
    End Sub

    'get selected cell from editDgv
    Private Sub editDgv_RowEnter(sender As Object, e As DataGridViewCellEventArgs) Handles editDgv.RowEnter
        editUserNameTb.Text = BeEasy.getSelectedFromDgv(editDgv, e, 1)
        editPasswordTb.Text = BeEasy.getSelectedFromDgv(editDgv, e, 2)
        editWebsiteTb.Text = BeEasy.getSelectedFromDgv(editDgv, e, 3)
        editLinkTb.Text = BeEasy.getSelectedFromDgv(editDgv, e, 4)

        'variables that hold original values before changes
        editID = BeEasy.getSelectedFromDgv(editDgv, e, 0)
        editUser = editUserNameTb.Text
        editPass = editPasswordTb.Text
        editWeb = editWebsiteTb.Text
        editLink = editLinkTb.Text
    End Sub

    'edit button
    Private Sub updateBtn_Click(sender As Object, e As EventArgs) Handles updateBtn.Click
        If (editID = 0) Then
            MsgBox("There is no account to be edited",, "Error")
            Return
        End If
        Dim editDone As Boolean = False

        'check user name validation
        If (editUser <> editUserNameTb.Text) Then
            If (Not SqlConn.userNameValidation(editUserNameTb.Text)) Then
                Return
            End If
        End If

        'check link validation
        If (editLink <> editLinkTb.Text) Then
            If (Not SqlConn.linkValidation(editLinkTb.Text)) Then
                Return
            End If
        End If

        'edit every column after check if data updated
        If (BeEasy.areEdit(editUserNameTb, editUser, editID, "userName")) Then editDone = True
        If (BeEasy.areEdit(editPasswordTb, editPass, editID, "password")) Then editDone = True
        If (BeEasy.areEdit(editWebsiteTb, editWeb, editID, "websiteName")) Then editDone = True
        If (BeEasy.areEdit(editLinkTb, editLink, editID, "link")) Then editDone = True

        If (editDone) Then
            MsgBox("Done",, "Complete")
            initCommands()
        Else
            MsgBox("There is no edited values",, "Error")
        End If
    End Sub

    '---------------------------------------------------------------------------------------------------

    'DELETE TAB
    'show password checkbox
    Private Sub delShwPassCb_CheckedChanged(sender As Object, e As EventArgs) Handles delShwPassCb.CheckedChanged
        BeEasy.showPasswordCb(delShwPassCb, delPasswordTb)
    End Sub

    'fill listbox in delDgv by user name
    Private Sub delByUserRb_CheckedChanged(sender As Object, e As EventArgs) Handles delByUserRb.CheckedChanged
        Try
            BeEasy.fillListBox(dataTblUserName, delAccLb, "userName")
        Catch ex As Exception
        End Try
    End Sub

    'fill listbox in delDgv by website name
    Private Sub delByWebRb_CheckedChanged(sender As Object, e As EventArgs) Handles delByWebRb.CheckedChanged
        Try
            BeEasy.fillListBox(dataTblWebsite, delAccLb, "websiteName")
        Catch ex As Exception
        End Try
    End Sub

    'filter delDgv using listbox
    Private Sub delAccLb_SelectedIndexChanged(sender As Object, e As EventArgs) Handles delAccLb.SelectedIndexChanged
        If (delByUserRb.Checked) Then
            delDgv.DataSource = SqlConn.runDML("select ID, userName as [User Name], password,
                                 websiteName as [Website Name], link as [Link] from accountTbl
                                 where userName like '" & delAccLb.SelectedItem & "'")
            delDgv.Columns(0).Visible = False
            delDgv.Columns(2).Visible = False

        ElseIf (delByWebRb.Checked) Then
            delDgv.DataSource = SqlConn.runDML("select ID, userName as [User Name], password,
                                 websiteName as [Website Name], link as [Link] from accountTbl
                                 where websiteName like '" & delAccLb.SelectedItem & "'")
            delDgv.Columns(0).Visible = False
            delDgv.Columns(2).Visible = False

        Else
            MsgBox("Cannot filter table using this selection", "Error")
        End If
    End Sub

    'get selected cell from delDgv
    Private Sub delDgv_RowEnter(sender As Object, e As DataGridViewCellEventArgs) Handles delDgv.RowEnter
        afterDelSel = e.RowIndex
        delID = BeEasy.getSelectedFromDgv(delDgv, e, 0)
        delUserNameTb.Text = BeEasy.getSelectedFromDgv(delDgv, e, 1)
        delPasswordTb.Text = BeEasy.getSelectedFromDgv(delDgv, e, 2)
        delWebsiteTb.Text = BeEasy.getSelectedFromDgv(delDgv, e, 3)
        delLinkTb.Text = BeEasy.getSelectedFromDgv(delDgv, e, 4)
    End Sub

    'delete button
    Private Sub delBtn_Click(sender As Object, e As EventArgs) Handles delBtn.Click
        If (delID = 0 Or delUserNameTb.Text = "") Then
            MsgBox("There is no account to be deleted",, "Error")
            Return
        End If

        If (MsgBox("Are you sure you want to delete " & delUserNameTb.Text & " account", 4, "Confirm") = 6) Then
            Dim temp = afterDelSel
            SqlConn.runDML("delete from accountTbl where ID = " & delID & " ", "Done")
            initCommands()

            Try
                delDgv.Item(1, temp).Selected = True
            Catch ex1 As Exception
                Try
                    delDgv.Item(1, 0).Selected = True
                Catch ex2 As Exception
                End Try
            End Try

            delID = 0
        End If
    End Sub

    '---------------------------------------------------------------------------------------------------

    'SEND TAB
    'get selected cell from sendDgv
    Private Sub sendDgv_RowEnter(sender As Object, e As DataGridViewCellEventArgs) Handles sendDgv.RowEnter
        sendFromTb.Text = BeEasy.getSelectedFromDgv(sendDgv, e, 1)
        sendPass = BeEasy.getSelectedFromDgv(sendDgv, e, 2)
    End Sub

    'paste buttons
    Private Sub sendSubjPstBtn_Click(sender As Object, e As EventArgs) Handles sendSubjPstBtn.Click
        BeEasy.pasteBtn(sendSubjectTb)
    End Sub

    Private Sub sendToPstBtn_Click(sender As Object, e As EventArgs) Handles sendToPstBtn.Click
        BeEasy.pasteBtn(sendToTb)
    End Sub

    'open file browser
    Private Sub sendAttBtn_Click(sender As Object, e As EventArgs) Handles sendAttBtn.Click
        sendFileDialog.ShowDialog()
    End Sub

    'fill sendAttFileName with attached file
    Private Sub sendFileDialog_FileOk(sender As Object, e As System.ComponentModel.CancelEventArgs) Handles sendFileDialog.FileOk
        sendAttFileNameTb.Text = SqlConn.getFileName(sendFileDialog.FileName)
    End Sub

    'clear sendDgv textboxs
    Private Sub sendClrBtn_Click(sender As Object, e As EventArgs) Handles sendClrBtn.Click
        BeEasy.clearTextboxs(sendFromTb, sendSubjectTb, sendToTb, sendAttFileNameTb)
        sendBodyRTb.Clear()
        sendFileDialog.FileName = ""
        sendProgBar.Value = 0
        progBarValLbl.Text = ""
    End Sub

    'send button
    Private Sub sendBtn_Click(sender As Object, e As EventArgs) Handles sendBtn.Click
        If (sendFromTb.Text = "" Or sendToTb.Text = "") Then
            MsgBox("From and To Account must be Entered",, "Error")
            Return
        End If

        Dim domName As String = SqlConn.getDomain(sendFromTb.Text)
        If (domName = "") Then Return

        Try
            sendProgBar.Visible = True
            Using eMail As New MailMessage
                eMail.From = New MailAddress(sendFromTb.Text)
                sendProgBar.Value = 10
                progBarValLbl.Text = "10%..."

                eMail.To.Add(sendToTb.Text)
                sendProgBar.Value = 20
                progBarValLbl.Text = "20%..."

                eMail.Body = sendBodyRTb.Text$
                sendProgBar.Value = 30
                progBarValLbl.Text = "30%..."

                If Not sendFileDialog.FileName = vbNullString Then
                    Dim attach As New Attachment(sendFileDialog.FileName)
                    eMail.Attachments.Add(attach)
                End If

                eMail.Subject = sendSubjectTb.Text$
                'eMail.Priority = eMail.Priority.High

                Using smtpServer As New SmtpClient
                    smtpServer.EnableSsl = True
                    sendProgBar.Value = 40
                    progBarValLbl.Text = "40%..."

                    smtpServer.Port = "587"
                    sendProgBar.Value = 50
                    progBarValLbl.Text = "50%..."

                    smtpServer.Host = "smtp." & domName
                    sendProgBar.Value = 60
                    progBarValLbl.Text = "60%..."

                    smtpServer.Credentials = New Net.NetworkCredential(sendFromTb.Text, sendPass)
                    sendProgBar.Value = 70
                    progBarValLbl.Text = "70%..."

                    smtpServer.Send(eMail)
                    sendProgBar.Value = 80
                    progBarValLbl.Text = "80%..."
                End Using
                sendProgBar.Value = 90
                progBarValLbl.Text = "90%..."
            End Using

            sendProgBar.Value = 100
            progBarValLbl.Text = "100%..."
            MsgBox("Send E_Mail Successfully",, "Complete")

            'clear everything after sending
            BeEasy.clearTextboxs(sendFromTb, sendSubjectTb, sendToTb, sendAttFileNameTb)
            sendBodyRTb.Clear()
            sendFileDialog.FileName = ""
            sendProgBar.Value = 0
            sendProgBar.Visible = False
            progBarValLbl.Text = ""

        Catch ex As Exception
            MsgBox(ex.Message,, "Error")
            sendProgBar.Value = 0
            sendProgBar.Visible = False
            progBarValLbl.Text = ""
        End Try
    End Sub

    'help btn
    Private Sub sendErrorBtn_Click(sender As Object, e As EventArgs) Handles sendErrorBtn.Click
        MsgBox("This application support gmail only " & vbNewLine &
               "Please turn off 'Less secure app access' in your account setting security",, "Help")
    End Sub

    '---------------------------------------------------------------------------------------------------

    'prevent user from edit rowHeaderWidth
    Private Sub findDgv_RowHeadersWidthChanged(sender As Object, e As EventArgs) Handles findDgv.RowHeadersWidthChanged
        findDgv.RowHeadersWidth = 4
    End Sub

    Private Sub editDgv_RowHeadersWidthChanged(sender As Object, e As EventArgs) Handles editDgv.RowHeadersWidthChanged
        editDgv.RowHeadersWidth = 4
    End Sub

    Private Sub delDgv_RowHeadersWidthChanged(sender As Object, e As EventArgs) Handles delDgv.RowHeadersWidthChanged
        delDgv.RowHeadersWidth = 4
    End Sub

    Private Sub sendDgv_RowHeadersWidthChanged(sender As Object, e As EventArgs) Handles sendDgv.RowHeadersWidthChanged
        sendDgv.RowHeadersWidth = 4
    End Sub

    'end application when main form closed
    Private Sub mainForm_FormClosed(sender As Object, e As FormClosedEventArgs) Handles MyBase.FormClosed
        End
    End Sub

End Class