
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Ben Mesi - cis152 - data structurs gui class to make gui stuff
 *         (add/checkout functions)
 */
public class GUISTUFF extends JFrame {
	private final int HEIGHT = 400;
	private final int WIDTH = 700;

	/**
	 * guiSTUFF contructor; makes gui stuff
	 * 
	 */
	public GUISTUFF() {
		JFrame frame = new JFrame("GridBagLayout Demo");
		// add book stuff
		JLabel AddBookLabel = new JLabel("Add Book: ");
		JTextField AddBookText = new JTextField("");
		JButton AddBookButton = new JButton("Add");
		// Remove out functions
		JLabel RemoveBookLabel = new JLabel("Remove: ");
		JTextField RemoveBookText = new JTextField("");
		JButton RemoveBookButton = new JButton("Remove");
		// Check out
		JLabel CheckOutBookLabel = new JLabel("Check out: ");
		JTextField CheckOutBookText = new JTextField("");
		JButton CheckOutBookButton = new JButton("Check out");

		JPanel panel = new JPanel(new GridBagLayout());
		GridBagConstraints cst = new GridBagConstraints();

		// add label to the panel
		cst.fill = GridBagConstraints.HORIZONTAL;
		cst.gridx = 0;
		cst.gridy = 0;
		panel.add(AddBookLabel, cst);

		// add textfield to the panel
		cst.fill = GridBagConstraints.HORIZONTAL;
		cst.gridx = 3;
		cst.gridy = 0;
		AddBookText.setPreferredSize(new Dimension(140, 30));
		panel.add(AddBookText, cst);

		// add bookbutton to the panel
		cst.fill = GridBagConstraints.HORIZONTAL;
		cst.gridx = 15;
		cst.gridy = 0;
		panel.add(AddBookButton, cst);

		// add removeBookLabel to the panel
		cst.fill = GridBagConstraints.HORIZONTAL;
		cst.gridx = 0;
		cst.gridy = 9;
		panel.add(RemoveBookLabel, cst);

		// add removetextfield to the panel
		cst.fill = GridBagConstraints.HORIZONTAL;
		cst.gridx = 3;
		cst.gridy = 500;
		AddBookText.setPreferredSize(new Dimension(140, 20));
		panel.add(RemoveBookText, cst);

		// add button removeOutBookButton to the panel
		cst.fill = GridBagConstraints.SOUTH;
		cst.gridx = 15;
		cst.gridy = 500;
		panel.add(RemoveBookButton, cst);

		// add CheckOutBookLabel to the panel
		cst.fill = GridBagConstraints.HORIZONTAL;
		cst.gridx = 0;
		cst.gridy = 900;
		panel.add(CheckOutBookLabel, cst);

		// add c/o textfield to the panel
		cst.fill = GridBagConstraints.HORIZONTAL;
		cst.gridx = 3;
		cst.gridy = 900;
		AddBookText.setPreferredSize(new Dimension(140, 20));
		panel.add(CheckOutBookText, cst);

		// add c/o button CheckOutBookButton to the panel
		cst.fill = GridBagConstraints.SOUTH;
		cst.gridx = 15;
		cst.gridy = 900;
		panel.add(CheckOutBookButton, cst);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(WIDTH, HEIGHT);
		frame.getContentPane().add(panel);
		frame.setVisible(true);

	}
}
