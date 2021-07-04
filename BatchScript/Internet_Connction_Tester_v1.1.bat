@echo off
title Internet_Connction_Tester_v1.1
echo "Welcome %username%" > test.txt
ping google.com -n 10 > test.txt
color 0a
echo "Testing completed !"
find "Packets" test.txt
rm test.txt
pause