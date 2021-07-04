@echo off
Title Dirs_Files_Creator

:main
set No=nul,Pre,Suf
color 0f
cls

set /p file_dir=Do you want to create file or folders (1/2) respectively : 
if %file_dir%==1 (
goto :create_file
)

if %file_dir%==2 (
goto :create_dir
)

	
	:create_file
	set UR="c:\Users\%username%\Desktop"
	cls
	color 0e
	set /p No=Please enter the number of files that you want to create : 
	set /p Pre=Do you want to start with a specific word "press enter if you don`t" : 
	set /p Suf=Do you want to end with a specific word "press enter if you don`t" : 
	set /p UR=type Path that you want to create in (Default is %UR%) : 
	cd /d %UR%
	
	for /l %%x in (1 , 1 , %No%) do (
	type nul > %Pre%%%x%Suf%.txt
	)
	cls
	color 0a
	echo Operation Completed!
	echo -----------------------
	goto :return
	
	
	:create_dir
	set UR="c:\Users\%username%\Desktop"
	cls
	color 0c
	set /p No=Please enter the number of folders that you want to create : 
	set /p Pre=Do you want to start with a specific word "press enter if you don`t" : 
	set /p Suf=Do you want to end with a specific word "press enter if you don`t" : 
	set /p UR=type Path that you want to create in (Default is %UR%) : 
	cd /d %UR%
	
	for /l %%x in (1 , 1 , %No%) do (
	mkdir %Pre%%%x%Suf%
	)
	cls
	color 0a
	echo Operation Completed!
	echo -----------------------
	goto :return
	
	
	:return
	set /p again=Do you want to create again y/n : 
	if %again%==y (
	goto :main
	)else (
	exit
	)

pause