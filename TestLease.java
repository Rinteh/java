/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leaseassignment;

import java.util.Scanner;
public class TestLease {
    public static void main(String args[]){
    
   // created new Scanner Object
		Scanner input = new Scanner(System.in);
		
		// new lease Objects
		Lease lease   = new Lease();
		Lease apt     = new Lease();

		
        
		// getData methods
		apt.getAptNum();
		apt. getLeaseTerm();
		apt.getName();

		// 
		System.out.println("Enter Leasees name: ");
		lease.setName(input.nextLine());
		
		System.out.println("Enter Apartment number: ");
		lease.setAptNum(Integer.parseInt(input.nextLine()));
		
		System.out.println("Enter rent: ");
		lease.setRentAmt(Double.parseDouble(input.nextLine()));
		
		System.out.println("Enter Lease term in months: ");
		lease.setLeaseTerm(Integer.parseInt(input.nextLine()));
		showValues(lease.getRentAmt());
		
		
		showValues(apt.getRentAmt());		
		
		Lease someone = new Lease();
		
		
		showValues(someone.getRentAmt());
		someone.addPetFee();
		showValues(someone.getRentAmt());
		
		Lease renter  = new Lease();
		
		showValues(lease.getRentAmt());

		showValues(renter.getRentAmt());
		input.close();
	}
	
	public static void showValues( Object e )
	{
		System.out.println(e);
		
	}
}
