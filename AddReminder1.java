package Login;


import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddReminder1 {

	private JFrame addFrame;
	String username;
	
	int x = 3;
	boolean flag = true;
	Reminder r1;
	
	
	Reminder getVal() {
		return r1;
	}
	
	void addVal(Reminder r) {
		this.r1 = r;
		this.flag = false;
		System.out.println(this.r1);
	}
	
	void inc() {
		x++;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddReminder1 window = new AddReminder1();
					window.addFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	void setVisible(boolean l) {	
		addFrame.setVisible(l);
	}
	
	public AddReminder1() {
		initialize(this.username);
	}
	public AddReminder1(String user) {
		
		initialize(user);
		this.username = user;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize(String username) {
		addFrame = new JFrame();
		addFrame.setBounds(450, 0, 650, 808);
		addFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add New Reminder");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(212, 28, 202, 40);
		addFrame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Reminder Type:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(213, 131, 191, 39);
		addFrame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Habit");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNewRadioButton.setBounds(103, 194, 78, 21);
		addFrame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnMedicine = new JRadioButton("Medicine");
		rdbtnMedicine.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnMedicine.setBounds(209, 194, 97, 21);
		addFrame.getContentPane().add(rdbtnMedicine);
		
		JRadioButton rdbtnPayment = new JRadioButton("Payment");
		rdbtnPayment.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnPayment.setBounds(336, 194, 102, 21);
		addFrame.getContentPane().add(rdbtnPayment);
		
		JRadioButton rdbtnOther = new JRadioButton("Other");
		rdbtnOther.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnOther.setBounds(465, 194, 78, 21);
		addFrame.getContentPane().add(rdbtnOther);
		
		ButtonGroup b = new ButtonGroup();
		b.add(rdbtnNewRadioButton);
		b.add(rdbtnMedicine);
		b.add(rdbtnPayment);
		b.add(rdbtnOther);
		
		JLabel lblNewLabel_1_1 = new JLabel("Time:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(132, 292, 57, 39);
		addFrame.getContentPane().add(lblNewLabel_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		comboBox.setBounds(213, 298, 51, 26);
		addFrame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "> "}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_1.setBounds(285, 298, 51, 26);
		addFrame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("HH");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(223, 275, 27, 13);
		addFrame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("MM");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(296, 275, 27, 13);
		addFrame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Alert Type:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(103, 369, 103, 39);
		addFrame.getContentPane().add(lblNewLabel_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Loud Alert");
		rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNewRadioButton_4.setBounds(213, 381, 123, 21);
		addFrame.getContentPane().add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Silent Alert");
		rdbtnNewRadioButton_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNewRadioButton_5.setBounds(365, 381, 131, 21);
		addFrame.getContentPane().add(rdbtnNewRadioButton_5);
		
		
		ButtonGroup b1 = new ButtonGroup();
		b1.add(rdbtnNewRadioButton_4);
		b1.add(rdbtnNewRadioButton_5);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inc();
				String t="Default";
				if(rdbtnNewRadioButton.isSelected()) {
					t = "Habit";
				}
				else if(rdbtnMedicine.isSelected()) {
					t = "Medicine";
				}
				else if(rdbtnPayment.isSelected()) {
					t = "Payment";
				}
				else if(rdbtnOther.isSelected()) {
					t = "Other";
				}
				
				int hh = Integer.valueOf((String)comboBox.getSelectedItem());
				int mm = Integer.valueOf((String)comboBox_1.getSelectedItem());
				
				Time t1 = new Time(hh,mm);
				
				boolean a = true;
				if(rdbtnNewRadioButton_4.isSelected()) {
					a = true;
				}
				else if(rdbtnNewRadioButton_5.isSelected()) {
					a = false;
				}
				
				Reminder r2 =  new Reminder(x,t,t1,a);
				
				MainScreen m = new MainScreen(username);
				m.add(r2);
				m.setVisible(true);
				addFrame.setVisible(false);
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(221, 694, 163, 46);
		addFrame.getContentPane().add(btnNewButton);
		
		
		
		
	}

}
