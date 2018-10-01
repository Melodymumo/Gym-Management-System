 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.management.system;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author MELODY
 */
public class GYMMANAGEMENTSYSTEM {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    JFrame myframe=new JFrame("Login");
    JPanel mypanel=new JPanel();
    JLabel name=new JLabel("UserName");
    JLabel e=new JLabel("Password");
    JTextField f=new JTextField();
    JPasswordField g=new JPasswordField();
    JButton h=new JButton("Login");
    JButton m=new JButton("Exit");
    f.setColumns(20);
    g.setColumns(20);
    mypanel.add(name);
    mypanel.add(f);
    mypanel.add(e);
    mypanel.add(g);
    mypanel.add(h);
    mypanel.add(m);
    myframe.add(mypanel);
    myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myframe.setSize(400,300);
    myframe.setVisible(true);
    }
}