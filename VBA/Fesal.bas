Private Sub ComboBox1_Change()
Sheet1.Activate
'tbl is (B1:M11)
Dim c As Integer
On Error GoTo err
c = Application.WorksheetFunction.Match(ComboBox1.Value, Range("B1:M1"), 0)
TextBox1.Value = Cells(2, c + 1) 'ÇáãÏíÑ
TextBox2.Value = Cells(3, c + 1) 'äÇÆÈ ãÏíÑ Çæá
TextBox5.Value = Cells(4, c + 1) 'äÇÆÈ ãÏíÑ ËÇäí
TextBox8.Value = Cells(5, c + 1) 'äÇÆÈ ãÏíÑ ËÇáË
TextBox3.Value = Cells(6, c + 1) 'æßíá äÇÆÈ Çæá Çæá
TextBox4.Value = Cells(7, c + 1) 'æßíá äÇÆÈ Çæá ËÇäí
TextBox6.Value = Cells(8, c + 1) 'æßíá äÇÆÈ ËÇäí Çæá
TextBox7.Value = Cells(9, c + 1) 'æßíá äÇÆÈ ËÇäí ËÇäí
TextBox9.Value = Cells(10, c + 1) 'æßíá äÇÆÈ ËÇáË Çæá
TextBox10.Value = Cells(11, c + 1) 'æßíá äÇÆÈ ËÇáË ÊÇäí
err:
End Sub
Private Sub CommandButton1_Click()
Sheet1.Activate
'tbl is (B1:M11)
Dim c As Integer
c = Application.WorksheetFunction.Match(ComboBox1.Value, Range("B1:M1"), 0)
Cells(2, c + 1) = TextBox1.Value 'ÇáãÏíÑ
Cells(3, c + 1) = TextBox2.Value 'äÇÆÈ ãÏíÑ Çæá
Cells(4, c + 1) = TextBox5.Value 'äÇÆÈ ãÏíÑ ËÇäí
Cells(5, c + 1) = TextBox8.Value 'äÇÆÈ ãÏíÑ ËÇáË
Cells(6, c + 1) = TextBox3.Value 'æßíá äÇÆÈ Çæá Çæá
Cells(7, c + 1) = TextBox4.Value 'æßíá äÇÆÈ Çæá ËÇäí
Cells(8, c + 1) = TextBox6.Value 'æßíá äÇÆÈ ËÇäí Çæá
Cells(9, c + 1) = TextBox7.Value 'æßíá äÇÆÈ ËÇäí ËÇäí
Cells(10, c + 1) = TextBox9.Value 'æßíá äÇÆÈ ËÇáË Çæá
Cells(11, c + 1) = TextBox10.Value 'æßíá äÇÆÈ ËÇáË ÊÇäí

TextBox1.Value = Empty
TextBox2.Value = Empty
TextBox3.Value = Empty
TextBox4.Value = Empty
TextBox5.Value = Empty
TextBox6.Value = Empty
TextBox7.Value = Empty
TextBox8.Value = Empty
TextBox9.Value = Empty
TextBox10.Value = Empty

MsgBox "Êã ÍÝÙ ÇáÈíÇäÇÊ ÈäÌÇÍ"
End Sub
Private Sub CommandButton2_Click()
If ComboBox1.Value = "ÇáÔÑßÇÊ" Then Sheet2.PrintOut
If ComboBox1.Value = "ÇáÊÍÑßÇÊ" Then Sheet3.PrintOut
If ComboBox1.Value = "ÇáåäÏÓíÉ" Then Sheet4.PrintOut
If ComboBox1.Value = "ÇáãÇáíÉ" Then Sheet5.PrintOut
If ComboBox1.Value = "ÔÆæä_ÇáÚÇãáíä" Then Sheet6.PrintOut
If ComboBox1.Value = "ÇáÃÔÛÇá" Then Sheet7.PrintOut
If ComboBox1.Value = "ÇáÊãæíä" Then Sheet8.PrintOut
If ComboBox1.Value = "ÇáÇÊÕÇáÇÊ" Then Sheet9.PrintOut
If ComboBox1.Value = "ÇáÎÏãÇÊ" Then Sheet10.PrintOut
If ComboBox1.Value = "ÇáÊÑÓÇäÇÊ" Then Sheet11.PrintOut
If ComboBox1.Value = "ÇáÈÍæË" Then Sheet12.PrintOut
If ComboBox1.Value = "ÇáßÑÇßÇÊ" Then Sheet13.PrintOut
End Sub
Private Sub CommandButton3_Click()
ActiveWorkbook.Save
End Sub
Private Sub CommandButton4_Click()
Application.Quit
Application.DisplayAlerts = False
ActiveWorkbook.Close savechanges:=False
End Sub
