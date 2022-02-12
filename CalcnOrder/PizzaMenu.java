import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;


public class PizzaMenu extends JPanel implements ActionListener
{
        

    // properties
    private JLabel label, label2, label3, label4, label5, label6, label7;
    private JLabel price, price2, price3, price4, price5, price6, price7;
    private JLabel title;
    private JPanel topPane;
    private JPanel middlePane;
    private JPanel bottomPane;
    private Image image, image2, image3, image4, image5, image6, image7;
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
    private JLabel baconLbl;
    private AppMain gui;
    private JButton backButton;
    private DishDetails dishDetails;
    private Restaurant restaurant;
    
    
    
    // constructor
    public PizzaMenu(AppMain g, DishDetails dd, Restaurant res)
    {
        gui = g;
        dishDetails = dd;
        restaurant = res;
        res.addCategory("Pizzas");
        restaurant.addFood("360 gr dough, pizza sauce, mozzerella, mushrooms, olive", "Vegetarian Pizza", new ImageIcon("foods\\vegetarianpizza.jpg"), 960, 10, 29, 60, true, true, true, true,false, true, true,true, false, "Pizzas", 3.4);
        restaurant.addFood("360 gr dough, red bell peppers, cherry tomatoes, mushrooms ", "Vegan Pizza", new ImageIcon("foods\\veganpizza.jpg"), 840, 10, 36, 72, true, true, false, true,true, true, true, true, false, "Pizzas",3.5);
        restaurant.addFood("360 gr dough, pizza sauce, mozzerella, basil pesto ", "Italian Pizza", new ImageIcon("foods\\italianpizza.jpg"), 988, 10, 30, 62, true, true, true, false,false, true, true,true, true, "Pizzas",3.6);
        restaurant.addFood("360 gr dough, pizza sauce, mozzerella, cheddar, parmesan,", "Cheese Pizza", new ImageIcon("foods\\cheesepizza.jpg"), 1088, 10, 40, 82, true, true, true, false,false, true, true,true, true, "Pizzas",3.7);
        restaurant.addFood("450 gr dough, pizza sauce, ground beef, sausage, mozzerella ", "Chicago Pizza", new ImageIcon("foods\\chicagopizza.jpg"), 1200, 10, 25, 51, true, true, true, false,false, true, true,true, true, "Pizzas",3.6);
        restaurant.addFood("360 gr dough, pizza sauce, pastrami, mozzerella ", "Turkish Pizza", new ImageIcon("foods\\turkishpizza.jpg"), 1120, 10, 24, 49, true, true, true, false,false, true, true,true, true, "Pizzas",3.2);
        restaurant.addFood("360 gr dough, pizza sauce, sausage, mushrooms, sweetcorn, mozzerella", "Mixed Pizza", new ImageIcon("foods\\mixedpizza.jpg"), 1100, 10, 27, 56, true, true, true, false,false, true, true,true, true, "Pizzas",3.6);


        setBounds(100,100,900,600);
        this.setBackground(new Color(255, 204, 153));
        this.setLayout(null);
        
        logo = new ImageIcon("output-onlinepngtools.png");
        
        title = new JLabel("Pizza Menu");
        
        label = new JLabel("Cheese Pizza");
        label.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label.setBounds(709, 453, 139, 24);
        
        label2 = new JLabel("Chicago Pizza");
        label2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label2.setBounds(488, 223, 164, 24);
        
        label3 = new JLabel("Turkish Pizza");
        label3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label3.setBounds(282, 223, 122, 24);
        
        label4 = new JLabel("Vegan Pizza");
        label4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label4.setBounds(54, 453, 132, 24);
        
        label5 = new JLabel("Vegetarian Pizza");
        label5.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label5.setBounds(39, 223, 158, 24);
        
        label6 = new JLabel("Italian Pizza");
        label6.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label6.setBounds(282, 453, 145, 24);
        
        label7 = new JLabel("Mixed Pizza");
        label7.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label7.setBounds(502, 453, 150, 24);
            
        
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
        
        JLabel lblBurgers = new JLabel("PIZZAS");
        lblBurgers.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
        lblBurgers.setBounds(393, 16, 108, 51);
        this.add(lblBurgers);
        
        backButton = new JButton("");
        backButton.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("back.png")));
        backButton.setBounds(15, 16, 73, 57);
        backButton.addActionListener(this);
        this.add(backButton);
        
        hamburgerPrice = new JLabel("28.90 \u20BA");
        hamburgerPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        hamburgerPrice.setBounds(82, 247, 69, 20);
        this.add(hamburgerPrice);
        
        cheeseburgerPrice = new JLabel("35.90 \u20BA");
        cheeseburgerPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        cheeseburgerPrice.setBounds(82, 476, 69, 20);
        this.add(cheeseburgerPrice);
        
        veggiePrice = new JLabel("25.00 \u20BA");
        veggiePrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        veggiePrice.setBounds(524, 247, 69, 20);
        this.add(veggiePrice);
        
        stuffedPrice = new JLabel("29.90 \u20BA");
        stuffedPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        stuffedPrice.setBounds(310, 476, 69, 20);
        this.add(stuffedPrice);
        
        veganPrice = new JLabel("23.90 \u20BA");
        veganPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        veganPrice.setBounds(310, 247, 69, 20);
        this.add(veganPrice);
        
        baconPrice = new JLabel("39.90 \u20BA");
        baconPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        baconPrice.setBounds(732, 476, 69, 20);
        this.add(baconPrice);
        
        chickenPrice = new JLabel("26.90 \u20BA");
        chickenPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        chickenPrice.setBounds(524, 476, 69, 20);
        this.add(chickenPrice);

        cheeseburgerLbl = new JLabel("");
        cheeseburgerLbl.setBounds(65, 347, 86, 90);
        cheeseburgerLbl.setIcon(new ImageIcon(new ImageIcon("foods\\veganpizza.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        this.add(cheeseburgerLbl);
        
        hambugerLbl = new JLabel("");
        hambugerLbl.setBounds(65, 117, 86, 90);
        hambugerLbl.setIcon(new ImageIcon(new ImageIcon("foods\\vegetarianpizza.jpg").getImage().getScaledInstance(hambugerLbl.getWidth(), hambugerLbl.getHeight(), Image.SCALE_DEFAULT)));
        this.add(hambugerLbl);
        
        hamburgerDetails = new JButton("Dish Details");
        hamburgerDetails.setBackground(new Color(224, 255, 255));
        hamburgerDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        hamburgerDetails.setBounds(54, 275, 115, 29);
        hamburgerDetails.addActionListener(this);
        this.add(hamburgerDetails);
        
        vgnBrgrLbl = new JLabel("");
        vgnBrgrLbl.setIcon(new ImageIcon(new ImageIcon("foods\\turkishpizza.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        vgnBrgrLbl.setBounds(293, 117, 86, 90);
        this.add(vgnBrgrLbl);
        
        veganDetails = new JButton("Dish Details");
        veganDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        veganDetails.setBackground(new Color(224, 255, 255));
        veganDetails.setBounds(282, 275, 115, 29);
        veganDetails.addActionListener(this);
        this.add(veganDetails);
        
        veggieBurgrLbl = new JLabel("");
        veggieBurgrLbl.setIcon(new ImageIcon(new ImageIcon("foods\\chicagopizza.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        veggieBurgrLbl.setBounds(507, 117, 86, 90);
        this.add(veggieBurgrLbl);
        
        veggieDetails = new JButton("Dish Details");
        veggieDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        veggieDetails.setBackground(new Color(224, 255, 255));
        veggieDetails.setBounds(502, 275, 115, 29);
        veggieDetails.addActionListener(this);
        this.add(veggieDetails);
        
        
        cheeseburgerDetails = new JButton("Dish Details");
        cheeseburgerDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        cheeseburgerDetails.setBackground(new Color(224, 255, 255));
        cheeseburgerDetails.setBounds(54, 512, 115, 29);
        cheeseburgerDetails.addActionListener(this);
        this.add(cheeseburgerDetails);
        
        stuffedDetails = new JButton("Dish Details");
        stuffedDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        stuffedDetails.setBackground(new Color(224, 255, 255));
        stuffedDetails.setBounds(283, 512, 115, 29);
        stuffedDetails.addActionListener(this);
        this.add(stuffedDetails);
        
        chickenDetails = new JButton("Dish Details");
        chickenDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        chickenDetails.setBackground(new Color(224, 255, 255));
        chickenDetails.setBounds(502, 512, 115, 29);
        chickenDetails.addActionListener(this);
        this.add(chickenDetails);
        
        baconDetails = new JButton("Dish Details");
        baconDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        baconDetails.setBackground(new Color(224, 255, 255));
        baconDetails.setBounds(714, 508, 115, 29);
        baconDetails.addActionListener(this);
        this.add(baconDetails);
        
        stuffedLbl = new JLabel("");
        stuffedLbl.setIcon(new ImageIcon(new ImageIcon("foods\\italianpizza.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        stuffedLbl.setBounds(298, 347, 86, 90);
        this.add(stuffedLbl);
        
        chickenLbl = new JLabel("");
        chickenLbl.setIcon(new ImageIcon(new ImageIcon("foods\\mixedpizza.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        chickenLbl.setBounds(518, 347, 86, 90);
        this.add(chickenLbl);
        
        baconLbl = new JLabel("");
        baconLbl.setIcon(new ImageIcon(new ImageIcon("foods\\cheesepizza.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        baconLbl.setBounds(728, 347, 86, 90);
        this.add(baconLbl);
        
        
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == hamburgerDetails)
        {
            gui.frame.remove(gui.pizzaMenuPage);
            gui.frame.add(gui.dishDetailsPage);
            gui.dishDetailsPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
            dishDetails.setrefer(gui.pizzaMenuPage);
            dishDetails.setFood(restaurant.getFood("Vegetarian Pizza"));


        }
        if(e.getSource() == veganDetails)
        {
            gui.frame.remove(gui.pizzaMenuPage);
            gui.frame.add(gui.dishDetailsPage);
            gui.dishDetailsPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
            dishDetails.setrefer(gui.pizzaMenuPage);
            dishDetails.setFood(restaurant.getFood("Turkish Pizza"));


        }
        if(e.getSource() == veggieDetails)
        {
            gui.frame.remove(gui.pizzaMenuPage);
            gui.frame.add(gui.dishDetailsPage);
            gui.dishDetailsPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
            dishDetails.setrefer(gui.pizzaMenuPage);
            dishDetails.setFood(restaurant.getFood("Chicago Pizza"));


        }   
        if(e.getSource() == cheeseburgerDetails)
        {
            gui.frame.remove(gui.pizzaMenuPage);
            gui.frame.add(gui.dishDetailsPage);
            gui.dishDetailsPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
            dishDetails.setrefer(gui.pizzaMenuPage);
            dishDetails.setFood(restaurant.getFood("Vegan Pizza"));


        } 
        if(e.getSource() == stuffedDetails)
        {
            gui.frame.remove(gui.pizzaMenuPage);
            gui.frame.add(gui.dishDetailsPage);
            gui.dishDetailsPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
            dishDetails.setrefer(gui.pizzaMenuPage);
            dishDetails.setFood(restaurant.getFood("Italian Pizza"));


        }
        if(e.getSource() == chickenDetails)
        {
            gui.frame.remove(gui.pizzaMenuPage);
            gui.frame.add(gui.dishDetailsPage);
            gui.dishDetailsPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
            dishDetails.setrefer(gui.pizzaMenuPage);
            dishDetails.setFood(restaurant.getFood("Mixed Pizza"));


        }
        if(e.getSource() == baconDetails)
        {
            gui.frame.remove(gui.pizzaMenuPage);
            gui.frame.add(gui.dishDetailsPage);
            gui.dishDetailsPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
            dishDetails.setrefer(gui.pizzaMenuPage);
            dishDetails.setFood(restaurant.getFood("Cheese Pizza"));


        }
        if (e.getSource() == backButton) {
            gui.frame.remove(gui.pizzaMenuPage);
            gui.frame.add(gui.mainPage);
            gui.mainPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
        }
    }
}

