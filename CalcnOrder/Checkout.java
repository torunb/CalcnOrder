import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextArea;

public class Checkout extends JPanel implements ActionListener{

	private JComboBox comboBox;
	private JButton btnNewButton;
	private JLabel lblTl;
	JButton backButton;
	private String[] methods = {"Credit Card", "Cash", "Tokens"};
	private AppMain gui;
	private JTextArea orderNote;
	private JTextArea addressArea;
	private int price;
	private Login loginPage;
	private int tokens;
	private MainPage mPage;
	PreviousOrders pOrders;
	private String order;


	/**
	 * Create the frame.
	 */
	public Checkout(AppMain g, PreviousOrders po) {
		gui = g;
		pOrders = po;
		setBounds(100, 100, 900, 600);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setBackground(new Color(255, 204, 153));
		this.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("output-onlinepngtools-small.png")));
		label.setBounds(338, -12, 216, 196);
		this.add(label);
		
		backButton = new JButton("");
		backButton.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("back.png")));
		backButton.setBounds(15, 16, 72, 60);
		this.add(backButton);
		backButton.addActionListener(this);
		
		JLabel lblTotalAmount = new JLabel("TOTAL AMOUNT:");
		lblTotalAmount.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblTotalAmount.setBounds(62, 200, 179, 37);
		this.add(lblTotalAmount);
		
		JLabel lblOrderNote = new JLabel("ORDER NOTE:");
		lblOrderNote.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblOrderNote.setBounds(62, 265, 179, 37);
		this.add(lblOrderNote);
		
		JLabel lblAddress = new JLabel("ADDRESS:");
		lblAddress.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblAddress.setBounds(62, 360, 179, 37);
		this.add(lblAddress);
		
		JLabel lblPayng = new JLabel("PAYMENT METHOD:");
		lblPayng.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblPayng.setBounds(62, 446, 202, 37);
		this.add(lblPayng);
		
		btnNewButton = new JButton("Deliver");
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		btnNewButton.setBounds(387, 519, 125, 37);
		this.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		comboBox = new JComboBox(methods);
		comboBox.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		comboBox.setBounds(292, 453, 185, 26);
		this.add(comboBox);
		
		lblTl = new JLabel("00 TL");
		lblTl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTl.setBounds(292, 208, 185, 20);
		this.add(lblTl);
		
		orderNote = new JTextArea();
		orderNote.setBounds(292, 265, 185, 60);
		add(orderNote);
		
		addressArea = new JTextArea();
		addressArea.setEditable(true);
		addressArea.setBounds(292, 360, 185, 60);
		add(addressArea);
	}

	public void setPrice(int price){
		this.price=price;
		lblTl.setText(""+ price+ "TL");

	}

	public void setorder(String str){
		order = str;
	}

	public void setTokens(int t){
		tokens = t;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == backButton) {
			gui.frame.remove(gui.checkoutPage);
        	gui.frame.add(gui.reviewPage);
        	gui.reviewPage.setVisible(true);
        	gui.frame.repaint();
        	gui.frame.revalidate();
		}
		
		if (e.getSource() == btnNewButton) {
			if((String)comboBox.getSelectedItem() == "Tokens"){
	
				if (tokens <= MainPage.tokens) {
					JFrame deliveryMessage = new JFrame("Delivery Message");
					JOptionPane.showMessageDialog(deliveryMessage,"Your order is being delivered!");
					pOrders.setOrders(order);
					gui.frame.remove(gui.checkoutPage);
					gui.frame.add(gui.mainPage);
					gui.mainPage.setVisible(true);
					gui.frame.repaint();
					gui.frame.revalidate();
					gui.reviewPage.clearTextArea();
		
				}
				else{
					JFrame deliveryMessage = new JFrame("Delivery Message");
					JOptionPane.showMessageDialog(deliveryMessage,"Insuffient Tokens");
				}
			}
		else{ 
			JFrame deliveryMessage = new JFrame("Delivery Message");
			JOptionPane.showMessageDialog(deliveryMessage,"Your order is being delivered!");
			gui.frame.remove(gui.checkoutPage);
			pOrders.setOrders(order);
			gui.frame.add(gui.mainPage);
			gui.mainPage.setVisible(true);
			gui.frame.repaint();
			gui.frame.revalidate();
		}
		}
	}
}
