/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prime.number;

/**
 *
 * @author fabia
 */
import java.io.*;
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
       
	BufferedReader ob = new BufferedReader (new InputStreamReader (System.in));
	int i,j=2;
        
	System.out.println("Enter the number you want to check whether its prime or not...");
        
	//i=Integer.parseInt(ob.readLine());
        i = Integer.parseInt(ob.readLine());
	if (i == 0)
	{
		System.out.println("You entered zero....invalid input");
	}
	else{for(j=2;j<i;j++)
		{int k = i%j;
		if(k == 0)
			{ System.out.println("Not Prime !");
                        break;}}}
		if(j == i)
		{System.out.println("Prime Number");} 

	}
    }
    


