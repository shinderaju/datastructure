package bridgeLab.Datastructure;

import java.util.Scanner;
/*
* Purpose:There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be returned by Vending Machine. Write a Program to calculate the minimum number of Notes as well as the Notes to be returned by the Vending Machine as a Change
*/
public class VendingMachine{
	static int minNotes = 0;
	static int count = 0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//displaying prompt and taking the input from user
		System.out.println("Enter the amount u want to with draw from Vending Machine");
		int amount = sc.nextInt();;
		//calling the method to find minNoOfNotes
		minNotes = minNoOfNotes(amount);
		System.out.println("Total No Of Notes "+minNotes);	
	}//end of main
	
	//method to find Notes
	public static int minNoOfNotes(int amount){
		if(amount == 0){
			return minNotes;		
		}
		//logic when user enters more than 1000 rupees
		else if(amount >= 1000){
			minNotes += amount/1000;
			count = amount/1000;
			System.out.println("1000 Rupees Notes are "+count);
			if(amount % 1000 == 0){
				return minNotes;			
			}
			else{
				minNoOfNotes(amount % 1000);
			}		
		}
		//logic when user enters amount more than 500
		else if(amount >= 500){
			minNotes += amount/500;
			count = amount/500;
			System.out.println("500 Rupees Notes are "+count);
			if(amount % 500 == 0){
				return minNotes;
			}
			else{
				minNoOfNotes(amount % 500);			
			}		
		}
		//logic when user enters amount more than 100
		else if(amount >= 100){
			minNotes += amount/100;
			count = amount/100;
			System.out.println("100 Rupees Notes are "+count);
			if(amount % 100 == 0){
				return minNotes;			
			}
			else{
				minNoOfNotes(amount % 100);			
			}		
		}
		//logic when user enters amount more than 50
		else if(amount >= 50){
			minNotes += amount/50;
			count = amount/50;
			System.out.println("50 Rupees Notes are "+count);
			if(amount % 50 == 0){
				return minNotes;			
			}
			else{
				minNoOfNotes(amount % 50);			
			}		
		}
		//logic when user enters amount more than 20
		else if(amount >= 20){
			minNotes += amount/20;
			count = amount/20;
			System.out.println("20 Rupees Notes are "+count);
			if(amount % 20 ==0){
				return minNotes;
			}
			else{
				minNoOfNotes(amount % 20);			
			}		
		}
		//logic when user enters amount more than 10
		else if(amount >= 10){
			minNotes += amount/10;
			count = amount/10;
			System.out.println("10 Rupees Notes are "+count);
			if(amount % 10 == 0){
				return minNotes;			
			}
			else{
				minNoOfNotes(amount % 10);			
			}
		}
		//logic when user enters the amount more than 5
		else if(amount >= 5){
			minNotes += amount/5;
			count = amount/5;
			System.out.println("5 Rupees Notes are "+count);
			if(amount % 5 == 0){
				return minNotes;			
			}
			else{
				minNoOfNotes(amount % 5);			
			}		
		}
		//logic when user enters 2 rs or more than
		else if(amount >= 2){
			minNotes += amount/2;
			count = amount/2;
			System.out.println("2 Rupees Notes are "+count);
			if(amount % 2 == 0){
				return minNotes;			
			}
			else{
				minNoOfNotes(amount %2);		
			}		
		}
		//logic when user enters 1rs or more
		else if(amount >= 1){
			minNotes += amount/1;
			count = amount/1;
			System.out.println("1 Rupees Notes are "+count);
			if(amount % 1 == 0){
				return minNotes;			
			}
			else{
				minNoOfNotes(amount % 1);			
			}		
		}
		return minNotes;
	}//end of the method
}//end of the class
