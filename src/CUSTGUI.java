import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Ben Mesi - CIS 152 - Data Structures customer gui. Here the user can
 *         input customer associated data.
 */
public class CUSTGUI {
	JFrame frame;
	static JTextField AddCustomer;
	static JTextField PhoneNumberField;
	static List CustomerList = new List(0, true);
	static Customer ThisCustomer = new Customer();
	private int ID = 100;
	public static ArrayList<Customer> MainCustomerList;


	/**
	 * Making GUI components; but logic handling should really be separated from all
	 * of this...
	 * 
	 */
	public CUSTGUI() {
		frame = new JFrame();
		frame.setBounds(100, 100, 596, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 523, 398);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		AddCustomer = new JTextField();
		AddCustomer.setBounds(139, 19, 239, 20);
		panel.add(AddCustomer);
		AddCustomer.setColumns(10);
		JButton AddCustomerButton = new JButton("Add Customer");
		AddCustomerButton.setBounds(388, 18, 125, 23);
		panel.add(AddCustomerButton);
		PhoneNumberField = new JTextField();
		PhoneNumberField.setBounds(139, 53, 239, 20);
		panel.add(PhoneNumberField);
		PhoneNumberField.setColumns(10);
		JButton RemoveCustomerButton = new JButton("Remove Customer");
		RemoveCustomerButton.setBounds(388, 52, 125, 23);
		panel.add(RemoveCustomerButton);
		JLabel ViewCustomerInfoLabel = new JLabel("ViewCustomerInfo");
		ViewCustomerInfoLabel.setBounds(10, 0, 289, 14);
		panel.add(ViewCustomerInfoLabel);
		JButton ReturnButton = new JButton("Return");
		ReturnButton.setBounds(388, 83, 125, 23);
		panel.add(ReturnButton);
		JButton ViewCustButton = new JButton("ViewCustomerInfo");
		ViewCustButton.setBounds(388, 117, 125, 23);
		panel.add(ViewCustButton);
		CustomerList.setBounds(10, 145, 430, 243);
		panel.add(CustomerList);

		JLabel NameLabel = new JLabel("Name:");
		NameLabel.setBounds(41, 22, 46, 14);
		panel.add(NameLabel);

		JLabel PhoneLabel = new JLabel("Phone:");
		PhoneLabel.setBounds(41, 56, 46, 14);
		panel.add(PhoneLabel);
		CustomerList.setVisible(true);
		// action listeners
		//
		AddCustomerButton.addActionListener(new ActionListener() {
			/*
			 * Adding customer to GUI/display List (non-Javadoc)
			 * 
			 * @see
			 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
			 */
			public void actionPerformed(ActionEvent arg0) {
				ThisCustomer = new Customer(CUSTGUI.AddCustomer.getText(), CUSTGUI.PhoneNumberField.getText(),
						ID + CUSTGUI.AddCustomer.getText().substring(0, 2), null);
				CUSTGUI.CustomerList
						.add(ThisCustomer.getName() + " " + ThisCustomer.getID() + " " + ThisCustomer.getPhone());
				// add customer to an arraylist
				MainCustomerList.add(ThisCustomer);

			}
		});
		RemoveCustomerButton.addActionListener(new ActionListener() {
			/*
			 * Deleting customer from GUI/display List (non-Javadoc)
			 * 
			 * @see
			 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
			 */
			public void actionPerformed(ActionEvent arg0) {
				CUSTGUI.CustomerList.remove(
						CUSTGUI.AddCustomer.getText() + " " + ThisCustomer.getID() + " " + ThisCustomer.getPhone());
				// remove customer from arraylist
				MainCustomerList.remove(ThisCustomer);

			}
		});
		ViewCustButton.addActionListener(new ActionListener() {
			/*
			 * 
			 * @see
			 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
			 */
			@SuppressWarnings("unlikely-arg-type")
			public void actionPerformed(ActionEvent arg0) {
				// remove customer from arraylist
				if ( MainCustomerList.contains(AddCustomer.getText()) == true) {
					String CustSearch = AddCustomer.getText();
					MainCustomerList.get(MainCustomerList.indexOf(CustSearch));
					CUSTGUI.CustomerList.add(
							CUSTGUI.AddCustomer.getText() + " " + ThisCustomer.getID() + " " + ThisCustomer.getPhone() + " --"+ ThisCustomer.CheckedOut);
					}

			}
		});
	}
}
