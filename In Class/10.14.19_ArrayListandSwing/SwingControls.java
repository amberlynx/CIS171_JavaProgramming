/**

InClass Program: SwingControls
Author: Amber Sakkinen <alsakkinen@hawkmail.hfcc.edu>
Description: This is an in class example program using swing controls in GUI.
Created: 10.14.19
Last Edited: 10.14.19

**/
import java.awt.*; // * uses all libraries (includes sub libraries)
import java.awt.event.*;
import javax.swing.*;
public class SwingControls
{
   private JFrame mainframe;
   private JLabel lblHeader;
   private JLabel lblStatus;
   private JPanel controlPanel;

   public SwingControls()
   {
      mainframe = new JFrame("Button Example"); // Empty until you use the word new; new just looks for new place in memory
      mainframe.setSize(400, 400);
      mainframe.setVisible(true);
      mainframe.setLayout(new GridLayout(3,1));
      
      lblHeader = new JLabel("", JLabel.CENTER);
      lblStatus = new JLabel("", JLabel.CENTER);
      lblStatus.setSize(350,100);
      
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());
      
      mainframe.add(lblHeader);
      mainframe.add(controlPanel);
      mainframe.add(lblStatus);
      mainframe.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent windowEvent){System.exit(0);}});
   }
   
   public static void main(String [] args)
   {
      SwingControls demo = new SwingControls();
      demo.showEventDemo();
   }
   
   private void showEventDemo()
   {
      lblHeader.setText("Learning swing controls!");
      
      JButton btnInitiate = new JButton("Let's do it.");
      controlPanel.add(btnInitiate);
      btnInitiate.addActionListener(new ButtonClickListener());
      
      JButton btnSubmit = new JButton("Submit");
      controlPanel.add(btnSubmit);
      btnSubmit.addActionListener(new ButtonClickListener());
      
      JButton btnCancel = new JButton("Cancel");
      controlPanel.add(btnCancel);
      btnCancel.addActionListener(new ButtonClickListener());
   }
   
   private class ButtonClickListener implements ActionListener // Events are what the user does and listers accept the input and do something with it
   {
      public void actionPerformed(ActionEvent e)
      {
         String command = e.getActionCommand();
         if(command.equals("Let's do it.")) { lblStatus.setText("Initiating learning swing controls.."); }
         if(command.equals("Submit")) { lblStatus.setText("You have submitted the data."); }
         if(command.equals("Cancel")) { lblStatus.setText("Canceling action.."); }
      }
   }
}