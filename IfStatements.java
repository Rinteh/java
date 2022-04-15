/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifstatements;

/**
 *
 * @author fabia
 */
public class IfStatements {

    
    public static void main(String[] args) {
        boolean isMale = false;
        boolean isTall = false;
        
        //&& and takes into account both variables
        //|| takes either variable but not both
        //! not parameter making somthing reverse its value
        
         /* if(isMale && isTall){
        System.out.println("You are a tall male.");
        }else if(isMale && !isTall) {
        System.out.println("You are a short male.");
        }else if(!isMale && isTall){
        System.out.println("You are tall but not a male.");
        } else{
            System.out.println("You are not male and not tall .");
        }*/
        
       System.out.println(max(5,5,5));
       
    }
    //Lets us display compared conditions of the num variables while one number is bigger
    public static int max(int num1,int num2 , int num3){
    if(num1 >= num2 && num1 >= num3){
    return num1;
    } else if(num2 >= num1 && num2 >= num3){
    return num2;
    } else{
        return num3;
    }
    
    }
    
}
