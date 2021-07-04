Imports System.IO

Public Class MainForm
    Private Sub pstBtn_Click(sender As Object, e As EventArgs) Handles pstBtn.Click
        pathTb.Text = My.Computer.Clipboard.GetText()
    End Sub

    Private Sub shwBtn_Click(sender As Object, e As EventArgs) Handles shwBtn.Click
        Try
            File.SetAttributes(pathTb.Text, FileAttributes.Normal)
            MsgBox("Showing Done",, "Complete")
        Catch ex As Exception
            MsgBox(ex.Message,, "Error")
        End Try
    End Sub

    Private Sub hideBtn_Click(sender As Object, e As EventArgs) Handles hideBtn.Click
        Try
            File.SetAttributes(pathTb.Text, FileAttributes.Hidden + FileAttributes.System)
            MsgBox("Hiding done",, "Complete")
        Catch ex As Exception
            MsgBox(ex.Message,, "Error")
        End Try
    End Sub

    Private Sub clrBtn_Click(sender As Object, e As EventArgs) Handles clrBtn.Click
        pathTb.Clear()
    End Sub
End Class
