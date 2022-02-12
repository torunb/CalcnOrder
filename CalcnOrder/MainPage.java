import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Image;
import javax.swing.border.*;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;

public class MainPage extends JPanel implements ActionListener{

	private JButton optionsButton;
	private JButton cartButton;
	private JPanel mealOfDayPanel;
	private JLabel label_11;
	private JLabel label_1, label_2, label_3, label_4, label_5, label_6, label_7, label_8, label_9;
	private JButton button_4;
	private JButton btnNewButton;
	private JButton btnBurgers;
	private JButton btnSalads;
	private JButton btnPzzas;
	private JButton btnPastas;
	private JButton btnSoups;
	private JButton btnWraps;
	private JButton button_2;
	private JButton button_3;
	private JLabel lblTokens;
	private JLabel userNameLabel;
	private AppMain gui;
	private int token;
	private Review reviewPage;
	private Restaurant restaurant;
	Food random1;
	Food random2;
	Food random3;
	Food mealOftheday;
	DishDetails dishDetails;
	private JLabel lblDiscountedPrice;
	private JLabel lblOldPrice;
	public static int tokens = 0;

	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// 	EventQueue.invokeLater(new Runnable() {
	// 		public void run() {
	// 			try {
	// 				MainPage frame = new MainPage();
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
	public MainPage(AppMain g, Review r, Restaurant res, DishDetails dd) {
		gui = g;
		reviewPage = r;
		restaurant=res;
		dishDetails=dd;
		setBounds(100, 100, 900, 600);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setBackground(new Color(255, 204, 153));
		this.setLayout(null);
		random1 = restaurant.getRandomFoods()[0];
		random2 = restaurant.getRandomFoods()[1];
		random3 =restaurant.getRandomFoods()[2];
		mealOftheday= restaurant.getRandomFoods()[3];
		mealOftheday.setPrice(mealOftheday.getPrice()-5);
		
		optionsButton = new JButton();
		optionsButton.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("options-lines (2).png")));
		optionsButton.setBounds(15, 36, 49, 41);
		this.add(optionsButton);
		optionsButton.addActionListener(this);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("output-onlinepngtools-small.png")));
		label.setBounds(653, 0, 201, 184);
		this.add(label);
		
		cartButton = new JButton("");
		cartButton.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("trolley (4).png")));
		cartButton.setBounds(589, 34, 49, 47);
		this.add(cartButton);
		cartButton.addActionListener(this);
		
		JLabel lblRecommendaton = new JLabel("RECOMMENDATIONS");
		lblRecommendaton.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblRecommendaton.setBounds(15, 114, 224, 28);
		this.add(lblRecommendaton);
		
		JLabel lblMenus = new JLabel("MENUS");
		lblMenus.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblMenus.setBounds(395, 114, 81, 28);
		this.add(lblMenus);
		
		mealOfDayPanel = new JPanel();
		mealOfDayPanel.setBackground(new Color(173, 216, 230));
		mealOfDayPanel.setBounds(625, 200, 260, 251);
		this.add(mealOfDayPanel);
		mealOfDayPanel.setLayout(null);
		
		JLabel label_10 = new JLabel("MEAL OF THE DAY");
		label_10.setFont(new Font("Microsoft YaHei", Font.ITALIC, 18));
		label_10.setBounds(43, 16, 174, 24);
		mealOfDayPanel.add(label_10);
		
		label_11 = new JLabel("");
		label_11.setBounds(89, 56, 81, 84);
		label_11.setIcon(new ImageIcon(mealOftheday.getPhoto().getImage().getScaledInstance(label_11.getWidth(), label_11.getHeight(), Image.SCALE_DEFAULT)));
		mealOfDayPanel.add(label_11);
		
		button_4 = new JButton(mealOftheday.getName());
		button_4.setBounds(66, 147, 128, 29);
		mealOfDayPanel.add(button_4);
		button_4.addActionListener(this);
		
		lblDiscountedPrice = new JLabel("Discounted price: "+ mealOftheday.getPrice()+"TL");
		lblDiscountedPrice.setForeground(new Color(51, 153, 0));
		lblDiscountedPrice.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		lblDiscountedPrice.setBounds(15, 215, 245, 24);
		mealOfDayPanel.add(lblDiscountedPrice);
		
		lblOldPrice = new JLabel("Old price: "+ (mealOftheday.getPrice()+5)+"TL");
		lblOldPrice.setForeground(new Color(128, 0, 0));
		lblOldPrice.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		lblOldPrice.setBounds(35, 185, 190, 24);
		mealOfDayPanel.add(lblOldPrice);
		
		label_1 = new JLabel("");
		label_1.setBounds(81, 158, 81, 84);
		label_1.setIcon(new ImageIcon(random1.getPhoto().getImage().getScaledInstance(label_1.getWidth(), label_1.getHeight(), Image.SCALE_DEFAULT)));
		this.add(label_1);
		
		btnNewButton = new JButton(random1.getName());
		btnNewButton.setBounds(59, 249, 128, 29);
		this.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("cheese-burger (2).png")));
		label_2.setBounds(330, 158, 72, 75);
		this.add(label_2);
		
		btnBurgers = new JButton("BURGERS");
		btnBurgers.setBounds(304, 249, 115, 29);
		this.add(btnBurgers);
		btnBurgers.addActionListener(this);
		
		label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("pizza.png")));
		label_3.setBounds(330, 294, 72, 75);
		this.add(label_3);
		
		btnPzzas = new JButton("PIZZAS");
		btnPzzas.setBounds(304, 385, 115, 29);
		this.add(btnPzzas);
		btnPzzas.addActionListener(this);

		
		label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("salad.png")));
		label_4.setBounds(330, 424, 72, 75);
		this.add(label_4);
		
		btnSalads = new JButton("SALADS");
		btnSalads.setBounds(304, 515, 115, 29);
		this.add(btnSalads);
		btnSalads.addActionListener(this);

		
		label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("spaguetti.png")));
		label_5.setBounds(478, 158, 72, 75);
		this.add(label_5);

		
		btnPastas = new JButton("PASTAS");
		btnPastas.setBounds(459, 249, 115, 29);
		this.add(btnPastas);
		btnPastas.addActionListener(this);

		
		label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("recipe-soup-icon (1).png")));
		label_6.setBounds(469, 294, 96, 75);
		this.add(label_6);
		
		btnSoups = new JButton("SOUPS");
		btnSoups.setBounds(459, 385, 115, 29);
		this.add(btnSoups);
		btnSoups.addActionListener(this);
		
		btnWraps = new JButton("WRAPS");
		btnWraps.setBounds(459, 515, 115, 29);
		this.add(btnWraps);
		btnWraps.addActionListener(this);

		
		label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("recipe-wrap-icon (1).png")));
		label_7.setBounds(469, 432, 96, 67);
		this.add(label_7);
		
		label_8 = new JLabel("");
		label_8.setBounds(81, 294, 81, 84);
		label_8.setIcon(new ImageIcon(random2.getPhoto().getImage().getScaledInstance(label_8.getWidth(), label_8.getHeight(), Image.SCALE_DEFAULT)));
		this.add(label_8);
		
		button_2 = new JButton(random2.getName());
		button_2.setBounds(59, 385, 128, 29);
		this.add(button_2);
		button_2.addActionListener(this);

		label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(random3.getPhoto().getImage().getScaledInstance(label_8.getWidth(), label_8.getHeight(), Image.SCALE_DEFAULT)));
		label_9.setBounds(81, 424, 81, 84);
		this.add(label_9);
		
		button_3 = new JButton(random3.getName());
		button_3.setBounds(59, 515, 128, 29);
		this.add(button_3);
		button_3.addActionListener(this);
		
		userNameLabel = new JLabel("username");
		userNameLabel.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		userNameLabel.setBounds(118, 37, 229, 41);
		add(userNameLabel);
		
		lblTokens = new JLabel("Tokens:");
		lblTokens.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblTokens.setBounds(362, 37, 201, 41);
		add(lblTokens);
	}

	public void setUserName(String str){
		userNameLabel.setText(str);
	}
	public void setTokens(int tokens){
		token = tokens;
		lblTokens.setText("Tokens: " + token);
	}
	public int getTokens(){
		return token;
	}
	public void addTokens(int tokens){
		token = token + tokens;
	}
	public void setTokenslbl(){
		lblTokens.setText("Tokens: "+ token);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cartButton) {
			gui.frame.remove(gui.mainPage);
        	gui.frame.add(gui.reviewPage);
        	gui.reviewPage.setVisible(true);
        	gui.frame.repaint();
        	gui.frame.revalidate();
			//reviewPage.setFoods
		}
		if (e.getSource() == optionsButton) {
			gui.frame.remove(gui.mainPage);
        	gui.frame.add(gui.categoriesPage);
        	gui.categoriesPage.setVisible(true);
        	gui.frame.repaint();
        	gui.frame.revalidate();
		}
		if (e.getSource() == btnBurgers) {
			gui.frame.remove(gui.mainPage);
        	gui.frame.add(gui.burgerMenuPage);
        	gui.burgerMenuPage.setVisible(true);
        	gui.frame.repaint();
        	gui.frame.revalidate();
		}
		if (e.getSource() == btnPastas) {
			gui.frame.remove(gui.mainPage);
        	gui.frame.add(gui.pastaMenuPage);
        	gui.pastaMenuPage.setVisible(true);
        	gui.frame.repaint();
        	gui.frame.revalidate();
		}
		if (e.getSource() == btnPzzas) {
			gui.frame.remove(gui.mainPage);
        	gui.frame.add(gui.pizzaMenuPage);
        	gui.pizzaMenuPage.setVisible(true);
        	gui.frame.repaint();
        	gui.frame.revalidate();
		}
		if (e.getSource() == btnSalads) {
			gui.frame.remove(gui.mainPage);
        	gui.frame.add(gui.saladMenuPage);
        	gui.saladMenuPage.setVisible(true);
        	gui.frame.repaint();
        	gui.frame.revalidate();
		}
		if (e.getSource() == btnSoups) {
			gui.frame.remove(gui.mainPage);
        	gui.frame.add(gui.soupMenuPage);
        	gui.soupMenuPage.setVisible(true);
        	gui.frame.repaint();
        	gui.frame.revalidate();
		}
		if (e.getSource() == btnWraps) {
			gui.frame.remove(gui.mainPage);
        	gui.frame.add(gui.wrapMenuPage);
        	gui.wrapMenuPage.setVisible(true);
        	gui.frame.repaint();
        	gui.frame.revalidate();
		}
		if(e.getSource() == btnNewButton){
			gui.frame.remove(gui.mainPage);
        	gui.frame.add(gui.dishDetailsPage);
        	gui.dishDetailsPage.setVisible(true);
        	gui.frame.repaint();
        	gui.frame.revalidate();
			dishDetails.setFood(random1);
			dishDetails.setrefer(this);

		}
		if(e.getSource() == button_2){
			gui.frame.remove(gui.mainPage);
        	gui.frame.add(gui.dishDetailsPage);
        	gui.dishDetailsPage.setVisible(true);
        	gui.frame.repaint();
        	gui.frame.revalidate();
			dishDetails.setFood(random2);
			dishDetails.setrefer(this);

		}
		if(e.getSource() == button_3){
			gui.frame.remove(gui.mainPage);
        	gui.frame.add(gui.dishDetailsPage);
        	gui.dishDetailsPage.setVisible(true);
        	gui.frame.repaint();
        	gui.frame.revalidate();
			dishDetails.setFood(random3);
			dishDetails.setrefer(this);
		}
		if(e.getSource() == button_4){
			gui.frame.remove(gui.mainPage);
        	gui.frame.add(gui.dishDetailsPage);
        	gui.dishDetailsPage.setVisible(true);
        	gui.frame.repaint();
        	gui.frame.revalidate();
			dishDetails.setFood(mealOftheday);
			dishDetails.setrefer(this);
		}

	}
}
