#ifndef DRAWINTRO_H
#define DRAWINTRO_H

#include <iostream>
#include <string>
#include <windows.h> //screen calculations
using namespace std;

class DrawIntro
{
public:
	DrawIntro();
	~DrawIntro();
	
private:
	void intro();
	void printChar(char);
	void drawSpecialLine(string, char);
	
	int screenWidth, space, counter, index;
	string str;
};
#endif