/*
MyDeque class
This class creates MyDeque and a deque to store a
string id and a double price. It also defines methods
that will be used in MyDequeApp and MyStack.
"Create a MyDeque class based on the discussion of deques
(p. 143) in this chapter. It should include the following
methods: insertFront(), insertRear(), removeFront(),
removeRear(), peekFront(), peekRear(), isEmpty(),
isFull(), toString(). You may create the class by updating
the existing class Queue.java in page 138 of the textbook.
For practicing purpose, assume that the deque contains
stock items. Each item consists two data: Item# (String),
Item price (double)."
*/
public class MyDeque
{
	private int maxSize;
	private Item[] dequeArr;
	private int front;
	private int rear;
	private int nItems;

	public MyDeque(int size)
	{
		maxSize = size;
		dequeArr = new Item[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}


	public void insertFront(String newId,double newPrice)
	{
		if(front == maxSize-1)
		front = 0;
		dequeArr[++front] = new Item(newId,newPrice);
		nItems++;
	}
	public void insertRear(String newId,double newPrice)
	{
		if(rear == maxSize-1)
		rear = -1;
		dequeArr[++rear] = new Item(newId,newPrice);
		nItems++;
	}

	public Item removeFront()
	{
		Item tmp = dequeArr[front++];
		if(front == maxSize)
		front = 0;
		nItems--;
		return tmp;
	}

	public Item removeRear()
	{
		Item tmp = dequeArr[rear++];
		if(rear == maxSize)
		rear = -1;
		nItems--;
		return tmp;
	}

	public Item peekFront()
	{
		return dequeArr[front];
	}

	public Item peekRear()
	{
		return dequeArr[rear];
	}

	public boolean isEmpty()
	{
		return (nItems == 0);
	}

	public boolean isFull()
	{
		return (nItems == maxSize);
	}
	public String toString()
	{
		String dequeArrData="";
		if(isEmpty())
		dequeArrData += "";

		else if(front < rear)
			for(int i = front; i < rear + 1; i++)
				dequeArrData += dequeArr[i] + "\n";

		else if(front > rear)
		{
			  for(int i = front; i < maxSize; i++)
			  	dequeArrData += dequeArr[i] + "\n";

			  for(int j = 0; j < rear+1; j++)
			  	dequeArrData += dequeArr[j] + "\n";
		}

			else if(front == rear)
			  dequeArrData += dequeArr[front] + "\n";

			return dequeArrData;
  		}

}
