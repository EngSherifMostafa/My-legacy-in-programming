Private Sub workbook_open()
Application.ExecuteExcel4Macro "SHOW.TOOLBAR(""Ribbon"",False)"
Application.DisplayFormulaBar = False
Application.DisplayStatusBar = Not Application.DisplayStatusBar
ActiveWindow.DisplayWorkbookTabs = False
Application.Visible = False
Login.Show

With ActiveWindow
.DisplayHorizontalScrollBar = False
.DisplayVerticalScrollBar = False
End With
End Sub
-----------------------------------------------------------------------
Private Sub Add_click()
On Error GoTo nameerror
ActiveWorkbook.Names("ÇáãÇÏÉ").Delete
ActiveWorkbook.Names("ÇáãÍÇÖÑ").Delete
ActiveWorkbook.Names("ÇáãæÇÚíÏ").Delete
nameerror:

s = Sheets("Helper").Range("H1048576").End(xlUp).Row
l = Sheets("Helper").Range("I1048576").End(xlUp).Row

If TextBox1.Value = "" Or TextBox2.Value = "" Or ComboBox1.Value = "" Then
MsgBox "ãä ÝÖáß ÊÃßÏ ãä ÇÏÎÇá ÇáÃÓã / ÇáÊáíÝæä / ÇáÝÑÞÉ"
Else
Sheets("Entering").Activate
LR = Range("A" & Rows.Count).End(xlUp).Row

Range("A" & LR + 1).Value = TextBox1.Value 'Name
Range("A" & LR + 1).Offset(0, 1).Value = TextBox2.Value 'Phone
Range("A" & LR + 1).Offset(0, 2).Value = TextBox3.Value 'Home
Range("A" & LR + 1).Offset(0, 3).Value = ComboBox1.Value 'Class
Range("A" & LR + 1).Offset(0, 4).Value = TextBox4.Value 'Money
Range("A" & LR + 1).Offset(0, 5).Value = TextBox5.Value 'Pay

Range("A" & LR + 1).Offset(0, 7).Value = TextBox6.Value 'Study
Sheets("Helper").Cells(s + 1, 8) = TextBox6.Text

Range("A" & LR + 1).Offset(0, 8).Value = TextBox7.Value 'Lecturer
Sheets("Helper").Cells(l + 1, 9) = TextBox7.Text

Range("A" & LR + 1).Offset(0, 9).Value = ComboBox2.Value 'Day1
Range("A" & LR + 1).Offset(0, 10).Value = TextBox8.Value 'Time1
t1 = Sheets("Helper").Range("J1048576").End(xlUp).Row
Sheets("Helper").Cells(t1 + 1, 10) = TextBox8.Text

Range("A" & LR + 1).Offset(0, 11).Value = ComboBox3.Value 'Day2
Range("A" & LR + 1).Offset(0, 12).Value = TextBox9.Value 'Time2
t2 = Sheets("Helper").Range("J1048576").End(xlUp).Row
Sheets("Helper").Cells(t2 + 1, 10) = TextBox9.Text

Range("A" & LR + 1).Offset(0, 13).Value = ComboBox4.Value 'Day3
Range("A" & LR + 1).Offset(0, 14).Value = TextBox10.Value 'Time3
t3 = Sheets("Helper").Range("J1048576").End(xlUp).Row
Sheets("Helper").Cells(t3 + 1, 10) = TextBox10.Text

Range("A" & LR + 1).Offset(0, 15).Value = ComboBox5.Value 'Day4
Range("A" & LR + 1).Offset(0, 16).Value = TextBox11.Value 'Time4
t4 = Sheets("Helper").Range("J1048576").End(xlUp).Row
Sheets("Helper").Cells(t4 + 1, 10) = TextBox11.Text

TextBox1.Value = ""
TextBox2.Value = ""
TextBox3.Value = ""
TextBox4.Value = ""
TextBox5.Value = ""
TextBox6.Value = ""
TextBox7.Value = ""
TextBox8.Value = ""
TextBox9.Value = ""
TextBox10.Value = ""
TextBox11.Value = ""

ComboBox1.Value = ""
ComboBox2.Value = ""
ComboBox3.Value = ""
ComboBox4.Value = ""
ComboBox5.Value = ""

'H ---> Stu ---> s
'I ---> Lec ---> l
'J ---> Time ---> t
Sheet10.Activate
Sheets("Helper").Range("H2:H1048576").RemoveDuplicates Columns:=1, Header:=xlNo
Sheets("Helper").Range("I2:I1048576").RemoveDuplicates Columns:=1, Header:=xlNo
Sheets("Helper").Range("J2:J1048576").RemoveDuplicates Columns:=1, Header:=xlNo

On Error GoTo blankserror
Sheets("Helper").Columns("H:H").Select
Selection.SpecialCells(xlCellTypeBlanks).Select
Selection.Delete Shift:=xlUp

Sheets("Helper").Columns("I:I").Select
Selection.SpecialCells(xlCellTypeBlanks).Select
Selection.Delete Shift:=xlUp

Sheets("Helper").Columns("J:J").Select
Selection.SpecialCells(xlCellTypeBlanks).Select
Selection.Delete Shift:=xlUp
blankserror:

s_n = Sheets("Helper").Range("H1048576").End(xlUp).Row
l_n = Sheets("Helper").Range("I1048576").End(xlUp).Row
t_n = Sheets("Helper").Range("J1048576").End(xlUp).Row
Range("H2:H" & s_n).Name = "ÇáãÇÏÉ"
Range("I2:I" & l_n).Name = "ÇáãÍÇÖÑ"
Range("J2:J" & t_n).Name = "ÇáãæÇÚíÏ"

MsgBox ("Êã ÇÖÇÝå ÇáÈíÇäÇÊ ÈäÌÇÍ")
End If
End Sub
Private Sub ComboBox2_Change()
If ComboBox2.Value = "ÇáÓÈÊ" Then ComboBox3.Value = "ÇáËáÇËÇÁ"
If ComboBox2.Value = "ÇáÃÍÏ" Then ComboBox3.Value = "ÇáÃÑÈÚÇÁ"
If ComboBox2.Value = "ÇáÃËäíä" Then ComboBox3.Value = "ÇáÎãíÓ"
End Sub
Private Sub ComboBox4_Change()
If ComboBox4.Value = "ÇáÓÈÊ" Then ComboBox5.Value = "ÇáËáÇËÇÁ"
If ComboBox4.Value = "ÇáÃÍÏ" Then ComboBox5.Value = "ÇáÃÑÈÚÇÁ"
If ComboBox4.Value = "ÇáÃËäíä" Then ComboBox5.Value = "ÇáÎãíÓ"
End Sub
Private Sub TextBox8_Change()
If TextBox8.Value <> "" Then TextBox9.Value = TextBox8.Value
End Sub
Private Sub TextBox10_change()
If TextBox10.Value <> "" Then TextBox11.Value = TextBox10.Value
End Sub
Private Sub ComboBox1_AfterUpdate()
x = WorksheetFunction.CountIf(Range("ÇáÝÑÞÉ"), ComboBox1.Value)
If x = 0 Then
MsgBox ("ÑÌÇÁ ÇÎÊíÇÑ ÇáÝÑÞÉ ãä ÇáÓåã ÇáãæÌæÏ íãíä ÇáÎáíå")
ComboBox1.Value = ""
End If
End Sub
Private Sub ComboBox2_AfterUpdate()
x = WorksheetFunction.CountIf(Range("ÇáÃíÇã"), ComboBox2.Value)
If x = 0 Then
MsgBox ("ÑÌÇÁ ÇÎÊíÇÑ Çáíæã ãä ÇáÓåã ÇáãæÌæÏ íãíä ÇáÎáíå")
ComboBox2.Value = ""
End If
End Sub
Private Sub ComboBox3_AfterUpdate()
x = WorksheetFunction.CountIf(Range("ÇáÃíÇã"), ComboBox3.Value)
If x = 0 Then
MsgBox ("ÑÌÇÁ ÇÎÊíÇÑ Çáíæã ãä ÇáÓåã ÇáãæÌæÏ íãíä ÇáÎáíå")
ComboBox3.Value = ""
End If
End Sub
Private Sub ComboBox4_AfterUpdate()
x = WorksheetFunction.CountIf(Range("ÇáÃíÇã"), ComboBox4.Value)
If x = 0 Then
MsgBox ("ÑÌÇÁ ÇÎÊíÇÑ Çáíæã ãä ÇáÓåã ÇáãæÌæÏ íãíä ÇáÎáíå")
ComboBox4.Value = ""
End If
End Sub
Private Sub ComboBox5_AfterUpdate()
x = WorksheetFunction.CountIf(Range("ÇáÃíÇã"), ComboBox5.Value)
If x = 0 Then
MsgBox ("ÑÌÇÁ ÇÎÊíÇÑ Çáíæã ãä ÇáÓåã ÇáãæÌæÏ íãíä ÇáÎáíå")
ComboBox5.Value = ""
End If
End Sub
Private Sub printapp_click()
If Sheets("App_form").Visible = False Then Sheets("App_form").Visible = True
Sheets("App_form").PrintOut
If Sheets("App_form").Visible = True Then Sheets("App_form").Visible = False
End Sub
Private Sub Back_to_main_Click()
Add_Win.Hide
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
Login.Show
End Sub
Private Sub UserForm_QueryClose(Cancel As Integer, CloseMode As Integer)
Cancel = True
End Sub
-----------------------------------------------------------------------
Private Sub SwTbl_Click()
Application.Visible = True
Sheets("Table").Activate
If Sheets("Table").Visible = False Then Sheets("Table").Visible = True
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
End Sub
Private Sub PrtTbl_Click()
Sheet4.PrintOut
End Sub
Private Sub Back_to_main_Click()
Application.Visible = False
Center_Table.Hide
If Sheets("Table").Visible = True Then Sheets("Table").Visible = False
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
Login.Show
End Sub
Private Sub UserForm_QueryClose(Cancel As Integer, CloseMode As Integer)
Cancel = True
End Sub
-----------------------------------------------------------------------
Private Sub Del_click()
If ComboBox1.Value = "" Then
MsgBox ("ãä ÝÖáß ÇÎÊÑ ÇáÇÓã ÇáãÑÇÏ ÍÐÝå")
Else
For Each c In Range("A3:K1002")
If c = ComboBox1.Value Then
c.Select
Exit For
End If
Next c

ActiveCell.Value = Empty
ActiveCell.Offset(0, 1).Value = Empty
ActiveCell.Offset(0, 2).Value = Empty
ActiveCell.Offset(0, 3).Value = Empty
ActiveCell.Offset(0, 4).Value = Empty
ActiveCell.Offset(0, 5).Value = Empty
ActiveCell.Offset(0, 7).Value = Empty
ActiveCell.Offset(0, 8).Value = Empty
ActiveCell.Offset(0, 9).Value = Empty
ActiveCell.Offset(0, 10).Value = Empty
ActiveCell.Offset(0, 11).Value = Empty
ActiveCell.Offset(0, 12).Value = Empty
ActiveCell.Offset(0, 13).Value = Empty
ActiveCell.Offset(0, 14).Value = Empty
ActiveCell.Offset(0, 15).Value = Empty
ActiveCell.Offset(0, 16).Value = Empty

ComboBox1.Clear
Sheets("Entering").Activate
Dim s As Integer
With ActiveSheet
rng = .Range("A" & Rows.Count).End(xlUp).Row
For s = 3 To rng
If Range("A" & s) <> "" Then
Me.ComboBox1.AddItem .Range("A" & s)
End If
Next s
End With

MsgBox ("Êã ÇáÍÐÝ ÈäÌÇÍ !")
ComboBox1.Value = ""
End If
End Sub
Private Sub Userform_Initialize()
Sheets("Entering").Activate
Dim s As Integer
With ActiveSheet
rng = .Range("A" & Rows.Count).End(xlUp).Row
For s = 3 To rng
If Range("A" & s) <> "" Then
Me.ComboBox1.AddItem .Range("A" & s)
End If
Next s
End With
End Sub
Private Sub Back_to_main_Click()
Del_Win.Hide
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
Login.Show
End Sub
Private Sub UserForm_QueryClose(Cancel As Integer, CloseMode As Integer)
Cancel = True
End Sub
-----------------------------------------------------------------------
Private Sub Edit_click()
On Error GoTo nameerror
ActiveWorkbook.Names("ÇáãÇÏÉ").Delete
ActiveWorkbook.Names("ÇáãÍÇÖÑ").Delete
ActiveWorkbook.Names("ÇáãæÇÚíÏ").Delete
nameerror:

s = Sheets("Helper").Range("H1048576").End(xlUp).Row
l = Sheets("Helper").Range("I1048576").End(xlUp).Row
Sheets("Entering").Activate
Dim rng As Range
Set rng = ActiveSheet.Range("A3:Q1002")

If ComboBox1.Value = "" Then
MsgBox "ãä ÝÖáß ÃÎÊÑ ÇáÃÓã ÇáãÑÇÏ ÊÚÏíá ÈíÇäÇÊå"

Else
For Each c In rng
If c = ComboBox1.Value Then
c.Select
ActiveCell.Offset(0, 1).Value = TextBox1.Value 'Phone
ActiveCell.Offset(0, 2).Value = TextBox2.Value 'Home
ActiveCell.Offset(0, 3).Value = ComboBox2.Value 'Grade
ActiveCell.Offset(0, 4).Value = TextBox3.Value 'Money
ActiveCell.Offset(0, 5).Value = TextBox4.Value 'Pay

ActiveCell.Offset(0, 7).Value = TextBox5.Value 'Study
Sheets("Helper").Cells(s + 1, 8) = TextBox5.Text

ActiveCell.Offset(0, 8).Value = TextBox6.Value 'Lecturer
Sheets("Helper").Cells(l + 1, 9) = TextBox6.Text

ActiveCell.Offset(0, 9).Value = ComboBox3.Value 'Day1
ActiveCell.Offset(0, 10).Value = TextBox7.Value 'Time1
t1 = Sheets("Helper").Range("J1048576").End(xlUp).Row
Sheets("Helper").Cells(t1 + 1, 10) = TextBox7.Text

ActiveCell.Offset(0, 11).Value = ComboBox4.Value 'Day2
ActiveCell.Offset(0, 12).Value = TextBox8.Value 'Time2
t2 = Sheets("Helper").Range("J1048576").End(xlUp).Row
Sheets("Helper").Cells(t2 + 1, 10) = TextBox8.Text

ActiveCell.Offset(0, 13).Value = ComboBox5.Value 'Day3
ActiveCell.Offset(0, 14).Value = TextBox9.Value 'Time3
t3 = Sheets("Helper").Range("J1048576").End(xlUp).Row
Sheets("Helper").Cells(t3 + 1, 10) = TextBox9.Text

ActiveCell.Offset(0, 15).Value = ComboBox6.Value 'Day4
ActiveCell.Offset(0, 16).Value = TextBox10.Value 'Time4
t4 = Sheets("Helper").Range("J1048576").End(xlUp).Row
Sheets("Helper").Cells(t4 + 1, 10) = TextBox10.Text

End If
Next c
TextBox1.Value = ""
TextBox2.Value = ""
TextBox3.Value = ""
TextBox4.Value = ""
TextBox5.Value = ""
TextBox6.Value = ""
TextBox7.Value = ""
TextBox8.Value = ""
TextBox9.Value = ""
TextBox10.Value = ""

ComboBox1.Value = ""
ComboBox2.Value = ""
ComboBox3.Value = ""
ComboBox4.Value = ""
ComboBox5.Value = ""
ComboBox6.Value = ""

Sheet10.Activate
Sheets("Helper").Range("H2:H1048576").RemoveDuplicates Columns:=1, Header:=xlNo
Sheets("Helper").Range("I2:I1048576").RemoveDuplicates Columns:=1, Header:=xlNo
Sheets("Helper").Range("J2:J1048576").RemoveDuplicates Columns:=1, Header:=xlNo

On Error GoTo blankserror
Sheets("Helper").Columns("H:H").Select
Selection.SpecialCells(xlCellTypeBlanks).Select
Selection.Delete Shift:=xlUp

Sheets("Helper").Columns("I:I").Select
Selection.SpecialCells(xlCellTypeBlanks).Select
Selection.Delete Shift:=xlUp

Sheets("Helper").Columns("J:J").Select
Selection.SpecialCells(xlCellTypeBlanks).Select
Selection.Delete Shift:=xlUp
blankserror:

s_n = Sheets("Helper").Range("H1048576").End(xlUp).Row
l_n = Sheets("Helper").Range("I1048576").End(xlUp).Row
t_n = Sheets("Helper").Range("J1048576").End(xlUp).Row
Range("H2:H" & s_n).Name = "ÇáãÇÏÉ"
Range("I2:I" & l_n).Name = "ÇáãÍÇÖÑ"
Range("J2:J" & t_n).Name = "ÇáãæÇÚíÏ"

MsgBox ("Êã ÊÚÏíá ÇáÈíÇäÇÊ ÈäÌÇÍ")
End If
End Sub
Private Sub Userform_Initialize()
Sheets("Entering").Activate
Dim s As Integer
With ActiveSheet
rng = .Range("A" & Rows.Count).End(xlUp).Row
For s = 3 To rng
If Range("A" & s) <> "" Then
Me.ComboBox1.AddItem .Range("A" & s)
End If
Next s
End With
End Sub
Sub combobox1_change()
LR = Sheets("Entering").Cells(Rows.Count, 2).End(xlUp).Row
Sheets("Entering").Activate

On Error GoTo ending
If ComboBox1.Value <> "" Then
TextBox1.Value = Application.WorksheetFunction.VLookup(ComboBox1.Value, ActiveSheet.Range("A3:Q1002"), 2, False) 'Phone
TextBox2.Value = Application.WorksheetFunction.VLookup(ComboBox1.Value, ActiveSheet.Range("A3:Q1002"), 3, False) 'Home
ComboBox2.Value = Application.WorksheetFunction.VLookup(ComboBox1.Value, ActiveSheet.Range("A3:Q1002"), 4, False) 'Grade
TextBox3.Value = Application.WorksheetFunction.VLookup(ComboBox1.Value, ActiveSheet.Range("A3:Q1002"), 5, False) 'Money
TextBox4.Value = Application.WorksheetFunction.VLookup(ComboBox1.Value, ActiveSheet.Range("A3:Q1002"), 6, False) 'Pay
TextBox5.Value = Application.WorksheetFunction.VLookup(ComboBox1.Value, ActiveSheet.Range("A3:Q1002"), 8, False) 'Study
TextBox6.Value = Application.WorksheetFunction.VLookup(ComboBox1.Value, ActiveSheet.Range("A3:Q1002"), 9, False) 'Lecturer

ComboBox3.Value = Application.WorksheetFunction.VLookup(ComboBox1.Value, ActiveSheet.Range("A3:Q1002"), 10, False) 'Day1
TextBox7.Value = Application.WorksheetFunction.VLookup(ComboBox1.Value, ActiveSheet.Range("A3:Q1002"), 11, False) 'Time1

ComboBox4.Value = Application.WorksheetFunction.VLookup(ComboBox1.Value, ActiveSheet.Range("A3:Q1002"), 12, False) 'Day2
TextBox8.Value = Application.WorksheetFunction.VLookup(ComboBox1.Value, ActiveSheet.Range("A3:Q1002"), 13, False) 'Time2

ComboBox5.Value = Application.WorksheetFunction.VLookup(ComboBox1.Value, ActiveSheet.Range("A3:Q1002"), 14, False) 'Day3
TextBox9.Value = Application.WorksheetFunction.VLookup(ComboBox1.Value, ActiveSheet.Range("A3:Q1002"), 15, False) 'Time3

ComboBox6.Value = Application.WorksheetFunction.VLookup(ComboBox1.Value, ActiveSheet.Range("A3:Q1002"), 16, False) 'Day4
TextBox10.Value = Application.WorksheetFunction.VLookup(ComboBox1.Value, ActiveSheet.Range("A3:Q1002"), 17, False) 'Time4
End If
ending:
End Sub
Private Sub ComboBox2_AfterUpdate()
x = WorksheetFunction.CountIf(Range("ÇáÝÑÞÉ"), ComboBox2.Value)
If x = 0 Then
MsgBox ("ÑÌÇÁ ÇÎÊíÇÑ ÇáÝÑÞÉ ãä ÇáÓåã ÇáãæÌæÏ íãíä ÇáÎáíå")
ComboBox2.Value = ""
End If
End Sub
Private Sub ComboBox3_AfterUpdate()
x = WorksheetFunction.CountIf(Range("ÇáÃíÇã"), ComboBox3.Value)
If x = 0 Then
MsgBox ("ÑÌÇÁ ÇÎÊíÇÑ Çáíæã ãä ÇáÓåã ÇáãæÌæÏ íãíä ÇáÎáíå")
ComboBox3.Value = ""
End If
End Sub
Private Sub ComboBox4_AfterUpdate()
x = WorksheetFunction.CountIf(Range("ÇáÃíÇã"), ComboBox4.Value)
If x = 0 Then
MsgBox ("ÑÌÇÁ ÇÎÊíÇÑ Çáíæã ãä ÇáÓåã ÇáãæÌæÏ íãíä ÇáÎáíå")
ComboBox4.Value = ""
End If
End Sub
Private Sub ComboBox5_AfterUpdate()
x = WorksheetFunction.CountIf(Range("ÇáÃíÇã"), ComboBox5.Value)
If x = 0 Then
MsgBox ("ÑÌÇÁ ÇÎÊíÇÑ Çáíæã ãä ÇáÓåã ÇáãæÌæÏ íãíä ÇáÎáíå")
ComboBox5.Value = ""
End If
End Sub
Private Sub ComboBox6_AfterUpdate()
x = WorksheetFunction.CountIf(Range("ÇáÃíÇã"), ComboBox6.Value)
If x = 0 Then
MsgBox ("ÑÌÇÁ ÇÎÊíÇÑ Çáíæã ãä ÇáÓåã ÇáãæÌæÏ íãíä ÇáÎáíå")
ComboBox6.Value = ""
End If
End Sub
Private Sub ComboBox3_change()
If ComboBox3.Value = "ÇáÓÈÊ" Then ComboBox4.Value = "ÇáËáÇËÇÁ"
If ComboBox3.Value = "ÇáÃÍÏ" Then ComboBox4.Value = "ÇáÃÑÈÚÇÁ"
If ComboBox3.Value = "ÇáÃËäíä" Then ComboBox4.Value = "ÇáÎãíÓ"
End Sub
Private Sub ComboBox5_change()
If ComboBox5.Value = "ÇáÓÈÊ" Then ComboBox6.Value = "ÇáËáÇËÇÁ"
If ComboBox5.Value = "ÇáÃÍÏ" Then ComboBox6.Value = "ÇáÃÑÈÚÇÁ"
If ComboBox5.Value = "ÇáÃËäíä" Then ComboBox6.Value = "ÇáÎãíÓ"
End Sub
Private Sub TextBox7_change()
If TextBox7.Value <> "" Then TextBox8.Value = TextBox7.Value
End Sub
Private Sub TextBox9_change()
If TextBox9.Value <> "" Then TextBox10.Value = TextBox9.Value
End Sub
Private Sub Back_to_main_Click()
Edit_Win.Hide
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
Login.Show
End Sub
Private Sub UserForm_QueryClose(Cancel As Integer, CloseMode As Integer)
Cancel = True
End Sub
-----------------------------------------------------------------------
Sub out_click()
Application.Quit
Application.DisplayAlerts = False
ActiveWorkbook.Close savechanges:=False
End Sub
Sub Save_click()
ActiveWorkbook.Save
MsgBox "Êã ÍÝÙ ÇáÈíÇäÇÊ ÈäÌÇÍ"
End Sub
Sub Add_click()
Login.Hide
Add_Win.Show
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Table").Visible = True Then Sheets("Table").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
End Sub
Sub Del_click()
Login.Hide
Del_Win.Show
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Table").Visible = True Then Sheets("Table").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
End Sub
Sub Edit_click()
Login.Hide
Edit_Win.Show
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Table").Visible = True Then Sheets("Table").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
End Sub
Sub Search_click()
Login.Hide
Search_Win.Show
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Table").Visible = True Then Sheets("Table").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
End Sub
Sub Groups_click()
Login.Hide
Select_group.Show
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Table").Visible = True Then Sheets("Table").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
End Sub
Private Sub Center_Click()
Login.Hide
Center_Table.Show
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Table").Visible = True Then Sheets("Table").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
End Sub
Private Sub UserForm_QueryClose(Cancel As Integer, CloseMode As Integer)
Cancel = True
End Sub
-----------------------------------------------------------------------
Private Sub TextBox1_Change()
Sheets("Entering").Activate
ListBox1.Clear
LR = Sheets("Entering").Cells(Rows.Count, 2).End(xlUp).Row
K = 0
For Each c In Range("A3:A" & LR)
B = InStr(c, TextBox1)

If B > 0 Then
    ListBox1.AddItem
    ListBox1.List(K, 0) = Cells(c.Row, 1).Value
    ListBox1.List(K, 1) = Cells(c.Row, 2).Value
    ListBox1.List(K, 2) = Cells(c.Row, 3).Value
    ListBox1.List(K, 3) = Cells(c.Row, 4).Value
    ListBox1.List(K, 4) = Cells(c.Row, 5).Value
    ListBox1.List(K, 5) = Cells(c.Row, 6).Value
    ListBox1.List(K, 6) = Cells(c.Row, 7).Value
    ListBox1.List(K, 7) = Cells(c.Row, 8).Value
    ListBox1.List(K, 8) = Cells(c.Row, 9).Value
    ListBox1.List(K, 9) = Cells(c.Row, 10).Value
    
    ListBox2.AddItem
    ListBox2.List(K, 0) = Cells(c.Row, 11).Value
    ListBox2.List(K, 1) = Cells(c.Row, 12).Value
    ListBox2.List(K, 2) = Cells(c.Row, 13).Value
    ListBox2.List(K, 3) = Cells(c.Row, 14).Value
    ListBox2.List(K, 4) = Cells(c.Row, 15).Value
    ListBox2.List(K, 5) = Cells(c.Row, 16).Value
    ListBox2.List(K, 6) = Cells(c.Row, 17).Value
    ListBox2.List(K, 7) = Cells(c.Row, 18).Value
    ListBox2.List(K, 8) = Cells(c.Row, 19).Value
    ListBox2.List(K, 9) = Cells(c.Row, 20).Value
        K = K + 1
        End If
        Next c
End Sub
Private Sub listBox1_DblClick(ByVal Cancel As MSForms.ReturnBoolean)
For I = 0 To ListBox1.ListCount
If ListBox1.Selected(I) = True Then
TextBox1.Value = ListBox1.Value
End If
Next I
End Sub
Private Sub Start_search_Click()
If TextBox1.Text = "" Then
TextBox2.Value = ""
TextBox3.Value = ""
TextBox4.Value = ""
TextBox5.Value = ""
TextBox6.Value = ""
TextBox7.Value = ""
TextBox8.Value = ""
TextBox9.Value = ""
TextBox10.Value = ""
TextBox11.Value = ""
TextBox12.Value = ""
TextBox13.Value = ""
TextBox14.Value = ""
TextBox15.Value = ""
TextBox16.Value = ""
TextBox17.Value = ""

MsgBox ("ãä ÝÖáß Þã ÈÇÏÎÇá ÇáÇÓã ÇáãÑÇÏ ÇáÈÍË Úäå")
Else
TextBox2.Value = ListBox1.List(I, 1)
TextBox3.Value = ListBox1.List(I, 2)
TextBox4.Value = ListBox1.List(I, 3)
TextBox5.Value = ListBox1.List(I, 4)
TextBox6.Value = ListBox1.List(I, 5)
TextBox7.Value = ListBox1.List(I, 6)
TextBox8.Value = ListBox1.List(I, 7)
TextBox9.Value = ListBox1.List(I, 8)

TextBox10.Value = ListBox1.List(I, 9)
TextBox14.Value = ListBox2.List(I, 0)

TextBox11.Value = ListBox2.List(I, 1)
TextBox15.Value = ListBox2.List(I, 2)

TextBox12.Value = ListBox2.List(I, 3)
TextBox17.Value = ListBox2.List(I, 6)

TextBox16.Value = ListBox2.List(I, 4)
TextBox13.Value = ListBox2.List(I, 5)

End If
End Sub
Private Sub Clear_Click()
ListBox1.Visible = True
TextBox1.Value = ""
TextBox2.Value = ""
TextBox3.Value = ""
TextBox4.Value = ""
TextBox5.Value = ""
TextBox6.Value = ""
TextBox7.Value = ""
TextBox8.Value = ""
TextBox9.Value = ""
TextBox10.Value = ""
TextBox11.Value = ""
TextBox12.Value = ""
TextBox13.Value = ""
TextBox14.Value = ""
TextBox15.Value = ""
TextBox16.Value = ""
TextBox17.Value = ""

ListBox1.Clear
ListBox2.Clear
End Sub
Private Sub Back_to_main_Click()
ListBox1.Visible = True
TextBox1.Value = ""
TextBox2.Value = ""
TextBox3.Value = ""
TextBox4.Value = ""
TextBox5.Value = ""
TextBox6.Value = ""
TextBox7.Value = ""
TextBox8.Value = ""
TextBox9.Value = ""
TextBox10.Value = ""
TextBox11.Value = ""
TextBox12.Value = ""
TextBox13.Value = ""
TextBox14.Value = ""
TextBox15.Value = ""
TextBox16.Value = ""
TextBox17.Value = ""
ListBox1.Clear
ListBox2.Clear

Search_Win.Hide
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
Login.Show
End Sub
Private Sub UserForm_QueryClose(Cancel As Integer, CloseMode As Integer)
Cancel = True
End Sub
-----------------------------------------------------------------------
Private Sub Userform_Activate()
ComboBox5.RowSource = "ÇáãæÇÚíÏ"
ComboBox6.RowSource = "ÇáãæÇÚíÏ"
ComboBox7.RowSource = "ÇáãæÇÚíÏ"
ComboBox8.RowSource = "ÇáãæÇÚíÏ"
ComboBox9.RowSource = "ÇáãÇÏÉ"
ComboBox10.RowSource = "ÇáãÍÇÖÑ"
End Sub
Private Sub Displayname_Click()
Dim rng As Range
Set rng = Sheet3.Range("A2:Q1002")

D1 = ComboBox1.Value 'Day_1 Column J (10)
D2 = ComboBox2.Value 'Day_2 Column L (12)
D3 = ComboBox3.Value 'Day_3 Column N (14)
D4 = ComboBox4.Value 'Day_4 Column P (16)

t1 = ComboBox5.Value 'Time_1 Column K (11)
t2 = ComboBox6.Value 'Time_2 Column M (13)
t3 = ComboBox7.Value 'Time_3 Column O (15)
t4 = ComboBox8.Value 'Time_4 Column Q (17)

Grade = ComboBox11.Value 'Grade Column D (4)
Stu = ComboBox9.Value 'Study Column H (8)
Lec = ComboBox10.Value 'Lecturer Column I (9)


If ComboBox11.Value = Empty Then 'Grade
rng.AutoFilter Field:=4
Else
rng.AutoFilter Field:=4, Criteria1:=Grade
End If

If ComboBox9.Value = Empty Then 'Study
rng.AutoFilter Field:=8
Else
rng.AutoFilter Field:=8, Criteria1:=Stu
End If

If ComboBox10.Value = Empty Then 'Lecturer
rng.AutoFilter Field:=9
Else
rng.AutoFilter Field:=9, Criteria1:=Lec
End If

If ComboBox1.Value = Empty Then 'Day 1
rng.AutoFilter Field:=10
Else
rng.AutoFilter Field:=10, Criteria1:=D1
End If

If ComboBox2.Value = Empty Then 'Day 2
rng.AutoFilter Field:=12
Else
rng.AutoFilter Field:=12, Criteria1:=D2
End If

If ComboBox3.Value = Empty Then 'Day 3
rng.AutoFilter Field:=14
Else
rng.AutoFilter Field:=14, Criteria1:=D3
End If

If ComboBox4.Value = Empty Then 'Day 4
rng.AutoFilter Field:=16
Else
rng.AutoFilter Field:=16, Criteria1:=D4
End If

If ComboBox5.Value = Empty Then 'Time 1
rng.AutoFilter Field:=11
Else
rng.AutoFilter Field:=11, Criteria1:=t1
End If

If ComboBox6.Value = Empty Then 'Time 2
rng.AutoFilter Field:=13
Else
rng.AutoFilter Field:=13, Criteria1:=t2
End If

If ComboBox7.Value = Empty Then 'Time 3
rng.AutoFilter Field:=15
Else
rng.AutoFilter Field:=15, Criteria1:=t3
End If

If ComboBox8.Value = Empty Then 'Time 4
rng.AutoFilter Field:=17
Else
rng.AutoFilter Field:=17, Criteria1:=t4
End If

Application.Visible = True
Sheet3.Activate
If Sheets("Entering").Visible = False Then Sheets("Entering").Visible = True

If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
If Sheets("App_form").Visible = True Then Sheets("App_form").Visible = False
If Sheets("Table").Visible = True Then Sheets("Table").Visible = False
Prntnow.Visible = True

ComboBox1.Value = ""
ComboBox2.Value = ""
ComboBox3.Value = ""
ComboBox4.Value = ""
ComboBox5.Value = ""
ComboBox6.Value = ""
ComboBox7.Value = ""
ComboBox8.Value = ""
ComboBox9.Value = ""
ComboBox10.Value = ""
ComboBox11.Value = ""
ST_money = ""
ST_pay = ""
ST_remain = ""
End Sub
Private Sub combobox1_change()
If ComboBox1.Value = "ÇáÓÈÊ" Then ComboBox2.Value = "ÇáËáÇËÇÁ"
If ComboBox1.Value = "ÇáÃÍÏ" Then ComboBox2.Value = "ÇáÃÑÈÚÇÁ"
If ComboBox1.Value = "ÇáÃËäíä" Then ComboBox2.Value = "ÇáÎãíÓ"
End Sub
Private Sub ComboBox3_change()
If ComboBox3.Value = "ÇáÓÈÊ" Then ComboBox4.Value = "ÇáËáÇËÇÁ"
If ComboBox3.Value = "ÇáÃÍÏ" Then ComboBox4.Value = "ÇáÃÑÈÚÇÁ"
If ComboBox3.Value = "ÇáÃËäíä" Then ComboBox4.Value = "ÇáÎãíÓ"
End Sub
Private Sub ComboBox5_change()
If ComboBox5.Value <> "" Then ComboBox6.Value = ComboBox5.Value
End Sub
Private Sub ComboBox7_change()
If ComboBox7.Value <> "" Then ComboBox8.Value = ComboBox7.Value
End Sub
Private Sub Calc_Click()
TextBox1.Visible = True
Passlbl.Visible = True
passwordinput.Visible = True
End Sub
Private Sub passwordinput_click()
If TextBox1.Value = "" Then
MsgBox "ÈÑÌÇÁ ÅÏÎÇá ÇáÑÞã ÇáÓÑí"
ElseIf TextBox1.Value = "xxxxxxxx" Then
ST_money = Sheets("Helper").Cells(3, 4)
ST_pay = Sheets("Helper").Cells(3, 5)
ST_remain = Sheets("Helper").Cells(3, 6)
Else
MsgBox "ÇáÑÞã ÇáÓÑí ÛíÑ ÕÍíÍ"
End If
TextBox1.Value = ""
End Sub
Private Sub Prntnow_Click()
Sheets("Entering").PrintOut
End Sub
Private Sub Prntall_Click()
Dim rng As Range
Set rng = Sheet3.Range("A2:Q1002")

rng.AutoFilter Field:=17
rng.AutoFilter Field:=16
rng.AutoFilter Field:=15
rng.AutoFilter Field:=14
rng.AutoFilter Field:=13
rng.AutoFilter Field:=12
rng.AutoFilter Field:=11
rng.AutoFilter Field:=10
rng.AutoFilter Field:=9
rng.AutoFilter Field:=8
rng.AutoFilter Field:=4

If Sheets("Entering").Visible = False Then Sheets("Entering").Visible = True
LR = Range("A" & Rows.Count).End(xlUp).Row
Sheets("Entering").Range("A1:Q" & LR).PrintOut
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
End Sub
Private Sub Back_to_main_Click()
Dim rng As Range
Set rng = Sheet3.Range("A2:Q1002")

Prntnow.Visible = False
Passlbl.Visible = False
TextBox1.Value = ""
TextBox1.Visible = False
passwordinput.Visible = False

ComboBox1.Value = ""
ComboBox2.Value = ""
ComboBox3.Value = ""
ComboBox4.Value = ""
ComboBox5.Value = ""
ComboBox6.Value = ""
ComboBox7.Value = ""
ComboBox8.Value = ""
ComboBox9.Value = ""
ComboBox10.Value = ""
ComboBox11.Value = ""
ST_money = ""
ST_pay = ""
ST_remain = ""

rng.AutoFilter Field:=17
rng.AutoFilter Field:=16
rng.AutoFilter Field:=15
rng.AutoFilter Field:=14
rng.AutoFilter Field:=13
rng.AutoFilter Field:=12
rng.AutoFilter Field:=11
rng.AutoFilter Field:=10
rng.AutoFilter Field:=9
rng.AutoFilter Field:=8
rng.AutoFilter Field:=4

Select_group.Hide
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
If Sheets("App_form").Visible = True Then Sheets("App_form").Visible = False
If Sheets("Table").Visible = True Then Sheets("Table").Visible = False
Application.Visible = False
Login.Show
End Sub
Private Sub UserForm_QueryClose(Cancel As Integer, CloseMode As Integer)
Cancel = True
End Sub