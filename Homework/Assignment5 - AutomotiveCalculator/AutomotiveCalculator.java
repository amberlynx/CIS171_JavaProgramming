/**

Homework: Automotive Calculator Program
Link: --
Author: Amber Sakkinen <alsakkinen@hawkmail.hfcc.edu>
Description: This is an assignment to make an Automotive Calculator.
Created: 10.21.19
Last Edited: 12.4.19

**/
import java.lang.Double;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
public class AutomotiveCalculator extends JFrame implements ActionListener
{
   JButton btnCalc, btnClear, btnExit;
   JTextField txtService, txtParts, txtTax, txtTotal, txtTotalParts, txtTotalLabor;
   JCheckBox oil, flushRad, flushTran, inspect, tire, muffler;
   JLabel lblOutput;
   String output = "";
   double parts=0, services=0, total=0;
   
   public static void main(String [] args)
   {      
      JFrame frame = new JFrame("Automotive");
      JPanel panel = new JPanel();
      panel.setLayout(null);
      
      AutomotiveCalculator page = new AutomotiveCalculator();
      page.placeComponents(panel);
      
      frame.setSize(1000,1000);
      frame.add(panel);
      frame.setVisible(true); // The visibility needs to be at the end
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   private void placeComponents(JPanel panel)
   {    
      JLabel maintenance = new JLabel("Maintenance Services");
      maintenance.setBounds(100,50,300,20);
      
      oil = new JCheckBox("Oil Change - $25.00");
      oil.setBounds(100,100,300,20);
      
      flushRad = new JCheckBox("Radiator Flush - $45.00");
      flushRad.setBounds(100,150,300,20);
      
      flushTran = new JCheckBox("Transmission Flush - $80.00");
      flushTran.setBounds(100,200,300,20);
      
      inspect = new JCheckBox("Inspection - $30.00");
      inspect.setBounds(100,250,300,20);
      
      tire = new JCheckBox("Tire Rotation - $25.00");
      tire.setBounds(100,300,300,20);
      
      muffler = new JCheckBox("Muffler Replacement - $125.00");
      muffler.setBounds(100,350,300,20);
      
      
      panel.add(maintenance); panel.add(oil); panel.add(flushRad); panel.add(flushTran); panel.add(inspect); panel.add(tire); panel.add(muffler);
     
      // Part and Labor Label
      JLabel lblPandL = new JLabel("Parts and Labor");
      lblPandL.setBounds(650,50,800,25);
      panel.add(lblPandL);
      
      // Total Parts Cost
      JLabel lblTotalParts = new JLabel("Total Parts Cost ($)");
      lblTotalParts.setBounds(550,150,800,25);
      panel.add(lblTotalParts);
      
      txtTotalParts = new JTextField(20);
      txtTotalParts.setBounds(700,150,165,25);
      panel.add(txtTotalParts);
      txtTotalParts.addActionListener(this);
      
      // Total labor
      JLabel lblTotalLabor = new JLabel("Total Labor at $20.00 per hour ($)");
      lblTotalLabor.setBounds(471,200,800,25);
      panel.add(lblTotalLabor);
      
      txtTotalLabor = new JTextField(20);
      txtTotalLabor.setBounds(700,200,165,25);
      panel.add(txtTotalLabor);
      txtTotalLabor.addActionListener(this);
      
      // Summary Label
      JLabel lblSummary = new JLabel("Summary");
      lblSummary.setBounds(655,350,800,25);
      panel.add(lblSummary);
      
      // Services and Labor
      JLabel lblService = new JLabel("Services and Labor");
      lblService.setBounds(550,400,800,25);
      panel.add(lblService);
      
      txtService = new JTextField(20);
      txtService.setBounds(700,400,165,25);
      panel.add(txtService);
      txtService.addActionListener(this);
      
      // Parts
      JLabel lblParts = new JLabel("Parts");
      lblParts.setBounds(600,450,800,25);
      panel.add(lblParts);
      
      txtParts = new JTextField(20);
      txtParts.setBounds(700,450,165,25);
      panel.add(txtParts);
      txtParts.addActionListener(this);
      
      // Taxes
      JLabel lblTax = new JLabel("Taxes");
      lblTax.setBounds(600,500,800,25);
      panel.add(lblTax);
      
      txtTax = new JTextField(20);
      txtTax.setBounds(700,500,165,25);
      panel.add(txtTax);
      txtTax.addActionListener(this);
      
      // Total Cost
      JLabel lblTotal = new JLabel("Total Cost");
      lblTotal.setBounds(600,550,800,25);
      panel.add(lblTotal);
      
      txtTotal = new JTextField(20);
      txtTotal.setBounds(700,550,165,25);
      panel.add(txtTotal);
      txtTotal.addActionListener(this);
      
      // Output Label
      lblOutput = new JLabel(output);
      lblOutput.setBounds(25,600,1300,25);
      panel.add(lblOutput);
      
      // Calculate Button
      btnCalc = new JButton("Calculate Total");
      btnCalc.setBounds(715,285,120,25);
      btnCalc.setEnabled(true);
      btnCalc.setToolTipText("Click me to calculate the summary");
      btnCalc.addActionListener(this);
      panel.add(btnCalc);
      
      // Clear Button
      btnClear = new JButton("Clear");
      btnClear.setBounds(100,450,120,25);
      btnClear.setEnabled(true);
      btnClear.setToolTipText("Click me to clear the page");
      btnClear.addActionListener(this);
      panel.add(btnClear);
      
      // Exit Button
      btnExit = new JButton("Exit");
      btnExit.setBounds(100,500,120,25);
      btnExit.setEnabled(true);
      btnExit.setToolTipText("Click me to exit this page");
      btnExit.addActionListener(this);
      panel.add(btnExit);
   }
   
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      
      try 
      {
         double inputPart = Double.parseDouble(txtTotalParts.getText());
         parts += inputPart;
      } 
      catch(Exception oh) { }
      
      try 
      {
         double inputLabor = Double.parseDouble(txtTotalLabor.getText());
         services += inputLabor;
      } 
      catch(Exception oh) { }
      
      // Checkbox Functionality
      if(oil.isSelected())
      {
         services += 25.00;
         output += "Oil change has been added +$25  ";
      }
      if(flushRad.isSelected())
      {
         services += 45.00;
         output += "Flush radiator has been added +$45  ";
      }
      if(flushTran.isSelected())
      {
         services += 80.00;
         output += "Flush transmission has been added +$80  ";
      }
      if(inspect.isSelected())
      {
         services += 30.00;
         output += "Inspection has been added +$30  ";
      }
      if(tire.isSelected())
      {
         services += 25.00;
         output += "Tire rotation has been added +$25  ";
      }
      if(muffler.isSelected())
      {
         parts += 125.00;
         output += "Muffler replacement has been added +$125  ";
      }
      
      total = services + parts;
      
      if(source == btnCalc)
      {
         txtTax.setText("0%");
         if(parts != 0) 
         { 
            txtTax.setText("6%"); 
            parts += parts * .06;
         }
         
         String costService = Double.toString(services);
         txtService.setText(costService);
         
         String costPart = Double.toString(parts);
         txtParts.setText(costPart);
         
         String costTotal = Double.toString(total);
         txtTotal.setText(costTotal);
         
         lblOutput.setText(output);
      }
      else if(source == btnClear)
      {
         output="";
         total=0;
         services=0;
         parts=0;
         lblOutput.setText("");
         txtTotalParts.setText("");
         txtTotalLabor.setText("");
         txtService.setText("");
         txtParts.setText("");
         txtTax.setText("");
         txtTotal.setText("");
         oil.setSelected(false);
         flushRad.setSelected(false);
         flushTran.setSelected(false);
         inspect.setSelected(false);
         tire.setSelected(false);
         muffler.setSelected(false);
      }
      else if(source == btnExit)
      {
         int reply = JOptionPane.showConfirmDialog(null, "Are you sure?", "Quit?", JOptionPane.YES_NO_OPTION);
         if(reply==JOptionPane.YES_OPTION) System.exit(0);
      }
   }
}