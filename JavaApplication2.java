/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;


 import java.util.Scanner;
public class JavaApplication2 {
    
    public static void main(String[] args) {
        String Party1, Party2, Party3;
        
        Float Party1vote,Party2vote,Party3vote;
        
        Float Votepercent1, Votepercent2, Votepercent3;
        
        Scanner var = new Scanner(System.in);
        Scanner varint = new Scanner(System.in);

      System.out.println("Enter Party 1:");
       Party1 = var.nextLine();
      
      System.out.println("Enter Party 1 votes:");
       Party1vote = varint.nextFloat();

      System.out.println("Enter Party 2:");
       Party2 = var.nextLine();
      
      System.out.println("Enter Party 2 votes:");
       Party2vote = varint.nextFloat();
      
      System.out.println("Enter Party 3:");
       Party3 = var.nextLine();
      
      System.out.println("Enter Party 3 votes:");
       Party3vote = varint.nextFloat();

      
   
       Votepercent1 = Party1vote/(Party1vote+Party2vote+Party3vote)*100;
      System.out.println("The" + Party1 +"Party got"+Votepercent1 ); 
    
     Votepercent2 = Party2vote/(Party1vote+Party2vote+Party3vote)*100;
      System.out.println("The " + Party2 +"Party got "+Votepercent2 );
      
       Votepercent3 = Party3vote/(Party1vote+Party2vote+Party3vote)*100;
      System.out.println("The " + Party3 +"Party got "+Votepercent3 );
    
    
    
    }
        
    }
    

