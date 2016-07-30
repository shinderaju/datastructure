package bridgeLab.Datastructure;

import java.io.*;
import java.util.Scanner;
public class Bank
{
 private int bankCash=100000;
 public void withdraw(int amount)
 {
	bankCash = bankCash - amount;
 }	
 public void deposite(int amount)
 {
	bankCash = bankCash + amount;
 }
 public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in); 
        /* Creating object of class linkedQueue */   
        LinkedQueue<Integer> lq = new LinkedQueue<Integer>(); 
	Bank b = new Bank();  
	int amt;         
        /* Perform Operations */    
        char ch;    
        do
        {
                System.out.println("how many peple want to stay in queue");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
                	lq.enqueue(i);  
		while(!lq.isEmpty())
		{                                
                	System.out.println("Enter the operation no.");
			System.out.println("1.withdraw");
			System.out.println("2.deposite");
			int m=sc.nextInt();
			switch(m)
			{
				case 1 : 
					System.out.println("Enter the amount you want to withdraw");
					amt=sc.nextInt();
					b.withdraw(amt);
					lq.dequeue();
					break;
				case 2 : 
					System.out.println("Enter the amount you want to deposite");
					amt = sc.nextInt();
					b.deposite(amt);
					lq.dequeue();
					break;
				default :
					System.out.println("Invalid operation");
					lq.dequeue();
					break;
			}//end switch	
		}//end while
		System.out.println("Are there more custemers ?");
		ch=sc.next().charAt(0);
	}while(ch=='y');//end do
	System.out.println("Todays bank cash is Rs."+b.bankCash);
}
}
