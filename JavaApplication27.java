
package javaapplication27;

import java.util.Scanner;

public class JavaApplication27 {

   
    public static void main(String[] args) {
        
        int number;
        boolean isprime= true;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        number = input.nextInt();
        input.close();
        
        if(number < 1)
            System.out.println("Number needs to be greater than one");
        else if(number ==1)
            System.out.println("1 is neither Prime or Not Prime");
        else {
        for(int divisor = 2; divisor <=(number/2); divisor ++)
        {
            if((number % divisor)== 0) 
            {
                isprime = false;
                break;
                
            }
                    
        }
        if(isprime){
        System.out.println(number+" is a prime number");}
        else{System.out.printf(number+" is not a prime number");}
              /* if(isprime){System.out.printf("%d is a prime number", number);}
        else{System.out.printf("%d is not a prime number, number")};*/
        
        }
    }
}




            
        
    
        
        
        
    
    

