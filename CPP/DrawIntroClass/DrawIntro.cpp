#include "DrawIntro.h"

//constructor
DrawIntro::DrawIntro()
{
	screenWidth = 0, space = 0, counter = 0, index = 0;
	str = "";

	//make screen full
	HWND consoleWindow = GetConsoleWindow();
	ShowWindow(consoleWindow, SW_MAXIMIZE);

	//get cmd width
	CONSOLE_SCREEN_BUFFER_INFO csbi;
	GetConsoleScreenBufferInfo(GetStdHandle(STD_OUTPUT_HANDLE), &csbi);
	screenWidth = csbi.srWindow.Right - csbi.srWindow.Left + 1;

	intro();
}

//destructor
DrawIntro::~DrawIntro()
{
}

void DrawIntro::intro()
{
	//draw 2 lines
    printChar('*');
    printChar('*');

	str=" ";
	drawSpecialLine(str,'*');

	str="WELCOME TO TATA language compiler project";
	drawSpecialLine(str,'*');

	str="DESIGNED BY:";
	drawSpecialLine(str,'*');

	str="1- MOHAMED SAYED HEMED";
	drawSpecialLine(str,'*');
	
	str="2- SHERIF MOSTAFA SAMY";
	drawSpecialLine(str,'*');

	str="CAIRO UNIVERSITY";
	drawSpecialLine(str,'*');

	str=" ";
	drawSpecialLine(str,'*');

	//draw 2 lines
    printChar('*');
    printChar('*');
}

void DrawIntro::drawSpecialLine(string str,char ch)
{
	//calculate remainder space after print string
	space=(screenWidth/3)-str.length();

	//counter = char + space before string + string length + space after string + char
	counter=(screenWidth/3)+(space/2)+str.length()+(space/2)+(screenWidth/3);

	//draw 1/3 line of char
	for(index=0;index<(screenWidth/3);index++)
		cout<<ch;

	//draw 1/2 remainder spaces before string
	for(index=0;index<(space/2);index++)
		cout<<" ";

	//print string
	cout<<str;

    if(ch==' ') return; //stop function when write string and variable

	//draw 1/2 remainder spaces after string
	for(index=0;index<(space/2);index++)
		cout<<" ";

	//check if spaces + char = screenWidth or less
	while(counter<screenWidth)
	{
		cout<<" ";
		counter++;
	}

	//draw 1/3 line of char
	for(index=0;index<(screenWidth/3);index++)
		cout<<ch;
}

void DrawIntro::printChar(char ch)
{
	for(counter=0;counter<screenWidth;counter++)
		cout<<ch;
}