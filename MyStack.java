/*
MyStack class
"Write a program to implement a stack class which is
based on the Deque class you have implemented. It should
include the following methods: push(), pop(), peek(),
isEmpty(), isFull(). The element type is Item.  To avoid
the name conflict with the Stack class defined in Java
library, please pick any name other than Stack for your
class.[Note: This technique is called delegation.
Define a deque object in this stack class, and then
use any existing methods of the deque to implement
the functions of the stack.]
*/
public class MyStack
{
	private int maxSize;
	private Item[] stackArr;
	private int top;

	MyDeque deque;

	public MyStack(int size)
	{
		maxSize = size;
		stackArr = new Item[maxSize];
		top = -1;
	}

	public void push(String id, double price)
	{
		stackArr[++top] = new Item(id, price);
	}

	public Item pop()
	{
		return stackArr[top-1];
	}

	public Item peek()
	{
		return stackArr[top];
	}

	public boolean isFull()
	{
		return(top == maxSize-1);
	}

	public boolean isEmpty()
	{
		return (top == -1);
	}

}
