Imports System.Windows.Forms
Imports System.Drawing
Imports System.Data.SqlClient 'local sql db
Imports System.Text.RegularExpressions

Class LocalSqlDB

    Private conLocalSql As New SqlConnection()
    Private cmdLocalSql As New SqlCommand()

    'connection .mdf file
    Function connectDB(ByRef dbPath As String, Optional ByRef msg As String = Nothing) As Boolean
        Try
            conLocalSql = New SqlConnection("Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=" & dbPath & ";Integrated Security=True;Connect Timeout=30")
            conLocalSql.Open()
            conLocalSql.Close()
            Return True
        Catch ex As Exception
            If (msg <> Nothing) Then MsgBox(msg & vbNewLine & ex.Message,, "Error Connection")
            Return False
        End Try
    End Function

    'run DDL commands
    Function runDDL(ByRef ddlStr As String, Optional ByRef msg As String = Nothing) As Boolean
        If (conLocalSql.State() = ConnectionState.Closed) Then conLocalSql.Open()
        cmdLocalSql = New SqlCommand(ddlStr, conLocalSql)
        Try
            cmdLocalSql.ExecuteNonQuery()
            Return 1
        Catch ex As Exception
            If (msg <> Nothing) Then MsgBox(msg & vbNewLine & ex.Message,, "Error DDL Command")
            Return 0
        Finally
            If (conLocalSql.State() = ConnectionState.Open) Then conLocalSql.Close()
        End Try
    End Function

    'run DML commands
    Function runDML(ByRef dmlStr As String, Optional ByRef msg As String = Nothing) As DataTable
        Dim dataTbl As New DataTable
        If (conLocalSql.State() = ConnectionState.Closed) Then conLocalSql.Open()
        Try
            cmdLocalSql = New SqlCommand(dmlStr, conLocalSql)
            dataTbl.Load(cmdLocalSql.ExecuteReader())
        Catch ex As Exception
            If (msg <> Nothing) Then MsgBox(msg & vbNewLine & ex.Message,, "Error DML Command")
        Finally
            If (conLocalSql.State() = ConnectionState.Open) Then conLocalSql.Close()
        End Try
        Return dataTbl
    End Function

    'find record at specific ID
    Function find(ByRef tblName As String, ByRef atID As Integer) As DataTable
        Dim dataTbl As DataTable
        dataTbl = runDML("select * from " & tblName & " where ID = " & atID & "")
        Return dataTbl
    End Function

    'update values in database
    Function update(ByRef tblName As String, ByRef colName As String,
                    ByRef newVal As String, ByRef updateID As Integer,
                    Optional ByRef msg As String = Nothing)

        Return runDML("update " & tblName & " set " & tblName & "." & colName & " = '" & newVal & "'
                where ID = " & updateID & "", msg)
    End Function

    'delete record from database
    Function delete(ByRef tblName As String, ByRef delID As Integer,
                    Optional ByRef msg As String = Nothing)
        Return runDML("delete from " & tblName & " where ID = " & delID & "", msg)
    End Function

    'generate auto number
    Function getAutoNum(tblName As String, colName As String) As Integer
        Dim dataTbl As DataTable
        dataTbl = runDML("select max(" & colName & ") + 1 from " & tblName) 'add one to get new id

        If (dataTbl.Rows(0)(0) Is DBNull.Value) Then 'check if null returned
            Return 1
        Else
            Return dataTbl.Rows(0)(0)
        End If
    End Function

    'fill dgv or combobox or listbox from database
    Function fillDCL(ByRef fillTarget As Object, ByRef tblName As String, ByRef colsName As String,
                     Optional dspMbr As String = Nothing,
                     Optional valueMbr As String = Nothing,
                     Optional ByRef msg As String = Nothing) As Boolean

        Dim chkType = fillTarget.GetType().Name
        Dim dataTbl As New DataTable
        dataTbl = runDML("select " & colsName & " from " & tblName & "", msg)

        Try
            If (chkType = "DataGridView") Then
                fillTarget.DataSource = dataTbl

            ElseIf (chkType = "ComboBox" Or chkType = "ListBox") Then
                fillTarget.DataSource = dataTbl
                fillTarget.displaymember = dspMbr
                fillTarget.ValueMember = valueMbr
            End If
        Catch ex As Exception
            If (msg <> Nothing) Then MsgBox(msg & vbNewLine & ex.Message,, "Error Filling DCL")
            Return 0
        End Try
        Return 1
    End Function

    'fill textboxes from table in database   Note-> txtBoxArr and colArr must be ordered
    Function fillTxtBoxDB(ByRef tblName As String, ByRef rowNum As Integer,
                        ByRef txtBoxArr() As TextBox, ByRef colArr() As String,
                        Optional ByRef msg As String = Nothing) As Boolean

        Dim index As Integer = 0
        Dim dataTbl As New DataTable
        dataTbl = runDML("select * from " & tblName & "")

        For Each txtbox In txtBoxArr
            Try
                If (dataTbl.Rows(rowNum).Item(colArr(index)) Is DBNull.Value) Then
                    txtbox.Text = ""
                Else
                    txtbox.Text = dataTbl.Rows(rowNum).Item(colArr(index))
                End If
            Catch ex As Exception
                If (msg <> Nothing) Then MsgBox(msg & vbNewLine & ex.Message,, "Error Filling Textboxes From Database")
                Return 0
            End Try
            index += 1
        Next
        Return 1
    End Function

    'fill textboxes from datatable  Note-> txtBoxArr and colArr must be ordered
    Function fillTxtBoxDataTbl(ByRef dataTblName As DataTable, ByRef txtBoxArr() As TextBox,
                               ByRef colIndexArr() As Integer, Optional ByRef rowIndex As Integer = 0,
                               Optional ByRef msg As String = Nothing) As Boolean

        Dim i As Integer = 0
        Try
            For Each col In colIndexArr
                If (dataTblName.Rows(rowIndex)(col) Is DBNull.Value) Then
                    txtBoxArr(i).Text = ""
                Else
                    txtBoxArr(i).Text = dataTblName.Rows(rowIndex)(col)
                End If
                i += 1
            Next
        Catch ex As Exception
            If (msg <> Nothing) Then MsgBox(msg & vbNewLine & ex.Message,, "Error Filling Textboxes From DataTable")
            Return 0
        End Try
        Return 1
    End Function

    'copy or paste with textboxes
    Function copyAndPaste(ByRef tb As TextBox,
                          Optional ByRef cpy As Boolean = False,
                          Optional ByRef pst As Boolean = False)
        If (cpy) Then
            Try
                My.Computer.Clipboard.SetText(tb.Text)
                Return 1
            Catch ex As Exception
                My.Computer.Clipboard.SetText(vbEmpty)
                Return 0
            End Try

        ElseIf (pst) Then
            tb.Text = My.Computer.Clipboard.GetText()
            Return 1

        Else
            Return 0
        End If
    End Function

    'convert dgv or datatable or combobox or listbox to array
    Function convertToArr(ByRef ctrlName As Object) As Object()
        Dim strArr() As Object = Nothing
        Dim rows, cols, i As Integer

        'calculate array size
        If (ctrlName.GetType.Name = "DataGridView" Or ctrlName.GetType.Name = "DataTable") Then
            rows = ctrlName.Rows.Count
            cols = ctrlName.Columns.Count
            'set dim of dynamic array
            ReDim strArr((rows * cols) - 1)
            'get real count of rows and cols
            cols -= 1
            rows -= 1
        ElseIf (ctrlName.GetType.Name = "ComboBox" Or ctrlName.GetType.Name = "ListBox") Then
            rows = ctrlName.Items.Count - 1
            ReDim strArr(rows)
        Else
            Return strArr
        End If

        'convert to array
        If (ctrlName.GetType.Name = "DataGridView") Then
            For r As Integer = 0 To rows
                For c As Integer = 0 To cols
                    strArr(i) = (CType(ctrlName, DataGridView).Rows(r).Cells(c).Value)
                    i += 1
                Next
            Next

        ElseIf (ctrlName.GetType.Name = "DataTable") Then
            For r As Integer = 0 To rows
                For c As Integer = 0 To cols
                    strArr(i) = (CType(ctrlName, DataTable).Rows(r)(c))
                    i += 1
                Next
            Next

        ElseIf (ctrlName.GetType.Name = "ComboBox" Or ctrlName.GetType.Name = "ListBox") Then
            For r As Integer = 0 To rows
                strArr(i) = (ctrlName.Items(r)(0))
                i += 1
            Next

        End If
        Return strArr
    End Function

    'compare two arrays if equal return true
    Function compArrs(ByRef originalArr() As Object, ByRef newArr() As Object) As Boolean
        If (originalArr.Length <> newArr.Length) Then Return 0
        Dim i As Integer
        For i = 0 To originalArr.Length - 1
            If (originalArr(i) <> newArr(i)) Then Return 0
        Next
        Return 1
    End Function

    'return selected value from dgv or combobox or listbox
    Function getSelectedFromDCL(ByRef ctrlName As Object,
                                ByRef ctrlColNum As Integer,
                                Optional ByRef ctrlEvent As Object = Nothing,
                                Optional ByRef msg As String = Nothing) As Object
        Try
            If (ctrlName.GetType.Name = "DataGridView") Then
                Return ctrlName.Rows(ctrlEvent.RowIndex).Cells(ctrlColNum).Value

            ElseIf (ctrlName.GetType.Name = "ComboBox" Or ctrlName.GetType.Name = "ListBox") Then
                Return ctrlName.SelectedItem(ctrlColNum)
            End If
        Catch ex As Exception
            If (msg <> Nothing) Then MsgBox(msg & vbNewLine & ex.Message,, "Error Returning")
        End Try
        Return 0
    End Function

    'check validation of strings with regular expression
    Function checkValidation(ByRef strArr() As String, ByRef regexStr As String) As Boolean
        Dim exp As Regex = New Regex(regexStr)
        For Each singleStr In strArr
            If (exp.Match(singleStr).ToString <> singleStr) Then Return 0
        Next
        Return 1
    End Function

    'check empty of textboxes
    Function isEmpty(ByRef txtArr() As TextBox, Optional ByRef txtOp As Boolean = True) As Boolean
        'txtOp true mean that operator between texts is and
        'txtOp false mean that operator between texts is or

        '(and) if any textbox have nothing return true
        If (txtOp) Then
            For Each tb In txtArr
                If (tb.Text.Replace(" ", "") = Nothing) Then Return 1
            Next
            Return 0
        End If

        '(or) if all textbox have nothing return true
        If (Not txtOp) Then
            For Each tb In txtArr
                If (tb.Text.Replace(" ", "") <> Nothing) Then Return 0
            Next
        End If
        Return 1
    End Function

    'show or hide and disable or enable and password char or not for controls
    Function protectCtrl(ByRef ctrlArr As Object,
                         Optional ByRef show As Boolean = True,
                         Optional ByRef enable As Boolean = True,
                         Optional ByRef passChar As Boolean = False) As Boolean
        Try
            If (show) Then
                For Each c In ctrlArr
                    c.visible = True
                Next
            Else
                For Each c In ctrlArr
                    c.visible = False
                Next
            End If

            If (enable) Then
                For Each c In ctrlArr
                    c.Enabled = True
                Next
            Else
                For Each c In ctrlArr
                    c.Enabled = False
                Next
            End If

            If (passChar) Then
                For Each c In ctrlArr
                    c.PasswordChar = "*"
                Next
            Else
                For Each c In ctrlArr
                    c.PasswordChar = ""
                Next
            End If
            Return 1

        Catch ex As Exception
            Return 0
        End Try
    End Function

    'edit form size
    Function setFormSize(ByRef frm As Form, ByRef fromLeft As Integer, ByRef fromTop As Integer)
        Dim x = Screen.PrimaryScreen.Bounds.Width - (fromLeft * 2)
        Dim y = Screen.PrimaryScreen.Bounds.Height - (fromTop * 2)
        frm.Size = New Size(x, y)
        'set location in screen center
        frm.Location = New Point(fromLeft, fromTop)
        Return 0
    End Function

    'edit form center
    Function setFormCenter(ByRef frm As Form)
        Dim xFrm = (Screen.PrimaryScreen.Bounds.Width - frm.Width) / 2
        Dim yFrm = (Screen.PrimaryScreen.Bounds.Height - frm.Height) / 2
        frm.Location = New Point(xFrm, yFrm)
        Return 0
    End Function

    'edit panel center
    Function setPanelCenter(ByRef frm As Form, ByRef pnl As Panel)
        Dim xPnl = (frm.Width - pnl.Width) / 2
        Dim yPnl = (frm.Height - pnl.Height) / 2
        pnl.Location = New Point(xPnl, yPnl)
        Return 0
    End Function

    'clear controls
    Function clearCtrl(ByRef frm As Object,
                       Optional ByRef dgvClr As Boolean = False,
                       Optional ByRef cmbBoxClr As Boolean = False,
                       Optional ByRef lstBoxClr As Boolean = False,
                       Optional ByRef txtBoxClr As Boolean = False,
                       Optional ByRef chkBoxClr As Boolean = False)

        For Each c In frm.Controls
            If (chkBoxClr And (TypeOf c Is CheckBox)) Then
                c.Checked = False

            ElseIf (txtBoxClr And (TypeOf c Is TextBox)) Then
                c.Clear()

            ElseIf (dgvClr And (TypeOf c Is DataGridView)) Then
                c.DataSource = Nothing

            ElseIf (cmbBoxClr And (TypeOf c Is ComboBox)) Then
                c.DataSource = Nothing

            ElseIf (lstBoxClr And (TypeOf c Is ListBox)) Then
                c.DataSource = Nothing
            End If
        Next
        Return 0
    End Function

End Class