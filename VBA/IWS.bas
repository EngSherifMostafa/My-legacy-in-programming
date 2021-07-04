Private Sub Workbook_Open()
    With ActiveWindow
        .DisplayHorizontalScrollBar = False
        .DisplayVerticalScrollBar = False
        End With
        ActiveWindow.DisplayWorkbookTabs = False
End Sub

'Add win
Private Sub Back_to_main_Click()
Add_Win.Hide
Login_Win.Show
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
If Sheets("BARAKA 1").Visible = True Then Sheets("BARAKA 1").Visible = False
If Sheets("ASD").Visible = True Then Sheets("ASD").Visible = False
If Sheets("Salam 1").Visible = True Then Sheets("Salam 1").Visible = False
If Sheets("Salam 5").Visible = True Then Sheets("Salam 5").Visible = False
If Sheets("Salam 7").Visible = True Then Sheets("Salam 7").Visible = False
If Sheets("F.BAKR").Visible = True Then Sheets("F.BAKR").Visible = False
If Sheets("MOAWEN 7").Visible = True Then Sheets("MOAWEN 7").Visible = False
End Sub
Private Sub OK_Click()
If TextBox1.Value = "" Or TextBox7.Value = "" Or TextBox8.Value = "" Then
MsgBox "ãä ÝÖáß ÊÃßÏ ãä ÇÏÎÇá ÇáÈíÇäÇÊ Ýí ÇáÍÞæá ÐÇÊ Çááæä ÇáÇÍãÑ"

Else
Sheets("Entering").Activate

LR = Range("A" & Rows.Count).End(xlUp).Row

Range("A" & LR + 1).Value = TextBox1.Value
Range("A" & LR + 1).Offset(0, 1).Value = TextBox2.Value
Range("A" & LR + 1).Offset(0, 2).Value = TextBox3.Value
Range("A" & LR + 1).Offset(0, 3).Value = TextBox4.Value
Range("A" & LR + 1).Offset(0, 4).Value = TextBox5.Value
Range("A" & LR + 1).Offset(0, 5).Value = TextBox6.Value
Range("A" & LR + 1).Offset(0, 6).Value = CDate(TextBox7.Value)
Range("A" & LR + 1).Offset(0, 8).Value = CDate(TextBox8.Value)
Range("A" & LR + 1).Offset(0, 10).Value = TextBox9.Value
Range("A" & LR + 1).Offset(0, 11).Value = TextBox10.Value
Range("A" & LR + 1).Offset(0, 12).Value = TextBox11.Value
Range("A" & LR + 1).Offset(0, 13).Value = TextBox12.Value
Range("A" & LR + 1).Offset(0, 14).Value = TextBox13.Value
Range("A" & LR + 1).Offset(0, 15).Value = TextBox14.Value
Range("A" & LR + 1).Offset(0, 16).Value = TextBox15.Value
Range("A" & LR + 1).Offset(0, 17).Value = TextBox16.Value
Range("A" & LR + 1).Offset(0, 18).Value = TextBox17.Value
Range("A" & LR + 1).Offset(0, 19).Value = TextBox18.Value
Range("A" & LR + 1).Offset(0, 20).Value = TextBox19.Value
Range("A" & LR + 1).Offset(0, 21).Value = TextBox20.Value
Range("A" & LR + 1).Offset(0, 22).Value = TextBox21.Value
Range("A" & LR + 1).Offset(0, 23).Value = TextBox22.Value
Range("A" & LR + 1).Offset(0, 24).Value = TextBox23.Value
Range("A" & LR + 1).Offset(0, 25).Value = TextBox24.Value
Range("A" & LR + 1).Offset(0, 26).Value = TextBox25.Value

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
TextBox18.Value = ""
TextBox19.Value = ""
TextBox20.Value = ""
TextBox21.Value = ""
TextBox22.Value = ""
TextBox23.Value = ""
TextBox24.Value = ""
TextBox25.Value = ""

MsgBox ("Êã ÇÖÇÝå ÇáÈíÇäÇÊ ÈäÌÇÍ")
End If
End Sub
Private Sub TextBox9_AfterUpdate()
x = WorksheetFunction.CountIf(Range("ÇáÏÑÌå"), TextBox9.Value)
If x = 0 Then
MsgBox ("ÑÌÇÁ ÇÎÊíÇÑ ÇáÈíÇä ãä ÇáÓåã ÇáãæÌæÏ íãíä ÇáÎáíå")
TextBox9.Value = ""
End If
End Sub
Private Sub TextBox10_AfterUpdate()
x = WorksheetFunction.CountIf(Range("ÇáãÄåá"), TextBox10.Value)
If x = 0 Then
MsgBox ("ÑÌÇÁ ÇÎÊíÇÑ ÇáÈíÇä ãä ÇáÓåã ÇáãæÌæÏ íãíä ÇáÎáíå")
TextBox10.Value = ""
End If
End Sub
Private Sub TextBox12_AfterUpdate()
x = WorksheetFunction.CountIf(Range("ÝÕíáå_ÇáÏã"), TextBox12.Value)
If x = 0 Then
MsgBox ("ÑÌÇÁ ÇÎÊíÇÑ ÇáÈíÇä ãä ÇáÓåã ÇáãæÌæÏ íãíä ÇáÎáíå")
TextBox12.Value = ""
End If
End Sub
Private Sub userform_Queryclose(cancel As Integer, closemode As Integer)
cancel = True
End Sub

'Del win
Private Sub Back_to_main_Click()
Del_Win.Hide
Login_Win.Show
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
If Sheets("BARAKA 1").Visible = True Then Sheets("BARAKA 1").Visible = False
If Sheets("ASD").Visible = True Then Sheets("ASD").Visible = False
If Sheets("Salam 1").Visible = True Then Sheets("Salam 1").Visible = False
If Sheets("Salam 5").Visible = True Then Sheets("Salam 5").Visible = False
If Sheets("Salam 7").Visible = True Then Sheets("Salam 7").Visible = False
If Sheets("F.BAKR").Visible = True Then Sheets("F.BAKR").Visible = False
If Sheets("MOAWEN 7").Visible = True Then Sheets("MOAWEN 7").Visible = False
End Sub
Private Sub Del_Click()
If ComboBox1.Value = "" Then
MsgBox ("ãä ÝÖáß ÇÎÊÑ ÇáÇÓã ÇáãÑÇÏ ÍÐÝå")
Else
For Each c In Range("a2:aaa1000")
If c = ComboBox1.Value Then
c.Select
Exit For
End If
Next c
ActiveCell.Value = ""
ActiveCell.Offset(0, 1).Value = ""
ActiveCell.Offset(0, 2).Value = ""
ActiveCell.Offset(0, 3).Value = ""
ActiveCell.Offset(0, 4).Value = ""
ActiveCell.Offset(0, 5).Value = ""
ActiveCell.Offset(0, 6).Value = ""
ActiveCell.Offset(0, 8).Value = ""
ActiveCell.Offset(0, 10).Value = ""
ActiveCell.Offset(0, 11).Value = ""
ActiveCell.Offset(0, 12).Value = ""
ActiveCell.Offset(0, 13).Value = ""
ActiveCell.Offset(0, 14).Value = ""
ActiveCell.Offset(0, 15).Value = ""
ActiveCell.Offset(0, 16).Value = ""
ActiveCell.Offset(0, 17).Value = ""
ActiveCell.Offset(0, 18).Value = ""
ActiveCell.Offset(0, 19).Value = ""
ActiveCell.Offset(0, 20).Value = ""
ActiveCell.Offset(0, 21).Value = ""
ActiveCell.Offset(0, 22).Value = ""
ActiveCell.Offset(0, 23).Value = ""
ActiveCell.Offset(0, 24).Value = ""
ActiveCell.Offset(0, 25).Value = ""
ActiveCell.Offset(0, 26).Value = ""
ActiveCell.Offset(0, 27).Value = ""

MsgBox ("Êã ÇáÍÐÝ ÈäÌÇÍ !")
ComboBox1.Value = ""
End If
End Sub
Private Sub Userform_Initialize()
Sheets("Entering").Activate
Dim s As Integer
With ActiveSheet
rng = .Range("a" & Rows.Count).End(xlUp).Row
For s = 2 To rng
If Range("a" & s) <> "" Then
Me.ComboBox1.AddItem .Range("a" & s)
End If
Next s
End With
End Sub
Private Sub userform_Queryclose(cancel As Integer, closemode As Integer)
cancel = True
End Sub

'Edit shift
Private Sub Back_to_main_Click()
Edit_shift.Hide
Login_Win.Show
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
If Sheets("BARAKA 1").Visible = True Then Sheets("BARAKA 1").Visible = False
If Sheets("ASD").Visible = True Then Sheets("ASD").Visible = False
If Sheets("Salam 1").Visible = True Then Sheets("Salam 1").Visible = False
If Sheets("Salam 5").Visible = True Then Sheets("Salam 5").Visible = False
If Sheets("Salam 7").Visible = True Then Sheets("Salam 7").Visible = False
If Sheets("F.BAKR").Visible = True Then Sheets("F.BAKR").Visible = False
If Sheets("MOAWEN 7").Visible = True Then Sheets("MOAWEN 7").Visible = False
End Sub
Private Sub combobox1_AfterUpdate()
x = WorksheetFunction.CountIf(Sheets("Helper").Range("F2:I18"), ComboBox1.Value)
If x = 0 Then
MsgBox ("ÑÌÇÁ ÇÎÊíÇÑ ÇáæÍÏÉ ãä ÇáÓåã ÇáãæÌæÏ íãíä ÇáÎáíå")
ComboBox1.Value = ""
End If
End Sub
Private Sub combobox2_AfterUpdate()
LR = Sheets("Entering").Cells(Rows.Count, 2).End(xlUp).Row
x = WorksheetFunction.CountIf(Sheets("Entering").Range("A2:A" & LR), ComboBox2.Value)
If x = 0 Then
MsgBox ("ÑÌÇÁ ÇÎÊíÇÑ ÇáÃÓã ãä ÇáÓåã ÇáãæÌæÏ íãíä ÇáÎáíå")
ComboBox2.Value = ""
End If
End Sub
Private Sub combobox3_AfterUpdate()
LR = Sheets("Entering").Cells(Rows.Count, 2).End(xlUp).Row
x = WorksheetFunction.CountIf(Sheets("Entering").Range("A2:A" & LR), ComboBox3.Value)
If x = 0 Then
MsgBox ("ÑÌÇÁ ÇÎÊíÇÑ ÇáÃÓã ãä ÇáÓåã ÇáãæÌæÏ íãíä ÇáÎáíå")
ComboBox3.Value = ""
End If
End Sub
Private Sub combobox4_AfterUpdate()
LR = Sheets("Entering").Cells(Rows.Count, 2).End(xlUp).Row
x = WorksheetFunction.CountIf(Sheets("Entering").Range("A2:A" & LR), ComboBox4.Value)
If x = 0 Then
MsgBox ("ÑÌÇÁ ÇÎÊíÇÑ ÇáÃÓã ãä ÇáÓåã ÇáãæÌæÏ íãíä ÇáÎáíå")
ComboBox4.Value = ""
End If
End Sub
Private Sub combobox1_change()
Sheets("Helper").Activate
Set rng = Range("F2:I18")

On Error GoTo ending
ComboBox2.Value = Application.WorksheetFunction.VLookup(ComboBox1.Value, rng, 2, False)
ComboBox3.Value = Application.WorksheetFunction.VLookup(ComboBox1.Value, rng, 3, False)
ComboBox4.Value = Application.WorksheetFunction.VLookup(ComboBox1.Value, rng, 4, False)
ending:

If (ComboBox1.Value <> "") Then
    With Sheets("Entering")
       ComboBox2.RowSource = _
        "'" & .Name & "'!" & .Range("A2", .Range("A65536").End(xlUp)).Address
        
        ComboBox3.RowSource = _
        "'" & .Name & "'!" & .Range("A2", .Range("A65536").End(xlUp)).Address
        
        ComboBox4.RowSource = _
        "'" & .Name & "'!" & .Range("A2", .Range("A65536").End(xlUp)).Address
    End With

End If
End Sub
Private Sub Edit_Click()
If (ComboBox1.Value <> "" And ComboBox2.Value <> "" Or ComboBox3.Value <> "" Or ComboBox4.Value <> "") Then
For Each c In Range("F2:I18")
If c = ComboBox1.Value Then
c.Select
ActiveCell.Offset(0, 1).Value = ComboBox2.Value
ActiveCell.Offset(0, 2).Value = ComboBox3.Value
ActiveCell.Offset(0, 3).Value = ComboBox4.Value
End If
Next c

ComboBox1.Value = ""
ComboBox2.Value = ""
ComboBox3.Value = ""
ComboBox4.Value = ""
MsgBox ("Êã ÇáÊÚÏíá ÈäÌÇÍ")

End If
End Sub
Private Sub userform_Queryclose(cancel As Integer, closemode As Integer)
cancel = True
End Sub

'Edit win
Private Sub Back_to_main_Click()
Edit_Win.Hide
Login_Win.Show
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
If Sheets("BARAKA 1").Visible = True Then Sheets("BARAKA 1").Visible = False
If Sheets("ASD").Visible = True Then Sheets("ASD").Visible = False
If Sheets("Salam 1").Visible = True Then Sheets("Salam 1").Visible = False
If Sheets("Salam 5").Visible = True Then Sheets("Salam 5").Visible = False
If Sheets("Salam 7").Visible = True Then Sheets("Salam 7").Visible = False
If Sheets("F.BAKR").Visible = True Then Sheets("F.BAKR").Visible = False
If Sheets("MOAWEN 7").Visible = True Then Sheets("MOAWEN 7").Visible = False
End Sub
Private Sub OK_Click()
If ComboBox1.Value = "" Or TextBox7.Value = "" Or TextBox8.Value = "" Then
MsgBox "ãä ÝÖáß ÊÃßÏ ãä ÇÏÎÇá ÇáÈíÇäÇÊ Ýí ÇáÎáÇíÇ ÐÇÊ Çááæä ÇáÇÍãÑ"

Else
LR = Sheets("Entering").Range("A" & Rows.Count).End(xlUp).Row
For Each c In Range("A2:A" & LR)
If c = ComboBox1.Value Then
c.Select
ActiveCell.Offset(0, 1).Value = TextBox2.Text
ActiveCell.Offset(0, 2).Value = TextBox3.Text
ActiveCell.Offset(0, 3).Value = TextBox4.Text
ActiveCell.Offset(0, 4).Value = TextBox5.Text
ActiveCell.Offset(0, 5).Value = TextBox6.Text
ActiveCell.Offset(0, 6).Value = Format(TextBox7.Text, "dd/mm/yyyy")
ActiveCell.Offset(0, 8).Value = Format(TextBox8.Text, "dd/mm/yyyy")
ActiveCell.Offset(0, 10).Value = TextBox9.Text
ActiveCell.Offset(0, 11).Value = TextBox10.Text
ActiveCell.Offset(0, 12).Value = TextBox11.Text
ActiveCell.Offset(0, 13).Value = TextBox12.Text
ActiveCell.Offset(0, 14).Value = TextBox13.Text
ActiveCell.Offset(0, 15).Value = TextBox14.Text
ActiveCell.Offset(0, 16).Value = TextBox15.Text
ActiveCell.Offset(0, 17).Value = TextBox16.Text
ActiveCell.Offset(0, 18).Value = TextBox17.Text
ActiveCell.Offset(0, 19).Value = TextBox18.Text
ActiveCell.Offset(0, 20).Value = TextBox19.Text
ActiveCell.Offset(0, 21).Value = TextBox20.Text
ActiveCell.Offset(0, 22).Value = TextBox21.Text
ActiveCell.Offset(0, 23).Value = TextBox22.Text
ActiveCell.Offset(0, 24).Value = TextBox23.Text
ActiveCell.Offset(0, 25).Value = TextBox24.Text
ActiveCell.Offset(0, 26).Value = TextBox25.Text
End If
Next c

ComboBox1.Value = ""
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
TextBox18.Value = ""
TextBox19.Value = ""
TextBox20.Value = ""
TextBox21.Value = ""
TextBox22.Value = ""
TextBox23.Value = ""
TextBox24.Value = ""
TextBox25.Value = ""

MsgBox ("Êã ÊÚÏíá ÇáÈíÇäÇÊ ÈäÌÇÍ")
End If
End Sub
Private Sub TextBox9_AfterUpdate()
x = WorksheetFunction.CountIf(Range("ÇáÏÑÌå"), TextBox9.Value)
If x = 0 Then
MsgBox ("ÑÌÇÁ ÇÎÊíÇÑ ÇáÈíÇä ãä ÇáÓåã ÇáãæÌæÏ íãíä ÇáÎáíå")
TextBox9.Value = ""
End If
End Sub
Private Sub TextBox10_AfterUpdate()
x = WorksheetFunction.CountIf(Range("ÇáãÄåá"), TextBox10.Value)
If x = 0 Then
MsgBox ("ÑÌÇÁ ÇÎÊíÇÑ ÇáÈíÇä ãä ÇáÓåã ÇáãæÌæÏ íãíä ÇáÎáíå")
TextBox10.Value = ""
End If
End Sub
Private Sub TextBox12_AfterUpdate()
x = WorksheetFunction.CountIf(Range("ÝÕíáå_ÇáÏã"), TextBox12.Value)
If x = 0 Then
MsgBox ("ÑÌÇÁ ÇÎÊíÇÑ ÇáÈíÇä ãä ÇáÓåã ÇáãæÌæÏ íãíä ÇáÎáíå")
TextBox12.Value = ""
End If
End Sub
Private Sub Userform_Initialize()
Sheets("Entering").Activate
Dim s As Integer
With ActiveSheet
rng = .Range("a" & Rows.Count).End(xlUp).Row
For s = 2 To rng
If Range("a" & s) <> "" Then
Me.ComboBox1.AddItem .Range("a" & s)
End If
Next s
End With
End Sub
Sub combobox1_change()
Sheets("Entering").Activate
LR = Sheets("Entering").Range("A" & Rows.Count).End(xlUp).Row
If ComboBox1.Value <> "" Then
On Error GoTo ending
TextBox2.Value = Application.WorksheetFunction.VLookup(ComboBox1.Text, ActiveSheet.Range("A2:AAA" & LR), 2, 0)
TextBox3.Value = Application.WorksheetFunction.VLookup(ComboBox1.Text, ActiveSheet.Range("A2:AAA" & LR), 3, 0)
TextBox4.Value = Application.WorksheetFunction.VLookup(ComboBox1.Text, ActiveSheet.Range("A2:AAA" & LR), 4, 0)
TextBox5.Value = Application.WorksheetFunction.VLookup(ComboBox1.Text, ActiveSheet.Range("A2:AAA" & LR), 5, 0)
TextBox6.Value = Application.WorksheetFunction.VLookup(ComboBox1.Text, ActiveSheet.Range("A2:AAA" & LR), 6, 0)
TextBox7.Value = Format(Application.WorksheetFunction.VLookup(ComboBox1.Text, ActiveSheet.Range("A2:AAA" & LR), 7, 0), "dd/mm/yyyy")
TextBox8.Value = Format(Application.WorksheetFunction.VLookup(ComboBox1.Text, ActiveSheet.Range("A2:AAA" & LR), 9, 0), "dd/mm/yyyy")
TextBox9.Value = Application.WorksheetFunction.VLookup(ComboBox1.Text, ActiveSheet.Range("A2:AAA" & LR), 11, 0)
TextBox10.Value = Application.WorksheetFunction.VLookup(ComboBox1.Text, ActiveSheet.Range("A2:AAA" & LR), 12, 0)
TextBox11.Value = Application.WorksheetFunction.VLookup(ComboBox1.Text, ActiveSheet.Range("A2:AAA" & LR), 13, 0)
TextBox12.Value = Application.WorksheetFunction.VLookup(ComboBox1.Text, ActiveSheet.Range("A2:AAA" & LR), 14, 0)
TextBox13.Value = Application.WorksheetFunction.VLookup(ComboBox1.Text, ActiveSheet.Range("A2:AAA" & LR), 15, 0)
TextBox14.Value = Application.WorksheetFunction.VLookup(ComboBox1.Text, ActiveSheet.Range("A2:AAA" & LR), 16, 0)
TextBox15.Value = Application.WorksheetFunction.VLookup(ComboBox1.Text, ActiveSheet.Range("A2:AAA" & LR), 17, 0)
TextBox16.Value = Application.WorksheetFunction.VLookup(ComboBox1.Text, ActiveSheet.Range("A2:AAA" & LR), 18, 0)
TextBox17.Value = Application.WorksheetFunction.VLookup(ComboBox1.Text, ActiveSheet.Range("A2:AAA" & LR), 19, 0)
TextBox18.Value = Application.WorksheetFunction.VLookup(ComboBox1.Text, ActiveSheet.Range("A2:AAA" & LR), 20, 0)
TextBox19.Value = Application.WorksheetFunction.VLookup(ComboBox1.Text, ActiveSheet.Range("A2:AAA" & LR), 21, 0)
TextBox20.Value = Application.WorksheetFunction.VLookup(ComboBox1.Text, ActiveSheet.Range("A2:AAA" & LR), 22, 0)
TextBox21.Value = Application.WorksheetFunction.VLookup(ComboBox1.Text, ActiveSheet.Range("A2:AAA" & LR), 23, 0)
TextBox22.Value = Application.WorksheetFunction.VLookup(ComboBox1.Text, ActiveSheet.Range("A2:AAA" & LR), 24, 0)
TextBox23.Value = Application.WorksheetFunction.VLookup(ComboBox1.Text, ActiveSheet.Range("A2:AAA" & LR), 25, 0)
TextBox24.Value = Application.WorksheetFunction.VLookup(ComboBox1.Text, ActiveSheet.Range("A2:AAA" & LR), 26, 0)
TextBox25.Value = Application.WorksheetFunction.VLookup(ComboBox1.Text, ActiveSheet.Range("A2:AAA" & LR), 27, 0)
End If
ending:
End Sub
Private Sub userform_Queryclose(cancel As Integer, closemode As Integer)
cancel = True
End Sub

'Login win
Private Sub Add_Click()
Login_Win.Hide
Add_Win.Show
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
If Sheets("BARAKA 1").Visible = True Then Sheets("BARAKA 1").Visible = False
If Sheets("ASD").Visible = True Then Sheets("ASD").Visible = False
If Sheets("Salam 1").Visible = True Then Sheets("Salam 1").Visible = False
If Sheets("Salam 5").Visible = True Then Sheets("Salam 5").Visible = False
If Sheets("Salam 7").Visible = True Then Sheets("Salam 7").Visible = False
If Sheets("F.BAKR").Visible = True Then Sheets("F.BAKR").Visible = False
If Sheets("MOAWEN 7").Visible = True Then Sheets("MOAWEN 7").Visible = False
End Sub
Private Sub Delete_Click()
Login_Win.Hide
Del_Win.Show
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
If Sheets("BARAKA 1").Visible = True Then Sheets("BARAKA 1").Visible = False
If Sheets("ASD").Visible = True Then Sheets("ASD").Visible = False
If Sheets("Salam 1").Visible = True Then Sheets("Salam 1").Visible = False
If Sheets("Salam 5").Visible = True Then Sheets("Salam 5").Visible = False
If Sheets("Salam 7").Visible = True Then Sheets("Salam 7").Visible = False
If Sheets("F.BAKR").Visible = True Then Sheets("F.BAKR").Visible = False
If Sheets("MOAWEN 7").Visible = True Then Sheets("MOAWEN 7").Visible = False
End Sub
Private Sub Edit_Click()
Login_Win.Hide
Edit_Win.Show
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
If Sheets("BARAKA 1").Visible = True Then Sheets("BARAKA 1").Visible = False
If Sheets("ASD").Visible = True Then Sheets("ASD").Visible = False
If Sheets("Salam 1").Visible = True Then Sheets("Salam 1").Visible = False
If Sheets("Salam 5").Visible = True Then Sheets("Salam 5").Visible = False
If Sheets("Salam 7").Visible = True Then Sheets("Salam 7").Visible = False
If Sheets("F.BAKR").Visible = True Then Sheets("F.BAKR").Visible = False
If Sheets("MOAWEN 7").Visible = True Then Sheets("MOAWEN 7").Visible = False
End Sub
Private Sub Editshift_Click()
Login_Win.Hide
Edit_shift.Show
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
If Sheets("BARAKA 1").Visible = True Then Sheets("BARAKA 1").Visible = False
If Sheets("ASD").Visible = True Then Sheets("ASD").Visible = False
If Sheets("Salam 1").Visible = True Then Sheets("Salam 1").Visible = False
If Sheets("Salam 5").Visible = True Then Sheets("Salam 5").Visible = False
If Sheets("Salam 7").Visible = True Then Sheets("Salam 7").Visible = False
If Sheets("F.BAKR").Visible = True Then Sheets("F.BAKR").Visible = False
If Sheets("MOAWEN 7").Visible = True Then Sheets("MOAWEN 7").Visible = False
End Sub
Private Sub Search_Click()
Login_Win.Hide
Search_Win.Show
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
If Sheets("BARAKA 1").Visible = True Then Sheets("BARAKA 1").Visible = False
If Sheets("ASD").Visible = True Then Sheets("ASD").Visible = False
If Sheets("Salam 1").Visible = True Then Sheets("Salam 1").Visible = False
If Sheets("Salam 5").Visible = True Then Sheets("Salam 5").Visible = False
If Sheets("Salam 7").Visible = True Then Sheets("Salam 7").Visible = False
If Sheets("F.BAKR").Visible = True Then Sheets("F.BAKR").Visible = False
If Sheets("MOAWEN 7").Visible = True Then Sheets("MOAWEN 7").Visible = False
End Sub
Private Sub Shiftsearch_Click()
Login_Win.Hide
Shift_search.Show
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
If Sheets("BARAKA 1").Visible = True Then Sheets("BARAKA 1").Visible = False
If Sheets("ASD").Visible = True Then Sheets("ASD").Visible = False
If Sheets("Salam 1").Visible = True Then Sheets("Salam 1").Visible = False
If Sheets("Salam 5").Visible = True Then Sheets("Salam 5").Visible = False
If Sheets("Salam 7").Visible = True Then Sheets("Salam 7").Visible = False
If Sheets("F.BAKR").Visible = True Then Sheets("F.BAKR").Visible = False
If Sheets("MOAWEN 7").Visible = True Then Sheets("MOAWEN 7").Visible = False
End Sub
Private Sub Tugs_Click()
Login_Win.Hide
Selection_tugs.Show
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
If Sheets("BARAKA 1").Visible = True Then Sheets("BARAKA 1").Visible = False
If Sheets("ASD").Visible = True Then Sheets("ASD").Visible = False
If Sheets("Salam 1").Visible = True Then Sheets("Salam 1").Visible = False
If Sheets("Salam 5").Visible = True Then Sheets("Salam 5").Visible = False
If Sheets("Salam 7").Visible = True Then Sheets("Salam 7").Visible = False
If Sheets("F.BAKR").Visible = True Then Sheets("F.BAKR").Visible = False
If Sheets("MOAWEN 7").Visible = True Then Sheets("MOAWEN 7").Visible = False
End Sub
Private Sub Out_Click()
Application.DisplayAlerts = False
ActiveWorkbook.Close savechanges:=False
End Sub
Private Sub Save_Click()
ActiveWorkbook.Save
MsgBox "Êã ÇáÍÝÙ ÈäÌÇÍ"
Application.Quit
Application.DisplayAlerts = False
End Sub
Private Sub userform_Queryclose(cancel As Integer, closemode As Integer)
cancel = True
End Sub

'Search win
Private Sub Clear_Click()
ListBox1.Visible = True
ListBox1.clear
TextBox1.Value = ""
TextBox2.Value = ""
TextBox3.Value = ""
TextBox4.Value = ""
TextBox5.Value = ""
TextBox6.Value = ""
TextBox7.Value = ""
TextBox8.Value = ""
TextBox9.Value = ""
End Sub
Private Sub Back_to_main_Click()
Search_Win.Hide
Login_Win.Show
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
If Sheets("BARAKA 1").Visible = True Then Sheets("BARAKA 1").Visible = False
If Sheets("ASD").Visible = True Then Sheets("ASD").Visible = False
If Sheets("Salam 1").Visible = True Then Sheets("Salam 1").Visible = False
If Sheets("Salam 5").Visible = True Then Sheets("Salam 5").Visible = False
If Sheets("Salam 7").Visible = True Then Sheets("Salam 7").Visible = False
If Sheets("F.BAKR").Visible = True Then Sheets("F.BAKR").Visible = False
If Sheets("MOAWEN 7").Visible = True Then Sheets("MOAWEN 7").Visible = False
End Sub
Private Sub TextBox1_Change()
Sheets("Entering").Activate
ListBox1.clear

LR = Sheets("Entering").Cells(Rows.Count, 2).End(xlUp).Row
K = 0
For Each c In Range("A2:A" & LR)
b = InStr(c, TextBox1)

If b > 0 Then
    ListBox1.AddItem
    ListBox1.List(K, 0) = Cells(c.Row, 1).Value
    ListBox1.List(K, 1) = Cells(c.Row, 3).Value
    ListBox1.List(K, 2) = Cells(c.Row, 4).Value
    ListBox1.List(K, 3) = Cells(c.Row, 5).Value
    ListBox1.List(K, 4) = Cells(c.Row, 6).Value
    ListBox1.List(K, 5) = Cells(c.Row, 8).Value
    ListBox1.List(K, 6) = Cells(c.Row, 10).Value
    ListBox1.List(K, 7) = Cells(c.Row, 11).Value
    ListBox1.List(K, 8) = Cells(c.Row, 14).Value
        K = K + 1
        End If
        Next c
End Sub
Private Sub listBox1_DblClick(ByVal cancel As MSForms.ReturnBoolean)
For i = 0 To ListBox1.ListCount
If ListBox1.Selected(i) = True Then
TextBox1.Value = ListBox1.Value
End If
Next i
End Sub
Private Sub SS_Click()
If TextBox1.Text = "" Then
TextBox2.Value = ""
TextBox3.Value = ""
TextBox4.Value = ""
TextBox5.Value = ""
TextBox6.Value = ""
TextBox7.Value = ""
TextBox8.Value = ""
TextBox9.Value = ""

MsgBox ("ãä ÝÖáß Þã ÈÇÏÎÇá ÇáÇÓã ÇáãÑÇÏ ÇáÈÍË Úäå")
Else
TextBox2.Value = ListBox1.List(i, 1)
TextBox3.Value = ListBox1.List(i, 2)
TextBox4.Value = ListBox1.List(i, 3)
TextBox5.Value = ListBox1.List(i, 4)
TextBox6.Value = ListBox1.List(i, 5)
TextBox7.Value = ListBox1.List(i, 6)
TextBox8.Value = ListBox1.List(i, 7)
TextBox9.Value = ListBox1.List(i, 8)
ListBox1.Visible = False
End If
End Sub
Private Sub userform_Queryclose(cancel As Integer, closemode As Integer)
cancel = True
End Sub

'Selection tugs
Private Sub BARAKA1_Click()
Application.Visible = True
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
If Sheets("BARAKA 1").Visible = False Then Sheets("BARAKA 1").Visible = True
If Sheets("ASD").Visible = True Then Sheets("ASD").Visible = False
If Sheets("Salam 1").Visible = True Then Sheets("Salam 1").Visible = False
If Sheets("Salam 5").Visible = True Then Sheets("Salam 5").Visible = False
If Sheets("Salam 7").Visible = True Then Sheets("Salam 7").Visible = False
If Sheets("F.BAKR").Visible = True Then Sheets("F.BAKR").Visible = False
If Sheets("MOAWEN 7").Visible = True Then Sheets("MOAWEN 7").Visible = False
Dim rng As Range
Dim cell As Range
Set rng = Range("a7:a156")
    
    For Each cell In rng
           If cell.Value = "" Then
               cell.EntireRow.Hidden = True
            End If
        Next cell
End Sub
Private Sub Back_to_main_Click()
Rows("6:157").Select
Selection.EntireRow.Hidden = False
Range("A1:O5").Select
Selection_tugs.Hide
Login_Win.Show
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
If Sheets("BARAKA 1").Visible = True Then Sheets("BARAKA 1").Visible = False
If Sheets("ASD").Visible = True Then Sheets("ASD").Visible = False
If Sheets("Salam 1").Visible = True Then Sheets("Salam 1").Visible = False
If Sheets("Salam 5").Visible = True Then Sheets("Salam 5").Visible = False
If Sheets("Salam 7").Visible = True Then Sheets("Salam 7").Visible = False
If Sheets("F.BAKR").Visible = True Then Sheets("F.BAKR").Visible = False
If Sheets("MOAWEN 7").Visible = True Then Sheets("MOAWEN 7").Visible = False
End Sub
Private Sub userform_Queryclose(cancel As Integer, closemode As Integer)
cancel = True
End Sub

'Shift search
Private Sub Back_to_main_Click()
Shift_search.Hide
Login_Win.Show
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
If Sheets("BARAKA 1").Visible = True Then Sheets("BARAKA 1").Visible = False
If Sheets("ASD").Visible = True Then Sheets("ASD").Visible = False
If Sheets("Salam 1").Visible = True Then Sheets("Salam 1").Visible = False
If Sheets("Salam 5").Visible = True Then Sheets("Salam 5").Visible = False
If Sheets("Salam 7").Visible = True Then Sheets("Salam 7").Visible = False
If Sheets("F.BAKR").Visible = True Then Sheets("F.BAKR").Visible = False
If Sheets("MOAWEN 7").Visible = True Then Sheets("MOAWEN 7").Visible = False
End Sub
Private Sub Start_Search_Click()
If TextBox1.Value <> "" And ComboBox1.Value <> "" Then

TextBox2.Value = ""
TextBox3.Value = ""

If Sheets("Helper").Activate = False Then Sheets("Helper").Select = True
Date0 = Cells(2, 12)
Date_now = Cells(3, 12)
Date1 = Cells(4, 12)
Date2 = Cells(5, 12)
Date3 = Cells(6, 12)
Date4 = Cells(7, 12)
Date5 = Cells(8, 12)
Date6 = Cells(9, 12)
Q_Date = CDate(TextBox1.Value)

Set rng = Range("F2:I18")
unit = ComboBox1.Value
Dim find_shift1 As String
Dim find_shift2 As String
Dim find_shift3 As String

On Error GoTo try
find_shift1 = Application.WorksheetFunction.VLookup(unit, rng, 2, False)
find_shift2 = Application.WorksheetFunction.VLookup(unit, rng, 3, False)
find_shift3 = Application.WorksheetFunction.VLookup(unit, rng, 4, False)
try:

If Q_Date > Date5 Then
Do Until (Q_Date < Date6)
Q_Date = Q_Date - 6
Loop
End If

If Q_Date < Date_now Then
Do Until (Q_Date > Date0)
Q_Date = Q_Date + 6
Loop
End If


If (Q_Date = Date_now Or Q_Date = Date1) Then TextBox2.Value = find_shift1
If (Q_Date = Date2 Or Q_Date = Date3) Then TextBox2.Value = find_shift2
If (Q_Date = Date4 Or Q_Date = Date5) Then TextBox2.Value = find_shift3
End If


If (TextBox2.Value <> "") Then
Set search_rng = Sheets("Entering").Range("A:C")
On Error GoTo ending
phone = Application.WorksheetFunction.VLookup(TextBox2.Value, search_rng, 3, False)
TextBox3.Value = phone
ending:
End If

End Sub
Private Sub New_Search_Click()
TextBox1.Value = ""
TextBox2.Value = ""
TextBox3.Value = ""
ComboBox1.Value = ""
End Sub
Private Sub userform_Queryclose(cancel As Integer, closemode As Integer)
cancel = True
End Sub

'Module 1
Sub Back_To_Selection_Tugs()
Rows("6:157").Select
Selection.EntireRow.Hidden = False
Range("A1:O5").Select
If Sheets("Entering").Visible = True Then Sheets("Entering").Visible = False
If Sheets("Helper").Visible = True Then Sheets("Helper").Visible = False
If Sheets("BARAKA 1").Visible = True Then Sheets("BARAKA 1").Visible = False
If Sheets("ASD").Visible = True Then Sheets("ASD").Visible = False
If Sheets("Salam 1").Visible = True Then Sheets("Salam 1").Visible = False
If Sheets("Salam 5").Visible = True Then Sheets("Salam 5").Visible = False
If Sheets("Salam 7").Visible = True Then Sheets("Salam 7").Visible = False
If Sheets("F.BAKR").Visible = True Then Sheets("F.BAKR").Visible = False
If Sheets("MOAWEN 7").Visible = True Then Sheets("MOAWEN 7").Visible = False
End Sub