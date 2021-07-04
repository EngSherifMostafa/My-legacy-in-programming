Imports System.IO
Public Class LoginForm

    Private Sub LoginForm_FormClosed(sender As Object, e As FormClosedEventArgs) Handles MyBase.FormClosed
        End
    End Sub

    Private Sub loginShowCb_CheckedChanged(sender As Object, e As EventArgs) Handles loginShowCb.CheckedChanged
        BeEasy.showPasswordCb(loginShowCb, loginPassTb)
    End Sub

    Private Sub loginBtn_Click(sender As Object, e As EventArgs) Handles loginBtn.Click
        If (loginUserTb.Text = "" Or loginPassTb.Text = "") Then
            MsgBox("Please Enter Username and Password")
            Return
        End If

        Dim userStr As String = ""
        Dim passStr As String = ""

        Dim loginUserDataTbl = SqlConn.runDML("select userName from loginTbl where ID = 1")
        Dim loginPassDataTbl = SqlConn.runDML("select password from loginTbl where ID = 1")

        For Each row As DataRow In loginUserDataTbl.Rows
            userStr = row.Field(Of String)(0)
        Next

        For Each row As DataRow In loginPassDataTbl.Rows
            passStr = row.Field(Of String)(0)
        Next

        If (userStr = "" And passStr = "") Then
            userStr = loginUserTb.Text
            passStr = loginPassTb.Text
            SqlConn.runDDL("insert into loginTbl values
                          (" & 1 & " ,'" & userStr & "', '" & passStr & "')", "Username and Password Added" & vbNewLine & "Please remember them")

        ElseIf (userStr = loginUserTb.Text And passStr = loginPassTb.Text) Then
            MainForm.Visible = True
            Me.Visible = False

        Else
            MsgBox("Enter Correct Username and Password",, "Error")
            If (userStr <> loginUserTb.Text) Then loginUserTb.Clear()
            If (passStr <> loginPassTb.Text) Then loginPassTb.Clear()
        End If
    End Sub

    Private Sub LoginForm_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Try
            File.SetAttributes(".\mail.mdb", FileAttributes.Hidden + FileAttributes.System)
        Catch ex As Exception
        End Try
    End Sub

End Class