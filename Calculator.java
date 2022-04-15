/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        double num1 = Input.nextDouble();
        
        System.out.println("Enter an operator(+, -, x, /): ");
        String op = Input.next();
        
        System.out.println("Enter another number: ");
        double num2 = Input.nextDouble();
        
        
        if(op.equals("+")){
        System.out.println(num1+num2);
        }else if(op.equals("-")){
        System.out.println(num1-num2);
        }else if(op.equals("x")){
        System.out.println(num1*num2);
        }else if(op.equals("/")){
        System.out.println(num1/num2);
        }else{
        System.out.println("Invalid Operator");
        }
    }
    
}
