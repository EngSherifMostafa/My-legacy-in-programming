@echo off
title Create dotnet console project

dotnet --version && set dotnet=1 || set dotnet=0

if %dotnet%==1 (
dotnet new console
code .
)
if %dotnet%==0	(
echo "dotnet not found !"
echo "just download"
start https://dotnet.microsoft.com/download
)

exit