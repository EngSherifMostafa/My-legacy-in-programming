Function LetterOut(rng As Range)
Dim i As Integer
For i = 1 To Len(rng)
Select Case Asc(Mid(rng.Value, i, 1))
Case 0 To 64, 123 To 197
LetterOut = LetterOut & Mid(rng.Value, i, 1)
End Select
Next i
End Function
Function NumberOut(rng As Range)
Dim i As Integer
For i = 1 To Len(rng)
Select Case Asc(Mid(rng.Value, i, 1))
Case 0 To 64, 123 To 197
Case Else
NumberOut = NumberOut & _
Mid(rng.Value, i, 1)
End Select
Next i
End Function
Sub Response()
'
' Response Macro
'

'
    Sheets("Choose").Select
    Sheets("Response").Visible = True
    Sheets("Choose").Visible = False
End Sub
Sub Statistics()
'
' Statistics Macro
'

'
    Sheets("Choose").Select
    Sheets("Statistics").Visible = True
    Sheets("Choose").Visible = False
End Sub
Sub Non_response()
'
' Non_response Macro
'

'
    Sheets("Choose").Select
    Sheets("Non response").Visible = True
    Sheets("Choose").Visible = False
End Sub
Sub Start_new_report()
'
' Start_new_report Macro
'

'
    Sheets("Choose").Select
    Sheets("Start New Report").Visible = True
    Sheets("Choose").Select
    Sheets("Choose").Visible = False
    Sheets("Start New Report").Select
    If Sheets("response").Visible = True Then Sheets("response").Visible = False
    If Sheets("Non response").Visible = True Then Sheets("Non response").Visible = False
    If Sheets("Statistics").Visible = True Then Sheets("Statistics").Visible = False
End Sub
Sub Back()
If Sheets("choose").Visible = False Then Sheets("Choose").Visible = True
If Sheets("Response").Visible = True Then Sheets("Response").Visible = False
If Sheets("Non response").Visible = True Then Sheets("Non response").Visible = False
If Sheets("Statistics").Visible = True Then Sheets("Statistics").Visible = False
End Sub
Sub Back_from_search()
If Sheets("Start new report").Visible = False Then Sheets("Start new report").Visible = True
If Sheets("search").Visible = True Then Sheets("search").Visible = False
End Sub
Sub Go_to_search()
If Sheets("search").Visible = False Then Sheets("search").Visible = True
If Sheets("Start new report").Visible = True Then Sheets("Start new report").Visible = False
End Sub
Sub OP()
'
' OP Macro
'

'
    If Sheets("search").Visible = True Then Sheets("search").Visible = False
    If Sheets("Report").Visible = True Then Sheets("Report").Visible = False
    If Sheets("Statistics").Visible = True Then Sheets("Statistics").Visible = False
    
    If Sheets("Response").Visible = fales Then Sheets("Response").Visible = True
    Sheets("Response").Select
    Columns("A:Q").Select
    ActiveWorkbook.Worksheets("Response").Sort.SortFields.Clear
    ActiveWorkbook.Worksheets("Response").Sort.SortFields.Add Key:=Range( _
        "A2:A1002"), SortOn:=xlSortOnValues, Order:=xlAscending, DataOption:= _
        xlSortNormal
    With ActiveWorkbook.Worksheets("Response").Sort
        .SetRange Range("A1:Q1002")
        .Header = xlYes
        .MatchCase = False
        .Orientation = xlTopToBottom
        .SortMethod = xlPinYin
        .Apply
    End With
    If Sheets("Response").Visible = True Then Sheets("Response").Visible = False
    If Sheets("Non response").Visible = False Then Sheets("Non response").Visible = True
    Range("A1").Select
    Sheets("Non response").Select
    Columns("A:J").Select
    ActiveWorkbook.Worksheets("Non response").Sort.SortFields.Clear
    ActiveWorkbook.Worksheets("Non response").Sort.SortFields.Add Key:=Range( _
        "A2:A1002"), SortOn:=xlSortOnValues, Order:=xlAscending, DataOption:= _
        xlSortNormal
    With ActiveWorkbook.Worksheets("Non response").Sort
        .SetRange Range("A1:J1002")
        .Header = xlYes
        .MatchCase = False
        .Orientation = xlTopToBottom
        .SortMethod = xlPinYin
        .Apply
    End With
    If Sheets("Non response").Visible = True Then Sheets("Non response").Visible = False
    If Sheets("Choose").Visible = False Then Sheets("Choose").Visible = True
    Sheets("Start New Report").Visible = False
End Sub