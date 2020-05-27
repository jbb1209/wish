package WishList;

public class WishListIterator extends Item implements Iterator{
		Item items [];
		int position;
		public WishListIterator (Item [] a)
		{
			items = a;
			while(hasNext())
			{
				Next();
			}
			return;
		}
		public boolean hasNext()
		{
			if(items[position+1]==null)
				return false;
			else
				return true;
		}
		public Item Next()
		{
			return items[position+1];
		}
}
