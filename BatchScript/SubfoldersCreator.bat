@echo off
cls
color 3c

rem Specify the root path where you want to create folders inside all folders
set /p "root_path=Please, Enter path: "

rem Specify the names of the folders you want to create
set "folders_to_create=Lectures Sheets Reference Videos Assignments Project Lab"

rem Iterate through immediate directories in the specified path
for /d %%d in ("%root_path%\*") do (
    for %%f in (%folders_to_create%) do (
        if not exist "%%d\%%f" mkdir "%%d\%%f"
    )
)

echo Folders created successfully!
