/**

Java Final Project - Envunity Project Selection Application
Link: --
Author: Amber Sakkinen <alsakkinen@hawkmail.hfcc.edu>
Description: This is the Envunity application for signing up members.
Last Edited: 12.13.19

**/
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.io.*;
public class Envunity extends JFrame implements ActionListener {
   public Envunity() {}
   private ArrayList<String> userData = new ArrayList<String>();
   private ArrayList<String> fileFields = new ArrayList<String>();
   private final String envProjects[] = {"Tree Planting", "Clean-ups", "Content Creator", "Sustainable Products", "Terraforming Technologies", "Update List", "Other"};
   ArrayList<Leader> leaderList = new ArrayList<Leader>();
   ArrayList<Member> memberList = new ArrayList<Member>();
   Leader sarah = new Leader();
   JButton btnJoin, btnView, btnSignup, btnBack, btnExit;
   JLabel lblWelcome, lblDirections, lblSelection, lblFName, lblLName, lblCity, lblZip, lblState, lblCountry, lblPhone, lblEmail, lblRole, lblExperience, lblOrganizationQ, lblOrganization, lblPosition, lblNotes;
   JTextField txtFName, txtLName, txtCity, txtZip, txtState, txtCountry, txtPhone, txtEmail, txtExperience, txtOrganization, txtPosition, txtRole, txtNotes;
   JRadioButton radYes, radNo; // For organization question
   JComboBox cbProjectSelection;
   
   public static void main(String [] args) {
      JFrame frame = new JFrame("Envunity");
      JPanel panel = new JPanel();
      Envunity page = new Envunity();
      page.GUISetup(panel, frame);
   }
   
   private void GUISetup(JPanel panel, JFrame frame)
   {
      // Setup
      panel.setLayout(null);
      frame.setSize(925,900);
     // panel.setBackground(Color.ORANGE);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(panel);

      // Labels
      lblWelcome = new JLabel("Welcome to Envunity!");
      lblWelcome.setFont(new Font("Arial", Font.BOLD, 20));
      lblWelcome.setBounds(355, 10, 300, 25);
      panel.add(lblWelcome);

      lblSelection = new JLabel("Please select which project group list you would like to join:");
      lblSelection.setFont(new Font("Arial", Font.BOLD, 15));
      lblSelection.setBounds(250, 200, 500, 25);
      panel.add(lblSelection);

      lblDirections = new JLabel("Fill out this form to join the project group:");
      lblDirections.setFont(new Font("Arial", Font.BOLD, 20));
      lblDirections.setBounds(300, 25, 500, 25);
      lblDirections.setVisible(false);
      panel.add(lblDirections);

      lblFName = new JLabel("First Name:");
      lblFName.setFont(new Font("Arial", Font.BOLD, 12));
      lblFName.setBounds(150, 100, 500, 25);
      lblFName.setVisible(false);
      panel.add(lblFName);
      
      lblLName = new JLabel("Last Name:");
      lblLName.setFont(new Font("Arial", Font.BOLD, 12));
      lblLName.setBounds(525, 100, 500, 25);
      lblLName.setVisible(false);
      panel.add(lblLName);
      
      lblCity = new JLabel("City:");
      lblCity.setFont(new Font("Arial", Font.BOLD, 12));
      lblCity.setBounds(190, 150, 500, 25);
      lblCity.setVisible(false);
      panel.add(lblCity);
      
      lblZip = new JLabel("Zipcode/Postal Code:");
      lblZip.setFont(new Font("Arial", Font.BOLD, 12));
      lblZip.setBounds(470, 150, 500, 25);
      lblZip.setVisible(false);
      panel.add(lblZip);
      
      lblState = new JLabel("State/Province/Region:");
      lblState.setFont(new Font("Arial", Font.BOLD, 12));
      lblState.setBounds(90, 200, 500, 25);
      lblState.setVisible(false);
      panel.add(lblState);
      
      lblCountry = new JLabel("Country:");
      lblCountry.setFont(new Font("Arial", Font.BOLD, 12));
      lblCountry.setBounds(543, 200, 500, 25);
      lblCountry.setVisible(false);
      panel.add(lblCountry);
      
      lblPhone = new JLabel("Phone Number:");
      lblPhone.setFont(new Font("Arial", Font.BOLD, 12));
      lblPhone.setBounds(130, 250, 500, 25);
      lblPhone.setVisible(false);
      panel.add(lblPhone);
      
      lblEmail = new JLabel("Email:");
      lblEmail.setFont(new Font("Arial", Font.BOLD, 12));
      lblEmail.setBounds(555, 250, 500, 25);
      lblEmail.setVisible(false);
      panel.add(lblEmail);
      
      lblRole = new JLabel("Role Desired in Project Group:");
      lblRole.setFont(new Font("Arial", Font.BOLD, 12));
      lblRole.setBounds(45,300,500, 25);
      lblRole.setVisible(false);
      panel.add(lblRole);
      
      lblExperience = new JLabel("Past Field Experience:");
      lblExperience.setFont(new Font("Arial", Font.BOLD, 12));
      lblExperience.setBounds(465,300,500, 25);
      lblExperience.setVisible(false);
      panel.add(lblExperience);
            
      lblOrganizationQ = new JLabel("Are you apart of an organization?");
      lblOrganizationQ.setFont(new Font("Arial", Font.BOLD, 12));
      lblOrganizationQ.setBounds(355, 365, 500, 25);
      lblOrganizationQ.setVisible(false);
      panel.add(lblOrganizationQ);
      
      lblOrganization = new JLabel("Name of Organization:");
      lblOrganization.setFont(new Font("Arial", Font.BOLD, 12));
      lblOrganization.setBounds(95, 350, 500, 25);
      lblOrganization.setVisible(false);
      panel.add(lblOrganization);
      
      lblPosition = new JLabel("Position in Organization:");
      lblPosition.setFont(new Font("Arial", Font.BOLD, 12));
      lblPosition.setBounds(448, 350, 500, 25);
      lblPosition.setVisible(false);
      panel.add(lblPosition);
      
      lblNotes = new JLabel("Anything you'd like to add?");
      lblNotes.setFont(new Font("Arial", Font.BOLD, 12));
      lblNotes.setBounds(270,465,500,25);
      lblNotes.setVisible(false);
      panel.add(lblNotes);
      
      // User interactive
      cbProjectSelection = new JComboBox<>(envProjects);
      cbProjectSelection.setBounds(375,300,180,20);
      cbProjectSelection.setFont(new Font("Arial", Font.BOLD, 12));
      panel.add(cbProjectSelection);
      
      // Textboxes
      txtFName = new JTextField(20);
      txtFName.setBounds(225,100,165,25);
      txtFName.setVisible(false);
      panel.add(txtFName);
      
      txtLName = new JTextField(20);
      txtLName.setBounds(600,100,165,25);
      txtLName.setVisible(false);
      panel.add(txtLName);
      
      txtCity = new JTextField(20);
      txtCity.setBounds(225,150,165,25);
      txtCity.setVisible(false);
      panel.add(txtCity);
      
      txtZip = new JTextField(20);
      txtZip.setBounds(600,150,165,25);
      txtZip.setVisible(false);
      panel.add(txtZip);
      
      txtState = new JTextField(20);
      txtState.setBounds(225,200,165,25);
      txtState.setVisible(false);
      panel.add(txtState);
      
      txtCountry = new JTextField(20);
      txtCountry.setBounds(600,200,165,25);
      txtCountry.setVisible(false);
      panel.add(txtCountry);
      
      txtPhone = new JTextField(20);
      txtPhone.setBounds(225,250,165,25);
      txtPhone.setVisible(false);
      panel.add(txtPhone);
      
      txtEmail = new JTextField(20);
      txtEmail.setBounds(600,250,165,25);
      txtEmail.setVisible(false);
      panel.add(txtEmail);
      
      txtRole = new JTextField(20);
      txtRole.setBounds(225,300,165,25);
      txtRole.setVisible(false);
      panel.add(txtRole);
      
      txtExperience = new JTextField(20);
      txtExperience.setBounds(600,300,165,25);
      txtExperience.setVisible(false);
      panel.add(txtExperience);
            
      txtOrganization = new JTextField(20);
      txtOrganization.setBounds(230,350,165,25);
      txtOrganization.setVisible(false);
      panel.add(txtOrganization);
      
      txtPosition = new JTextField(20);
      txtPosition.setBounds(600,350,165,25);
      txtPosition.setVisible(false);
      panel.add(txtPosition);
      
      txtNotes = new JTextField(20);
      txtNotes.setBounds(265,500,400,150);
      txtNotes.setVisible(false);
      panel.add(txtNotes);
      
      // Radio Buttons
      radYes = new JRadioButton("Yes");
      radYes.setBounds(400,385,50,20);
      radYes.setVisible(false);
      panel.add(radYes);
      radYes.addActionListener(this);
      
      radNo = new JRadioButton("No");
      radNo.setBounds(475,385,50,20);
      radNo.setVisible(false);
      panel.add(radNo);
      
      ButtonGroup radGroup = new ButtonGroup();
      radGroup.add(radYes); radGroup.add(radNo);
      
      // Button
      btnJoin = new JButton("Join Project");
      btnJoin.setBounds(200,700,125,25);
      btnJoin.setToolTipText("Click me to join project group list");
      btnJoin.addActionListener(this);
      panel.add(btnJoin);
      
      btnView = new JButton("View Members");
      btnView.setBounds(400,700,125,25);
      btnView.setToolTipText("Click me to view current members");
      btnView.addActionListener(this);
      panel.add(btnView);

      btnExit = new JButton("Exit");
      btnExit.setBounds(600,700,125,25);
      btnExit.setToolTipText("Exit Application");
      btnExit.addActionListener(this);
      panel.add(btnExit);
            
      btnSignup = new JButton("Join");
      btnSignup.setBounds(200,700,125,25);
      btnSignup.setToolTipText("Click me to join the group");
      btnSignup.addActionListener(this);
      btnSignup.setVisible(false);
      panel.add(btnSignup);

      btnBack = new JButton("Back");
      btnBack.setBounds(400,700,125,25);
      btnBack.setToolTipText("Back to homepage");
      btnBack.addActionListener(this);
      btnBack.setVisible(false);
      panel.add(btnBack);
            
      // Show all - goes at the end
      frame.setVisible(true);
   }

   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      if(source == radYes)
      {
         lblOrganizationQ.setVisible(false);
         radYes.setVisible(false);
         radNo.setVisible(false);
         lblOrganization.setVisible(true);
         lblPosition.setVisible(true);
         txtOrganization.setVisible(true);
         txtPosition.setVisible(true);
      } 
      else if(source == btnJoin)
      {
            lblWelcome.setVisible(false);
            lblSelection.setVisible(false);
            btnJoin.setVisible(false);
            btnView.setVisible(false);
            cbProjectSelection.setVisible(false);
            lblDirections.setVisible(true);
            lblFName.setVisible(true);
            lblLName.setVisible(true);
            lblCity.setVisible(true);
            lblZip.setVisible(true);
            lblState.setVisible(true);
            lblCountry.setVisible(true);
            lblPhone.setVisible(true);
            lblEmail.setVisible(true);
            lblRole.setVisible(true);
            lblExperience.setVisible(true);
            lblOrganizationQ.setVisible(true);
            lblNotes.setVisible(true);
            txtFName.setVisible(true);
            txtLName.setVisible(true);
            txtCity.setVisible(true);
            txtZip.setVisible(true);
            txtState.setVisible(true);
            txtCountry.setVisible(true);
            txtPhone.setVisible(true);
            txtEmail.setVisible(true);
            radYes.setVisible(true);
            radNo.setVisible(true);
            txtRole.setVisible(true);
            txtExperience.setVisible(true);
            txtNotes.setVisible(true);
            btnSignup.setVisible(true);
            btnBack.setVisible(true);
      }
      else if(source == btnView)
      {
         // Get project and member data from database
      }
      else if(source == btnExit)
      {
         int reply = JOptionPane.showConfirmDialog(null, "Are you sure?", "Quit?", JOptionPane.YES_NO_OPTION);
         if(reply==JOptionPane.YES_OPTION) System.exit(0);
      }
      else if(source == btnSignup)
      {
         // Fill data
         try {
            userData.add(txtFName.getText());
            userData.add(txtLName.getText());
            userData.add(txtCity.getText());
            userData.add(txtZip.getText());
            userData.add(txtState.getText());
            userData.add(txtCountry.getText());
            userData.add(txtPhone.getText());
            userData.add(txtEmail.getText());
            userData.add(txtOrganization.getText());
            userData.add(txtPosition.getText());
            userData.add(txtRole.getText());
            userData.add(txtExperience.getText());
            userData.add(txtNotes.getText());
         } catch(Exception ex) { System.out.println("Exception - " + ex); }
         fileFields.add("First Name:"); fileFields.add("Last Name:"); fileFields.add("City:"); fileFields.add("Zipcode/Postal Code:"); fileFields.add("State/Province/Region:"); fileFields.add("Country:"); fileFields.add("Phone Number:"); fileFields.add("Email:"); fileFields.add("Organization:"); fileFields.add("Position in Organization:"); fileFields.add("Role Desired:"); fileFields.add("Experience:"); fileFields.add("Additional Notes:");
         
         // Write application to file
         try {
            PrintWriter applicationFile = new PrintWriter("application.txt");
            
            applicationFile.println("Project Group:");
            applicationFile.println(cbProjectSelection.getSelectedItem());
            for(int x=0; x < userData.size(); ++x)
            {
               applicationFile.println("\n" + fileFields.get(x) + " ");
               applicationFile.print(" " + userData.get(x));
            }
            applicationFile.close();
            JOptionPane.showMessageDialog(this, "Your application has been submitted. Welcome to Envunity!");
         } catch(Exception ex) { System.out.println("Exception - " + ex); }
      }
      else if(source == btnBack)
      {
            lblWelcome.setVisible(true);
            lblSelection.setVisible(true);
            btnJoin.setVisible(true);
            btnView.setVisible(true);
            cbProjectSelection.setVisible(true);
            lblDirections.setVisible(false);
            lblFName.setVisible(false);
            lblLName.setVisible(false);
            lblCity.setVisible(false);
            lblZip.setVisible(false);
            lblState.setVisible(false);
            lblCountry.setVisible(false);
            lblPhone.setVisible(false);
            lblEmail.setVisible(false);
            lblExperience.setVisible(false);
            lblOrganizationQ.setVisible(false);
            lblOrganization.setVisible(false);
            radYes.setVisible(false);
            radNo.setVisible(false);
            lblPosition.setVisible(false);
            lblRole.setVisible(false);
            lblNotes.setVisible(false);
            txtFName.setVisible(false);
            txtLName.setVisible(false);
            txtCity.setVisible(false);
            txtZip.setVisible(false);
            txtState.setVisible(false);
            txtCountry.setVisible(false);
            txtPhone.setVisible(false);
            txtEmail.setVisible(false);
            txtRole.setVisible(false);
            txtExperience.setVisible(false);
            txtOrganization.setVisible(false);
            txtPosition.setVisible(false);
            txtNotes.setVisible(false);
            btnSignup.setVisible(false);
            btnBack.setVisible(false);
      }
   }  
   
  interface Template { void Message(String message); }
  class ProjectGroup {
    Template m = message -> System.out.println(message);
//       m.Message("Welcome to the project group!");
      String project, name, country, role;
      
      String getProject() { return project; }
      String getName() { return name; }
      String getCountry() { return country; }
      String getRole() { return role; }
      
      void setProject(String p) { project = p; }
      void setName(String n) { name = n; }
      void setCountry(String c) { country = c; }
      void setRole(String r) { role = r; }
    }
    
    class Leader extends ProjectGroup { 
      public Leader() {}
     // @Override void Messaging() { System.out.println("Welcome new team leader!"); } 
      
     // sarah.setProject("Tree Planting");
     // sarah.setName("Sarah");
     // sarah.setCountry("USA");
     // sarah.setRole("Project Leader");
      
     // leaderList.add(sarah);
     
      //leaderList.add();
      //leaderList.add();      
    }
    
    class Member extends ProjectGroup { 
      public Member() {}
   //    @Override void Messaging() { System.out.println("Welcome new team member!"); } 
      
    }
}