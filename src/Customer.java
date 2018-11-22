import java.util.ArrayList;

/**
 * @author Ben Mesi - CIS 152 - Data Structures
 * Customer class, has Name, id, phone, and if a book has been checked out.
 */
public class Customer {
	public String Name;
	public String ID;
	public String Phone;
	public Book CheckedOut;
	
	/**	Customer null constructor
	 * 
	 */
	public Customer() {
		Name = null;	ID = null; 	Phone = null;	CheckedOut = null;
	}
	/** Customer constructor
	 * @param mName
	 * @param mPhone
	 * @param mID
	 * @param mCheckedOut
	 */
	public Customer(String mName, String mPhone, String mID, Book mCheckedOut) {
		Name = mName;	ID = mID; 	Phone = mPhone;		CheckedOut = mCheckedOut;
	}
	/** Customer name getter
	 * @return
	 */
	public String getName() {
		return Name;
	}
	/** Customer name setter
	 * @param name
	 */
	/**
	 * @param name
	 */
	public void setName(String name) {
		this.Name = name;
	}
	/** customer id getter
	 * @return
	 */
	public String getID() {
		return ID;
	}
	/** customer id setter
	 * @param iD
	 */
	public void setID(String iD) {
		ID = iD;
	}
	/**customer phone getter
	 * @return
	 */
	public String getPhone() {
		return Phone;
	}
	/**customer phone setter
	 * @param phone
	 */
	public void setPhone(String phone) {
		Phone = phone;
	}
	/**customer book check out getter
	 * @return
	 */
	public Book getCheckedOut() {
		return CheckedOut;
	}
	/** customer book check out setter
	 * @param checkedOut
	 */
	public void setCheckedOut(Book checkedOut) {
		CheckedOut = checkedOut;
	}
	/**customer Tostring method
	 * @return
	 */
	public String Show() {
		return Name +" " + ID+ " " +Phone+ " " + " " + CheckedOut;
	}
}
