/*
Item class
This class creates objects for use in the other
classes and applications.
"Create a class called Item. The elements in the deque
are objects of the Item class. It needs to handle
wrap-around of the array, as a circular queue does"
*/

public class Item
{
	String id;
	double price;

	public Item(String newId, double newPrice)
	{
		id = newId;
		price = newPrice;
	}

	public String getId()
	{
		return id;
	}

	public double getPrice()
	{
		return price;
	}

	public void setId(String newId)
	{
		id = newId;
	}

	public void setPrice(double newPrice)
	{
		price = newPrice;
	}

	public String toString()
	{
		return "Item #: " + id + "\n Item Price: $" + price + "\n";
	}
}
