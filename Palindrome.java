package bridgeLab.Datastructure;

import java.util.*;
import java.util.Scanner;
public class Palindrome
{	
	public static void main(String[] args)
	{
		String original;
		Scanner in = new Scanner(System.in); 		
      		System.out.println("Enter a string to check if it is a palindrome");
		original = in.nextLine();
		Palindrome p = new Palindrome();
		if (p.checkPalindrome(original))
			System.out.println("String is palindrom");
		else
			System.out.println("String not palindrom");
	}
	//method to check palindrome string using dequeue
	public boolean checkPalindrome(String original)
	{
      		String reverse = "";
 		int l = original.length();
      		Dequeue<Character> dq = new Dequeue<Character>();
		for(int i=0;i<l;i++)
			dq.insertAtRear(original.charAt(i));
        	for(int i=0;i<l;i++)
			reverse = reverse + dq.removeAtRear();        
		System.out.println("original "+original+"\nreverse "+reverse);
		if (original.equals(reverse))
			return true;
		else
			return false;
	}	
}
