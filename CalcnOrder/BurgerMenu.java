
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BurgerMenu extends JPanel implements ActionListener 
{
   

    // properties
    private JLabel label, label2, label3, label4, label5, label6, label7;
    //private JLabel price, price2, price3, price4, price5, price6, price7;
    private JLabel title;
    //private JPanel topPane;
    //private JPanel middlePane;
    //private JPanel bottomPane;
    //private Image image, image2, image3, image4, image5, image6, image7;
    private ImageIcon logo;
    private JLabel hamburgerPrice;
    private JLabel cheeseburgerPrice;
    private JLabel veggiePrice;
    private JLabel stuffedPrice;
    private JLabel veganPrice;
    private JLabel baconPrice;
    private JLabel chickenPrice;
    private JLabel hambugerLbl;
    private JButton hamburgerDetails;
    private JLabel vgnBrgrLbl;
    private JButton veganDetails;
    private JLabel veggieBurgrLbl;
    private JButton veggieDetails;
    private JLabel cheeseburgerLbl;
    private JButton cheeseburgerDetails;
    private JButton stuffedDetails;
    private JButton chickenDetails;
    private JButton baconDetails;
    private JLabel stuffedLbl;
    private JLabel chickenLbl;
    private JLabel baconLbl;;
    private AppMain gui;
    private JButton backButton;
    private DishDetails dishDetails;
    private Restaurant restaurant;
    
    
    
    // constructor
    public BurgerMenu(AppMain g, DishDetails dd, Restaurant res)
    {
        gui = g;
        dishDetails = dd;
        restaurant = res;
        setBounds(100,100,900,600);
        this.setBackground(new Color(255, 204, 153));
        this.setLayout(null);
        restaurant.addCategory("Burgers");
        restaurant.addFood("120 gr ham, tomato", "Hamburger", new ImageIcon("foods\\Hamburger.jpg"), 540, 25, 20, 20, true, true, false, false,false, true, true,true, true, "Burgers", 3.4);
        restaurant.addFood("120 gr ham, cheddar, tomato", "Cheeseburger", new ImageIcon("foods\\cheeseburger.png"), 640, 25, 20, 20, true, true, false, false, false,true, true,true, true, "Burgers",4.3); 
        restaurant.addFood("120 gr vegan ham, tomato", "Vegetarian Burger", new ImageIcon("foods\\vegetarianburger.jpg"), 400, 25, 20, 20, true, true, false, true, false,true, true,true, true, "Burgers",4.3); 
        restaurant.addFood("120 gr vegan ham, tomato", "Vegan Burger", new ImageIcon("foods\\veganburger.jpg"), 400, 25, 20, 20, true, true, false, true, true,true, true,true, true, "Burgers",3.1); 
        restaurant.addFood("120 gr ham, bacon, tomato", "Bacon Burger", new ImageIcon("foods\\baconburger.jpg"), 615, 25, 20, 20, true, true, false, false, false,true, true,true, true, "Burgers",4.2); 
        restaurant.addFood("120 gr chicken, cheddar, tomato", "Chicken Burger", new ImageIcon("foods\\chickenburger.jpg"), 375, 25, 20, 20, true, true, false, false, false,true, true,true, true, "Burgers",4.5); 
        restaurant.addFood("220 gr ham, cheddar, bacon, tomato", "Stuffed Burger", new ImageIcon("foods\\stuffedburger.jpg"), 615, 25, 20, 20, true, true, false, false, false,true, true,true, true, "Burgers",4.6); 
        logo = new ImageIcon("output-onlinepngtools.png");


        
        title = new JLabel("Burger Menu");
        
        label = new JLabel("Bacon Burger");
        label.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label.setBounds(675, 453, 139, 24);
        label2 = new JLabel("Vegetarian Burger");
        label2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label2.setBounds(429, 223, 164, 24);
        label3 = new JLabel("Vegan Burger");
        label3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label3.setBounds(242, 223, 122, 24);
        label4 = new JLabel("Cheeseburger");
        label4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label4.setBounds(37, 453, 132, 24);
        label5 = new JLabel("Hamburger");
        label5.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label5.setBounds(47, 223, 122, 24);
        label6 = new JLabel("Stuffed Burger");
        label6.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label6.setBounds(242, 453, 145, 24);
        label7 = new JLabel("Chicken Burger");
        label7.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label7.setBounds(442, 453, 174, 24);
            
        
        this.add(label);
        this.add(label2);
        this.add(label3);
        this.add(label4);
        this.add(label5);
        this.add(label6);
        this.add(label7);
        
        JLabel label_1 = new JLabel("");
        label_1.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("output-onlinepngtools-small.png")));
        label_1.setBounds(694, 16, 185, 176);
        this.add(label_1);
        
        JLabel lblBurgers = new JLabel("BURGERS");
        lblBurgers.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
        lblBurgers.setBounds(393, 16, 108, 51);
        this.add(lblBurgers);
        
        backButton = new JButton("");
        backButton.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("back.png")));
        backButton.setBounds(15, 16, 73, 57);
        this.add(backButton);
        backButton.addActionListener(this);
        
        hamburgerPrice = new JLabel("28.90 \u20BA");
        hamburgerPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        hamburgerPrice.setBounds(67, 247, 69, 20);
        this.add(hamburgerPrice);
        
        cheeseburgerPrice = new JLabel("35.90 \u20BA");
        cheeseburgerPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        cheeseburgerPrice.setBounds(67, 476, 69, 20);
        this.add(cheeseburgerPrice);
        
        veggiePrice = new JLabel("25.00 \u20BA");
        veggiePrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        veggiePrice.setBounds(472, 247, 69, 20);
        this.add(veggiePrice);
        
        stuffedPrice = new JLabel("29.90 \u20BA");
        stuffedPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        stuffedPrice.setBounds(273, 476, 69, 20);
        this.add(stuffedPrice);
        
        veganPrice = new JLabel("23.90 \u20BA");
        veganPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        veganPrice.setBounds(273, 247, 69, 20);
        this.add(veganPrice);
        
        baconPrice = new JLabel("39.90 \u20BA");
        baconPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        baconPrice.setBounds(704, 472, 69, 20);
        this.add(baconPrice);
        
        chickenPrice = new JLabel("26.90 \u20BA");
        chickenPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        chickenPrice.setBounds(472, 476, 69, 20);
        this.add(chickenPrice);
        
        hambugerLbl = new JLabel("");
        hambugerLbl.setBounds(53, 117, 86, 90);
        hambugerLbl.setIcon(new ImageIcon(new ImageIcon("foods\\Hamburger.jpg").getImage().getScaledInstance(hambugerLbl.getWidth(), hambugerLbl.getHeight(), Image.SCALE_DEFAULT)));
        this.add(hambugerLbl);

        
        hamburgerDetails = new JButton("Dish Details");
        hamburgerDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        hamburgerDetails.setBounds(38, 275, 115, 29);
        hamburgerDetails.addActionListener(this);
        this.add(hamburgerDetails);
        
        vgnBrgrLbl = new JLabel("");
        vgnBrgrLbl.setBounds(259, 117, 86, 90);
        vgnBrgrLbl.setIcon(new ImageIcon(new ImageIcon("foods\\veganburger.jpg").getImage().getScaledInstance(vgnBrgrLbl.getWidth(), vgnBrgrLbl.getHeight(), Image.SCALE_DEFAULT)));
        this.add(vgnBrgrLbl);
        
        veganDetails = new JButton("Dish Details");
        veganDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        veganDetails.setBounds(242, 275, 115, 29);
        veganDetails.addActionListener(this);
        this.add(veganDetails);
        
        veggieBurgrLbl = new JLabel("");
        veggieBurgrLbl.setBounds(472, 117, 86, 90);
        veggieBurgrLbl.setIcon(new ImageIcon(new ImageIcon("foods\\vegetarianburger.jpg").getImage().getScaledInstance(veggieBurgrLbl.getWidth(), veggieBurgrLbl.getHeight(), Image.SCALE_DEFAULT)));

        this.add(veggieBurgrLbl);
        
        veggieDetails = new JButton("Dish Details");
        veggieDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        veggieDetails.setBounds(453, 275, 115, 29);
        veggieDetails.addActionListener(this);
        this.add(veggieDetails);
        
        cheeseburgerLbl = new JLabel("");
        cheeseburgerLbl.setBounds(53, 347, 86, 90);
        cheeseburgerLbl.setIcon(new ImageIcon(new ImageIcon("foods\\cheeseburger.png").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        this.add(cheeseburgerLbl);
        
        cheeseburgerDetails = new JButton("Dish Details");
        cheeseburgerDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        cheeseburgerDetails.setBounds(44, 507, 115, 29);
        cheeseburgerDetails.addActionListener(this);
        this.add(cheeseburgerDetails);
        
        stuffedDetails = new JButton("Dish Details");
        stuffedDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        stuffedDetails.setBounds(242, 507, 115, 29);
        stuffedDetails.addActionListener(this);
        this.add(stuffedDetails);
        
        chickenDetails = new JButton("Dish Details");
        chickenDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        chickenDetails.setBounds(453, 507, 115, 29);
        chickenDetails.addActionListener(this);
        this.add(chickenDetails);
        
        baconDetails = new JButton("Dish Details");
        baconDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        baconDetails.setBounds(675, 507, 115, 29);
        baconDetails.addActionListener(this);
        this.add(baconDetails);
        
        stuffedLbl = new JLabel("");
        stuffedLbl.setBounds(259, 347, 86, 90);
        stuffedLbl.setIcon(new ImageIcon(new ImageIcon("foods\\stuffedburger.jpg").getImage().getScaledInstance(stuffedLbl.getWidth(), stuffedLbl.getHeight(), Image.SCALE_DEFAULT)));
        this.add(stuffedLbl);
        
        chickenLbl = new JLabel("");
        chickenLbl.setBounds(472, 347, 86, 90);
        chickenLbl.setIcon(new ImageIcon(new ImageIcon("foods\\chickenburger.jpg").getImage().getScaledInstance(chickenLbl.getWidth(), chickenLbl.getHeight(), Image.SCALE_DEFAULT)));
        this.add(chickenLbl);
        
        baconLbl = new JLabel("");
        baconLbl.setBounds(687, 347, 86, 90);
        baconLbl.setIcon(new ImageIcon(new ImageIcon("foods\\baconburger.jpg").getImage().getScaledInstance(baconLbl.getWidth(), baconLbl.getHeight(), Image.SCALE_DEFAULT)));
        this.add(baconLbl);
    }
        @Override
        public void actionPerformed(ActionEvent e) {
    		if (e.getSource() == backButton) {
    			gui.frame.remove(gui.burgerMenuPage);
            	gui.frame.add(gui.mainPage);
            	gui.mainPage.setVisible(true);
            	gui.frame.repaint();
            	gui.frame.revalidate();
    		}
    		if (e.getSource() == baconDetails) {
    			gui.frame.remove(gui.burgerMenuPage);
            	gui.frame.add(gui.dishDetailsPage);
            	gui.mainPage.setVisible(true);
            	gui.frame.repaint();
            	gui.frame.revalidate();
                dishDetails.setrefer(gui.burgerMenuPage);
                dishDetails.setFood(restaurant.getFood("Bacon Burger"));


    		}
    		if (e.getSource() == hamburgerDetails) {
    			gui.frame.remove(gui.burgerMenuPage);
            	gui.frame.add(gui.dishDetailsPage);
            	gui.mainPage.setVisible(true);
            	gui.frame.repaint();
            	gui.frame.revalidate();
                dishDetails.setrefer(gui.burgerMenuPage);
                dishDetails.setFood(restaurant.getFood("Hamburger"));

    		}
    		if (e.getSource() == veganDetails) {
    			gui.frame.remove(gui.burgerMenuPage);
            	gui.frame.add(gui.dishDetailsPage);
            	gui.mainPage.setVisible(true);
            	gui.frame.repaint();
            	gui.frame.revalidate();
                dishDetails.setrefer(gui.burgerMenuPage);
                dishDetails.setFood(restaurant.getFood("Vegan Burger"));


    		}
    		if (e.getSource() == veggieDetails) {
    			gui.frame.remove(gui.burgerMenuPage);
            	gui.frame.add(gui.dishDetailsPage);
            	gui.mainPage.setVisible(true);
            	gui.frame.repaint();
            	gui.frame.revalidate();
                dishDetails.setrefer(gui.burgerMenuPage);
                dishDetails.setFood(restaurant.getFood("Vegetarian Burger"));
    		}
    		if (e.getSource() == cheeseburgerDetails) {
    			gui.frame.remove(gui.burgerMenuPage);
            	gui.frame.add(gui.dishDetailsPage);
            	gui.mainPage.setVisible(true);
            	gui.frame.repaint();
            	gui.frame.revalidate();
                dishDetails.setrefer(gui.burgerMenuPage);
                dishDetails.setFood(restaurant.getFood("Cheeseburger"));


    		}
    		if (e.getSource() == stuffedDetails) {
    			gui.frame.remove(gui.burgerMenuPage);
            	gui.frame.add(gui.dishDetailsPage);
            	gui.mainPage.setVisible(true);
            	gui.frame.repaint();
            	gui.frame.revalidate();
                dishDetails.setrefer(gui.burgerMenuPage);
                dishDetails.setFood(restaurant.getFood("Stuffed Burger"));
    		}
    		if (e.getSource() == chickenDetails) {
    			gui.frame.remove(gui.burgerMenuPage);
            	gui.frame.add(gui.dishDetailsPage);
            	gui.mainPage.setVisible(true);
            	gui.frame.repaint();
            	gui.frame.revalidate();
                dishDetails.setrefer(gui.burgerMenuPage);
                dishDetails.setFood(restaurant.getFood("Chicken Burger"));
    		}
        
        
    }
}
