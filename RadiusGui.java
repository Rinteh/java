/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package radiusgui;

import javax.swing.JOptionPane;

/**
 *
 * @author fabia
 */
public class RadiusGui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
	String numStr;
	double result;
	double radius;
	double area;
        
        
	JOptionPane.showMessageDialog(null,"AREA CALCULATOR"," SIMPLE PROGRAM.",JOptionPane.PLAIN_MESSAGE);
        
        
	numStr=JOptionPane.showInputDialog("Enter the radius");
        
        
	radius=Integer.parseInt(numStr);
        
        
	result=radius*radius*3.142857142;
        
        
	JOptionPane.showMessageDialog(null,"The area of " + radius+ " is "+ result);
	}
    }
    

