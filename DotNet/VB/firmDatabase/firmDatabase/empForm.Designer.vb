<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class empForm
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()>
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        Me.components = New System.ComponentModel.Container()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(empForm))
        Me.btnSearchRpt = New System.Windows.Forms.Button()
        Me.chkAutoSearch = New System.Windows.Forms.CheckBox()
        Me.btnSearch = New System.Windows.Forms.Button()
        Me.txtSearch = New System.Windows.Forms.TextBox()
        Me.rbtnBSalary = New System.Windows.Forms.RadioButton()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.rbtnPhone = New System.Windows.Forms.RadioButton()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label7 = New System.Windows.Forms.Label()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.btnAddDept = New System.Windows.Forms.Button()
        Me.comDeptName = New System.Windows.Forms.ComboBox()
        Me.numEmpSalary = New System.Windows.Forms.NumericUpDown()
        Me.txtEmpPhone = New System.Windows.Forms.TextBox()
        Me.txtEmpAddr = New System.Windows.Forms.TextBox()
        Me.txtEmpName = New System.Windows.Forms.TextBox()
        Me.txtEmpNo = New System.Windows.Forms.TextBox()
        Me.Timer1 = New System.Windows.Forms.Timer(Me.components)
        Me.rbtnDept = New System.Windows.Forms.RadioButton()
        Me.pnl = New System.Windows.Forms.Panel()
        Me.lblDateTime = New System.Windows.Forms.Label()
        Me.btnUpdate = New System.Windows.Forms.Button()
        Me.btnDel = New System.Windows.Forms.Button()
        Me.BtnClr = New System.Windows.Forms.Button()
        Me.btnRpt = New System.Windows.Forms.Button()
        Me.btnPhoneRpt = New System.Windows.Forms.Button()
        Me.btnBackup = New System.Windows.Forms.Button()
        Me.btnAdd = New System.Windows.Forms.Button()
        Me.dgvEmp = New System.Windows.Forms.DataGridView()
        Me.lblCount = New System.Windows.Forms.Label()
        Me.dgvPhone = New System.Windows.Forms.DataGridView()
        Me.btnAddPhone = New System.Windows.Forms.Button()
        Me.btnClrPhone = New System.Windows.Forms.Button()
        Me.GroupBox1 = New System.Windows.Forms.GroupBox()
        Me.rbtnGSalary = New System.Windows.Forms.RadioButton()
        Me.rbtnLSalary = New System.Windows.Forms.RadioButton()
        Me.rbtnSalary = New System.Windows.Forms.RadioButton()
        Me.rbtnAddr = New System.Windows.Forms.RadioButton()
        Me.rbtnName = New System.Windows.Forms.RadioButton()
        Me.rbtnNum = New System.Windows.Forms.RadioButton()
        Me.EmpDBDataSet = New firmDatabase.EmpDBDataSet()
        Me.DepartmentBindingSource = New System.Windows.Forms.BindingSource(Me.components)
        Me.DepartmentTableAdapter = New firmDatabase.EmpDBDataSetTableAdapters.departmentTableAdapter()
        Me.TableAdapterManager = New firmDatabase.EmpDBDataSetTableAdapters.TableAdapterManager()
        Me.EmployeeTableAdapter = New firmDatabase.EmpDBDataSetTableAdapters.employeeTableAdapter()
        Me.EmployeeBindingSource = New System.Windows.Forms.BindingSource(Me.components)
        CType(Me.numEmpSalary, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.pnl.SuspendLayout()
        CType(Me.dgvEmp, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.dgvPhone, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.GroupBox1.SuspendLayout()
        CType(Me.EmpDBDataSet, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.DepartmentBindingSource, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.EmployeeBindingSource, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'btnSearchRpt
        '
        Me.btnSearchRpt.BackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(255, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.btnSearchRpt.Cursor = System.Windows.Forms.Cursors.Hand
        Me.btnSearchRpt.FlatStyle = System.Windows.Forms.FlatStyle.Popup
        Me.btnSearchRpt.Font = New System.Drawing.Font("Tahoma", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnSearchRpt.Location = New System.Drawing.Point(357, 159)
        Me.btnSearchRpt.Name = "btnSearchRpt"
        Me.btnSearchRpt.Size = New System.Drawing.Size(144, 32)
        Me.btnSearchRpt.TabIndex = 23
        Me.btnSearchRpt.Text = "Search Report"
        Me.btnSearchRpt.UseVisualStyleBackColor = False
        '
        'chkAutoSearch
        '
        Me.chkAutoSearch.AutoSize = True
        Me.chkAutoSearch.Location = New System.Drawing.Point(162, 160)
        Me.chkAutoSearch.Name = "chkAutoSearch"
        Me.chkAutoSearch.Size = New System.Drawing.Size(163, 33)
        Me.chkAutoSearch.TabIndex = 18
        Me.chkAutoSearch.Text = "Auto Search"
        Me.chkAutoSearch.UseVisualStyleBackColor = True
        '
        'btnSearch
        '
        Me.btnSearch.Cursor = System.Windows.Forms.Cursors.Hand
        Me.btnSearch.FlatStyle = System.Windows.Forms.FlatStyle.Popup
        Me.btnSearch.Location = New System.Drawing.Point(50, 159)
        Me.btnSearch.Name = "btnSearch"
        Me.btnSearch.Size = New System.Drawing.Size(94, 34)
        Me.btnSearch.TabIndex = 17
        Me.btnSearch.Text = "Search"
        Me.btnSearch.UseVisualStyleBackColor = True
        '
        'txtSearch
        '
        Me.txtSearch.Location = New System.Drawing.Point(50, 118)
        Me.txtSearch.Name = "txtSearch"
        Me.txtSearch.Size = New System.Drawing.Size(675, 35)
        Me.txtSearch.TabIndex = 9
        '
        'rbtnBSalary
        '
        Me.rbtnBSalary.AutoSize = True
        Me.rbtnBSalary.Font = New System.Drawing.Font("Tahoma", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rbtnBSalary.Location = New System.Drawing.Point(555, 84)
        Me.rbtnBSalary.Name = "rbtnBSalary"
        Me.rbtnBSalary.Size = New System.Drawing.Size(170, 28)
        Me.rbtnBSalary.TabIndex = 6
        Me.rbtnBSalary.TabStop = True
        Me.rbtnBSalary.Text = "Salary Between"
        Me.rbtnBSalary.UseVisualStyleBackColor = True
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(14, 180)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(72, 24)
        Me.Label4.TabIndex = 33
        Me.Label4.Text = "Salary:"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(14, 136)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(87, 24)
        Me.Label3.TabIndex = 32
        Me.Label3.Text = "Address:"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(14, 92)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(162, 24)
        Me.Label2.TabIndex = 31
        Me.Label2.Text = "Employee Name:"
        '
        'rbtnPhone
        '
        Me.rbtnPhone.AutoSize = True
        Me.rbtnPhone.Font = New System.Drawing.Font("Tahoma", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rbtnPhone.Location = New System.Drawing.Point(606, 34)
        Me.rbtnPhone.Name = "rbtnPhone"
        Me.rbtnPhone.Size = New System.Drawing.Size(86, 28)
        Me.rbtnPhone.TabIndex = 8
        Me.rbtnPhone.TabStop = True
        Me.rbtnPhone.Text = "Phone"
        Me.rbtnPhone.UseVisualStyleBackColor = True
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(14, 48)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(180, 24)
        Me.Label1.TabIndex = 30
        Me.Label1.Text = "Employee Number:"
        '
        'Label7
        '
        Me.Label7.AutoSize = True
        Me.Label7.Font = New System.Drawing.Font("Tahoma", 19.8!, CType(((System.Drawing.FontStyle.Bold Or System.Drawing.FontStyle.Italic) _
                Or System.Drawing.FontStyle.Underline), System.Drawing.FontStyle), System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label7.Location = New System.Drawing.Point(480, 0)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(272, 40)
        Me.Label7.TabIndex = 36
        Me.Label7.Text = "Employee Form"
        Me.Label7.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(17, 270)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(148, 24)
        Me.Label6.TabIndex = 35
        Me.Label6.Text = "Phone Number:"
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(14, 224)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(124, 24)
        Me.Label5.TabIndex = 34
        Me.Label5.Text = "Department:"
        '
        'btnAddDept
        '
        Me.btnAddDept.Cursor = System.Windows.Forms.Cursors.Hand
        Me.btnAddDept.FlatStyle = System.Windows.Forms.FlatStyle.Popup
        Me.btnAddDept.Location = New System.Drawing.Point(423, 224)
        Me.btnAddDept.Name = "btnAddDept"
        Me.btnAddDept.Size = New System.Drawing.Size(37, 32)
        Me.btnAddDept.TabIndex = 43
        Me.btnAddDept.Text = "+"
        Me.btnAddDept.UseVisualStyleBackColor = True
        '
        'comDeptName
        '
        Me.comDeptName.FormattingEnabled = True
        Me.comDeptName.Location = New System.Drawing.Point(200, 224)
        Me.comDeptName.Name = "comDeptName"
        Me.comDeptName.Size = New System.Drawing.Size(217, 32)
        Me.comDeptName.TabIndex = 42
        '
        'numEmpSalary
        '
        Me.numEmpSalary.Location = New System.Drawing.Point(200, 180)
        Me.numEmpSalary.Maximum = New Decimal(New Integer() {100000, 0, 0, 0})
        Me.numEmpSalary.Name = "numEmpSalary"
        Me.numEmpSalary.Size = New System.Drawing.Size(260, 32)
        Me.numEmpSalary.TabIndex = 41
        Me.numEmpSalary.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'txtEmpPhone
        '
        Me.txtEmpPhone.Location = New System.Drawing.Point(15, 297)
        Me.txtEmpPhone.Name = "txtEmpPhone"
        Me.txtEmpPhone.Size = New System.Drawing.Size(212, 32)
        Me.txtEmpPhone.TabIndex = 40
        '
        'txtEmpAddr
        '
        Me.txtEmpAddr.Location = New System.Drawing.Point(200, 134)
        Me.txtEmpAddr.Name = "txtEmpAddr"
        Me.txtEmpAddr.Size = New System.Drawing.Size(260, 32)
        Me.txtEmpAddr.TabIndex = 39
        '
        'txtEmpName
        '
        Me.txtEmpName.Location = New System.Drawing.Point(200, 91)
        Me.txtEmpName.Name = "txtEmpName"
        Me.txtEmpName.Size = New System.Drawing.Size(260, 32)
        Me.txtEmpName.TabIndex = 38
        '
        'txtEmpNo
        '
        Me.txtEmpNo.Location = New System.Drawing.Point(200, 48)
        Me.txtEmpNo.Name = "txtEmpNo"
        Me.txtEmpNo.ReadOnly = True
        Me.txtEmpNo.Size = New System.Drawing.Size(260, 32)
        Me.txtEmpNo.TabIndex = 37
        Me.txtEmpNo.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'Timer1
        '
        Me.Timer1.Enabled = True
        Me.Timer1.Interval = 1000
        '
        'rbtnDept
        '
        Me.rbtnDept.AutoSize = True
        Me.rbtnDept.Font = New System.Drawing.Font("Tahoma", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rbtnDept.Location = New System.Drawing.Point(436, 34)
        Me.rbtnDept.Name = "rbtnDept"
        Me.rbtnDept.Size = New System.Drawing.Size(138, 28)
        Me.rbtnDept.TabIndex = 7
        Me.rbtnDept.TabStop = True
        Me.rbtnDept.Text = "Department"
        Me.rbtnDept.UseVisualStyleBackColor = True
        '
        'pnl
        '
        Me.pnl.Controls.Add(Me.lblDateTime)
        Me.pnl.Controls.Add(Me.btnUpdate)
        Me.pnl.Controls.Add(Me.btnDel)
        Me.pnl.Controls.Add(Me.BtnClr)
        Me.pnl.Controls.Add(Me.btnRpt)
        Me.pnl.Controls.Add(Me.btnPhoneRpt)
        Me.pnl.Controls.Add(Me.btnBackup)
        Me.pnl.Controls.Add(Me.btnAdd)
        Me.pnl.Controls.Add(Me.dgvEmp)
        Me.pnl.Controls.Add(Me.lblCount)
        Me.pnl.Controls.Add(Me.dgvPhone)
        Me.pnl.Controls.Add(Me.btnAddPhone)
        Me.pnl.Controls.Add(Me.btnClrPhone)
        Me.pnl.Controls.Add(Me.GroupBox1)
        Me.pnl.Controls.Add(Me.Label4)
        Me.pnl.Controls.Add(Me.Label3)
        Me.pnl.Controls.Add(Me.Label2)
        Me.pnl.Controls.Add(Me.Label1)
        Me.pnl.Controls.Add(Me.Label7)
        Me.pnl.Controls.Add(Me.Label6)
        Me.pnl.Controls.Add(Me.Label5)
        Me.pnl.Controls.Add(Me.btnAddDept)
        Me.pnl.Controls.Add(Me.comDeptName)
        Me.pnl.Controls.Add(Me.numEmpSalary)
        Me.pnl.Controls.Add(Me.txtEmpPhone)
        Me.pnl.Controls.Add(Me.txtEmpAddr)
        Me.pnl.Controls.Add(Me.txtEmpName)
        Me.pnl.Controls.Add(Me.txtEmpNo)
        Me.pnl.Location = New System.Drawing.Point(3, 2)
        Me.pnl.Name = "pnl"
        Me.pnl.Size = New System.Drawing.Size(1227, 581)
        Me.pnl.TabIndex = 1
        '
        'lblDateTime
        '
        Me.lblDateTime.AutoSize = True
        Me.lblDateTime.BackColor = System.Drawing.SystemColors.Control
        Me.lblDateTime.ForeColor = System.Drawing.Color.Blue
        Me.lblDateTime.Location = New System.Drawing.Point(908, 10)
        Me.lblDateTime.Name = "lblDateTime"
        Me.lblDateTime.Size = New System.Drawing.Size(0, 24)
        Me.lblDateTime.TabIndex = 57
        '
        'btnUpdate
        '
        Me.btnUpdate.BackColor = System.Drawing.Color.FromArgb(CType(CType(192, Byte), Integer), CType(CType(255, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.btnUpdate.Cursor = System.Windows.Forms.Cursors.Hand
        Me.btnUpdate.FlatStyle = System.Windows.Forms.FlatStyle.Popup
        Me.btnUpdate.Location = New System.Drawing.Point(189, 502)
        Me.btnUpdate.Name = "btnUpdate"
        Me.btnUpdate.Size = New System.Drawing.Size(134, 51)
        Me.btnUpdate.TabIndex = 56
        Me.btnUpdate.Text = "Update"
        Me.btnUpdate.UseVisualStyleBackColor = False
        '
        'btnDel
        '
        Me.btnDel.BackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(192, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.btnDel.Cursor = System.Windows.Forms.Cursors.Hand
        Me.btnDel.FlatStyle = System.Windows.Forms.FlatStyle.Popup
        Me.btnDel.Location = New System.Drawing.Point(362, 502)
        Me.btnDel.Name = "btnDel"
        Me.btnDel.Size = New System.Drawing.Size(134, 51)
        Me.btnDel.TabIndex = 55
        Me.btnDel.Text = "Delete"
        Me.btnDel.UseVisualStyleBackColor = False
        '
        'BtnClr
        '
        Me.BtnClr.BackColor = System.Drawing.Color.FromArgb(CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer))
        Me.BtnClr.Cursor = System.Windows.Forms.Cursors.Hand
        Me.BtnClr.FlatStyle = System.Windows.Forms.FlatStyle.Popup
        Me.BtnClr.Location = New System.Drawing.Point(535, 502)
        Me.BtnClr.Name = "BtnClr"
        Me.BtnClr.Size = New System.Drawing.Size(134, 51)
        Me.BtnClr.TabIndex = 54
        Me.BtnClr.Text = "Clear"
        Me.BtnClr.UseVisualStyleBackColor = False
        '
        'btnRpt
        '
        Me.btnRpt.BackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(255, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.btnRpt.Cursor = System.Windows.Forms.Cursors.Hand
        Me.btnRpt.FlatStyle = System.Windows.Forms.FlatStyle.Popup
        Me.btnRpt.Location = New System.Drawing.Point(708, 502)
        Me.btnRpt.Name = "btnRpt"
        Me.btnRpt.Size = New System.Drawing.Size(134, 51)
        Me.btnRpt.TabIndex = 53
        Me.btnRpt.Text = "Report"
        Me.btnRpt.UseVisualStyleBackColor = False
        '
        'btnPhoneRpt
        '
        Me.btnPhoneRpt.BackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(255, Byte), Integer), CType(CType(128, Byte), Integer))
        Me.btnPhoneRpt.Cursor = System.Windows.Forms.Cursors.Hand
        Me.btnPhoneRpt.FlatStyle = System.Windows.Forms.FlatStyle.Popup
        Me.btnPhoneRpt.Location = New System.Drawing.Point(881, 502)
        Me.btnPhoneRpt.Name = "btnPhoneRpt"
        Me.btnPhoneRpt.Size = New System.Drawing.Size(153, 51)
        Me.btnPhoneRpt.TabIndex = 52
        Me.btnPhoneRpt.Text = "Phone Report"
        Me.btnPhoneRpt.UseVisualStyleBackColor = False
        '
        'btnBackup
        '
        Me.btnBackup.BackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(192, Byte), Integer), CType(CType(255, Byte), Integer))
        Me.btnBackup.Cursor = System.Windows.Forms.Cursors.Hand
        Me.btnBackup.FlatStyle = System.Windows.Forms.FlatStyle.Popup
        Me.btnBackup.Location = New System.Drawing.Point(1073, 502)
        Me.btnBackup.Name = "btnBackup"
        Me.btnBackup.Size = New System.Drawing.Size(134, 51)
        Me.btnBackup.TabIndex = 51
        Me.btnBackup.Text = "Backup"
        Me.btnBackup.UseVisualStyleBackColor = False
        '
        'btnAdd
        '
        Me.btnAdd.BackColor = System.Drawing.Color.FromArgb(CType(CType(192, Byte), Integer), CType(CType(192, Byte), Integer), CType(CType(255, Byte), Integer))
        Me.btnAdd.Cursor = System.Windows.Forms.Cursors.Hand
        Me.btnAdd.FlatStyle = System.Windows.Forms.FlatStyle.Popup
        Me.btnAdd.Location = New System.Drawing.Point(16, 502)
        Me.btnAdd.Name = "btnAdd"
        Me.btnAdd.Size = New System.Drawing.Size(134, 51)
        Me.btnAdd.TabIndex = 50
        Me.btnAdd.Text = "Add"
        Me.btnAdd.UseVisualStyleBackColor = False
        '
        'dgvEmp
        '
        Me.dgvEmp.AllowUserToAddRows = False
        Me.dgvEmp.AllowUserToDeleteRows = False
        Me.dgvEmp.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.Fill
        Me.dgvEmp.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize
        Me.dgvEmp.Location = New System.Drawing.Point(476, 297)
        Me.dgvEmp.Name = "dgvEmp"
        Me.dgvEmp.ReadOnly = True
        Me.dgvEmp.RowTemplate.Height = 26
        Me.dgvEmp.Size = New System.Drawing.Size(731, 199)
        Me.dgvEmp.TabIndex = 49
        '
        'lblCount
        '
        Me.lblCount.AutoSize = True
        Me.lblCount.Location = New System.Drawing.Point(829, 259)
        Me.lblCount.Name = "lblCount"
        Me.lblCount.Size = New System.Drawing.Size(21, 24)
        Me.lblCount.TabIndex = 48
        Me.lblCount.Text = "0"
        '
        'dgvPhone
        '
        Me.dgvPhone.AllowUserToAddRows = False
        Me.dgvPhone.AllowUserToDeleteRows = False
        Me.dgvPhone.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.Fill
        Me.dgvPhone.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize
        Me.dgvPhone.Location = New System.Drawing.Point(16, 342)
        Me.dgvPhone.Name = "dgvPhone"
        Me.dgvPhone.ReadOnly = True
        Me.dgvPhone.RowTemplate.Height = 26
        Me.dgvPhone.Size = New System.Drawing.Size(443, 154)
        Me.dgvPhone.TabIndex = 46
        '
        'btnAddPhone
        '
        Me.btnAddPhone.Cursor = System.Windows.Forms.Cursors.Hand
        Me.btnAddPhone.FlatStyle = System.Windows.Forms.FlatStyle.Popup
        Me.btnAddPhone.Location = New System.Drawing.Point(233, 297)
        Me.btnAddPhone.Name = "btnAddPhone"
        Me.btnAddPhone.Size = New System.Drawing.Size(127, 32)
        Me.btnAddPhone.TabIndex = 45
        Me.btnAddPhone.Text = "Add Phone"
        Me.btnAddPhone.UseVisualStyleBackColor = True
        '
        'btnClrPhone
        '
        Me.btnClrPhone.Cursor = System.Windows.Forms.Cursors.Hand
        Me.btnClrPhone.FlatStyle = System.Windows.Forms.FlatStyle.Popup
        Me.btnClrPhone.Location = New System.Drawing.Point(366, 297)
        Me.btnClrPhone.Name = "btnClrPhone"
        Me.btnClrPhone.Size = New System.Drawing.Size(94, 32)
        Me.btnClrPhone.TabIndex = 44
        Me.btnClrPhone.Text = "Clear"
        Me.btnClrPhone.UseVisualStyleBackColor = True
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.btnSearchRpt)
        Me.GroupBox1.Controls.Add(Me.chkAutoSearch)
        Me.GroupBox1.Controls.Add(Me.btnSearch)
        Me.GroupBox1.Controls.Add(Me.txtSearch)
        Me.GroupBox1.Controls.Add(Me.rbtnPhone)
        Me.GroupBox1.Controls.Add(Me.rbtnBSalary)
        Me.GroupBox1.Controls.Add(Me.rbtnDept)
        Me.GroupBox1.Controls.Add(Me.rbtnGSalary)
        Me.GroupBox1.Controls.Add(Me.rbtnLSalary)
        Me.GroupBox1.Controls.Add(Me.rbtnSalary)
        Me.GroupBox1.Controls.Add(Me.rbtnAddr)
        Me.GroupBox1.Controls.Add(Me.rbtnName)
        Me.GroupBox1.Controls.Add(Me.rbtnNum)
        Me.GroupBox1.Font = New System.Drawing.Font("Tahoma", 13.8!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.GroupBox1.Location = New System.Drawing.Point(476, 48)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(731, 208)
        Me.GroupBox1.TabIndex = 47
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Search"
        '
        'rbtnGSalary
        '
        Me.rbtnGSalary.AutoSize = True
        Me.rbtnGSalary.Font = New System.Drawing.Font("Tahoma", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rbtnGSalary.Location = New System.Drawing.Point(353, 84)
        Me.rbtnGSalary.Name = "rbtnGSalary"
        Me.rbtnGSalary.Size = New System.Drawing.Size(159, 28)
        Me.rbtnGSalary.TabIndex = 5
        Me.rbtnGSalary.TabStop = True
        Me.rbtnGSalary.Text = "Salary Greater"
        Me.rbtnGSalary.UseVisualStyleBackColor = True
        '
        'rbtnLSalary
        '
        Me.rbtnLSalary.AutoSize = True
        Me.rbtnLSalary.Font = New System.Drawing.Font("Tahoma", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rbtnLSalary.Location = New System.Drawing.Point(179, 84)
        Me.rbtnLSalary.Name = "rbtnLSalary"
        Me.rbtnLSalary.Size = New System.Drawing.Size(131, 28)
        Me.rbtnLSalary.TabIndex = 4
        Me.rbtnLSalary.TabStop = True
        Me.rbtnLSalary.Text = "Salary Less"
        Me.rbtnLSalary.UseVisualStyleBackColor = True
        '
        'rbtnSalary
        '
        Me.rbtnSalary.AutoSize = True
        Me.rbtnSalary.Font = New System.Drawing.Font("Tahoma", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rbtnSalary.Location = New System.Drawing.Point(50, 84)
        Me.rbtnSalary.Name = "rbtnSalary"
        Me.rbtnSalary.Size = New System.Drawing.Size(86, 28)
        Me.rbtnSalary.TabIndex = 3
        Me.rbtnSalary.TabStop = True
        Me.rbtnSalary.Text = "Salary"
        Me.rbtnSalary.UseVisualStyleBackColor = True
        '
        'rbtnAddr
        '
        Me.rbtnAddr.AutoSize = True
        Me.rbtnAddr.Font = New System.Drawing.Font("Tahoma", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rbtnAddr.Location = New System.Drawing.Point(303, 34)
        Me.rbtnAddr.Name = "rbtnAddr"
        Me.rbtnAddr.Size = New System.Drawing.Size(101, 28)
        Me.rbtnAddr.TabIndex = 2
        Me.rbtnAddr.TabStop = True
        Me.rbtnAddr.Text = "Address"
        Me.rbtnAddr.UseVisualStyleBackColor = True
        '
        'rbtnName
        '
        Me.rbtnName.AutoSize = True
        Me.rbtnName.Font = New System.Drawing.Font("Tahoma", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rbtnName.Location = New System.Drawing.Point(188, 34)
        Me.rbtnName.Name = "rbtnName"
        Me.rbtnName.Size = New System.Drawing.Size(83, 28)
        Me.rbtnName.TabIndex = 1
        Me.rbtnName.TabStop = True
        Me.rbtnName.Text = "Name"
        Me.rbtnName.UseVisualStyleBackColor = True
        '
        'rbtnNum
        '
        Me.rbtnNum.AutoSize = True
        Me.rbtnNum.Font = New System.Drawing.Font("Tahoma", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rbtnNum.Location = New System.Drawing.Point(55, 34)
        Me.rbtnNum.Name = "rbtnNum"
        Me.rbtnNum.Size = New System.Drawing.Size(101, 28)
        Me.rbtnNum.TabIndex = 0
        Me.rbtnNum.TabStop = True
        Me.rbtnNum.Text = "Number"
        Me.rbtnNum.UseVisualStyleBackColor = True
        '
        'EmpDBDataSet
        '
        Me.EmpDBDataSet.DataSetName = "EmpDBDataSet"
        Me.EmpDBDataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'DepartmentBindingSource
        '
        Me.DepartmentBindingSource.DataMember = "department"
        Me.DepartmentBindingSource.DataSource = Me.EmpDBDataSet
        '
        'DepartmentTableAdapter
        '
        Me.DepartmentTableAdapter.ClearBeforeFill = True
        '
        'TableAdapterManager
        '
        Me.TableAdapterManager.BackupDataSetBeforeUpdate = False
        Me.TableAdapterManager.departmentTableAdapter = Me.DepartmentTableAdapter
        Me.TableAdapterManager.employeeTableAdapter = Me.EmployeeTableAdapter
        Me.TableAdapterManager.empPhonesTableAdapter = Nothing
        Me.TableAdapterManager.Table1TableAdapter = Nothing
        Me.TableAdapterManager.Table2TableAdapter = Nothing
        Me.TableAdapterManager.Table3TableAdapter = Nothing
        Me.TableAdapterManager.UpdateOrder = firmDatabase.EmpDBDataSetTableAdapters.TableAdapterManager.UpdateOrderOption.InsertUpdateDelete
        '
        'EmployeeTableAdapter
        '
        Me.EmployeeTableAdapter.ClearBeforeFill = True
        '
        'EmployeeBindingSource
        '
        Me.EmployeeBindingSource.DataMember = "employee"
        Me.EmployeeBindingSource.DataSource = Me.EmpDBDataSet
        '
        'empForm
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(11.0!, 24.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(1230, 583)
        Me.Controls.Add(Me.pnl)
        Me.Font = New System.Drawing.Font("Tahoma", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.Margin = New System.Windows.Forms.Padding(5, 4, 5, 4)
        Me.Name = "empForm"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Employee Form"
        CType(Me.numEmpSalary, System.ComponentModel.ISupportInitialize).EndInit()
        Me.pnl.ResumeLayout(False)
        Me.pnl.PerformLayout()
        CType(Me.dgvEmp, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.dgvPhone, System.ComponentModel.ISupportInitialize).EndInit()
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox1.PerformLayout()
        CType(Me.EmpDBDataSet, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.DepartmentBindingSource, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.EmployeeBindingSource, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub

    Friend WithEvents btnSearchRpt As Button
    Friend WithEvents chkAutoSearch As CheckBox
    Friend WithEvents btnSearch As Button
    Friend WithEvents txtSearch As TextBox
    Friend WithEvents rbtnBSalary As RadioButton
    Friend WithEvents Label4 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents rbtnPhone As RadioButton
    Friend WithEvents Label1 As Label
    Friend WithEvents Label7 As Label
    Friend WithEvents Label6 As Label
    Friend WithEvents Label5 As Label
    Friend WithEvents btnAddDept As Button
    Friend WithEvents comDeptName As ComboBox
    Friend WithEvents numEmpSalary As NumericUpDown
    Friend WithEvents txtEmpPhone As TextBox
    Friend WithEvents txtEmpAddr As TextBox
    Friend WithEvents txtEmpName As TextBox
    Friend WithEvents txtEmpNo As TextBox
    Friend WithEvents Timer1 As Timer
    Friend WithEvents rbtnDept As RadioButton
    Friend WithEvents pnl As Panel
    Friend WithEvents lblDateTime As Label
    Friend WithEvents btnUpdate As Button
    Friend WithEvents btnDel As Button
    Friend WithEvents BtnClr As Button
    Friend WithEvents btnRpt As Button
    Friend WithEvents btnPhoneRpt As Button
    Friend WithEvents btnBackup As Button
    Friend WithEvents btnAdd As Button
    Friend WithEvents dgvEmp As DataGridView
    Friend WithEvents lblCount As Label
    Friend WithEvents dgvPhone As DataGridView
    Friend WithEvents btnAddPhone As Button
    Friend WithEvents btnClrPhone As Button
    Friend WithEvents GroupBox1 As GroupBox
    Friend WithEvents rbtnGSalary As RadioButton
    Friend WithEvents rbtnLSalary As RadioButton
    Friend WithEvents rbtnSalary As RadioButton
    Friend WithEvents rbtnAddr As RadioButton
    Friend WithEvents rbtnName As RadioButton
    Friend WithEvents rbtnNum As RadioButton
    Friend WithEvents EmpDBDataSet As EmpDBDataSet
    Friend WithEvents DepartmentBindingSource As BindingSource
    Friend WithEvents DepartmentTableAdapter As EmpDBDataSetTableAdapters.departmentTableAdapter
    Friend WithEvents TableAdapterManager As EmpDBDataSetTableAdapters.TableAdapterManager
    Friend WithEvents EmployeeTableAdapter As EmpDBDataSetTableAdapters.employeeTableAdapter
    Friend WithEvents EmployeeBindingSource As BindingSource
End Class
