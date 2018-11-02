
/**
 * @author Ben Mesi - cis152 data structures
 *	Link class  - makes new link for linked list
 */
public class Link {
	public String Data;	public Link Next;
	/**	Link constructor ; accepts string type
	 * @param mData
	 */
	public Link(String mData) {
		Data = mData;
		
	}
	/** DisplayLink method - displays individual link
	 * @return
	 */
	public String DisplayLink() {
		System.out.println("Item: "+Data);	return Data;
	}
}
