/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.management.system;

import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author MELODY
 */
public class Members {
    JFrame memberFrame = new JFrame("Members Details");
    JPanel aPanel = new JPanel();
    
    
    JLabel bfname=new JLabel("FirstName");
    JLabel clname= new JLabel("LastName");
    JLabel phoneno = new JLabel("PhoneNumber");
    JLabel DOB = new JLabel("DateOfBirth");
    JLabel gender = new JLabel("Gender");
    
    
    JTextField e = new JTextField();
    JTextField g = new JTextField();
    JTextField h = new JTextField();
    JTextField l = new JTextField();
    
    
    JCheckBox gMale = new JCheckBox();
    JCheckBox gFemale = new JCheckBox();
    
    JButton m = new JButton("Add Member");
    
    DataBaseConnector rt = new DataBaseConnector();
    public void members(){
    aPanel.setlayout(null); 
    aPanel.add(bfname);
    aPanel.add(e);
    aPanel.add(clname);
    aPanel.add(g);
    aPanel.add(phoneno);
    aPanel.add(h);
    aPanel.add(DOB);
    aPanel.add(l);
    aPanel.add(gender);
    aPanel.add(gMale);
    aPanel.add(gFemale);
    
    
    bfname.setBounds(30,10,60,80);
    e.setBounds(150,300,100,220);
    clname.setBounds(30,10,60,80);
    g.setBounds(200,400,140,180);
    phoneno.setBounds(30,10,60,80);
    h.setBounds(200,400,140,180);
    DOB.setBounds(30,10,60,80);
    l.setBounds(200,400,140,180);
    gender.setBounds(30,10,60,80);
    gMale.setBounds(200,400,140,180); 
    gFemale.setBounds(200,400,140,180);
    
    addMemberS.adddActionListener((java.awt.event.ActionEvent evt)->{
        addActionPerformed(evt);       
    });
    
    
    memberFrame.add(aPanel);
    memberFrame.setSize(800,900);
    memberFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    memberFrame.pack();
    memberFrame.setVisible(true);
 }
    
    public void addActionPerformed(java.awt.event.ActionEvent evt){
        Connection c = rt.DatabaseConnector();
        String sql = "insert into membersdetails(firstname,lastname,phoneno,DOB,gender)";
        try{
          PreparedStatement st = c.prepareStatement(sql);         
        }   
        catch(SQLException ex){
         Logger.getLogger(Members.class.getName()).log(Level.SEVERE,null,ex);
        }
            }
    
    
    
    
    
    
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
