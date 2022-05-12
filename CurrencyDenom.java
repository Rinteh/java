/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package currency.denom;

/**
 *
 * @author fabia
 */
import java.util.*;
import javax.swing.JOptionPane;
public class CurrencyDenom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        
        Currency c1 = Currency.getInstance("ZAR");
       String cur = "R";
        JOptionPane.showMessageDialog(null,"Currency symbol = R");
        
				 String m = JOptionPane.showInputDialog(null, "Enter number of Rands");
				int noHund = (int) Integer.parseInt(m)/100;
                                
                                double balanceAfterHund = Integer.parseInt(m) - (noHund * 100);
				int noTwenty = (int) balanceAfterHund / 20;
				
				double balanceAfterTwenty = Integer.parseInt(m) -((noHund * 100)+ (noTwenty * 20));
				int noTen = (int) balanceAfterTwenty / 10;
				
				double balanceAfterTen = Integer.parseInt(m) - ((noHund * 100)+(noTwenty * 20) + (noTen * 10));
				int noOne = (int) (balanceAfterTen / 1);
				
                                JOptionPane.showMessageDialog(null,m+"is converted to "+noHund+" "+cur+"100s "+ noTwenty+" "+cur+"20s "+ noTen+" "+cur+"10s " + noOne+" "+cur+"1s" );
    }
    //int noFive = (int) balanceAfterTen / 5;
				//System.out.println("You have " + noFive + " five dollar bills.");
				//double balanceAfterFive = Integer.parseInt(m) - ((noTwenty * 20) + (noTen * 10) + (noFive * 5));
}
