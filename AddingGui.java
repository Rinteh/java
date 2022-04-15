/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package addinggui;

import javax.swing.JOptionPane;


public class AddingGui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog(null, "First number to add"); 
 
        while (!isNumber(n1))  {
  n1 = JOptionPane.showInputDialog(null,
 "Invalid first number. Please insert another number");
 }

 String n2 = JOptionPane.showInputDialog(null, "Second number to add"); 

 while (!isNumber(n2))  {
 n2 = JOptionPane.showInputDialog(null,
 "Invalid second number. Please insert another number"); 
 }
 

 int r = Integer.parseInt(n1)+Integer.parseInt(n2);
 
 JOptionPane.showMessageDialog(null, "The result of the addition of: "
 + n1 + " and: " + n2 + " is " + r);  
    
    }
     private static boolean isNumber(String n)  {
 try {
 Integer.parseInt(n);
 return true;
 } 
catch (NumberFormatException nfe) {
 return false;
 }
    } 
}
    
   
    

    

