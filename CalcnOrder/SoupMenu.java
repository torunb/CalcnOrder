import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;


public class SoupMenu extends JPanel implements ActionListener
{
    
    // public static void main( String[] args)
    // {
    //     SoupMenu soup = new SoupMenu();
    //     soup.setVisible(true);
    // }
    

    // properties
    private JLabel lblAnaliKizliSoup, label2, label3, label4, label5, label6, label7;
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
    private JButton lentilDetails;
    private JLabel vgnBrgrLbl;
    private JButton boullionDetails;
    private JLabel veggieBurgrLbl;
    private JButton beanDetails;
    private JLabel cheeseburgerLbl;
    private JButton fishDetails;
    private JButton tomatoDetails;
    private JButton turkeyDetails;
    private JButton analiKizliDetails;
    private JLabel stuffedLbl;
    private JLabel chickenLbl;
    private JLabel baconLbl;
    private AppMain gui;
    private JButton backButton;
    private DishDetails dishDetails;
    private Restaurant restaurant;
    
    
    
    // constructor
    public SoupMenu(AppMain g, DishDetails dd, Restaurant res)
    {
        gui = g;
        dishDetails = dd;
        restaurant = res;
        res.addCategory("Soups");
        restaurant.addFood("meatballs(chickpea, beef, bulghur), yogurt, onion", "Anali Kizli Soup", new ImageIcon("foods\\analisoup.jpg"), 420, 10, 29, 60, true, true, true, false,false, true, true,true, true, "Soups", 3.5);
        restaurant.addFood("garlic, salmon, red onion, carrot", "Fish Soup", new ImageIcon("foods\\fishsoup.jpeg"), 410, 10, 36, 72, true, true, false, false,false, true, true, true, false, "Soups", 3.6);
        restaurant.addFood("lentil, onion, carrot", "Lentil Soup", new ImageIcon("foods\\lentilsoup.jpg"), 380, 10, 30, 62, true, true, false, true,true, true, true,true, false, "Soups",3.7);
        restaurant.addFood("tomato, heavy cream, tomato paste", "Tomato Soup", new ImageIcon("foods\\tomatosoup.jpg"), 360, 10, 40, 82, true, true, true, true,false, true, true,true, false, "Soups", 3.2);
        restaurant.addFood("turkey, rice, onion, carrot", "Turkey Soup", new ImageIcon("foods\\turkeysoup.jpeg"), 410, 10, 25, 51, true, true, false, false,false, true, true,true, true, "Soups", 4.0);
        restaurant.addFood("dried navy beans, meat, onions, carrots", "Bean Soup", new ImageIcon("foods\\beansoup.jpg"), 340, 10, 24, 49, true, true, false, false,false, true, true,true, true, "Soups", 4.5);
        restaurant.addFood("beef bouillon, tomatoes, garlic, celery, onion", "Boullion Soup", new ImageIcon("foods\\boullionsoup.jpg"), 380, 10, 27, 56, true, true, false, false,false, true, true,true, true, "Soups", 4.3);


        setBounds(100,100,900,600);
        this.setBackground(new Color(255, 204, 153));
        this.setLayout(null);
        
        logo = new ImageIcon("output-onlinepngtools.png");
        
        title = new JLabel("Soup Menu");
        
        lblAnaliKizliSoup = new JLabel("Anali Kizli Soup");
        lblAnaliKizliSoup.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        lblAnaliKizliSoup.setBounds(652, 453, 185, 24);
        
        label2 = new JLabel("Bean Soup");
        label2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label2.setBounds(460, 223, 108, 24);
        
        label3 = new JLabel("Boullion Soup");
        label3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label3.setBounds(242, 223, 122, 24);
        
        label4 = new JLabel("Fish Soup");
        label4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label4.setBounds(51, 453, 102, 24);
        
        label5 = new JLabel("Lentil Soup");
        label5.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label5.setBounds(47, 223, 122, 24);
        
        label6 = new JLabel("Tomato Soup");
        label6.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label6.setBounds(242, 453, 145, 24);
        
        label7 = new JLabel("Turkey Soup");
        label7.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label7.setBounds(453, 453, 128, 24);
            
        
        this.add(lblAnaliKizliSoup);
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
        
        JLabel lblBurgers = new JLabel("SOUPS");
        lblBurgers.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
        lblBurgers.setBounds(393, 16, 108, 51);
        this.add(lblBurgers);
        
        backButton = new JButton("");
        backButton.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("back.png")));
        backButton.setBounds(15, 16, 73, 57);
        this.add(backButton);
        backButton.addActionListener(this);
        
        hamburgerPrice = new JLabel("15.90 \u20BA");
        hamburgerPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        hamburgerPrice.setBounds(67, 247, 69, 20);
        this.add(hamburgerPrice);
        
        cheeseburgerPrice = new JLabel("17.90 \u20BA");
        cheeseburgerPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        cheeseburgerPrice.setBounds(67, 476, 69, 20);
        this.add(cheeseburgerPrice);
        
        veggiePrice = new JLabel("15.00 \u20BA");
        veggiePrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        veggiePrice.setBounds(472, 247, 69, 20);
        this.add(veggiePrice);
        
        stuffedPrice = new JLabel("14.90 \u20BA");
        stuffedPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        stuffedPrice.setBounds(273, 476, 69, 20);
        this.add(stuffedPrice);
        
        veganPrice = new JLabel("16.90 \u20BA");
        veganPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        veganPrice.setBounds(273, 247, 69, 20);
        this.add(veganPrice);
        
        baconPrice = new JLabel("18.90 \u20BA");
        baconPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        baconPrice.setBounds(689, 476, 69, 20);
        this.add(baconPrice);
        
        chickenPrice = new JLabel("13.90 \u20BA");
        chickenPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        chickenPrice.setBounds(472, 476, 69, 20);
        this.add(chickenPrice);
        
        cheeseburgerLbl = new JLabel("");
        cheeseburgerLbl.setBounds(53, 347, 86, 90);
        cheeseburgerLbl.setIcon(new ImageIcon(new ImageIcon("foods\\fishsoup.jpeg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        this.add(cheeseburgerLbl);

        hambugerLbl = new JLabel("");
        hambugerLbl.setIcon(new ImageIcon(new ImageIcon("foods\\lentilsoup.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        hambugerLbl.setBounds(53, 117, 86, 90);
        this.add(hambugerLbl);
        
        lentilDetails = new JButton("Dish Details");
        lentilDetails.setBackground(new Color(224, 255, 255));
        lentilDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lentilDetails.setBounds(38, 275, 115, 29);
        this.add(lentilDetails);
        lentilDetails.addActionListener(this);
        
        vgnBrgrLbl = new JLabel("");
        vgnBrgrLbl.setIcon(new ImageIcon(new ImageIcon("foods\\boullionsoup.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        vgnBrgrLbl.setBounds(259, 117, 86, 90);
        this.add(vgnBrgrLbl);
        
        boullionDetails = new JButton("Dish Details");
        boullionDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        boullionDetails.setBackground(new Color(224, 255, 255));
        boullionDetails.setBounds(242, 275, 115, 29);
        this.add(boullionDetails);
        boullionDetails.addActionListener(this);
        
        veggieBurgrLbl = new JLabel("");
        veggieBurgrLbl.setIcon(new ImageIcon(new ImageIcon("foods\\beansoup.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        veggieBurgrLbl.setBounds(460, 117, 86, 90);
        this.add(veggieBurgrLbl);
        
        beanDetails = new JButton("Dish Details");
        beanDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        beanDetails.setBackground(new Color(224, 255, 255));
        beanDetails.setBounds(453, 275, 115, 29);
        this.add(beanDetails);
        beanDetails.addActionListener(this);
                
        fishDetails = new JButton("Dish Details");
        fishDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        fishDetails.setBackground(new Color(224, 255, 255));
        fishDetails.setBounds(44, 507, 115, 29);
        this.add(fishDetails);
        fishDetails.addActionListener(this);
        
        tomatoDetails = new JButton("Dish Details");
        tomatoDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        tomatoDetails.setBackground(new Color(224, 255, 255));
        tomatoDetails.setBounds(242, 507, 115, 29);
        this.add(tomatoDetails);
        tomatoDetails.addActionListener(this);
        
        turkeyDetails = new JButton("Dish Details");
        turkeyDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        turkeyDetails.setBackground(new Color(224, 255, 255));
        turkeyDetails.setBounds(453, 507, 115, 29);
        this.add(turkeyDetails);
        turkeyDetails.addActionListener(this);
        
        analiKizliDetails = new JButton("Dish Details");
        analiKizliDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        analiKizliDetails.setBackground(new Color(224, 255, 255));
        analiKizliDetails.setBounds(658, 507, 115, 29);
        this.add(analiKizliDetails);
        analiKizliDetails.addActionListener(this);
        
        stuffedLbl = new JLabel("");
        stuffedLbl.setIcon(new ImageIcon(new ImageIcon("foods\\tomatosoup.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        stuffedLbl.setBounds(259, 347, 86, 90);
        this.add(stuffedLbl);
        
        chickenLbl = new JLabel("");
        chickenLbl.setIcon(new ImageIcon(new ImageIcon("foods\\turkeysoup.jpeg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        chickenLbl.setBounds(460, 347, 86, 90);
        this.add(chickenLbl);
        
        baconLbl = new JLabel("");
        baconLbl.setIcon(new ImageIcon(new ImageIcon("foods\\analisoup.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        baconLbl.setBounds(668, 347, 86, 90);
        this.add(baconLbl);
    }
        
        @Override
        public void actionPerformed(ActionEvent e){
        	
    		if (e.getSource() == backButton) {
    			gui.frame.remove(gui.soupMenuPage);
            	gui.frame.add(gui.mainPage);
            	gui.mainPage.setVisible(true);
            	gui.frame.repaint();
            	gui.frame.revalidate();
    		}
    		if (e.getSource() == tomatoDetails) {
    			gui.frame.remove(gui.soupMenuPage);
            	gui.frame.add(gui.dishDetailsPage);
            	gui.mainPage.setVisible(true);
            	gui.frame.repaint();
            	gui.frame.revalidate();
                dishDetails.setFood(restaurant.getFood("Tomato Soup"));
                dishDetails.setrefer(gui.soupMenuPage);


    		}
    		if (e.getSource() == fishDetails) {
    			gui.frame.remove(gui.soupMenuPage);
            	gui.frame.add(gui.dishDetailsPage);
            	gui.mainPage.setVisible(true);
            	gui.frame.repaint();
            	gui.frame.revalidate();
                dishDetails.setFood(restaurant.getFood("Fish Soup"));
                dishDetails.setrefer(gui.soupMenuPage);

    		}
    		if (e.getSource() == beanDetails) {
    			gui.frame.remove(gui.soupMenuPage);
            	gui.frame.add(gui.dishDetailsPage);
            	gui.mainPage.setVisible(true);
            	gui.frame.repaint();
            	gui.frame.revalidate();
                dishDetails.setFood(restaurant.getFood("Bean Soup"));
                dishDetails.setrefer(gui.soupMenuPage);


    		}
    		if (e.getSource() == boullionDetails) {
    			gui.frame.remove(gui.soupMenuPage);
            	gui.frame.add(gui.dishDetailsPage);
            	gui.mainPage.setVisible(true);
            	gui.frame.repaint();
            	gui.frame.revalidate();
                dishDetails.setFood(restaurant.getFood("Boullion Soup"));
                dishDetails.setrefer(gui.soupMenuPage);


    		}
    		if (e.getSource() == turkeyDetails) {
    			gui.frame.remove(gui.soupMenuPage);
            	gui.frame.add(gui.dishDetailsPage);
            	gui.mainPage.setVisible(true);
            	gui.frame.repaint();
            	gui.frame.revalidate();
                dishDetails.setFood(restaurant.getFood("Turkey Soup"));
                dishDetails.setrefer(gui.soupMenuPage);


    		}
    		if (e.getSource() == analiKizliDetails) {
    			gui.frame.remove(gui.soupMenuPage);
            	gui.frame.add(gui.dishDetailsPage);
            	gui.mainPage.setVisible(true);
            	gui.frame.repaint();
            	gui.frame.revalidate();
                dishDetails.setFood(restaurant.getFood("Anali Kizli Soup"));
                dishDetails.setrefer(gui.soupMenuPage);

    		}
    		if (e.getSource() == lentilDetails) {
    			gui.frame.remove(gui.soupMenuPage);
            	gui.frame.add(gui.dishDetailsPage);
            	gui.mainPage.setVisible(true);
            	gui.frame.repaint();
            	gui.frame.revalidate();
                dishDetails.setFood(restaurant.getFood("Lentil Soup"));
                dishDetails.setrefer(gui.soupMenuPage);


    		}
    	}
       
}


