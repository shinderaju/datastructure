package bridgeLab.Datastructure;

import java.awt.List;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BalancedParentheses
{
	    public static void main(String[] args) throws Exception 
	    {
	        Scanner scan = new Scanner(System.in);
	        /* Accepting expression */
	        System.out.println("Enter expression");
	        String exp = scan.next();       	        
	        BalancedParentheses b = new BalancedParentheses();
	        boolean r =b.matchparathesis(exp);
	        if(r)
	        {
	        	System.out.println("mathematical expression is balanced");
	        }
	        else
	        	System.out.println("expresion is unbalanced");
	    }//end of main
	   //method to check matching of parenthesis of expression
	    public boolean matchparathesis(String exp) throws Exception
	    {    	
	    	int len = exp.length();
	    	Stack<Integer> st = new Stack<Integer>(100);
	        for (int i = 0; i < len; i++)
	        {    
	            char ch = exp.charAt(i);
	            if (ch == '(')
	                st.push(i);
	            else if (ch == ')')
	            {
	          
	               	if(st.isStackEmpty())
			{
				return false;
			}
			else
			{
			    	st.pop();
			}
	   
	            }            
	        }
	        while (!st.isStackEmpty() )
	        {
	            return false;
	            
	        }
	        return true;
			
	    }//end of method
	
}//end of class
