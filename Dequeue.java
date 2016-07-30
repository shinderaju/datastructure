package bridgeLab.Datastructure;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;
class Dequeue<T>
{
    private Node<T> front, rear;
    private int size;
 
    /* Constructor */
    public Dequeue()
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
    public int getSize()
    {
        return size;
    }
    /* Clear dequeue */
    public void clear()
    {
        front = null;
        rear = null;
        size = 0;
    }
    /*  Function to insert an element at begining  */
    public void insertAtFront(T val)
    {
        Node<T> nptr = new Node<T>(); 
	nptr.setData(val);   
        size++ ;    
        if (front == null) 
        {
            front = nptr;
            rear = front;
        }
        else 
        {
            nptr.setLink(front);
            front = nptr;
        }
    }
    /*  Function to insert an element at end  */
    public void insertAtRear(T val)
    {
        Node<T> nptr = new Node<T>();
	nptr.setData(val);    
        size++ ;    
        if (rear == null) 
        {
            rear = nptr;
            front = rear;
        }
        else 
        {
            rear.setLink(nptr);
            rear = nptr;
        }
    }    
    /*  Function to remove front element from the queue */
    public T removeAtFront()
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
    /*  Function to remove rear element from the queue */
    public T removeAtRear()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        T ele = rear.getData();
        Node<T> s = front;
        Node<T> t = front;
        while (s != rear)
        {
            t = s;
            s = s.getLink();
        }
        rear = t;
        rear.setLink(null);
        size --;
 
        return ele;
    }        
    /*  Function to check the front element of the queue */
    public T peekAtFront()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        return front.getData();
    }
    /*  Function to check the front element of the queue */
    public T peekAtRear()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        return rear.getData();
    }    
    /*  Function to display the status of the queue */
    public void display()
    {
        System.out.print("\nDequeue = ");
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
        /* Creating object of class Dequeue */   
        Dequeue<Integer> dq = new Dequeue<Integer>();            
        /* Perform Dequeue Operations */    
        System.out.println("Dequeue Test\n"); 
        char ch;        
        do
        {
            System.out.println("\nDequeue Operations");
            System.out.println("1. insert at front");
            System.out.println("2. insert at rear");
            System.out.println("3. delete at front");
            System.out.println("4. delete at rear");
            System.out.println("5. peek at front");
            System.out.println("6. peek at rear");
            System.out.println("7. size");
            System.out.println("8. check empty");
            System.out.println("9. clear");
            int choice = scan.nextInt();
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                dq.insertAtFront( scan.nextInt() );
                break;  
            case 2 : 
                System.out.println("Enter integer element to insert");
                dq.insertAtRear( scan.nextInt() );
                break;                         
            case 3 : 
                try 
                {
                    System.out.println("Removed Element = "+ dq.removeAtFront());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;
            case 4 : 
                try 
                {
                    System.out.println("Removed Element = "+ dq.removeAtRear());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;                         
            case 5 : 
                try
                {
                    System.out.println("Peek Element = "+ dq.peekAtFront());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }
                break;
            case 6 : 
                try
                {
                    System.out.println("Peek Element = "+ dq.peekAtRear());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }
                break;                         
            case 7 : 
                System.out.println("Size = "+ dq.getSize());
                break; 
            case 8 : 
                System.out.println("Empty status = "+ dq.isEmpty());
                break; 
            case 9 : 
                System.out.println("\nDequeue Cleared\n");
                dq.clear();
                break;                         
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }                
            /* display dequeue */        
            dq.display();
 
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);            
        } while (ch == 'Y'|| ch == 'y');                                                            
    } 
}
