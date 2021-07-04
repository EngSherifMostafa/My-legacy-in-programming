<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class LoginForm
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(LoginForm))
        Me.loginUserTb = New System.Windows.Forms.TextBox()
        Me.loginPassTb = New System.Windows.Forms.TextBox()
        Me.loginShowCb = New System.Windows.Forms.CheckBox()
        Me.loginBtn = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'loginUserTb
        '
        Me.loginUserTb.BackColor = System.Drawing.Color.White
        Me.loginUserTb.BorderStyle = System.Windows.Forms.BorderStyle.None
        Me.loginUserTb.Font = New System.Drawing.Font("Tahoma", 16.2!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.loginUserTb.Location = New System.Drawing.Point(171, 210)
        Me.loginUserTb.Name = "loginUserTb"
        Me.loginUserTb.Size = New System.Drawing.Size(412, 33)
        Me.loginUserTb.TabIndex = 2
        '
        'loginPassTb
        '
        Me.loginPassTb.BackColor = System.Drawing.Color.White
        Me.loginPassTb.BorderStyle = System.Windows.Forms.BorderStyle.None
        Me.loginPassTb.Font = New System.Drawing.Font("Tahoma", 16.2!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.loginPassTb.Location = New System.Drawing.Point(171, 319)
        Me.loginPassTb.Name = "loginPassTb"
        Me.loginPassTb.PasswordChar = Global.Microsoft.VisualBasic.ChrW(42)
        Me.loginPassTb.Size = New System.Drawing.Size(412, 33)
        Me.loginPassTb.TabIndex = 3
        '
        'loginShowCb
        '
        Me.loginShowCb.AutoSize = True
        Me.loginShowCb.ForeColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(192, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.loginShowCb.Location = New System.Drawing.Point(616, 334)
        Me.loginShowCb.Name = "loginShowCb"
        Me.loginShowCb.Size = New System.Drawing.Size(18, 17)
        Me.loginShowCb.TabIndex = 5
        Me.loginShowCb.UseVisualStyleBackColor = True
        '
        'loginBtn
        '
        Me.loginBtn.BackColor = System.Drawing.Color.DarkCyan
        Me.loginBtn.Font = New System.Drawing.Font("Bodoni MT Condensed", 36.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.loginBtn.ForeColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.loginBtn.Location = New System.Drawing.Point(77, 400)
        Me.loginBtn.Name = "loginBtn"
        Me.loginBtn.Size = New System.Drawing.Size(536, 80)
        Me.loginBtn.TabIndex = 6
        Me.loginBtn.Text = "Login"
        Me.loginBtn.UseVisualStyleBackColor = False
        '
        'LoginForm
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(7.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.FromArgb(CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer))
        Me.BackgroundImage = Global.Mail_Manager.Resources.loginScreen
        Me.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.ClientSize = New System.Drawing.Size(693, 483)
        Me.Controls.Add(Me.loginBtn)
        Me.Controls.Add(Me.loginShowCb)
        Me.Controls.Add(Me.loginPassTb)
        Me.Controls.Add(Me.loginUserTb)
        Me.ForeColor = System.Drawing.Color.Transparent
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.MaximizeBox = False
        Me.Name = "LoginForm"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Login Mail Manager v1.0"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents loginUserTb As TextBox
    Friend WithEvents loginPassTb As TextBox
    Friend WithEvents loginShowCb As CheckBox
    Friend WithEvents loginBtn As Button
End Class
