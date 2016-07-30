package bridgeLab.Datastructure;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class Hash
{
  OrderList[] order=new OrderList[11];
  public  Hash() throws IOException
  {
            
            File f = new File("/home/bridgeit/Desktop/raju/Datastructure/file2.txt");
            ReadFile r = new ReadFile();
	    //read integers from file
            UnorderList retArray  = r.readIntFromFile(f);
            System.out.println("list size is "+retArray.size());
	    //adding element at proper position 
            for(int i=1; i<=retArray.size(); i++)
            {
                int rem = (int) retArray.searchPos(i) % 11;
                if(order[rem]== null)
                {
                    order[rem] = new OrderList();
                    order[rem].add( (int) retArray.searchPos(i));
                }
                else
                    order [rem].add( (int) retArray.searchPos(i));
            }
	    //traverse data of Hash
            for(int i=0;i<11;i++)
            {
                System.out.println(i);
                if(order[i] !=null)
                {
                    order[i].traverse();
		  
                }
 		System.out.println("==============");
            }
    }//end of Hash()
    public static void main(String[] args) throws IOException
    {
      Hash hs = new Hash();
    }
  }
