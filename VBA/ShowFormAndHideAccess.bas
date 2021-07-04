Option Compare Database
Option Explicit
 
Global Const SW_HIDE = 0
Global Const SW_SHOWNORMAL = 1
Global Const SW_SHOWMINIMIZED = 2
Global Const SW_SHOWMAXIMIZED = 3
 
Private Declare Function apiShowWindow Lib "user32" _
Alias "ShowWindow" (ByVal hWnd As Long, _
ByVal nCmdShow As Long) As Long
 
Function fSetAccessWindow(nCmdShow As Long)
     
    Dim loX As Long
    Dim loForm As Form
    On Error Resume Next
    Set loForm = Screen.ActiveForm
     
    If Err <> 0 Then
        loX = apiShowWindow(hWndAccessApp, nCmdShow)
        Err.Clear
    End If
     
    If nCmdShow = SW_SHOWMINIMIZED And loForm.Modal = True Then
        MsgBox "Cannot minimize Access with " _
        & (loForm.Caption + " ") _
        & "form on screen"
    ElseIf nCmdShow = SW_HIDE And loForm.PopUp <> True Then
        MsgBox "Cannot hide Access with " _
        & (loForm.Caption + " ") _
        & "form on screen"
    Else
        loX = apiShowWindow(hWndAccessApp, nCmdShow)
    End If
    fSetAccessWindow = (loX <> 0)
End Function


'call this function in form
fSetAccessWindow (SW_SHOWMINIMIZED)