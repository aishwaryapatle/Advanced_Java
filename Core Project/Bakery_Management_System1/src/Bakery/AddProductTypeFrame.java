package Bakery;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AddProductTypeFrame {

	static public void AddProductTypeFrameCode()
	{
		//Swing
		JFrame frame3 = new JFrame("Add Product Type");
		JOptionPane pane = new JOptionPane();
		
		//Insert
		JLabel label = new JLabel("Add Product Type");
		label.setBounds(260,50,150,25);
		label.setFont(new Font("Times New Roman", Font.BOLD,17));

		JLabel ptype = new JLabel("Product Type Title");
		ptype.setBounds(200,100,180,25);
		
		JTextField ptypeText = new JTextField();
		ptypeText.setBounds(200,135,300,25);
		
		JLabel des1 = new JLabel("Description");
		des1.setBounds(200,200,100,25);
		
		JTextField des1Text = new JTextField();
//		des1Text.setRows(4);
//		des1Text.setColumns(40);
		des1Text.setBounds(200,250,300,100);
		
		JButton add = new JButton("Save Product");
		add.setBounds(300, 400, 100, 25);
		
		JButton back1 = new JButton("Back to Home");
		back1.setBounds(10, 480, 120, 25);
		
		back1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
//				Home h = new Home();
				frame3.dispose();	
			}
		});
		
		add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				AddProductType a = new AddProductType(ptypeText.getText(), des1Text.getText());
				
				try{
					int x = AddProductTypeConnectivity.AddProductTypeCode(a);
					if(x>0)
					{
						pane.showMessageDialog(frame3, "Product type saved successfully");
					}
					else
					{
						pane.showMessageDialog(frame3, "Not saved successfully");
					}
				} catch (SQLException | ClassNotFoundException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		
		frame3.add(label);
		frame3.add(ptype);
		frame3.add(ptypeText);
		frame3.add(des1);
		frame3.add(des1Text);
		frame3.add(add);
		frame3.add(back1);
		
		frame3.setSize(600, 620);
		frame3.setLayout(null);
		frame3.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddProductTypeFrame a = new AddProductTypeFrame();
		a.AddProductTypeFrameCode();
	}

}
