import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.event.*;
import javax.swing.JTextField;
import java.awt.Image;

public class AddingDishToCart extends JPanel implements ActionListener{

	private JComboBox<Integer> comboBox;
	private String[] quantity = {"1","2","3","4","5","6","7","8","9"};
	private JButton button;
	private JLabel labelPhoto;
	private JLabel lblFoodsName;
	private JLabel lblTl;
	private JButton btnOk;
	private AppMain gui;
	private JTextField textField;
	private JLabel tokenPriceLabel;
	private Review reviewPage;
	private Food foodItem;


	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// 	EventQueue.invokeLater(new Runnable() {
	// 		public void run() {
	// 			try {
	// 				AddingDishToCart frame = new AddingDishToCart();
	// 				frame.setVisible(true);
	// 			} catch (Exception e) {
	// 				e.printStackTrace();
	// 			}
	// 		}
	// 	});
	// }

	/**
	 * Create the frame.
	 */
	public AddingDishToCart(AppMain g, Review r) {
		gui =g;
		reviewPage = r;
		setBounds(100, 100, 900, 600);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setBackground(new Color(255, 204, 153));
		this.setLayout(null);
		
		button = new JButton("");
		button.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("back.png")));
		button.setBounds(15, 16, 74, 57);
		this.add(button);
		button.addActionListener(this);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("output-onlinepngtools-small.png")));
		label.setBounds(343, 0, 208, 166);
		this.add(label);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblQuantity.setBounds(54, 201, 98, 34);
		this.add(lblQuantity);
		
		JLabel lblIngredients = new JLabel("Ingredients:");
		lblIngredients.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblIngredients.setBounds(54, 286, 126, 34);
		this.add(lblIngredients);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblPrice.setBounds(54, 389, 98, 34);
		this.add(lblPrice);
		
		labelPhoto = new JLabel("");
		labelPhoto.setBounds(679, 71, 164, 145);
		labelPhoto.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("no-camera.png")));
		this.add(labelPhoto);
		
		lblFoodsName = new JLabel("Food's Name");
		lblFoodsName.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblFoodsName.setBounds(694, 230, 138, 34);
		this.add(lblFoodsName);
		
		lblTl = new JLabel("00 TL");
		lblTl.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		lblTl.setBounds(227, 397, 69, 20);
		this.add(lblTl);
		
		btnOk = new JButton("Add");
		btnOk.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		btnOk.setBackground(Color.GRAY);
		btnOk.setForeground(Color.WHITE);
		btnOk.setBounds(686, 490, 115, 29);
		this.add(btnOk);
		btnOk.addActionListener(this);
		
		comboBox = new JComboBox(quantity);
		comboBox.setBounds(215, 207, 69, 26);
		this.add(comboBox);
		
		textField = new JTextField();
		textField.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		textField.setBounds(215, 286, 628, 44);
		add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		JLabel lblPriceInTokens = new JLabel("Price in tokens:");
		lblPriceInTokens.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblPriceInTokens.setBounds(54, 460, 150, 34);
		add(lblPriceInTokens);
		
		tokenPriceLabel = new JLabel("00 ");
		tokenPriceLabel.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		tokenPriceLabel.setBounds(227, 469, 150, 20);
		add(tokenPriceLabel);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button){
			gui.frame.remove(gui.addingDishToCartPage);
            gui.frame.add(gui.dishDetailsPage);
            gui.dishDetailsPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
		}
		if (e.getSource() == btnOk) {
			gui.frame.remove(gui.addingDishToCartPage);
            gui.frame.add(gui.mainPage);
            gui.mainPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
			JFrame successFrame = new JFrame();
			reviewPage.setFoods(foodItem);
			reviewPage.setQuantity(Integer.parseInt((String) comboBox.getSelectedItem()));
			JOptionPane.showMessageDialog(successFrame,"Item successfully added to cart!");
		}
	}
	public void setFood(Food food){
		foodItem = food;
		tokenPriceLabel.setText(""+foodItem.getPriceInTokens() + " tokens");
		lblTl.setText(""+ foodItem.getPrice()+ "TL");
		labelPhoto.setIcon(new ImageIcon(foodItem.getPhoto().getImage().getScaledInstance(labelPhoto.getWidth(), labelPhoto.getHeight(), Image.SCALE_DEFAULT)));
		textField.setText(foodItem.getIngredients());
		lblFoodsName.setText(foodItem.getName());
	}
}
