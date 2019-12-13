/**

InClass: My First Swing
Author: Amber Sakkinen <alsakkinen@hawkmail.hfcc.edu>
Description: This program demonstrates dynamic GUI.
Created: 10.9.19
Last Edited: 10.9.19

**/
import javax.swing.*;
import java.awt.*;
public class MyFirstSwing
{
   public static void main(String [] args)
   {
      JFrame f = new JFrame("My first Real GUI");
      f.setSize(400, 300);
      f.setVisible(true); // visibility starts off at false
      
      f.setLocationRelativeTo(null);
      f.setTitle("Test");
      f.setResizable(true);
      
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Just because you click an x does not mean the window closes
      
      ImageIcon img = new ImageIcon("wallpaper.jpg");
      f.setIconImage(img.getImage());
      
      JLabel L = new JLabel("Cool Gooie"); // Works but needs to be placed properly
      f.getContentPane().add(L);
   }
}