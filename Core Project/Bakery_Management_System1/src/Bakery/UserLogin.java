package Bakery;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class UserLogin extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JTextField textfield;
	private JPasswordField passwordfield;
	private JButton btnNewButton;
	private JLabel label;
	private JPanel contentPane;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try{
					UserLogin frame = new UserLogin();
					frame.setVisible(true);
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		});

	}
	
	public UserLogin()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450,190,1014,597);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		lblNewLabel.setBounds(423, 13, 273, 93);
		contentPane.add(lblNewLabel);
		
		textfield = new JTextField();
		textfield.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textfield.setBounds(481, 170, 281, 68);
		contentPane.add(textfield);
		textfield.setColumns(10);
		
		passwordfield = new JPasswordField();
		passwordfield.setFont(new Font("Tahoma", Font.PLAIN, 32));
		passwordfield.setBounds(481, 286, 281, 68);
		contentPane.add(passwordfield);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBackground(Color.BLACK);
		lblUsername.setForeground(Color.BLACK);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblUsername.setBounds(250, 166, 193, 52);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBackground(Color.CYAN);
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblPassword.setBounds(250, 286, 193, 52);
		contentPane.add(lblPassword);
		
		btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnNewButton.setBounds(545, 392, 162, 73);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String userName  = textfield.getText();
				String password = passwordfield.getText();
				
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery","root","abc123");
					
					PreparedStatement st = con.prepareStatement("SELECT name, password from login where name=? and password=?");
					st.setString(1, userName);
					st.setString(2, password);
					ResultSet rs = st.executeQuery();
					if(rs.next()){
						dispose();
						con.close();
						JOptionPane.showMessageDialog(btnNewButton, "You have successfully logged in");
					} else {
						JOptionPane.showMessageDialog(btnNewButton, "Wrong Username & Password");
						con.close();
					}
					
					
				} catch(SQLException sqlException){
					sqlException.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		contentPane.add(btnNewButton);
		label = new JLabel("");
		label.setBounds(0,0,1008,562);
		contentPane.add(label);
		
	}

}
