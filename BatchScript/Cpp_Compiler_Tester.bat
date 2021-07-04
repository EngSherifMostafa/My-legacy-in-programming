@echo off
title Test C & C++ Compiler
cls
color 0c
echo Hello this app test the compiler of c and c++
timeout /t 5

gcc --version && set gcc=1 || set gcc=0
echo ---------------------------------------------
g++ --version && set g++=1 || set g++=0
echo ---------------------------------------------
gdb --version && set gdb=1 || set gdb=0
echo ---------------------------------------------
make --version && set make=1 || set make=0
echo ---------------------------------------------
cls

if %gcc%==1 (
echo "gcc done"
)
if %gcc%==0	(
echo "gcc not found !"
echo "just download"
start https://goo.gl/VrB41t
)


if %g++%==1 (
echo "g++ done"
)
if %g++%==0 (
echo "g++ not found !"
echo "just download"
start https://goo.gl/VrB41t)
)


if %gdb%==1 (
echo "gdb done"
)
if %gdb%==0 (
echo "gdb not found !"
echo "just download"
start https://goo.gl/VrB41t)
)


if %make%==1 (
echo "make done"
)
if %make%==0 (
echo "make not found !"
echo "just download"
start https://goo.gl/VrB41t)
)


color 0a
pause