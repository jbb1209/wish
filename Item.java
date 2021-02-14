/*
 * Jonathan Brown 
 * CSCE 247
 * 2/13/2021
 */
package WishList;

public abstract class Item {
	String Title;
	String Description;
	double price;
	// object requirements
	public Item(String atitle, String aDescription, double aprice)
	{
		Title = atitle;
		Description = aDescription;
		price = aprice;
	}
	// prints out the item
	public String toString()
	{
		 return "**************"+Title+"**************"+ "\r\n"+ Description+"$"+price;
	}
	// returns price of object
	public double getPrice()
	{
		return price;
	}
	// prints space
	public void print()
	{
		System.out.print(toString());
	}
}
