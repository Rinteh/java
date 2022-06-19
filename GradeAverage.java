/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grade.average;

import java.util.*;
public class GradeAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Double grade1,grade2,grade3,grade4,grade5;
        
       Scanner grd = new Scanner(System.in);
       
       System.out.println("Enter a Grade");
       grade1 = grd.nextDouble();
       
        System.out.println("Enter the next Grade");
       grade2 = grd.nextDouble();
       
              
       System.out.println("Enter the next Grade");
       grade3 = grd.nextDouble();
       
       
       System.out.println("Enter the next Grade");
       grade4 = grd.nextDouble();
       
       
       System.out.println("Enter the final Grade");
       grade5 = grd.nextDouble();
       
       
        Double Average = (grade1 + grade2 + grade3 + grade4 + grade5)/5;
       
        if(Average>=250){
        System.out.println("The average is " + Average +" \nYou are above average");
        
        }else{System.out.println("The average is " + Average +" \nYou are below average");}
    }
    
}
