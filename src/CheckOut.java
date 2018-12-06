import java.util.Map;

/**
 * @author Ben Mesi - CIS 152 - Data Structures
 *	check out class - using MAP to combine book and customer upon return/checkout transaction
 */
public class CheckOut {
	private Customer c;
	private Book b;
	public Map<Customer, Book> CheckOutAction; 

	/**  null constructor
	 * 
	 */
	CheckOut(){
		c = null;	b = null;
	}
	/** checkout constructor combines the customer and book
	 * @param mc
	 * @param mb
	 */
	CheckOut(Customer mc, Book mb){
		c = mc ; b = mb;
		CheckOutAction.put(c, b);
	}
	/** checkout customer getter 
	 * @return
	 */
	public Customer getC() {
		return c;
	}
	/** checkout customer setter
	 * @param c
	 */
	public void setC(Customer c) {
		this.c = c;
	}
	/** checkout book getter
	 * @return
	 */
	public Book getB() {
		return b;
	}
	/**checkout book setter
	 * @param b
	 */
	public void setB(Book b) {
		this.b = b;
	}
}
