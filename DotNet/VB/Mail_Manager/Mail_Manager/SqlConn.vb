Imports System.Data.OleDb
Imports System.Text.RegularExpressions

Public Class SqlConn
    Inherits MainForm

    Dim conn As New OleDbConnection("Provider=Microsoft.ACE.OLEDB.12.0;Data Source=mail.mdb")
    Dim cmd As New OleDbCommand("", conn)

    'connect to Database
    Function connectDataBase()
        Try
            Me.AccountTblTableAdapter.Fill(Me.MailDataSet.accountTbl)
        Catch ex As Exception
            MsgBox("Database Not Found!",, "Error")
            End
        End Try
    End Function

    'select from database, rename columns in dgv and hide unused column
    Function selectRenAndHide(ByRef dgv As DataGridView)
        'select all from table in db
        dgv.DataSource = runDML("select * from accountTbl")
        'rename column
        dgv.Columns(1).HeaderText = "User Name"
        dgv.Columns(3).HeaderText = "Website Name"
        dgv.Columns(4).HeaderText = "Link"
        'hide unused column
        dgv.Columns(0).Visible = False
        dgv.Columns(2).Visible = False
    End Function

    'DDL commands
    Function runDDL(ddlCmd As String, Optional msg As String = "")
        Try
            If conn.State = ConnectionState.Closed Then conn.Open()
            cmd.CommandText = ddlCmd
            cmd.ExecuteNonQuery()
            If msg <> "" Then MsgBox(msg,, "Complete")
        Catch ex As Exception
            MsgBox(ex.Message,, "Error")
        Finally
            If conn.State = ConnectionState.Open Then conn.Close()
        End Try
    End Function

    'DML commands
    Function runDML(dmlCmd As String, Optional msg As String = "") As DataTable
        Try
            Dim tbl As New DataTable()
            If conn.State = ConnectionState.Closed Then conn.Open()
            cmd.CommandText = dmlCmd
            tbl.Load(cmd.ExecuteReader())
            If msg <> "" Then MsgBox(msg,, "Complete")
            Return tbl
        Catch ex As Exception
            MsgBox(ex.Message,, "Error")
            Return New DataTable()
        Finally
            If conn.State = ConnectionState.Open Then conn.Close()
        End Try
    End Function

    'autoNumber
    Function getAutoNum(tblName As String, colName As String) As Integer
        Dim tbl As DataTable
        tbl = runDML("select max(" & colName & ") + 1 from " & tblName) 'add one to get new id

        If (tbl.Rows(0)(0) Is DBNull.Value) Then 'check if null returned
            Return 1
        Else
            Return tbl.Rows(0)(0)
        End If
    End Function

    'user name validation test
    Function userNameValidation(userNameStr As String) As Integer
        Dim exp As Regex = New Regex("[a-zA-Z][\w\.]+@[a-zA-z]+\.\w+")

        If (exp.Match(userNameStr).ToString() <> userNameStr) Then
            If (MsgBox("User Name may be error" & vbNewLine & "Do you want to continue", 4, "Warning!") = 6) Then
                Return True
            Else
                Return False
            End If
        End If
        Return True
    End Function

    'link validation test
    Function linkValidation(linkStr As String) As Integer
        Dim exp As Regex = New Regex("((https:\/\/)|(http:\/\/))?(w{3}\.)?(\w+\.)+(\w{2,3})(\/.*)?")

        If (exp.Match(linkStr).ToString() <> linkStr) Then
            If (MsgBox("Link may be error" & vbNewLine & "Do you want to continue", 4, "Warning!") = 6) Then
                Return True
            Else
                Return False
            End If
        End If
        Return True
    End Function

    'get domain name from account username
    Function getDomain(email As String) As String
        Dim domRegExp As String = "@\w+.\w{3}"
        Dim resultStr As String = ""
        Dim expMatch As MatchCollection = Regex.Matches(email, domRegExp)

        For Each matchChar In expMatch
            resultStr = matchChar.ToString()
        Next
        Try
            resultStr = resultStr.Substring(1, (resultStr.Count - 1))
        Catch ex As Exception
            MsgBox("You cannot use this account",, "Error")
            Return ""
        End Try

        Return resultStr
    End Function

    'get file name from file path
    Function getFileName(path As String) As String

        Dim nameRegExp As String = "\\[^\\.]+\..*"
        Dim resultStr As String = ""
        Dim expMatch As MatchCollection = Regex.Matches(path, nameRegExp)

        For Each matchChar In expMatch
            resultStr = matchChar.ToString()
        Next

        Try
            resultStr = resultStr.Substring(1, (resultStr.Count - 1))
        Catch ex As Exception
            MsgBox("You cannot use this file",, "Error")
            Return ""
        End Try

        MsgBox(resultStr)
        Return resultStr
    End Function

End Class