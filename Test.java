package bridgeLab.Datastructure;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Test {
	public static void main(String[] args){
		Test t = new Test();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name");
		String fullname =sc.nextLine();
		System.out.println("Enter your mobile no.");
		String mob=  sc.nextLine();
		t.replce(fullname, mob);
	}
	public void replce(String fullname,String mob)
	{
		String []s = fullname.split(" ");
		//replacement of first name
		String st1 = "Hello username";
		Pattern p1 = Pattern.compile("username");
		Matcher m1=p1.matcher(st1);
		if(m1.find())
		{
			String st=st1.replaceAll("username",s[0]);
            System.out.println(st);
		}
		
		//replacemet of fullname
		String st2 = "We have your fullname as <fullname>";
		Pattern p2 = Pattern.compile("<fullname>");
		Matcher m2 = p2.matcher(st2);
		if(m2.find())
		{
			String st =st2.replaceAll("<fullname>", fullname);
			System.out.println(st);
		}
		
		//replacement of mobile no
		String st3 = "your contact number is 91-xx. Please,let us know in case of any clarification";
		Pattern p3 = Pattern.compile("xx");
		Matcher m3 = p3.matcher(st3);
		if(m3.find())
		{
			String st =st3.replaceAll("xx", mob);
			System.out.println(st);
		}

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Calendar cal = Calendar.getInstance();  
		String s4 = "Thank you BridgeLabz 01/01/2016";
		s4=s4.replaceAll("01/01/2016",dateFormat.format(cal.getTime()));
		System.out.println(s4);
	}
	}


