package WishList;

public class WishList extends Item{
	String name;
	Item items[];
	int count;
	
	public WishList(String aname)
	{
		name = aname;
	}
	public void addItem(String aname, String aDescription, double aprice)
	{
		count =count+1;
		growArray(items);
		Item Wishs;
		Item s = new Item.(aname,aDescription,aprice);
		items[count]= new Item(aname,aDescription,aprice);
		
		
	}
	public WishListIterator createIterator()
	{
		WishListIterator name = new WishListIterator(items);
		
		return name;
	}
	public double totalCost()
	{
		double totalCost;
		int start=0;
		createIterator();
		while (WishListIterator.hasNext())
		if(items[start]==null)
			return totalCost;
		else
			totalCost = totalCost + items[count].getPrice();
		
	}
	private Item [] growArray(Item [] itemss)
	{
		int start;
		Item [] a = new Item[count];
		while(itemss.hasNext())
		
			return items;
	}
}
