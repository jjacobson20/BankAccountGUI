/**
 * 
 * @author jeremy
 * Period 6
 *
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BankAccountGUI extends JFrame
{
	public BankAccountGUI()
	{
		JFrame window = new JFrame();
		window.setLayout(null);
		window.setBounds(500, 500, 600, 300);
		window.setTitle("Bank Account Manager");
		
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//drop down account options
		final String[] types = {"Checking", "Savings"};
		
		//labels
		JLabel nameLabel = new JLabel("Name: ");
		JLabel accountTypeLabel = new JLabel("Account Type: ");
		JLabel initialBalanceLabel = new JLabel("Initial Balance: ");
		
		//fields and drop down
		JTextField nameField = new JTextField();
		JComboBox accountTypeDropDown = new JComboBox(types);
		JTextField initialBalanceField = new JTextField();
		
		//buttons
		JButton createAccount = new JButton("Create Account");
		JButton displayAccounts = new JButton("Display All Accounts");
		
		//bounds
		nameLabel.setBounds(50, 50, 75, 30);
		accountTypeLabel.setBounds(50, 90, 125, 30);
		initialBalanceLabel.setBounds(50, 130, 125, 30);
		
		nameField.setBounds(150, 50, 300, 30);
		accountTypeDropDown.setBounds(150, 90, 150, 30);
		initialBalanceField.setBounds(150, 130, 300, 30);	
		
		createAccount.setBounds(150, 175, 125, 30);
		displayAccounts.setBounds(300, 175, 150, 30);
		
		//Account creation
		createAccount.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
		
		//add all components
		window.add(nameLabel);
		window.add(accountTypeLabel);
		window.add(initialBalanceLabel);
		
		window.add(nameField);
		window.add(accountTypeDropDown);
		window.add(initialBalanceField);
		
		window.add(createAccount);
		window.add(displayAccounts);
		
		window.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new BankAccountGUI();
	}
}
