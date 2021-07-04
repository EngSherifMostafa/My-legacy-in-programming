package java_swing;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Extends extends JFrame
{
    JFrame frm;
    
    Extends ()
    {
    JButton btn = new JButton("Welcome");
    add(btn);
    setSize(500 , 500);
    btn.setBounds(125, 125, 250, 50);
    setLayout(null);
    setVisible(true);
    }
}