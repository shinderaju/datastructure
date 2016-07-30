package bridgeLab.Datastructure;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
public class ReadFile<T>
{
	public UnorderList readStringFromFile(File f)
	{
           UnorderList<String> u = new UnorderList<String>();          
           try (BufferedReader br = new BufferedReader(new FileReader(f)))
           {
        	   String sCurrentLine = br.readLine();//read line from file
        	   while (sCurrentLine!= null) 
        	   {
        		   String[] str= sCurrentLine.split("\\s"); //split line to words
        		   for(String s1 : str)
        		   {
        				   u.add(s1);  //add word to list                         
        		   }
        		   sCurrentLine=br.readLine();
        	   }//end while            
        	   return u;
           } //end try
           catch (IOException e) 
           {
        	   e.printStackTrace();
           } 
           return u;
	}//end ReadFile method
	
	//read integer from file
	public UnorderList readIntFromFile(File f) throws IOException
	{
		UnorderList ol = new UnorderList();
		Pattern p = Pattern.compile("[0-9]");
		BufferedReader br = new BufferedReader(new FileReader(f));
		String line = br.readLine();
		while(line!=null)
		{
			String[] wordsArray=line.split(" ");
			 int[] inputArray=new int[wordsArray.length];
             for(int i=0;i<wordsArray.length;i++)
             {
            	 Matcher m = p.matcher(wordsArray[i]);
            	 if(m.find())
            		 ol.add(Integer.parseInt(wordsArray[i]));
             }
			line=br.readLine();
		}
		return ol;
	}

	public static void main(String []args)
	{ 
		try
	     	{
			File f = new File("/home/bridgeit/Desktop/raju/Datastructure/file1.txt");
			f.createNewFile();
			ReadFile r = new ReadFile();
			// UnorderList u = r.fileWordToList(f);
             		UnorderList u = r.readStringFromFile(f);
             		u.traverse();
            		System.out.println("===============================================");
             		System.out.println("enter the word  you want to search");
             		Scanner sc = new Scanner(System.in);
             		String str = sc.next();
             		if(u.searchList(str))
             		{
               			u.remove(str);
             		}
             		else
             		{
               			u.add(str);
             		}
             		System.out.println("===============================================");
             		u.traverse();
             
           	}//end try
		catch(IOException e)
           	{
             		e.printStackTrace();
           	}
	}//end main method  
	

}//end class ReadFile 

