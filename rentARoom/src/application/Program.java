package application; 

import java.util.Scanner;
import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		Rent[] vect=new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int quantity=s.nextInt();
		System.out.println();
		
		
		for(int i=0; i<quantity; i++) {
		System.out.printf("Rent #%d\n", i+1);
		System.out.print("Name: ");
		s.nextLine();
		String name=s.nextLine();
		System.out.print("Email: ");
		String email=s.nextLine();
		System.out.print("Room: ");
		int roomNumber=s.nextInt(); 
		 vect[roomNumber]= new Rent(name, email);
		 System.out.println();
		}
		
		System.out.println("Busy rooms: ");
		
		for(int i=0; i<vect.length; i++) {
		
		if(vect[i]!=null) {
			System.out.println(i+": "+vect[i]);
			
		}
		}
		s.close();
		
	}
}
		
		
		
		
		
		

