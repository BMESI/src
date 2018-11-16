import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JList;

/**
 * @author Ben Mesi - cis152 data structures
 * GUI class
 */
public class GUISTUFF implements ActionListener{

	JFrame frame;
	private JTextField ChecOutText;
	private JTextField AddText;
	private JTextField RemoveText;
	private JTextField ReturnText;
	LinkedList a = new LinkedList();


	/**
	 * Create the application.
	 */
	public GUISTUFF() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 239);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		AddText = new JTextField();
		AddText.setBounds(66, 19, 239, 20);
		panel.add(AddText);
		AddText.setColumns(10);
		
		JButton AddButton = new JButton("Add");
		AddButton.setBounds(315, 18, 89, 23);
		panel.add(AddButton);
		AddButton.addActionListener(this);
		
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
		ReturnText.setBounds(66, 84, 239, 20);
		panel.add(ReturnText);
		ReturnText.setColumns(10);
		
		JButton ReturnButton = new JButton("Return");
		ReturnButton.setBounds(315, 86, 89, 23);
		panel.add(ReturnButton);
		
		ChecOutText = new JTextField();
		ChecOutText.setBounds(66, 119, 239, 20);
		panel.add(ChecOutText);
		ChecOutText.setColumns(10);
		
		JButton CheckOutButton = new JButton("Check Out");
		CheckOutButton.setBounds(315, 120, 89, 23);
		panel.add(CheckOutButton);
		
		JList LibraryList = new JList();
		LibraryList.setBounds(38, 162, 366, 66);
		panel.add(LibraryList);
		
	}

	/* (non-Javadoc) make new instance of book obj and Insert into LL
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Book New = new Book(this.AddText.getText());
		a.insertFirst(New);

	}
}
