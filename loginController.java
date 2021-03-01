package Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;



public class loginController{

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginController window = new loginController();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public loginController() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initialize() {
		User user1 = new User();
		user1.init();
		
		frame = new JFrame("Login Screen");
		frame.setBounds(250, 0, 1075, 808);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(502, 192, 241, 44);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBounds(502, 287, 241, 44);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(313, 193, 158, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPassword.setBounds(313, 302, 158, 29);
		frame.getContentPane().add(lblPassword);
		
		
		Button button = new Button("Login    ");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String u = textField.getText();
				String p = passwordField.getText();
				
				int k = user1.login(u,p);
				if(k == 2) {
					MainScreen m = new MainScreen(u);
					m.setVisible(true);
					frame.setVisible(false);
				}
				else if(k==1) {
					JOptionPane.showMessageDialog(null,"Incorrect Password entered");
					passwordField.setText("");
				}
				else{
					JOptionPane.showMessageDialog(null,"This username does not exist!");
					textField.setText("");
					passwordField.setText("");
				}
				
			}
		});
		button.setActionCommand("LogIn");
		button.setFont(new Font("Dialog", Font.PLAIN, 19));
		button.setForeground(Color.WHITE);
		button.setBackground(Color.BLACK);
		button.setBounds(365, 400, 158, 37);
		frame.getContentPane().add(button);
		
		Button button_1 = new Button("Reset    ");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				passwordField.setText("");
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Dialog", Font.PLAIN, 19));
		button_1.setBackground(Color.LIGHT_GRAY);
		button_1.setActionCommand("LogIn");
		button_1.setBounds(569, 400, 158, 37);
		frame.getContentPane().add(button_1);
		
	}
}
