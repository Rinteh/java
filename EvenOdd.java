/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evenodd;

/**
 *
 * @author fabia
 */
   
public class EvenOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
      
      
      /* for(int i=1;i<=40;i++){
           if(i/2 == 0){
           System.out.println("Number is Odd"+ i);}
           else{System.out.println("Number is Even"+ i);}
            ;*/
int start = 1;
int end = 41;

for (int val = start; val < end; val++)
{
    // Condition to Check Even, Not condition (!) will give Odd number
    if (val % 2 == 0) 
    {
        System.out.println("Number is Even: " + val);
    }
    else
    {
        System.out.println("Number is Odd: " + val);
    }
      
    }
    }
}
    

