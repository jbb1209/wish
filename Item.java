package WishList;

public abstract class Item {
	String Title;
	String Description;
	double price;
	public Item(String atitle, String aDescription, double aprice)
	{
		Title = atitle;
		Description = aDescription;
		price = aprice;
	}
	public String toString()
	{
		 return "**************"+Title+"**************"+ "\r\n"+ Description+"$"+price;
	}
	public double getPrice()
	{
		return price;
	}
	public void Print()
	{
		System.out.print("");
	}
}
