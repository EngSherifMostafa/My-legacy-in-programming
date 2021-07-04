Imports System.Data.OleDb
Public Class empForm
    Dim conn As New OleDbConnection("Provider=Microsoft.ACE.OLEDB.12.0;Data Source=EmpDB.mdb")
    Dim cmd As New OleDbCommand("", conn)
    Sub runSqlCmd(sqlCmd As String, Optional msg As String = "")
        Try
            If conn.State = ConnectionState.Closed Then conn.Open()
            cmd.CommandText = sqlCmd
            cmd.ExecuteNonQuery()
            If msg <> "" Then MsgBox(msg)
        Catch ex As Exception
            MsgBox(ex.Message)
        Finally
            If conn.State = ConnectionState.Open Then conn.Close()
        End Try
    End Sub
    Function getTbl(selectCmd As String) As DataTable
        Try
            Dim tbl As New DataTable()
            If conn.State = ConnectionState.Closed Then conn.Open()
            cmd.CommandText = selectCmd
            tbl.Load(cmd.ExecuteReader())
            Return tbl
        Catch ex As Exception
            MsgBox(ex.Message)
            Return New DataTable()
        Finally
            If conn.State = ConnectionState.Open Then conn.Close()
        End Try
    End Function
    Private Sub empForm_Resize(sender As Object, e As EventArgs) Handles MyBase.Resize
        Dim x As Integer = ((Me.Width() - pnl.Width()) / 2) - 10
        Dim y As Integer = ((Me.Height() - pnl.Height()) / 2) - 10
        pnl.Location = New Point(x, y)
    End Sub
    Private Sub Timer1_Tick(sender As Object, e As EventArgs) Handles Timer1.Tick
        lblDateTime.Text = Now.ToString("dd-MMMM-yyyy" & vbNewLine & "hh:mm:ss")
    End Sub
    Sub fillEmp()
        dgvEmp.DataSource = getTbl("select * from empDept")
    End Sub
    Sub fillPhone()
        dgvPhone.DataSource = getTbl("select * from employeePhones")
    End Sub
    Sub fillDept()
        comDeptName.DataSource = getTbl("select * from department")
        comDeptName.ValueMember = "deptID" 'value hidden from user'
        comDeptName.DisplayMember = "deptName" 'value display to user'
    End Sub
    Function getAutoNum(tblName As String, colName As String) As String
        Dim tbl As DataTable
        tbl = getTbl("select max(" & colName & ") + 1 from " & tblName) 'add one to get new id
        If (tbl.Rows(0)(0) Is DBNull.Value) Then 'check if null returned
            Return "1"
        Else
            Return tbl.Rows(0)(0)
        End If
    End Function
    Private Sub empForm_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Dim AutoNum As Integer = getAutoNum("employee", "empID")
        txtEmpNo.Text = AutoNum

        runSqlCmd("create view empDept as
                       select empID as ID , empName as Name,empAdd as Address,
                       empSalary as Salary,deptName as Department
                       from employee inner join department
                       on employee.deptID = department.deptID")

        runSqlCmd("create view employeePhones as
                       select empName as Name,empPhone as Phone
                       from employee inner join empPhones
                       on employee.empID=empPhones.empID")
        fillEmp()
        fillPhone()
        fillDept()

        runSqlCmd("drop table empDept")
        runSqlCmd("drop table employeePhones")
    End Sub
    Private Sub btnAddDept_Click(sender As Object, e As EventArgs) Handles btnAddDept.Click
        Dim dNewName As String = InputBox("Enter department name: ")
        Dim autoNum As String = getAutoNum("department", "deptID")
        If dNewName.Trim() = "" Then
            MsgBox("Department name is empty")
        Else
            runSqlCmd("insert into department values(" & autoNum & ",'" & dNewName & "')")
            fillDept()
            comDeptName.SelectedValue = autoNum 'make selected value is new value
        End If
    End Sub
    Sub txtFillDatabase(boxName As Control, tbl As String, colName As String)
        Dim val As String = boxName.Text
        If val.Trim() = "" Then
            MsgBox("Some data is empty")
        Else
            runSqlCmd("insert into " & tbl & " (" & colName & " ) values('" & val & "')")
        End If

    End Sub
    Sub combFillDatabase(boxName As Control, tbl As String, colName As String)
        Dim val As String = comDeptName.ValueMember
        If val.Trim() = "" Then
            MsgBox("Some data is empty")
        Else
            runSqlCmd("insert into " & tbl & " (" & colName & " ) values('" & val & "')")
        End If

    End Sub
    Private Sub btnAdd_Click(sender As Object, e As EventArgs) Handles btnAdd.Click

        txtFillDatabase(txtEmpNo, "employee", "empID")
        combFillDatabase(comDeptName, "employee", "deptID")

        txtFillDatabase(txtEmpAddr, "employee", "empAdd")
        txtFillDatabase(numEmpSalary, "employee", "empSalary")
        'txtFillDatabase(txtEmpPhone, "empPhones", "empPhone")
    End Sub
End Class
