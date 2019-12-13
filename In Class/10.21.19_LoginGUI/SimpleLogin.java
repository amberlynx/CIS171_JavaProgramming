/**

InClass - Password form GUI
Link: --
Author: Amber Sakkinen <alsakkinen@hawkmail.hfcc.edu>
Description: This is an inclass program to create a GUI for the password program.
Created: 10.21.19
Last Edited: 10.21.19

**/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
public class SimpleLogin extends JFrame implements ActionListener
{
   public SimpleLogin(){}
   JButton loginButton;
      
   public static void main(String [] args)
   {
      JFrame frame = new JFrame("Login Page");
      JPanel panel = new JPanel();
      
      frame.setSize(350,200);
      frame.add(panel);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
      SimpleLogin sl = new SimpleLogin();
      sl.placeComponents(panel);
   }
   
   private void placeComponents(JPanel panel)
   {
      panel.setLayout(null);
      JLabel userLabel = new JLabel("User");
      userLabel.setFont(new Font("Consolas", Font.BOLD, 12));
      userLabel.setBounds(10,20,80,25);
      panel.add(userLabel);
      
      JTextField userText = new JTextField(20);
      userText.setBounds(100,20,165,25);
      panel.add(userText);
      
      JLabel pswdLabel = new JLabel("Password");
      pswdLabel.setBounds(10,50,80,25);
      panel.add(pswdLabel);
      
      JTextField pswdText = new JPasswordField(20);
      pswdText.setBounds(100,50,165,25);
      panel.add(pswdText);
      
      loginButton = new JButton("Login");
      loginButton.setBounds(10,80,80,25);
      loginButton.setEnabled(false);
      loginButton.setToolTipText("Click me");
      loginButton.addActionListener(this);
      userText.addActionListener(this);
      panel.add(loginButton);
   }
   
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      if(source == loginButton)
      {
         System.out.println("Login Button Clicked");
      }
      
      if(source instanceof JTextField)
      {
         System.out.println("Text Box");
         loginButton.setEnabled(true);
      }
   }
}