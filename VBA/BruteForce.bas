Option Explicit

Sub bruteForce()
    Dim rowNumber, last_row, target_value As Integer
    Dim rColor, gColor, bColor As Integer
    Dim sheetName, col_name, cell_one, cell_two, result As String
    Dim cell, rng As Range
    
    sheetName = InputBox("Enter the sheet name : ")
    col_name = InputBox("Enter the column character : ")
    target_value = InputBox("Enter the target Value : ")
    
    last_row = Sheets(sheetName).Range(col_name & Rows.Count).End(xlUp).Row
    Set rng = Range(col_name & "1:" & col_name & last_row)
    
    For Each cell In rng
        For rowNumber = 1 To last_row
            'check offset to be in range
            If (cell.Row + rowNumber > last_row) Then GoTo nextCell
            
            If (cell.Value + cell.Offset(rowNumber, 0).Value = target_value) Then
                 result = result + ("Cell One: ( R" & cell.Row & " C" & cell.Column & " )") + vbNewLine
                 result = result + ("Cell Two: ( R" & cell.Offset(rowNumber, 0).Row & " C" & cell.Offset(rowNumber, 0).Column & " )") + vbNewLine
                 result = result + ("--------------------") + vbNewLine
                 
                 'color cells
                 rColor = Rnd() * 250
                 gColor = Rnd() * 250
                 bColor = Rnd() * 250
                 
                 Range(col_name & cell.Row).Interior.Color = RGB(rColor, gColor, bColor)
                 Range(col_name & cell.Offset(rowNumber, 0).Row).Interior.Color = RGB(rColor, gColor, bColor)
            End If
            
        Next rowNumber
nextCell:
    Next cell
    
    MsgBox result
End Sub