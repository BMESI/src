
/**
 * @author Ben Mesi - cis152 data structures
 *	Linked List class
 */
public class LinkedList {
	private Link First;
	
	/** LinkedList constructor make first link 
	 * 
	 */
	public LinkedList() {
		First = null;
	}
	/** isEmpty method ; checks if first is null
	 * @return
	 */
	public boolean isEmpty() {
		return First == null;
	}
	/** insertFirst method ; adds string  data type. 
	 * @param mData
	 */
	public void insertFirst(String mData) {
		Link NewLink = new Link(mData);
		NewLink.Next = First;
		First = NewLink;
	}
	/** DeleteFirst method ; removes first item from list
	 * @return
	 */
	public String DeleteFirst() {
		String EmptyMessage = "Nothing to remove...";
		if( First == null) {
			Link Empty = new Link(EmptyMessage);
			First = Empty;
		}
		Link Temporary = First;
		First = First.Next;
		return Temporary.Data;
	}
	/** Displaylist method ; shows list 
	 * 
	 */
	public void displayList() {
		Link Current = First;
		while( Current != null) {
			Current.DisplayLink();
			Current = Current.Next;
		}
	}
}

