Private Sub WorkSheet_SelectionChange(ByVal Target As Range)
Dim RngOne, RngTwo, LRH, LRI, cell, SCell As Range
Dim counter As Integer
LRH = Range("H" & Rows.Count).End(xlUp).Row
LRI = Range("I" & Rows.Count).End(xlUp).Row
Set RngOne = Sheet2.Range("H2:H" & LRH)
Set RngTwo = Sheet2.Range("I2:I" & LRI)

If Not Intersect(Target, Sheet2.Range("H2:I" & LRI)) Is Nothing Then
    For Each cell In RngOne
        counter = Application.WorksheetFunction.CountIf(RngOne, cell)
        If counter > 1 Then
        MsgBox "Sorry this Head serial is already existed in : " & vbCrLf & cell.Offset(0, -3).Value & " " & cell.Offset(0, -4).Value & " " & cell.Offset(0, -2).Value
        End If
    Next cell
    
    For Each cell In RngTwo
        counter = Application.WorksheetFunction.CountIf(RngTwo, cell)
        If counter > 1 Then
        MsgBox "Sorry this Head serial is already existed in : " & vbCrLf & cell.Offset(0, -3).Value & " " & cell.Offset(0, -4).Value & " " & cell.Offset(0, -2).Value
        End If
    Next cell

End If
End Sub