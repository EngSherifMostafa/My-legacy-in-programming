Attribute VB_Name = "Module1"
Function Approx(num As Double) As Double

Dim dec As Double, frac As Double, r As Double, l As Double

dec = Fix(num)
frac = Right(num, 2)

If frac < 1 Then
    r = 0
    l = Right(frac, 1)

ElseIf frac < 10 Then
    r = frac
    l = 0
    GoTo rCal
    
Else
    r = Right(frac, 1)
    l = Left(frac, 1)
    
rCal:
    If r = 0 Or r = 1 Or r = 2 Then
    r = 0
    ElseIf r = 3 Or r = 4 Or r = 5 Or r = 6 Or r = 7 Then
    r = 5
    ElseIf r = 8 Or r = 9 Then
    r = 0
    l = l + 1
    End If
End If
l = l / 10
r = r / 100
Approx = dec + l + r
End Function
