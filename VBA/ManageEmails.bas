manage accouts
---------------

ThisWorkbook
************
Private Sub Workbook_Open()
    With ActiveWindow
        .DisplayHorizontalScrollBar = False
        .DisplayVerticalScrollBar = False
        End With
        ActiveWindow.DisplayWorkbookTabs = False
End Sub
-----------------------------------------------------------------
Add
************
Private Sub TextBox1_Exit(ByVal Cancel As MSForms.ReturnBoolean)
LR = Sheets("DB").Cells(Rows.Count, 2).End(xlUp).Row
If Application.WorksheetFunction.CountIf(Sheets("DB").Range("B2 : B" & LR), Me.TextBox1.Text) > 0 And TextBox1.Value <> "" Then
    MsgBox "Sorry, This account is already existed"
    TextBox1.Value = ""
End If
End Sub
Private Sub add_click()
    
    If TextBox1.Value = "" Or TextBox2.Value = "" Or TextBox3.Value = "" Or TextBox4.Value = "" Or TextBox4.Text = "https://www." Then
    MsgBox "Please enter the empty fields"
    End If
    
If TextBox1.Value = "" Then
    TextBox1.BackColor = &HC0C0FF
    Else: TextBox1.BackColor = &H80000005
        End If
     
If TextBox2.Value = "" Then
    TextBox2.BackColor = &HC0C0FF
    Else: TextBox2.BackColor = &H80000005
        End If
        
If TextBox3.Value = "" Then
    TextBox3.BackColor = &HC0C0FF
    Else: TextBox3.BackColor = &H80000005
        End If
        
If TextBox4.Value = "" Or TextBox4.Value = "https://www." Then
    TextBox4.BackColor = &HC0C0FF
    Else: TextBox4.BackColor = &H80000005
        End If
    
    
If TextBox1.Value <> "" And TextBox2.Value <> "" And TextBox3.Value <> "" And TextBox4.BackColor <> &HC0C0FF Then

Sheets("DB").Activate
LR = Range("B" & Rows.Count).End(xlUp).Row

Range("B" & LR + 1).Value = TextBox1.Value
Range("B" & LR + 1).Offset(0, 2).Value = TextBox2.Value
Range("B" & LR + 1).Offset(0, 3).Value = TextBox3.Value
Range("B" & LR + 1).Offset(0, 1).Value = TextBox4.Value
MsgBox "Your data added successfully"

TextBox1.Value = ""
TextBox2.Value = ""
TextBox3.Value = ""
TextBox4.Value = ""

End If
End Sub
Private Sub Clear_Click()
TextBox1.Value = ""
TextBox2.Value = ""
TextBox3.Value = ""
TextBox4.Value = "https://www."

TextBox1.BackColor = &H80000005
TextBox2.BackColor = &H80000005
TextBox3.BackColor = &H80000005
TextBox4.BackColor = &H80000005

End Sub
-----------------------------------------------------------------
SMD
************
Private Sub ListBox1_DblClick(ByVal Cancel As MSForms.ReturnBoolean)
For i = 0 To ListBox1.ListCount
If ListBox1.Selected(i) = True Then
TextBox1.Value = ListBox1.Value
End If
Next i
ListBox1.Visible = False

End Sub
Private Sub TextBox1_Change()
TextBox2.Value = ""
TextBox3.Value = ""
TextBox4.Value = ""
TextBox5.Value = ""
ListBox1.Clear

Sheets("DB").Activate
listR = 0
LR = Sheets("DB").Cells(Rows.Count, 2).End(xlUp).Row
For Each c In Range("B2:B" & LR)
S = InStr(c, TextBox1)

If S > 0 Then
    ListBox1.AddItem
    ListBox1.List(listR, 0) = Cells(c.Row, 2).Value
    ListBox1.List(listR, 1) = Cells(c.Row, 3).Value
    ListBox1.List(listR, 2) = Cells(c.Row, 4).Value
    ListBox1.List(listR, 3) = Cells(c.Row, 5).Value
        listR = listR + 1
        End If
        Next c

End Sub
Private Sub Search_Click()
If TextBox1.Value = "" Then
TextBox2.Value = ""
TextBox3.Value = ""
TextBox4.Value = ""
TextBox5.Value = ""
ListBox1.Value = ""
End If

If TextBox1.Value <> "" And ListBox1.Visible = False Then
TextBox2.Value = ListBox1.List(i, 0)
TextBox3.Value = ListBox1.List(i, 2)
TextBox4.Value = ListBox1.List(i, 3)
TextBox5.Value = ListBox1.List(i, 1)
End If

End Sub
Private Sub Modify_Click()
If TextBox1.Value = "" Then
    MsgBox "Please enter the account that you want to modify"
    TextBox1.BackColor = &HC0C0FF
        Else
            TextBox1.BackColor = &HFFFFFF
End If

If TextBox1.Value <> "" And TextBox2.Value = "" Then
    TextBox2.BackColor = &HC0C0FF
        Else
            TextBox2.BackColor = &HFFFFFF
End If

If TextBox1.Value <> "" And TextBox3.Value = "" Then
    TextBox3.BackColor = &HC0C0FF
        Else
            TextBox3.BackColor = &HFFFFFF
End If

If TextBox1.Value <> "" And TextBox4.Value = "" Then
    TextBox4.BackColor = &HC0C0FF
        Else
            TextBox4.BackColor = &HFFFFFF
End If

If TextBox1.Value <> "" And TextBox5.Value = "" Then
    TextBox5.BackColor = &HC0C0FF
        Else
            TextBox5.BackColor = &HFFFFFF
End If


If TextBox1.Value <> "" And (TextBox2.Value = "" Or TextBox3.Value = "" Or TextBox4.Value = "" Or TextBox5.Value = "") Then
    MsgBox "Press ''Search'' button or Check empty fields"
End If


If TextBox1.Value <> "" And TextBox2.Value <> "" And TextBox3.Value <> "" And TextBox4.Value <> "" And TextBox5.Value <> "" Then
LR = Sheets("DB").Cells(Rows.Count, 2).End(xlUp).Row
For Each c In Range("B2:B" & LR)
    If c = TextBox1.Value Then
    c.Select
    ActiveCell.Value = TextBox2.Text
    ActiveCell.Offset(0, 1).Value = TextBox5.Text
    ActiveCell.Offset(0, 2).Value = TextBox3.Text
    ActiveCell.Offset(0, 3).Value = TextBox4.Text
    End If
    Next c
MsgBox "Done"
TextBox1.Value = ""
TextBox2.Value = ""
TextBox3.Value = ""
TextBox4.Value = ""
ListBox1.Clear
ListBox1.Visible = True
End If
End Sub
Private Sub Delete_Click()
If TextBox1.Value = "" Then
MsgBox "Please select the account that you want to remove it"
TextBox1.BackColor = &HC0C0FF
Else: TextBox1.BackColor = &HFFFFFF
End If

If TextBox1.Value <> "" Then
LR = Sheets("DB").Cells(Rows.Count, 2).End(xlUp).Row
For Each c In Range("B2: B" & LR)
S = InStr(c, TextBox1)
If S > 0 Then
Cells(c.Row, 2) = ""
Cells(c.Row, 3) = ""
Cells(c.Row, 4) = ""
Cells(c.Row, 5) = ""
MsgBox "Account deleted successfully"
TextBox1.Value = ""
End If
Next c
ListBox1.Clear
ListBox1.Visible = True
End If
End Sub
Private Sub Clear_Click()
TextBox1.Value = ""
TextBox2.Value = ""
TextBox3.Value = ""
TextBox4.Value = ""
TextBox5.Value = ""

TextBox1.BackColor = &HFFFFFF
TextBox2.BackColor = &HFFFFFF
TextBox3.BackColor = &HFFFFFF
TextBox4.BackColor = &HFFFFFF
TextBox5.BackColor = &HFFFFFF

ListBox1.Clear
ListBox1.Visible = True

End Sub
-----------------------------------------------------------------
Module 1
************
Sub Add_account()
Add.Show
Sheets("DB").Visible = False
End Sub
Sub SMD_account()
SMD.Show
Sheets("DB").Visible = False
End Sub
Sub Back()
Sheets("Inquiry").Visible = True
Sheets("DB").Visible = False
End Sub