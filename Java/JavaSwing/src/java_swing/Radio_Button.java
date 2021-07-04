package java_swing;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/*
 JRadioButton ()
 JRadioButton(String s)
 JRadioButton(String s , boolean b)
*/

public class Radio_Button
{
    public static void main (String[] args)
    {
        new frm();
    }
}

class frm
{
    JFrame frm;
    
    frm()
    {
        //set frm as object like JFrame frm = new JFrame();
        frm = new JFrame();
        
        JRadioButton R_B1 = new JRadioButton("1- Male");
        JRadioButton R_B2 = new JRadioButton("2- Female");
        
        R_B1.setBounds(40, 110, 80, 40);
        R_B2.setBounds(40, 140, 80, 40);
        
        //prevent from selected two button
        ButtonGroup B_G = new ButtonGroup();
        B_G.add(R_B1);
        B_G.add(R_B2);
        
        //add button to frame
        frm.add(R_B1);
        frm.add(R_B2);
        
        //set frame
        frm.setSize(500 , 500);
        frm.setLayout(null);
        frm.setVisible(true);
    }
}