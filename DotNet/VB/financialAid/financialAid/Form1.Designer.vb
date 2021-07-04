<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class Form1
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Form1))
        Me.okBtn = New System.Windows.Forms.Button()
        Me.copyAnsThree = New System.Windows.Forms.Button()
        Me.copyAnsTwo = New System.Windows.Forms.Button()
        Me.AnsOne = New System.Windows.Forms.RichTextBox()
        Me.AnsTwo = New System.Windows.Forms.RichTextBox()
        Me.AnsThree = New System.Windows.Forms.RichTextBox()
        Me.courseName = New System.Windows.Forms.TextBox()
        Me.copyAnsOne = New System.Windows.Forms.Button()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.againBtn = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'okBtn
        '
        Me.okBtn.Font = New System.Drawing.Font("Tahoma", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.okBtn.Location = New System.Drawing.Point(219, 67)
        Me.okBtn.Name = "okBtn"
        Me.okBtn.Size = New System.Drawing.Size(171, 50)
        Me.okBtn.TabIndex = 0
        Me.okBtn.Text = "Ok"
        Me.okBtn.UseVisualStyleBackColor = True
        '
        'copyAnsThree
        '
        Me.copyAnsThree.Font = New System.Drawing.Font("Tahoma", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.copyAnsThree.Location = New System.Drawing.Point(592, 477)
        Me.copyAnsThree.Name = "copyAnsThree"
        Me.copyAnsThree.Size = New System.Drawing.Size(171, 45)
        Me.copyAnsThree.TabIndex = 0
        Me.copyAnsThree.Text = "Copy Answer 3"
        Me.copyAnsThree.UseVisualStyleBackColor = True
        '
        'copyAnsTwo
        '
        Me.copyAnsTwo.Font = New System.Drawing.Font("Tahoma", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.copyAnsTwo.Location = New System.Drawing.Point(594, 332)
        Me.copyAnsTwo.Name = "copyAnsTwo"
        Me.copyAnsTwo.Size = New System.Drawing.Size(171, 45)
        Me.copyAnsTwo.TabIndex = 0
        Me.copyAnsTwo.Text = "Copy Answer 2"
        Me.copyAnsTwo.UseVisualStyleBackColor = True
        '
        'AnsOne
        '
        Me.AnsOne.Font = New System.Drawing.Font("Tahoma", 10.8!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.AnsOne.Location = New System.Drawing.Point(16, 134)
        Me.AnsOne.Name = "AnsOne"
        Me.AnsOne.ReadOnly = True
        Me.AnsOne.Size = New System.Drawing.Size(572, 130)
        Me.AnsOne.TabIndex = 2
        Me.AnsOne.Text = ""
        '
        'AnsTwo
        '
        Me.AnsTwo.Font = New System.Drawing.Font("Tahoma", 10.8!)
        Me.AnsTwo.Location = New System.Drawing.Point(16, 284)
        Me.AnsTwo.Name = "AnsTwo"
        Me.AnsTwo.ReadOnly = True
        Me.AnsTwo.Size = New System.Drawing.Size(572, 130)
        Me.AnsTwo.TabIndex = 2
        Me.AnsTwo.Text = ""
        '
        'AnsThree
        '
        Me.AnsThree.Font = New System.Drawing.Font("Tahoma", 10.8!)
        Me.AnsThree.Location = New System.Drawing.Point(16, 436)
        Me.AnsThree.Name = "AnsThree"
        Me.AnsThree.ReadOnly = True
        Me.AnsThree.Size = New System.Drawing.Size(572, 130)
        Me.AnsThree.TabIndex = 2
        Me.AnsThree.Text = ""
        '
        'courseName
        '
        Me.courseName.Font = New System.Drawing.Font("Tahoma", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.courseName.Location = New System.Drawing.Point(219, 11)
        Me.courseName.Multiline = True
        Me.courseName.Name = "courseName"
        Me.courseName.Size = New System.Drawing.Size(369, 50)
        Me.courseName.TabIndex = 3
        Me.courseName.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'copyAnsOne
        '
        Me.copyAnsOne.Font = New System.Drawing.Font("Tahoma", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.copyAnsOne.Location = New System.Drawing.Point(594, 178)
        Me.copyAnsOne.Name = "copyAnsOne"
        Me.copyAnsOne.Size = New System.Drawing.Size(171, 45)
        Me.copyAnsOne.TabIndex = 4
        Me.copyAnsOne.Text = "Copy Answer 1"
        Me.copyAnsOne.UseVisualStyleBackColor = True
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Font = New System.Drawing.Font("Tahoma", 10.8!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(17, 26)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(196, 23)
        Me.Label1.TabIndex = 5
        Me.Label1.Text = "Write Course Name"
        '
        'againBtn
        '
        Me.againBtn.Font = New System.Drawing.Font("Tahoma", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.againBtn.Location = New System.Drawing.Point(417, 67)
        Me.againBtn.Name = "againBtn"
        Me.againBtn.Size = New System.Drawing.Size(171, 50)
        Me.againBtn.TabIndex = 6
        Me.againBtn.Text = "again"
        Me.againBtn.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(7.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.FromArgb(CType(CType(192, Byte), Integer), CType(CType(255, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.ClientSize = New System.Drawing.Size(770, 582)
        Me.Controls.Add(Me.againBtn)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.copyAnsOne)
        Me.Controls.Add(Me.courseName)
        Me.Controls.Add(Me.AnsThree)
        Me.Controls.Add(Me.AnsTwo)
        Me.Controls.Add(Me.AnsOne)
        Me.Controls.Add(Me.copyAnsTwo)
        Me.Controls.Add(Me.copyAnsThree)
        Me.Controls.Add(Me.okBtn)
        Me.ForeColor = System.Drawing.SystemColors.ActiveCaptionText
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.MaximizeBox = False
        Me.MaximumSize = New System.Drawing.Size(788, 629)
        Me.MinimumSize = New System.Drawing.Size(788, 629)
        Me.Name = "Form1"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Financial Aid"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents Label1 As Label
    Friend WithEvents courseName As TextBox
    Friend WithEvents okBtn As Button
    Friend WithEvents againBtn As Button
    Friend WithEvents copyAnsOne As Button
    Friend WithEvents copyAnsTwo As Button
    Friend WithEvents copyAnsThree As Button
    Friend WithEvents AnsOne As RichTextBox
    Friend WithEvents AnsTwo As RichTextBox
    Friend WithEvents AnsThree As RichTextBox

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        hideOrVis(0)
    End Sub

    Private Sub okBtn_Click(sender As Object, e As EventArgs) Handles okBtn.Click

        If (courseName.Text = "") Then
            MsgBox("Enter course name in white box")
        Else
            AnsOne.Text = "I’m a student from Egypt and want to learn " + courseName.Text + " I think it will be beneficial for me to get into a good firm as an intern. But I’ve no job of my own to carry the expanses to pay for the certificate of this course. I live only for my scholarship. In this circumstance, it is very much difficult for me to gather such amount of money for the certificate. Financial Aid will help me take this course without any adverse impact on my monthly essential needs.
So, I’m badly in need of this financial aid. Receiving this Financial Aid will open for me a new horizons of the world of Coursera courses , which in turn will help me in future .Sir we are three brothers and we all are at learning stage and it becomes a lot difficult for the family members to pay the whole amount for all the three of us and if I add up my course it will make even harder for them to pay. Sir, I need this course very badly for my CV and for increasing my knowledge about the subject."

            AnsTwo.Text = "I want to take this course as I want to learn " + courseName.Text + ", I want to complete the course due to my curiosity and also that I can put a good CV to a get applied to a job. This Course will boost my job prospects after graduation from my institute. It will help perform better in carrying out various programs in a computer language and give me an edge over my competitors. A verified certificate will attach credibility to the certificate I receive from this course. I plan to complete all assignments on or before time as I have done in previous Signature Track Courses. Also, I intend to participate in Discussion Forums, which I have found to supplement my learning immensely in the other online courses I have taken on Coursera. I also plan to grade assignments which are to peer reviewed which I believe will an invaluable learning opportunity."

            AnsThree.Text = "Sir, the financial status of the family is not too good to pay the loan amount. We already have a lot of dept in the bank and my parents are paying it on regular basis. It would make their life even harder to add a new loan over them. Sir, I don't want to put any pressure over them. Sir, it would be a great help for me to get a good job and help my family if I'm able to get this course."

            hideOrVis(1)
        End If

    End Sub

    Private Sub againBtn_Click(sender As Object, e As EventArgs) Handles againBtn.Click
        hideOrVis(0)
        courseName.Text = ""
    End Sub

    Private Sub hideOrVis(flag As Boolean)
        AnsOne.Visible = flag
        AnsTwo.Visible = flag
        AnsThree.Visible = flag

        copyAnsOne.Visible = flag
        copyAnsTwo.Visible = flag
        copyAnsThree.Visible = flag
    End Sub

    Private Sub copyAnsOne_Click(sender As Object, e As EventArgs) Handles copyAnsOne.Click
        My.Computer.Clipboard.SetText(AnsOne.Text)
        MsgBox("Answer one copied successfully")
    End Sub

    Private Sub copyAnsTwo_Click(sender As Object, e As EventArgs) Handles copyAnsTwo.Click
        My.Computer.Clipboard.SetText(AnsTwo.Text)
        MsgBox("Answer two copied successfully")
    End Sub

    Private Sub copyAnsThree_Click(sender As Object, e As EventArgs) Handles copyAnsThree.Click
        My.Computer.Clipboard.SetText(AnsThree.Text)
        MsgBox("answer three copied successfully")
    End Sub
End Class