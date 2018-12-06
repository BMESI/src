import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.List;
import javax.swing.AbstractAction;
import javax.swing.Action;

/**
 * @author Ben Mesi - CIS 152 - Data Structures
 * Gui components 
 */
public class GUI {
	JFrame frame;
	private JTextField ChecOutText;
	static JTextField AddText;
	static JTextField RemoveText;
	private JTextField ReturnText;
	static List LibraryList = new List(0, true);
	static Book b = new Book();
	static LinkedList a = new LinkedList();
	private JTextField CustomerIDCheckOut;
	private JTextField CustomerIDReturn;
	public CheckOut Transaction;
	/** Making GUI components; but logic handling should really be separated from all of this...
	 * 
	 */
	public GUI() {
		frame = new JFrame();
		frame.setBounds(100, 100, 618, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 582, 398);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		AddText = new JTextField();
		AddText.setBounds(66, 19, 239, 20);
		panel.add(AddText);
		AddText.setColumns(10);
		JButton AddButton = new JButton("Add");
		AddButton.setBounds(315, 18, 89, 23);
		panel.add(AddButton);
		RemoveText = new JTextField();
		RemoveText.setBounds(66, 53, 239, 20);
		panel.add(RemoveText);
		RemoveText.setColumns(10);
		JButton RemoveButton = new JButton("Remove");
		RemoveButton.setBounds(315, 52, 89, 23);
		panel.add(RemoveButton);
		JLabel CheckOutLabel = new JLabel("Enter title in textfield to check out/ add/ remove");
		CheckOutLabel.setBounds(10, 0, 289, 14);
		panel.add(CheckOutLabel);
		ReturnText = new JTextField();
		ReturnText.setBounds(66, 153, 239, 20);
		panel.add(ReturnText);
		ReturnText.setColumns(10);
		JButton ReturnButton = new JButton("Return");
		ReturnButton.setBounds(483, 152, 89, 23);
		panel.add(ReturnButton);
		ChecOutText = new JTextField();
		ChecOutText.setBounds(66, 184, 239, 20);
		panel.add(ChecOutText);
		ChecOutText.setColumns(10);
		JButton CheckOutButton = new JButton("Check Out");
		CheckOutButton.setBounds(483, 183, 89, 23);
		panel.add(CheckOutButton);
		LibraryList.setBounds(10, 210, 495, 178);
		panel.add(LibraryList);
		
		CustomerIDCheckOut = new JTextField();
		CustomerIDCheckOut.setBounds(387, 184, 86, 20);
		panel.add(CustomerIDCheckOut);
		CustomerIDCheckOut.setColumns(10);
		
		CustomerIDReturn = new JTextField();
		CustomerIDReturn.setBounds(387, 153, 86, 20);
		panel.add(CustomerIDReturn);
		CustomerIDReturn.setColumns(10);
		
		JLabel CustomerIDLabel = new JLabel("Customer ID ");
		CustomerIDLabel.setBounds(387, 128, 76, 14);
		panel.add(CustomerIDLabel);
		LibraryList.setVisible(true);
// action listeners
// 
		AddButton.addActionListener(new ActionListener() {
			/*  Doing add from GUI/display List and LinkedList
			 * (non-Javadoc)
			 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
			 */
			public void actionPerformed(ActionEvent arg0) {
				b = new Book(GUI.AddText.getText());
				GUI.a.insertFirst(b);
				GUI.LibraryList.add(b.getBookName());
			}
		});
		RemoveButton.addActionListener(new ActionListener() {	
			/*  Doing delete from GUI/display List and LinkedList
			 * (non-Javadoc)
			 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
			 */
			public void actionPerformed(ActionEvent arg0) {
				GUI.LibraryList.remove(b.getBookName());
				GUI.a.Delete(b);
			}
		});
		CustomerIDCheckOut.addActionListener(new ActionListener() {	
			/*  Doing delete from GUI/display List and LinkedList
			 * (non-Javadoc)
			 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
			 */
			@SuppressWarnings("unlikely-arg-type")
			public void actionPerformed(ActionEvent arg0) {
				Book rental = new Book();
				if (a.equals(ChecOutText.getText()) &&  (CUSTGUI.MainCustomerList.contains(CustomerIDCheckOut.getText()))) {
					rental.setBookName(ChecOutText.getText()); 
				
					int custindex = CUSTGUI.MainCustomerList.indexOf(ChecOutText.getText());
					Customer customer = CUSTGUI.MainCustomerList.get(custindex);
					customer.setCheckedOut(rental);
					 CUSTGUI.MainCustomerList.set(custindex, customer);

					Transaction = new CheckOut(customer, rental);

				}
				// To do - relate customer information to book  
				/// 11/30 -- still not working
			   
				
			}
		});
		CustomerIDReturn.addActionListener(new ActionListener() {	
			/*  Doing delete from GUI/display List and LinkedList
			 * (non-Javadoc)
			 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
			 */
			public void actionPerformed(ActionEvent arg0) {
			//	Transaction.CheckOutAction(ChecOutText, Customer );
			//	GUI.a.Delete(b);
			}
		});
	}
}
