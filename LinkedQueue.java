package bridgeLab.Datastructure;

import java.util.*;
class LinkedQueue<T>
{
    protected Node<T> front, rear;
    public int size;
 
    /* Constructor */
    public LinkedQueue()
    {
        front = null;
        rear = null;
        size = 0;
    }    
    /*  Function to check if queue is empty */
    public boolean isEmpty()
    {
        return front == null;
    }    
    /*  Function to get the size of the queue */
    public int size()
    {
        return size;
    }    
    /*  Function to insert an element to the queue */
    public void enqueue(T data)
    {
        Node<T> nptr = new Node<T>();
	nptr.setData(data);
        if (rear == null)
        {
            front = nptr;
            rear = nptr;
        }
        else
        {
            rear.setLink(nptr);
            rear = rear.getLink();
        }
        size++ ;
    }    
    /*  Function to remove front element from the queue */
    public T dequeue()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        Node<T> ptr = front;
        front = ptr.getLink();        
        if (front == null)
            rear = null;
        size-- ;        
        return ptr.getData();
    }    
    /*  Function to check the front element of the queue */
    public T peek()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        return front.getData();
    }    
    /*  Function to display the status of the queue */
    public void display()
    {
        System.out.print("\nQueue = ");
        if (size == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        Node<T> ptr = front;
        while (ptr != rear.getLink() )
        {
            System.out.print(ptr.getData()+" ");
            ptr = ptr.getLink();
        }
        System.out.println();        
    }

 
   
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); 
        /* Creating object of class linkedQueue */   
        LinkedQueue<Integer> lq = new LinkedQueue<Integer>();            
        /* Perform Queue Operations */    
        System.out.println("Linked Queue Test\n"); 
        char ch;        
        do
        {
            System.out.println("\nQueue Operations");
            System.out.println("1. insert");
            System.out.println("2. remove");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. size");
            int choice = scan.nextInt();
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                lq.enqueue( scan.nextInt() );
                break;                         
            case 2 : 
                try 
                {
                    System.out.println("Removed Element = "+ lq.dequeue());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;                         
            case 3 : 
                try
                {
                    System.out.println("Peek Element = "+ lq.peek());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }
                break;                         
            case 4 : 
                System.out.println("Empty status = "+ lq.isEmpty());
                break;
 
            case 5 : 
                System.out.println("Size = "+ lq.size());
                break;  
 
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }                
            /* display queue */        
            lq.display();
 
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);            
        } while (ch == 'Y'|| ch == 'y');                                                            
    } 
}
