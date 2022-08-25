/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monthenum2;


import java.util.*;
public class Monthenum2 {

    enum Month{JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC};
    
    
    public static void main(String[] args) {
       Month bMonth;
       String userIN;
       
       int pos;
       int comp;
               
               
       Scanner Uinput = new Scanner(System.in);    
       
       System.out.println("The months of the year are: ");
       for(Month mon:Month.values()){
       System.out.print(mon + " ");
       System.out.print("\n\n Enter your birth month:  ");}
       userIN = Uinput.nextLine().toUpperCase();
       bMonth = Month.valueOf(userIN);
       System.out.println("You entered: "+ bMonth);
       pos = bMonth.ordinal();
       System.out.println(bMonth +" is in position: " + (pos + 1));
       System.out.println("So its month number is " + (pos + 1));
       
       comp = bMonth.compareTo(Month.JUN);
       
       if (comp < 0){
       System.out.println(bMonth +" is earlier in the year than " + Month.JUN);}
       else
       if (comp > 0){
           System.out.println(bMonth + " is later in the year than " + Month.JUN);}
       else{
       System.out.println(bMonth + " is " +Month.JUN);
       }
    }
}
    

