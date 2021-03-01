package Login;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddReminder extends JDialog {

	/**
	 * Launch the application.
	 */
	boolean flag = true;
	public static void main(String[] args) {
		try {
			AddReminder dialog = new AddReminder();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	int x= 3;
	Reminder r;
	public AddReminder() {
		
	}
	void addVal(Reminder r1) {
		this.r = r1;
		this.flag = false;
	}
	
	Reminder showDialog() {
		setVisible(true);
		return this.r;
	}
	void inc() {
		x++;
	}
	/**
	 * Create the dialog.
	 */
	public AddReminder(MainScreen m) {
		setBounds(450, 0, 650, 808);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add New Reminder");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(205, 29, 190, 45);
		getContentPane().add(lblNewLabel);
		
		JLabel lblEnterReminderType = new JLabel("Enter Reminder Type:");
		lblEnterReminderType.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEnterReminderType.setBounds(205, 118, 190, 45);
		getContentPane().add(lblEnterReminderType);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Habit");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNewRadioButton.setBounds(63, 204, 103, 21);
		getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Medicine");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNewRadioButton_1.setBounds(184, 204, 103, 21);
		getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Payment");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNewRadioButton_2.setBounds(314, 204, 103, 21);
		getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Other");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNewRadioButton_3.setBounds(463, 204, 103, 21);
		getContentPane().add(rdbtnNewRadioButton_3);
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTime.setBounds(136, 301, 57, 45);
		getContentPane().add(lblTime);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		comboBox.setBounds(220, 308, 57, 37);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		comboBox_1.setBounds(314, 309, 57, 37);
		getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_1 = new JLabel("HH");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(232, 268, 34, 30);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("MM");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(326, 268, 34, 30);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblAlertType = new JLabel("Alert Type:");
		lblAlertType.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAlertType.setBounds(104, 396, 89, 45);
		getContentPane().add(lblAlertType);
		
		JRadioButton rdbtnLoudAlert = new JRadioButton("Loud Alert");
		rdbtnLoudAlert.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnLoudAlert.setBounds(220, 411, 122, 21);
		getContentPane().add(rdbtnLoudAlert);
		
		JRadioButton rdbtnSilentAlert = new JRadioButton("Silent Alert");
		rdbtnSilentAlert.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnSilentAlert.setBounds(360, 411, 138, 21);
		getContentPane().add(rdbtnSilentAlert);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t="Default";
				if(rdbtnNewRadioButton.isSelected()) {
					t = "Habit";
				}
				else if(rdbtnNewRadioButton_1.isSelected()) {
					t = "Medicine";
				}
				else if(rdbtnNewRadioButton_2.isSelected()) {
					t = "Payment";
				}
				else if(rdbtnNewRadioButton_3.isSelected()) {
					t = "Other";
				}
				
				int hh = Integer.valueOf((String)comboBox.getSelectedItem());
				int mm = Integer.valueOf((String)comboBox_1.getSelectedItem());
				
				Time t1 = new Time(hh,mm);
				
				boolean a = true;
				if(rdbtnLoudAlert.isSelected()) {
					a = true;
				}
				else if(rdbtnSilentAlert.isSelected()) {
					a = false;
				}
				inc();
				Reminder r2 =  new Reminder(x,t,t1,a);
				m.add(r2);
				System.out.println(m.reminders);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(220, 689, 151, 45);
		getContentPane().add(btnNewButton);
	}
}
