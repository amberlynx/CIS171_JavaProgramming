/**

Password Program - GUI
Author: Amber Sakkinen <alsakkinen@hawkmail.hfcc.edu>
Description: This is a GUI for the password requirement verification program.
Created: 10.28.19
Last Edited: 10.30.19

**/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
public class PasswordGUI extends JFrame implements ActionListener
{
   JButton btnSubmit;
   JLabel lblPass;
   JTextField txtUser, txtPass;
   
   public static void main(String [] args)
   {   
      JFrame frame = new JFrame("Login");
      JPanel panel = new JPanel();
      panel.setLayout(null);
      
      frame.setSize(500,400);
      frame.add(panel);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
      // GUI Form
      PasswordGUI page = new PasswordGUI();
      page.Placement(panel);
   }
   
   private void Placement(JPanel panel)
   {
      // Introduction
      JLabel lblIntro = new JLabel("Please enter a proper password");
      lblIntro.setBounds(150,100,300,20);
      panel.add(lblIntro);
      
      // Password Requirements
      JLabel lblReq = new JLabel("Password Requirements:");
      lblReq.setBounds(500,100,300,20);
      panel.add(lblReq);
      
      JLabel lblNotPersonal = new JLabel("Don't use any personal information");
      lblNotPersonal.setBounds(500,130,300,20);
      panel.add(lblNotPersonal);
      
      JLabel lblOver10 = new JLabel("Greater than 10 characters");
      lblOver10.setBounds(500,150,300,20);
      panel.add(lblOver10);
   
      JLabel lblCase = new JLabel("At least one upper and one lower case letter");
      lblCase.setBounds(500,170,300,20);
      panel.add(lblCase);
      
      JLabel lblNum = new JLabel("At least one number");
      lblNum.setBounds(500,190,300,20);
      panel.add(lblNum);
      
      JLabel lblSpecial = new JLabel("At least one special character");
      lblSpecial.setBounds(500,210,300,20);
      panel.add(lblSpecial);
      
      // Username
      JLabel lblUser = new JLabel("Username:");
      lblUser.setBounds(100,150,300,20);
      panel.add(lblUser);
      
      txtUser = new JTextField(20);
      txtUser.setBounds(200,150,150,20);
      panel.add(txtUser);
      txtUser.addActionListener(this);
      
      // Password
      lblPass = new JLabel("Password:");
      lblPass.setBounds(100,200,300,20);
      panel.add(lblPass);
      
      txtPass = new JPasswordField(35);
      txtPass.setBounds(200,200,150,20);
      panel.add(txtPass);
      txtPass.addActionListener(this);
      
      // Submit Button
      btnSubmit = new JButton("Submit");
      btnSubmit.setBounds(150,300,150,20);
      btnSubmit.setEnabled(true);
      btnSubmit.setToolTipText("Click me to submit the password for verification");
      btnSubmit.addActionListener(this);
      panel.add(btnSubmit);
   }
   
   public void actionPerformed(ActionEvent e)
   {  
      Object source = e.getSource();
      
      if(source == btnSubmit)
      {
         verifyPassword();
      }
      
      if(source instanceof JTextField)
      {
         if(!(txtUser == null && txtPass == null))
         {
            lblPass.setEnabled(true);  
         }
      }
   }

   public void verifyPassword()
   {
      String pass = txtPass.getText();
		boolean verifyLength = false;
		boolean verifyUpper = false;
		boolean verifyLower = false;
		boolean verifyNumber = false;
		boolean verifySpecial = false;
      boolean restrictYear = false;
      int year=0;
      int x=0;
      char c;
      
     if(pass.length()>=10 && pass.length()<=35) { verifyLength = true; }
      
     for(x=0; x < pass.length() - 1; x++)
     {
         c = pass.charAt(x);
         if(Character.isDigit(c)) { verifyNumber = true; }
         else if(Character.isUpperCase(c)) { verifyUpper = true; }
         else if(Character.isLowerCase(c)) { verifyLower = true; }
         else { verifySpecial = true; }
         
         if(year >= 1950 && year <= 2020) { restrictYear = true; } // Check for year - not functional
     }
		
	  if(verifyLength == true && verifyUpper == true && verifyLower == true && verifyNumber == true && verifySpecial == true && restrictYear == false)
	  {
	      JOptionPane.showMessageDialog(this, "Password has been accepted!");
	  }
	  else { JOptionPane.showMessageDialog(this, "Password unacceptable. Please try again."); }
   }
}