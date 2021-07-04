<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class MainForm
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
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
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(MainForm))
        Me.shwBtn = New System.Windows.Forms.Button()
        Me.hideBtn = New System.Windows.Forms.Button()
        Me.pathTb = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.pstBtn = New System.Windows.Forms.Button()
        Me.clrBtn = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'shwBtn
        '
        Me.shwBtn.BackColor = System.Drawing.Color.FromArgb(CType(CType(192, Byte), Integer), CType(CType(255, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.shwBtn.Font = New System.Drawing.Font("Tahoma", 16.2!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.shwBtn.Location = New System.Drawing.Point(147, 195)
        Me.shwBtn.Margin = New System.Windows.Forms.Padding(2)
        Me.shwBtn.Name = "shwBtn"
        Me.shwBtn.Size = New System.Drawing.Size(149, 70)
        Me.shwBtn.TabIndex = 0
        Me.shwBtn.Text = "Show"
        Me.shwBtn.UseVisualStyleBackColor = False
        '
        'hideBtn
        '
        Me.hideBtn.BackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(192, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.hideBtn.Font = New System.Drawing.Font("Tahoma", 16.2!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.hideBtn.Location = New System.Drawing.Point(384, 195)
        Me.hideBtn.Margin = New System.Windows.Forms.Padding(2)
        Me.hideBtn.Name = "hideBtn"
        Me.hideBtn.Size = New System.Drawing.Size(149, 70)
        Me.hideBtn.TabIndex = 1
        Me.hideBtn.Text = "Hide"
        Me.hideBtn.UseVisualStyleBackColor = False
        '
        'pathTb
        '
        Me.pathTb.Font = New System.Drawing.Font("Tahoma", 13.8!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.pathTb.Location = New System.Drawing.Point(131, 78)
        Me.pathTb.Margin = New System.Windows.Forms.Padding(2)
        Me.pathTb.Name = "pathTb"
        Me.pathTb.Size = New System.Drawing.Size(402, 35)
        Me.pathTb.TabIndex = 2
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Font = New System.Drawing.Font("Tahoma", 16.2!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(47, 78)
        Me.Label1.Margin = New System.Windows.Forms.Padding(2, 0, 2, 0)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(80, 34)
        Me.Label1.TabIndex = 3
        Me.Label1.Text = "Path"
        '
        'pstBtn
        '
        Me.pstBtn.BackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(128, Byte), Integer), CType(CType(0, Byte), Integer))
        Me.pstBtn.Font = New System.Drawing.Font("Tahoma", 10.2!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.pstBtn.Location = New System.Drawing.Point(225, 127)
        Me.pstBtn.Margin = New System.Windows.Forms.Padding(2)
        Me.pstBtn.Name = "pstBtn"
        Me.pstBtn.Size = New System.Drawing.Size(71, 34)
        Me.pstBtn.TabIndex = 4
        Me.pstBtn.Text = "Paste"
        Me.pstBtn.UseVisualStyleBackColor = False
        '
        'clrBtn
        '
        Me.clrBtn.BackColor = System.Drawing.Color.FromArgb(CType(CType(192, Byte), Integer), CType(CType(255, Byte), Integer), CType(CType(255, Byte), Integer))
        Me.clrBtn.Font = New System.Drawing.Font("Tahoma", 10.2!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.clrBtn.Location = New System.Drawing.Point(384, 127)
        Me.clrBtn.Margin = New System.Windows.Forms.Padding(2)
        Me.clrBtn.Name = "clrBtn"
        Me.clrBtn.Size = New System.Drawing.Size(71, 34)
        Me.clrBtn.TabIndex = 5
        Me.clrBtn.Text = "Clear"
        Me.clrBtn.UseVisualStyleBackColor = False
        '
        'MainForm
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(7.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.Gray
        Me.ClientSize = New System.Drawing.Size(632, 303)
        Me.Controls.Add(Me.clrBtn)
        Me.Controls.Add(Me.pstBtn)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.pathTb)
        Me.Controls.Add(Me.hideBtn)
        Me.Controls.Add(Me.shwBtn)
        Me.Font = New System.Drawing.Font("Tahoma", 7.8!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.Margin = New System.Windows.Forms.Padding(2)
        Me.MaximizeBox = False
        Me.MaximumSize = New System.Drawing.Size(650, 350)
        Me.Name = "MainForm"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "FAC"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents shwBtn As Button
    Friend WithEvents hideBtn As Button
    Friend WithEvents pathTb As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents pstBtn As Button
    Friend WithEvents clrBtn As Button
End Class
