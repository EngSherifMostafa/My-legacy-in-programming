package java_swing;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 Contractors that use with buttonn
-----------------------------------
 JButton()
 JButton (String s)
 JButton (icon i)

 Public void setText (String s)
 Public void setEnabled (boolean b)
 Public void setIcon(Icon i)
 Public Icon getIcon ()
 Public void addActionListener (ActionListener a)
 Public String getText ()
*/

public class J_Button
{
    public static void main (String args [])
    {
        JFrame frm = new JFrame();
        JButton btn = new JButton(new ImageIcon ("download.png"));
        //you must put image in project file
        
        frm.add(btn);
        frm.setSize(500 , 500);
        frm.setVisible(true);
        frm.setLayout(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn.setBounds(100, 50, 230, 230);
    }
}