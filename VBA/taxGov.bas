Attribute VB_Name = "Module1"
Sub Start()
    Sheets(1).Select
    Sheets.Add
    Sheets(1).Name = "AllSheets"
    Call mergeAllSheets
End Sub
Private Sub mergeAllSheets()
Dim sheetsNo, LRS, LRA, i As Integer
sheetsNo = ActiveWorkbook.Worksheets.Count

For i = 2 To sheetsNo
    LRS = Sheets(i).Range("C" & Rows.Count).End(xlUp).Row + 1
    LRA = Sheets(1).Range("B" & Rows.Count).End(xlUp).Row + 1
    Sheets(i).Range("C2:C" & LRS).Copy Sheets(1).Range("B" & LRA) '''copy defination
    Sheets(i).Range("G2:G" & LRS).Copy Sheets(1).Range("A" & LRA) '''copy indexing
    Sheets(i).Range("D2:D" & LRS).Copy Sheets(1).Range("C" & LRA) '''copy money
Next i
Call selection
End Sub
Private Sub selection()
    Dim LR As Integer
    LR = Sheets(1).Range("A" & Rows.Count).End(xlUp).Row
    
    For i = 2 To LR
        Sheets(1).Range("D" & i).Value = Mid(Range("B" & i).Value, 28, 24)
    Next i
Call subtotals
End Sub
Private Sub subtotals()
    Dim sum, LR As Integer
    LR = Sheets(1).Range("A" & Rows.Count).End(xlUp).Row
    sum = Sheets(1).Range("C2").Value
    
    For i = 2 To LR
        If (Sheets(1).Range("D" & i).Value = Sheets(1).Range("D" & i + 1).Value) Then
            sum = CDbl(sum) + CDbl(Sheets(1).Range("C" & i + 1).Value)
        Else
            Sheets(1).Range("E" & i).Value = sum
            sum = Sheets(1).Range("C" & i + 1)
        End If
    Next i
Call totals
End Sub
Private Sub totals()
Dim sum, cerNo, LR As Integer
sum = 0
cerNo = 0
LR = Sheets(1).Range("A" & Rows.Count).End(xlUp).Row

For i = 2 To LR '''get total of money column
    sum = sum + CDbl(Sheets(1).Range("C" & i).Value)
Next i
    Sheets(1).Range("H2").Value = sum

sum = 0
For i = 2 To LR '''get total of subtotal column
    sum = sum + CDbl(Sheets(1).Range("E" & i).Value)
Next i
    Sheets(1).Range("H3").Value = sum
    
For i = 2 To LR '''get numbers of certificates
    If (Len(Range("D" & i)) = 24) Then cerNo = cerNo + 1
Next i
    Sheets(1).Range("H4").Value = cerNo
Call format
End Sub
Private Sub format()
    Sheets(1).Range("A1") = "Index"
    Sheets(1).Range("B1") = "Cause"
    Sheets(1).Range("C1") = "Money"
    Sheets(1).Range("E1") = "Sub total"
    
    Sheets(1).Range("G2") = "Total of sub total"
    Sheets(1).Range("G3") = "Total of money"
    Sheets(1).Range("G4") = "Numbers of certificates"
    
    Sheets(1).Rows.AutoFit
    Sheets(1).Columns.AutoFit
Call macroFormat
End Sub
Private Sub macroFormat()
    Columns("D:D").Hidden = True
    Range("H2").Activate
    Range("G2:H4").Borders(xlDiagonalDown).LineStyle = xlNone
    Range("G2:H4").Borders(xlDiagonalUp).LineStyle = xlNone
    With Range("G2:H4").Borders(xlEdgeLeft)
        .LineStyle = xlContinuous
        .ColorIndex = xlAutomatic
        .TintAndShade = 0
        .Weight = xlThick
    End With
    With Range("G2:H4").Borders(xlEdgeTop)
        .LineStyle = xlContinuous
        .ColorIndex = xlAutomatic
        .TintAndShade = 0
        .Weight = xlThick
    End With
    With Range("G2:H4").Borders(xlEdgeBottom)
        .LineStyle = xlContinuous
        .ColorIndex = xlAutomatic
        .TintAndShade = 0
        .Weight = xlThick
    End With
    With Range("G2:H4").Borders(xlEdgeRight)
        .LineStyle = xlContinuous
        .ColorIndex = xlAutomatic
        .TintAndShade = 0
        .Weight = xlThick
    End With
    With Range("G2:H4").Borders(xlInsideVertical)
        .LineStyle = xlContinuous
        .ColorIndex = xlAutomatic
        .TintAndShade = 0
        .Weight = xlThin
    End With
    With Range("G2:H4").Borders(xlInsideHorizontal)
        .LineStyle = xlContinuous
        .ColorIndex = xlAutomatic
        .TintAndShade = 0
        .Weight = xlThin
    End With
    Range("A1").Select
End Sub
