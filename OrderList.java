package bridgeLab.Datastructure;

public class OrderList {
	Node<Integer> start, last;

	public void add(int add) {
		boolean i=false;
		Node<Integer> n = new Node<Integer>();
		n.setData(add);
		Node<Integer> temp, temp1, previous = start;
		temp = start;
		if (temp == null) 
		{
			start = n;
		} 
		else 
		{
			if (add < start.getData()) 
			{
				n.setLink(start);
				start = n;
			} 
			else 
			{
				while (temp.getLink() != null) 
				{
					if (add >= temp.getData() && add<=previous.getData()) 
					{
						temp.setLink(n);
						n.setLink(previous);
						i=true;
						break;
					}
					else
					{
					temp=previous;
					previous=previous.getLink();
					}
				}
				if(i==false)
				//if(temp.getLink()==null)
				temp.setLink(n);
			}
		}
	}// end of add

/*public void add(int add) {
		boolean i=false;
		Node<Integer> n = new Node<Integer>();
		n.setData(add);
		Node<Integer> temp, temp1, previous = start;
		temp = start;
		if (temp == null) {
			start = n;
		} else {
			if (add < start.getData()) {
				n.setLink(start);
				start = n;
			} else {
				while (temp.getLink() != null) {
					if (add <= temp.getData() && add>=previous.getData()) {
						//temp.setLink(n);
						//n.setLink(previous);
						n.setLink(previous.getLink());
						previous.setLink(n);
						i=true;
						break;
					}else{
					//temp=previous;
					//previous=previous.getLink();
					 previous=temp;
				        temp=temp.getLink();
					}
				}
				if(i==false)
				//if(temp.getLink()==null)
				temp.setLink(n);
			}
		}
	}// end of add
*/

	// traverse the list and print list data
	public void traverse()
	 {
		Node<Integer> temp = start;
		if (temp == null)
			System.out.println("list is empty");
		else
			while (temp != null)
			 {
				System.out.println(temp.getData());
				temp = temp.getLink();
			}

	}// end of traverse()
	
	//remove data from list
	public void remove(int data)
	{
	   Node<Integer> temp=start;
	   Node<Integer> previous=start;
	   Node<Integer> head=null;
	   if(temp==null)
	   {
	     System.out.println("data is not in list  so you can't remove it");
	   }
	   else
	   {
	     while(data!=temp.getData())
	     {
	        previous=temp;
	        temp=temp.getLink();
	     }
	     if(temp==start)
	     {
	       start=start.getLink();
	       temp.setLink(null);
	     }
	     else
	     {   
	       previous.setLink(temp.getLink());
	       temp.setLink(null);
	     }
	   }
	}//end remove()
	
	//remove last item from list
	public Integer pop()
	{
	  Node<Integer> temp=start;
	  Node<Integer> previous=start;;
	  int pop;
	  if(temp==null)
	  {
	    System.out.println("Invalid pop operation");
	    return null;
	  }
	  else
	  {
	    while(temp.getLink()!=null)
	    {
	       previous=temp;
	       temp=temp.getLink();
	    }
	    pop=temp.getData();
	    previous.setLink(null);
	    return pop;
	  }
	}//end pop()
	
	//remove item from particular position
	public void pop(int pos)
	{
	  Node<Integer> temp=start;
	  Node<Integer> previous=start;
	  int count=0;
	  if(temp==null)
	  {
	    System.out.println("Invalid pop operation");
	  }
	  else
	  {
	    while(temp!=null) 
	    {  
	       count++;
	       if(pos==1)
	       {
	         start=start.getLink();
	         temp.setLink(null);
	         break;
	       }
	       if(count==pos)
	       {
	         previous.setLink(temp.getLink());
	         temp.setLink(null);
	         break;
	       }
	       previous=temp;
	       temp=temp.getLink();
	    }
	  }
	}//end pop()
	
	//return the position of item
	public int index(int data)
	{
	  Node<Integer> temp=start;
	  int count=0;
	  if(temp==null)
	    return count;
	  else
	    while(temp!=null)
	    {
	      count++;
	      if(data!=temp.getData())
	      {
	        return count;
	      }
	      temp=temp.getLink();
	    }
	  return -1;
	}//end of index method 


	//return the size of list
	 public int size()
	 {
	   int count=0;
	   Node<Integer> temp=start;
	   if(temp==null)
	      return count;
	   else
	      while(temp!=null)
	      {
	         count++;
	         temp=temp.getLink();
	      }
	   return count;
	}//end of size()



	//return true if list is empty
	public boolean isEmpty()
	{
	  if(start==null)
	    return true;
	  else
	    return false;
	}//ens isEmpty()
	
	//search data in list
	  public boolean searchList(int srch)
	  {
	    Node<Integer> temp=start;
	    if(temp==null)
	       return false;
	    while(temp!=null)
	    {
	      if(srch==temp.getData())
	      {
	        return true;
	      }
	      temp=temp.getLink();
	    }
	    return false;
	  }//end of searchList()

	public Integer searchPos(int pos)
	{
	  Node<Integer> temp=start;
	  int count=0;
	  if(temp==null)
	    return count;
	  else
	    while(temp!=null)
	    {
	      count++;
	      if(count==pos)
	      {
	        return temp.getData();
	      }
	      temp=temp.getLink();
	    }
	  return -1;
	}//end of index method 	
		
	
	
	  public static void main(String[] args) {

		OrderList ol = new OrderList();
		ol.add(100);
		ol.add(100);
		ol.add(40);
		ol.add(3);
		ol.add(30);
		ol.add(100);
		ol.traverse();
		int s= ol.size();
		System.out.println("size is "+s);
		ol.remove(40);
		System.out.println("-------------------");
		ol.traverse();
		System.out.println("-------------------"+ol.searchPos(1));
		/*ol.pop();
		System.out.println("-------------------");
		ol.traverse();
		ol.pop(2);
		System.out.println("-------------------");
		ol.traverse();
		int i=ol.index(100);
		System.out.println("index is "+i);
		if(ol.searchList(100))
		{
			System.out.println("found");
		}*/
	}
}
