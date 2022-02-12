import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Review extends JPanel implements ActionListener{

	//private JPanel this;
	private JLabel lblTl;
	private JButton btnNewButton;
	private JLabel lblFoodsName;
	private JLabel lblPrice;
	private JButton backbutton;
	private AppMain gui;
	private JLabel lblPriceInTokens;
	private JLabel lblReview;
	private JTextArea nameTextArea;
	private JTextArea priceTextArea;
	private JTextArea priceTokenTextArea;
	private int totalAmount = 0;
	private int quantity=1;
	private Checkout checkoutPage;
	private Food foodItem;
	private int totalTokenAmount=0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Review frame = new Review();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Review(AppMain g, Checkout ck) {
		gui = g;
		checkoutPage=ck;
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		//setResizable(false);
		//setTitle("Review");
		//this = new JPanel();
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setBackground(new Color(255, 204, 153));
		//add(this);
		this.setLayout(null);
		
		backbutton = new JButton("");
		backbutton.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("back.png")));
		backbutton.setBounds(15, 16, 79, 58);
		this.add(backbutton);
		backbutton.addActionListener(this);

		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("output-onlinepngtools-small.png")));
		label.setBounds(345, 0, 203, 176);
		this.add(label);
		
		btnNewButton = new JButton("CHECKOUT");
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		btnNewButton.setBounds(372, 515, 155, 50);
		this.add(btnNewButton);
		btnNewButton.addActionListener(this);

		JLabel lblTotal = new JLabel("TOTAL:");
		lblTotal.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblTotal.setBounds(372, 471, 83, 28);
		this.add(lblTotal);
		
		lblTl = new JLabel("00 TL");
		lblTl.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		lblTl.setBounds(479, 476, 69, 20);
		this.add(lblTl);
		
		lblFoodsName = new JLabel("Food's Name");
		lblFoodsName.setBounds(75, 214, 161, 40);
		add(lblFoodsName);
		lblFoodsName.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		
		lblPrice = new JLabel("Price");
		lblPrice.setBounds(423, 218, 75, 33);
		add(lblPrice);
		lblPrice.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		
		lblPriceInTokens = new JLabel("Price in tokens");
		lblPriceInTokens.setBounds(671, 218, 161, 33);
		add(lblPriceInTokens);
		lblPriceInTokens.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		
		lblReview = new JLabel("REVIEW");
		lblReview.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblReview.setBounds(413, 178, 96, 33);
		add(lblReview);
		
		nameTextArea = new JTextArea();
		nameTextArea.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		nameTextArea.setEditable(false);
		nameTextArea.setBounds(15, 254, 276, 208);
		add(nameTextArea);
		
		priceTextArea = new JTextArea();
		priceTextArea.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		priceTextArea.setEditable(false);
		priceTextArea.setBounds(323, 252, 266, 208);
		add(priceTextArea);
		
		priceTokenTextArea = new JTextArea();
		priceTokenTextArea.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		priceTokenTextArea.setEditable(false);
		priceTokenTextArea.setBounds(612, 254, 273, 208);
		add(priceTokenTextArea);
	}

	public void setFoods(Food item){
		foodItem = item;
		nameTextArea.setText(nameTextArea.getText() + foodItem.getName()+"\n");
		priceTextArea.setText(priceTextArea.getText() + (quantity*foodItem.getPrice())+"\n");
		priceTokenTextArea.setText(priceTokenTextArea.getText() + (quantity*foodItem.getPriceInTokens())+"\n");
		totalAmount = totalAmount + (quantity* foodItem.getPrice());
		totalTokenAmount = totalTokenAmount+ (quantity* foodItem.getPrice());
		lblTl.setText(totalAmount + ""); 
	}

	public void setQuantity(int quant){
		this.quantity = quant;
	}


	public int getQuantity(){
		return quantity;
	}
	public void clearTextArea(){
		nameTextArea.setText("");
		priceTextArea.setText("");
		priceTokenTextArea.setText("");
	}


	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() ==  backbutton){
			gui.frame.remove(gui.reviewPage);
        	gui.frame.add(gui.mainPage);
        	gui.mainPage.setVisible(true);
        	gui.frame.repaint();
        	gui.frame.revalidate();
		}
		if (e.getSource() ==  btnNewButton){
			gui.frame.remove(gui.reviewPage);
        	gui.frame.add(gui.checkoutPage);
        	gui.checkoutPage.setVisible(true);
        	gui.frame.repaint();
        	gui.frame.revalidate();
			checkoutPage.setPrice(totalAmount);
			checkoutPage.setTokens(totalTokenAmount);
			checkoutPage.setorder(nameTextArea.getText());

		}

		
	}
}




