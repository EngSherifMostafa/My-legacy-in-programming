@echo off
cls
title Set ipv4 address


::set variables
set localIp=10.10.10.10
set submask=255.255.255.0
set getway=192.168.0.10


::get ipv4_address
for /f "tokens=1-2 delims=:" %%a in ('ipconfig^|find "IPv4"') do set ip=%%b
set ip=%ip:~1%


::run dhcp protocol if adapter run on local network
if %ip%==%localIp% (

	::Run DHCP Protocol
	netsh interface ipv4 set address name="Wi-Fi" source=dhcp
	
	cls
	color f0
	echo Internet will activate after 10 sec
	timeout /t 10
	exit
)


::Run Static ip if adapter run on dhcp protocol
else (
	netsh interface ipv4 set address name="Wi-Fi" static %localIp% %submask% %getway%
	
	cls
	color 0a
	echo Local Network will activate after 10 sec
	timeout /t 10
	exit
)