/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rentarray;

import javax.swing.*;
public class RentArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] rents = { {0, 400,  450,  500},
                        {0, 500,  560,  600},
                        {0, 610,  650,  700 },
                        {0,1000, 1250, 1400} };
      String entry; 
      int floor;
      int bedrooms;
      entry = JOptionPane.showInputDialog(null,
         "Enter a floor number ");
      floor = Integer.parseInt(entry);
      entry = JOptionPane.showInputDialog(null,
         "Enter number of bedrooms ");
      bedrooms = Integer.parseInt(entry);
      JOptionPane.showMessageDialog(null,
         "The rent for a " + bedrooms + 
         " bedroom apartment on floor " + floor +
         " is $" + rents[floor][bedrooms]);
   }
    }
    

