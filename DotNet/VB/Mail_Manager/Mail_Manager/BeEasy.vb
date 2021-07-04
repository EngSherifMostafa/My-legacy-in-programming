Public Class BeEasy
    Inherits MainForm

    'return selected cell from any dgv
    Function getSelectedFromDgv(ByRef dgvName As DataGridView, ByRef dgvEvent As DataGridViewCellEventArgs, ByRef cellNum As Integer) As String
        Return dgvName.Rows(dgvEvent.RowIndex).Cells(cellNum).Value.ToString()
    End Function

    'fill listbox
    Function fillListBox(ByRef dataTbl As DataTable, listBoxName As ListBox, type As String)
        listBoxName.Items.Clear()
        'prepare data table that fill listbox
        dataTbl = SqlConn.runDML("select distinct " & type & " from accountTbl order by " & type & " asc")

        For Each row As DataRow In dataTbl.Rows
            For Each column As DataColumn In dataTbl.Columns
                listBoxName.Items.Add(row(column))
            Next
        Next
    End Function

    'show password checkbox
    Function showPasswordCb(showCb As CheckBox, passwordTb As TextBox)
        If (showCb.Checked) Then
            passwordTb.PasswordChar = ""
        Else
            passwordTb.PasswordChar = "*"
        End If
    End Function

    'copy buttons
    Function copyBtn(copyTb As TextBox)
        Try
            My.Computer.Clipboard.SetText(copyTb.Text)
        Catch ex As Exception
            My.Computer.Clipboard.SetText(vbEmpty)
        End Try
    End Function

    'paste buttons
    Function pasteBtn(pasteTb As TextBox)
        pasteTb.Text = My.Computer.Clipboard.GetText()
    End Function

    'clear textboxs
    Function clearTextboxs(tb1 As TextBox, tb2 As TextBox, tb3 As TextBox, tb4 As TextBox)
        tb1.Clear()
        tb2.Clear()
        tb3.Clear()
        tb4.Clear()
    End Function

    'generate random password
    Function genRandPass(ByRef passLen As Integer, ByRef chSet As Object) As Object
        Dim randPass, randDigit As Object
        randPass = ""
        randDigit = ""
        Randomize()
        For intstep = 1 To passLen
            randDigit = Int((Len(chSet) * Rnd()) + 1)
            randPass = randPass & Mid(chSet, randDigit, 1)
        Next
        Return randPass
    End Function

    'update values
    Function areEdit(textbox As TextBox, newVal As String, editID As Integer, editCol As String) As Boolean
        If (textbox.Text <> newVal) Then
            SqlConn.runDML("update accountTbl set accountTbl." & editCol & " = '" & textbox.Text & "' where ID = " & editID & "")
            Return True
        End If
        Return False
    End Function

End Class