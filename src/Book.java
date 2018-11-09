
/**
 * @author Ben Mesi - cis152 data structures
 * Book class defined by string book-name
 */
public class Book {
	private String BookName;

	/**
	 * Empty constructor
	 */
	public Book() {
		BookName = null;
	}
	/**book class constructor
	 * @param mName
	 */
	public Book(String mName) {
		BookName = mName;
	}
	/** getter for book-name
	 * @return
	 */
	public String getBookName() {
		return BookName;
	}

	/** book name setter
	 * @param bookName
	 */
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	
}
