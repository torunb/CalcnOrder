import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import java.awt.event.*;

public class DishDetails extends JPanel implements ActionListener
  {

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnAddToCart;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxCarbohydrate;
	private JCheckBox chckbxFat;
	private JCheckBox chckbxGlutenfree;
	private JCheckBox chckbxLactosefree;
	private JCheckBox chckbxVegan;
	private JCheckBox chckbxVegetarian;
	private JCheckBox chckbxCholesterol;
	private JCheckBox chckbxSugarfree;
	private JLabel imageLabel;
	private JButton button;
	private AppMain gui;
	private JPanel refer;
	private Food foodItem;
	private AddingDishToCart addingDishToCart;
	private JTextField weightTextField;
	private JTextField ratingTextField;
	private JLabel ratingNumberlbl;
	private JLabel label_1;
	private JLabel lblPrice;
	private JLabel lblPriceInTokens;
	private JTextField priceTextField;
	private JTextField priceTokensTextField;


	public DishDetails(AppMain g, AddingDishToCart adc) {
		addingDishToCart = adc;
		gui=g;
		setBounds(100, 100, 900, 600);		
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setBackground(new Color(255, 204, 153));
		this.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("output-onlinepngtools-small.png")));
		label.setBounds(336, 16, 206, 170);
		this.add(label);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblName.setBounds(39, 205, 81, 28);
		this.add(lblName);
		
		JLabel lblCalories = new JLabel("Calories:");
		lblCalories.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblCalories.setBounds(39, 249, 97, 28);
		this.add(lblCalories);
		
		JLabel lblIngredients = new JLabel("Ingredients:");
		lblIngredients.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblIngredients.setBounds(39, 292, 128, 28);
		this.add(lblIngredients);
		
		JLabel lblNutritionalValue = new JLabel("Nutritional Value:");
		lblNutritionalValue.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblNutritionalValue.setBounds(39, 336, 216, 28);
		this.add(lblNutritionalValue);
		
		JLabel lblWeight = new JLabel("Weight:");
		lblWeight.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblWeight.setBounds(39, 443, 97, 28);
		this.add(lblWeight);
		
		JLabel lblRating = new JLabel("Rating:");
		lblRating.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblRating.setBounds(681, 237, 81, 28);
		this.add(lblRating);
		
		btnAddToCart = new JButton("Add to Cart");
		btnAddToCart.setBackground(Color.GRAY);
		btnAddToCart.setForeground(Color.WHITE);
		btnAddToCart.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		btnAddToCart.setBounds(692, 528, 168, 29);
		this.add(btnAddToCart);
		btnAddToCart.addActionListener(this);
		
		textField = new JTextField();
		textField.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		textField.setEditable(false);
		textField.setBounds(236, 208, 283, 26);
		this.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(236, 252, 146, 26);
		this.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(236, 295, 427, 26);
		this.add(textField_2);
		
		chckbxNewCheckBox = new JCheckBox("Protein");
		chckbxNewCheckBox.setFont(new Font("Microsoft YaHei", Font.PLAIN, 16));
		chckbxNewCheckBox.setEnabled(false);
		chckbxNewCheckBox.setBounds(236, 338, 88, 29);
		this.add(chckbxNewCheckBox);
		
		chckbxCarbohydrate = new JCheckBox("Carbs");
		chckbxCarbohydrate.setFont(new Font("Microsoft YaHei", Font.PLAIN, 16));
		chckbxCarbohydrate.setEnabled(false);
		chckbxCarbohydrate.setBounds(336, 338, 88, 29);
		this.add(chckbxCarbohydrate);
		
		chckbxFat = new JCheckBox("Fat");
		chckbxFat.setFont(new Font("Microsoft YaHei", Font.PLAIN, 16));
		chckbxFat.setEnabled(false);
		chckbxFat.setBounds(431, 338, 88, 29);
		this.add(chckbxFat);
		
		chckbxGlutenfree = new JCheckBox("Gluten-free");
		chckbxGlutenfree.setFont(new Font("Microsoft YaHei", Font.PLAIN, 16));
		chckbxGlutenfree.setEnabled(false);
		chckbxGlutenfree.setBounds(526, 338, 137, 29);
		this.add(chckbxGlutenfree);
		
		chckbxLactosefree = new JCheckBox("Lactose-free");
		chckbxLactosefree.setFont(new Font("Microsoft YaHei", Font.PLAIN, 16));
		chckbxLactosefree.setEnabled(false);
		chckbxLactosefree.setBounds(670, 338, 129, 29);
		this.add(chckbxLactosefree);
		
		chckbxVegan = new JCheckBox("Vegan");
		chckbxVegan.setFont(new Font("Microsoft YaHei", Font.PLAIN, 16));
		chckbxVegan.setEnabled(false);
		chckbxVegan.setBounds(236, 393, 88, 29);
		this.add(chckbxVegan);
		
		chckbxVegetarian = new JCheckBox("Vegetarian");
		chckbxVegetarian.setFont(new Font("Microsoft YaHei", Font.PLAIN, 16));
		chckbxVegetarian.setEnabled(false);
		chckbxVegetarian.setBounds(336, 393, 128, 29);
		this.add(chckbxVegetarian);
		
		chckbxCholesterol = new JCheckBox("Cholesterol");
		chckbxCholesterol.setFont(new Font("Microsoft YaHei", Font.PLAIN, 16));
		chckbxCholesterol.setEnabled(false);
		chckbxCholesterol.setBounds(471, 393, 134, 29);
		this.add(chckbxCholesterol);
		
		chckbxSugarfree = new JCheckBox("Sugar-free");
		chckbxSugarfree.setFont(new Font("Microsoft YaHei", Font.PLAIN, 16));
		chckbxSugarfree.setEnabled(false);
		chckbxSugarfree.setBounds(612, 393, 128, 29);
		this.add(chckbxSugarfree);
		
		imageLabel = new JLabel();
		imageLabel.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("no-camera.png")));
		imageLabel.setBounds(681, 60, 179, 170);
		this.add(imageLabel);
		
		button = new JButton("");
		button.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("back.png")));
		button.setBounds(15, 16, 75, 57);
		this.add(button);
		button.addActionListener(this);
		
		weightTextField = new JTextField();
		weightTextField.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		weightTextField.setColumns(10);
		weightTextField.setBounds(236, 445, 146, 26);
		add(weightTextField);
		weightTextField.setEditable(false);
		
		ratingTextField = new JTextField();
		ratingTextField.setEditable(false);
		ratingTextField.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		ratingTextField.setBounds(777, 239, 37, 26);
		add(ratingTextField);
		ratingTextField.setColumns(10);
		
		ratingNumberlbl = new JLabel();
		ratingNumberlbl.setText("5");
		ratingNumberlbl.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		ratingNumberlbl.setBounds(848, 239, 37, 26);
		add(ratingNumberlbl);
		
		label_1 = new JLabel("/");
		label_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		label_1.setBounds(829, 240, 15, 22);
		add(label_1);
		
		lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblPrice.setBounds(39, 487, 97, 28);
		add(lblPrice);
		
		lblPriceInTokens = new JLabel("Price in tokens:");
		lblPriceInTokens.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblPriceInTokens.setBounds(39, 528, 162, 28);
		add(lblPriceInTokens);
		
		priceTextField = new JTextField();
		priceTextField.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		priceTextField.setEditable(false);
		priceTextField.setColumns(10);
		priceTextField.setBounds(236, 490, 146, 26);
		add(priceTextField);
		
		priceTokensTextField = new JTextField();
		priceTokensTextField.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		priceTokensTextField.setEditable(false);
		priceTokensTextField.setColumns(10);
		priceTokensTextField.setBounds(236, 531, 146, 26);
		add(priceTokensTextField);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			gui.frame.remove(gui.dishDetailsPage);
          	gui.frame.add(refer);
          	refer.setVisible(true);
          	gui.frame.repaint();
          	gui.frame.revalidate();
			textField.setText("");;
			textField_1.setText("");
			textField_2.setText("");

		}
		if(e.getSource() == btnAddToCart){
			gui.frame.remove(gui.dishDetailsPage);
            gui.frame.add(gui.addingDishToCartPage);
            gui.addingDishToCartPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
			addingDishToCart.setFood(foodItem);
		}
		
	}

	public void setrefer(JPanel panel){
		refer = panel;
	}

	public void setFood(Food food){
		foodItem = food;
		textField.setText(foodItem.getName());
		textField_1.setText(foodItem.getCalories()+"");
		textField_2.setText(foodItem.getIngredients());
		chckbxNewCheckBox.setSelected(foodItem.getProtein());
		chckbxCarbohydrate.setSelected(foodItem.getCarbs());
		chckbxCholesterol.setSelected(foodItem.getCholestrol());
		chckbxFat.setSelected(foodItem.getFat());
		chckbxGlutenfree.setSelected(foodItem.getGlutenFree());
		chckbxLactosefree.setSelected(foodItem.getLactoseFree());
		chckbxSugarfree.setSelected(foodItem.getSugerFree());
		chckbxVegetarian.setSelected(foodItem.getVegetarian());
		chckbxVegan.setSelected(foodItem.getVegan());
		imageLabel.setIcon(new ImageIcon(foodItem.getPhoto().getImage().getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_DEFAULT)));
		weightTextField.setText(foodItem.getWeight()+" Grams");
		priceTextField.setText(foodItem.getPrice()+ " TL");
		priceTokensTextField.setText(foodItem.getPriceInTokens() + " tokens");
		ratingTextField.setText(foodItem.getRating() + "");
	}
	
}
