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
 * @author Ben Mesi
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
	/** Making GUI components; but logic handling should really be separated from all of this...
	 * 
	 */
	public GUI() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 398);
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
		LibraryList.setBounds(10, 145, 295, 243);
		panel.add(LibraryList);
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
	}

}
