/*
 * Jonathan Brown 
 * CSCE 247
 * 2/13/2021
 */
package WishList;

public class WishListIterator implements Iterator {
		Item [] items ;
		int position;
		// goes throught the array
		public WishListIterator (Item [] a)
		{
			items = a;
			while(hasNext())
			{
				next();
			}
			return;
		}
		// checks to see if there is any more room in array
		public boolean hasNext()
		{
			if(items[position+1]==null)
				return false;
			else
				return true;
		}
		// move position
		public Item next()
		{
			return items[position+1];
		}
}
