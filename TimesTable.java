/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package times.table;

/**
 *
 * @author fabia
 */
import java.util.*;
public class TimesTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,k;
Scanner sc = new Scanner(System.in);


System.out.println("Enter the start nummber");
int n1 = sc.nextInt();
System.out.println("Enter the end number");
int n2 = sc.nextInt();
System.out.println("Enter mutiple");
int n3 = sc.nextInt();

for (i=n1;i<=n2;i++){
 k = n3 * i;
				
System.out.println(+n3 +" x " + i +" = "+k);	
    }
    
            
}
}
