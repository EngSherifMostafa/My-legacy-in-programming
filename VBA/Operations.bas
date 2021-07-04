Sub test()
Dim cell, rng As Range
Dim x, y As Integer

r = 1
c = 3
LR = Range("B" & Rows.Count).End(xlUp).Row
Set rng = Range("C1:C" & LR)

For Each cell In rng
    If Sheet1.Cells(r, c - 2) <> Empty Then
    Sheet1.Cells(r, c) = Sheet1.Cells(r, c - 1) - Sheet1.Cells(r, c - 2)
    
    ElseIf Sheet1.Cells(r, c - 2) = Empty Then
    Sheet1.Cells(r, c) = Empty
    End If
    
    r = r + 1
    Next cell
End Sub