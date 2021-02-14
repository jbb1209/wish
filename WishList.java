/*
 * Jonathan Brown 
 * CSCE 247
 * 2/13/2021
 */
package WishList;

public class WishList {
	// varibles in list
	String name;
	Item [] items;
	int count;
	public WishList(String aname)
	{
		name = aname;
		
	}
	// objects to the array
	public void addItem(String aname, String aDescription, double aprice)
	{
		
		count =count+1;
		growArray(items);
		Item s = new Item(aname,aDescription,aprice);
		items[count]=  s;
		
		
	}
	// creates iterator
	public WishListIterator createIterator()
	{
		WishListIterator name = new WishListIterator(items);
		
		return name;
	}
	// gets total cost
	public double totalCost()
	{
		double totalCost;
		int start=0;
		createIterator();
		while (WishListIterator().hasNext())
		{
		if(items[start]==null)
			return totalCost;
		else
			totalCost = totalCost + items[count].getPrice();
		}
	}
	// expands the array
	private Item [] growArray(Item [] itemss)
	{
		int start;
		Item [] a = new Item[count*2];
		while(items[count].hasNext() == true)
		{
			
		}
		
			return items;
	}
}
