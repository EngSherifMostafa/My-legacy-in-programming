package java_swing;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Java_swing
{
    public static void main(String[] args)
    {
        //set frame
        JFrame frm = new JFrame();
        frm.setVisible(true);
        frm.setLayout(null);
        
        //set button
        JButton btn = new JButton ("Welcome JAVA GUI");
        frm.add(btn);
        
        //coordinations
        btn.setBounds(125, 125, 200, 50);
        frm.setSize(500 , 500);
        
        //you can call class Extends like new Extends();
    }
}