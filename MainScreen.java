package Login;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.TextField;
import java.util.*;

import javax.swing.ScrollPaneConstants;
import javax.swing.JPanel;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.BoxLayout;

public class MainScreen {

	public JFrame mainFrame;
	String username;
	HashMap<Reminder,String> reminders = new HashMap<Reminder,String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainScreen() {
		initialize(this.username);
	}
	
	public MainScreen(String u) {

		initialize(u);
		this.username = u;

		JLabel lblNewLabel_1 = new JLabel(u);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBounds(837, 27, 181, 35);
		mainFrame.getContentPane().add(lblNewLabel_1);

	}
	
	void openDialog() {
		AddReminder a = new AddReminder(this);
		a.showDialog();
	}
	
	void setVisible(boolean l) {
		
		mainFrame.setVisible(l);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	void add(Reminder r) {
		reminders.put(r, this.username);
	}
	
	void load() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(277, 109, 776, 655);
		mainFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				load();
			}
		});
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setBounds(56, 14, 41, 34);
		mainFrame.getContentPane().add(btnNewButton_1);
		
		int i=0;
		int s=10;

		JPanel[] panels = new JPanel[20];
		JLabel[] labels = new JLabel[20];
		
		for (Map.Entry<Reminder, String> set : reminders.entrySet()) {
			
			panels[i] = new JPanel();
			panels[i].setBounds(10, s, 756, 146);
			
			labels[i] = new JLabel(set.toString());
			labels[i].setFont(new Font("Tahoma", Font.BOLD, 30));
			panels[i].add(labels[i]);
			
			if(set.getKey().type.equals("Other")) {
				panels[i].setBackground(Color.GREEN);
			}
			
			else if(set.getKey().type.equals("Medicine")) {
				panels[i].setBackground(Color.BLUE);
				labels[i].setForeground(Color.WHITE);
			}
			
			else if(set.getKey().type.equals("Habit")) {
				panels[i].setBackground(Color.YELLOW);
			}
			
			else {
				panels[i].setBackground(Color.RED);
			}
			s=s+160;
			panel.add(panels[i]);
			i++;
		}
	}
	
	private void initialize(String u) {
		
		add(new Reminder());
		add(new Reminder(1,"Habit",new Time(24,1),true));
		add(new Reminder(2,"Medicine",new Time(13,56),true));
		
		System.out.println(reminders);
		
		
		mainFrame = new JFrame("Home Screeen");
		mainFrame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		mainFrame.setBounds(250, 0, 1075, 808);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Add Reminder");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openDialog();
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(33, 162, 154, 49);
		mainFrame.getContentPane().add(btnNewButton);
		
		JButton btnDeleteReminder = new JButton("Delete Reminder");
		btnDeleteReminder.setForeground(Color.BLACK);
		btnDeleteReminder.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDeleteReminder.setBackground(Color.RED);
		btnDeleteReminder.setBounds(33, 305, 154, 49);
		mainFrame.getContentPane().add(btnDeleteReminder);
		
		JButton btnUpdateReminder = new JButton("Update Reminder");
		btnUpdateReminder.setForeground(Color.BLACK);
		btnUpdateReminder.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnUpdateReminder.setBackground(Color.ORANGE);
		btnUpdateReminder.setBounds(33, 439, 154, 49);
		mainFrame.getContentPane().add(btnUpdateReminder);
		
		JLabel lblNewLabel = new JLabel("Logged in Sucessfully!!!");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(446, 10, 233, 22);
		mainFrame.getContentPane().add(lblNewLabel);
		
		load();
	}
}
