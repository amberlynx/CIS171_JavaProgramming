/*

Java Test 2 - 
Author: Amber Sakkinen <alsakkinen@hawkmail.hfcc.edu>
Description: This program is my submission for Test 2.
Created: 11.11.19
Last Edited: 11.11.19

*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class EkkoPizza extends JFrame implements ActionListener
{
   String filename = "EkkoPizzaReceipt";
   Pizza pizzaOrder = new Pizza();
   Receipt receipt = new Receipt();
   JButton btnCancel, btnAdd, btnClear, btnPrint;
   JLabel lblSubtotalValue, lblTaxValue, lblTotalValue;
   JRadioButton radSmall, radMed, radLarge;
   JCheckBox cbPepp, cbMushroom, cbOnion, cbTom, cbJalapeno, cbOlive;
   
   public static void main(String [] args)
   {
      JFrame frame = new JFrame("Ekko Pizza!");
      JPanel panel = new JPanel();
      panel.setLayout(null);
      
      frame.setSize(600,700);
      frame.add(panel);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
      EkkoPizza page = new EkkoPizza();
      page.placement(panel);
   }
   
   private void placement(JPanel panel)
   {
      // Labels
      JLabel lblSize = new JLabel("Choose Size");
      lblSize.setBounds(70,50,300,20);
      panel.add(lblSize);
      
      JLabel lblTopping = new JLabel("Choose Toppings");
      lblTopping.setBounds(325,50,300,20);
      panel.add(lblTopping);
      
      JLabel lblSubtotal = new JLabel("Subtotal: ");
      lblSubtotal.setBounds(150,500,300,20);
      panel.add(lblSubtotal);
      
      JLabel lblSubtotalValue = new JLabel("$");
      lblSubtotalValue.setBounds(300,500,300,20);
      panel.add(lblSubtotalValue);
      
      JLabel lblTax = new JLabel("Tax: ");
      lblTax.setBounds(150,550,300,20);
      panel.add(lblTax);
      
      JLabel lblTaxValue = new JLabel("$");
      lblTaxValue.setBounds(300,550,300,20);
      panel.add(lblTaxValue);
      
      JLabel lblTotal = new JLabel("Total Due:");
      lblTotal.setBounds(150,600,300,20);
      panel.add(lblTotal);
      
      JLabel lblTotalValue = new JLabel("$");
      lblTotalValue.setBounds(300,600,300,20);
      panel.add(lblTotalValue);
      
      // Radio Buttons
      radSmall = new JRadioButton("Small");
      radSmall.setBounds(65,80,300,20);
      panel.add(radSmall);
      
      radMed = new JRadioButton("Medium");
      radMed.setBounds(65,115,300,20);
      panel.add(radMed);
      
      radLarge = new JRadioButton("Large");
      radLarge.setBounds(65,150,300,20);
      panel.add(radLarge);
      
      ButtonGroup bg = new ButtonGroup();
      bg.add(radSmall); bg.add(radMed); bg.add(radLarge);
      
      // Checkbox
      cbPepp = new JCheckBox("Pepperoni");
      cbPepp.setBounds(330,75,150,20);
      panel.add(cbPepp);
      
      cbMushroom = new JCheckBox("Mushrooms");
      cbMushroom.setBounds(330,100,150,20);
      panel.add(cbMushroom);
      
      cbOnion = new JCheckBox("Onions");
      cbOnion.setBounds(330,125,150,20);
      panel.add(cbOnion);
      
      cbTom = new JCheckBox("Tomatoes");
      cbTom.setBounds(330,150,150,20);
      panel.add(cbTom);
      
      cbJalapeno = new JCheckBox("Jalapenos");
      cbJalapeno.setBounds(330,175,150,20);
      panel.add(cbJalapeno);
      
      cbOlive = new JCheckBox("Olives");
      cbOlive.setBounds(330,200,150,20);
      panel.add(cbOlive);
      
      // Buttons
      btnCancel = new JButton("Cancel Order");
      btnCancel.setBounds(50,300,150,20);
      btnCancel.setEnabled(true);
      btnCancel.setToolTipText("Click me to cancel order");
      btnCancel.addActionListener(new CloseListener());
      panel.add(btnCancel);
      
      btnAdd = new JButton("Add Pizza to Order");
      btnAdd.setBounds(300,300,150,20);
      btnAdd.setEnabled(true);
      btnAdd.setToolTipText("Click me to add pizza to order");
      btnAdd.addActionListener(this);
      panel.add(btnAdd);
      
      btnClear = new JButton("Clear Toppings");
      btnClear.setBounds(50,350,150,20);
      btnClear.setEnabled(true);
      btnClear.setToolTipText("Click me to clear toppings");
      btnClear.addActionListener(this);
      panel.add(btnClear);
      
      btnPrint = new JButton("Print Receipt");
      btnPrint.setBounds(300,350,150,20);
      btnPrint.setEnabled(true);
      btnPrint.setToolTipText("Click me to print receipt");
      btnPrint.addActionListener(this);
      panel.add(btnPrint);
   }
   
   public void actionPerformed(ActionEvent e)
   {  
      Object source = e.getSource();
      
      if(source == btnAdd)
      {
         if(radSmall.isSelected()) { pizzaOrder.setSize("small"); }
         else if(radMed.isSelected()) { pizzaOrder.setSize("medium"); }
         else if(radLarge.isSelected()) { pizzaOrder.setSize("large"); }
         
         if(cbPepp.isSelected()) { receipt.addTopping(); }
         if(cbMushroom.isSelected()) { receipt.addTopping(); }
         if(cbOnion.isSelected()) { receipt.addTopping(); }
         if(cbTom.isSelected()) { receipt.addTopping(); }
         if(cbJalapeno.isSelected()) { receipt.addTopping(); }
         if(cbOlive.isSelected()) { receipt.addTopping(); }
         
         String subtotal = Double.toString(receipt.getSubtotal());
         String tax = Double.toString(receipt.calcTax());
         String total = Double.toString(receipt.fillTotal());
         
         lblSubtotalValue.setText(subtotal);
         lblTaxValue.setText(tax);
         lblTotalValue.setText(total);
      }
      else if(source == btnClear) //done
      {
         // Clear checkboxes
         cbPepp.setSelected(false);
         cbMushroom.setSelected(false);
         cbOnion.setSelected(false);
         cbTom.setSelected(false);
         cbJalapeno.setSelected(false);
         cbOlive.setSelected(false);
      }
      else if(source == btnPrint) 
      { 
         JOptionPane.showMessageDialog(this, receipt.toString());
         try
         {
            FileWriter fw = new FileWriter(filename, true);
            PrintWriter receipt = new PrintWriter(fw);
            receipt.print(receipt.toString());
            receipt.close();
         }
         catch(Exception ex) { JOptionPane.showMessageDialog(this, "Exception caught"); }
      }
   }
   
   public class CloseListener implements ActionListener
   {
      @Override
      public void actionPerformed(ActionEvent e)
      {
         if(e.getActionCommand().equals("Cancel Order"))
         {
            int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel your order?", "Quit?", JOptionPane.YES_NO_OPTION);
            if(reply==JOptionPane.YES_OPTION) System.exit(0);
         }
      }
   }
}