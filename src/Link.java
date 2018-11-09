
/**
 * @author Ben Mesi - cis152 data structures
 *	Link class  - makes new link for linked list
 */
public class Link {
	public Book Data;	
	public Link Next;
	/**	Link constructor ; accepts string type
	 * @param mData
	 */
	public Link(Book mData) {
		Data = mData;
		
	}
	/** DisplayLink method - displays individual link
	 * @return
	 */
	public String DisplayLink() {
		System.out.println("Item: "+Data);	return Data.getBookName();
	}
}
