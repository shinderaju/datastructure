package bridgeLab.Datastructure;
public class UnorderList<T>
{
  Node<T> start,last;

 //Add new node to list at last
  public void add(T s1)
  {
    Node<T> nd = new Node<T>();
    nd.setData(s1);
   
   //when list is empty
    if(start == null)
    {
      //set new node as first node
      start = nd;
      //set new node as last node
      last = nd;    
    }  
    else
    {
      //current last node pointing to new node 
      last.setLink(nd);
      //set new node as last node
      last = nd;  
    }
  }//end add()



//add new node after particular node
  public void addAfter(T add,T after)
  {
      Node<T> n = new Node<T>();
      n.setData((T) add);
      Node temp=start;
      Node temp2;
      while(temp!=null)
      {
        //if node found add new node after matched node
       // if(after.compareTo(temp.getData())==0)
    	  if(temp.getData().equals(after))
        {
          temp2=temp.getLink();
          temp.setLink(n);
          n.setLink(temp2);
          break;
        }//end if
        temp=temp.getLink();
     }//end while
  }//end addAfter()

//insert item at particula position
public void insertList(int pos, T data)
{
  Node<T> temp=start;
  Node<T> n = new Node<T>();
  n.setData(data);
  Node<T> temp2;
  int count=0;
  if(temp==null)
  {
     count++;
     if(count==pos)
     {
       start=n;
     }
     else
     {
       System.out.println("list is empty you can't add ");
     }
  }
  else
  {
    while(temp!=null)
    {
      count++;
      if(count==pos)
      {
        temp2=temp.getLink();
        temp.setLink(n);
        n.setLink(temp2);
        break;
      }
      temp=temp.getLink();
    }
    if(pos==count+1)
    {
      temp.setLink(n);
    }
  }//end else
}//end insertlist


//search data in list
  public boolean searchList(T srch)
  {
    Node<T> temp=start;
    if(temp==null)
       return false;
    while(temp!=null)
    {
      if(srch.equals(temp.getData()))
      {
        return true;
      }
      temp=temp.getLink();
    }
    return false;
  }//end of searchList()

  //search index data in list
  public T searchPos(int pos)
  {
    Node<T> temp=start;
    int count =0;
    if(temp==null)
       return null;
    while(temp!=null)
    {
    	count++;
      if(count==pos)
      {
        return temp.getData();
      }
      temp=temp.getLink();
    }
    return null;
  }//end of searchList()


//traverse the list and print list data
  public void traverse()
  {
    Node<T> temp = start;
    if(temp==null)
       System.out.println("list is empty");
    else
      while(temp!=null)
      {
        System.out.println(temp.getData());
        temp=temp.getLink();
      }

  }//end of traverse()



//return the size of list
 public int size()
 {
   int count=0;
   Node<T> temp=start;
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




//return the position of item
public int index(T data)
{
  Node<T> temp=start;
  int count=0;
  if(temp==null)
    return count;
  else
    while(temp!=null)
    {
      count++;
      if(data.equals(temp.getData()))
      {
        return count;
      }
      temp=temp.getLink();
    }
  return -1;
}




 



//remove item from list
public void remove(T data)
{
   Node<T> temp=start;
   Node<T> previous=start;
   Node<T> head=null;
   if(temp==null)
   {
     System.out.println("data is not in list  so you can't remove it");
   }
   else
   {
     while(!data.equals(temp.getData()))
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
public T pop()
{
  Node<T> temp=start;
  Node<T> previous=start;;
  T pop;
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
  Node<T> temp=start;
  Node<T> previous=start;
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
}//end of class unorderList
