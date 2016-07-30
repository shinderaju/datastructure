package bridgeLab.Datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import practice.Utility;

public class OrderListTest
{
	public static void main(String [] args) throws IOException
	{
		Utility u = new Utility();
		Scanner sc = new Scanner(System.in);
		OrderList ol = new OrderList();
		FileReader fr = new FileReader("/home/bridgeit/Desktop/number.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while(line!=null)
		{
			String[] nString = line.split(" ");
			int [] num = u.convertStringtoInt(nString);
			for(int i=0;i<num.length;i++)
			{
				ol.add(num[i]);
			}
			line = br.readLine();
		}		
		ol.traverse();
		System.out.println("===============================");
		System.out.println("Enter any number");
		int n = sc.nextInt();
		System.out.println(ol.searchList(n));
		if(ol.searchList(n))
			ol.remove(n);
		else
			ol.add(n);
		ol.traverse();
	}
}
