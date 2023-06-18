package Bakery;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login_Page_Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame1 = new JFrame("Login");
		JOptionPane pane = new JOptionPane();
		
		JLabel label1 = new JLabel("Login");
		label1.setBounds(260,50,150,25);
		label1.setFont(new Font("Times New Roman", Font.BOLD,17));

		JLabel username = new JLabel("Username");
		username.setBounds(200,100,100,25);
		
		JTextField usernameText = new JTextField();
		usernameText.setBounds(300,100,100,25);
		
		JLabel password = new JLabel("Password");
		password.setBounds(200,150,100,25);
		
		JTextField passwordText = new JTextField();
		passwordText.setBounds(300,150,100,25);
		
		JButton login = new JButton("Login");
		login.setBounds(180, 200, 100, 25);
		
		JButton cancel = new JButton("Cancel");
		cancel.setBounds(320, 200, 100, 25);
		
		frame1.add(label1);
		frame1.add(username);
		frame1.add(usernameText);
		frame1.add(password);
		frame1.add(passwordText);
		frame1.add(cancel);
		frame1.add(login);
		
//		frame1.pack();
		
		frame1.setSize(564, 420);
		frame1.setLayout(null);
		frame1.setVisible(true);
	}

}
