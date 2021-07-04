@echo off
Title Simple_Calculator
::THERE IS NO SPACES IN MATH EXPRESSIONS

:main
color 0a

::go to the function of cal
goto :cal

	::initialize function
	:cal
	cls
	::set with p for input
	set /p a=Please enter the first No. : 
	set /p op=Please enter the operation : 
	set /p b=Please enter the second No. : 
	
	cls
	color 0c
	::set with a for math expressions
	set /a R=%a%%op%%b% 
	echo %a% %op% %b% = %R%
	echo ----------------------------------
	
	:return
	set /p test=Do you want to Start y/n : 
	
	:: %% ---> to get the value of variable
	if %test%==y (
	goto :main
	)else (
	exit
	)
	::else must be after ) of if condition without space

pause