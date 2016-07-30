package bridgeLab.Datastructure;

public class Stack<T> 
{
	private static final int Stack = 0;
	private int stackSize;
	private T[] stackArr;
	private int top;
	
	//constructor to create stack with size
	public Stack(int size)
	{
		this.stackSize = size;
		this.stackArr = (T[]) new Object[stackSize];
		this.top =-1;
	}


	//This method adds new entry to the top of the stack 
	public void push(T entry)
	{
		if(this.isStackFull())
		{
			System.out.println(("Stack is full. Increasing the capacity."));
		}
		this.stackArr[++top] = entry ;
	}

	//This method removes an entry from the top of the stack.
	public T pop() throws Exception 
	{
		if(this.isStackEmpty())
		{
			throw new Exception("Stack is empty. Can not remove element.");
		}
		T entry = this.stackArr[top--];
		return entry;
	}

	//This method returns top of the stack without removing it
	public T peek() 
	{
		return stackArr[top];
	}
		
	// This method returns true if the stack is empty
	public boolean isStackEmpty() 
	{
		return (top == -1);
	}
	
	//This method returns true if the stack is full
	public boolean isStackFull() 
	{
		return (top == stackSize - 1);
	}

}
