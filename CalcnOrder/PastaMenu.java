import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;


public class PastaMenu extends JPanel implements ActionListener
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
    public PastaMenu(AppMain g, DishDetails dd, Restaurant res)
    {
        gui = g;
        dishDetails = dd;
        restaurant = res;
        restaurant.addCategory("Pastas");
        restaurant.addFood("120 gr pasta, bolognese sauce", "Bolognese Pasta", new ImageIcon("foods\\bolognesepasta.jpg"), 800, 25, 20, 20, true, true, false, true,false, true, true,true, true, "Pastas",4.3);
        restaurant.addFood("120 gr pasta, 50 gr chicken", "Chicken Pasta", new ImageIcon("foods\\chickenpasta.jpg"), 680, 25, 20, 20, true, true, false, false,false, true, true,true, true, "Pastas",4.3);
        restaurant.addFood("120 gr pasta, mushroom, cream", "Creamy Mushroom Pasta", new ImageIcon("foods\\creamymushroompasta.jpg"), 840, 25, 20, 20, true, true, false, true,false, true, true,true, true, "Pastas",4.3);
        restaurant.addFood("120 gr pasta, curry sauce", "Curry Sauce Pasta", new ImageIcon("foods\\currypasta.jpg"), 700, 25, 20, 20, true, true, false, true,false, true, true,true, true, "Pastas",4.3);
        restaurant.addFood("120 gr pasta, 50 gr chicken, cream", "Fettucine Alfredo", new ImageIcon("foods\\fettucinealfredopasta.jpg"), 760, 25, 20, 20, true, true, false, true,false, true, true,true, true, "Pastas",4.3);
        restaurant.addFood("120 gr pasta, 50 gr chicken, tomato sauce", "Penne Arabiata", new ImageIcon("foods\\penearabiatapasta.jpg"), 590, 25, 20, 20, true, true, false, true,false, true, true,true, true, "Pastas",4.3);
        restaurant.addFood("120 gr pasta, chedar, mozarella, parmesan", "Cheese Pasta", new ImageIcon("foods\\cheesepasta.jpg"), 790, 25, 20, 20, true, true, false, true,false, true, true,true, true, "Pastas",4.3);

        setBounds(100,100,900,600);
        this.setBackground(new Color(255, 204, 153));
        this.setLayout(null);
        
        logo = new ImageIcon("output-onlinepngtools.png");
        
        title = new JLabel("Pasta Menu");
        
        label = new JLabel("Bolognese Pasta");
        label.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label.setBounds(716, 453, 145, 24);
        
        label2 = new JLabel("Chicken Pasta");
        label2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label2.setBounds(523, 223, 164, 24);
        
        label3 = new JLabel("Creamy Mushroom Pasta");
        label3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label3.setBounds(230, 223, 223, 24);
        
        label4 = new JLabel("Curry Sauce Pasta");
        label4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label4.setBounds(26, 453, 178, 24);
        
        label5 = new JLabel("Fettucine Alfredo");
        label5.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label5.setBounds(26, 223, 180, 24);
        
        label6 = new JLabel("Penne Arabia");
        label6.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label6.setBounds(286, 453, 145, 24);
        
        label7 = new JLabel("Cheese Pasta");
        label7.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label7.setBounds(527, 453, 174, 24);
            
        
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
        
        JLabel lblBurgers = new JLabel("PASTAS");
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
        veggiePrice.setBounds(552, 247, 69, 20);
        this.add(veggiePrice);
        
        stuffedPrice = new JLabel("29.90 \u20BA");
        stuffedPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        stuffedPrice.setBounds(309, 476, 69, 20);
        this.add(stuffedPrice);
        
        veganPrice = new JLabel("23.90 \u20BA");
        veganPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        veganPrice.setBounds(309, 247, 69, 20);
        this.add(veganPrice);
        
        baconPrice = new JLabel("39.90 \u20BA");
        baconPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        baconPrice.setBounds(751, 476, 69, 20);
        this.add(baconPrice);
        
        chickenPrice = new JLabel("26.90 \u20BA");
        chickenPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        chickenPrice.setBounds(547, 476, 69, 20);
        this.add(chickenPrice);
        
        hambugerLbl = new JLabel("");
        hambugerLbl.setBounds(53, 117, 86, 90);
        hambugerLbl.setIcon(new ImageIcon(new ImageIcon("foods\\fettucinealfredopasta.jpg").getImage().getScaledInstance(hambugerLbl.getWidth(), hambugerLbl.getHeight(), Image.SCALE_DEFAULT)));
        this.add(hambugerLbl);
        
        hamburgerDetails = new JButton("Dish Details");
        hamburgerDetails.setBackground(new Color(224, 255, 255));
        hamburgerDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        hamburgerDetails.setBounds(38, 275, 115, 29);
        hamburgerDetails.addActionListener(this);
        this.add(hamburgerDetails);
        
        vgnBrgrLbl = new JLabel("");
        vgnBrgrLbl.setBounds(300, 117, 86, 90);
        vgnBrgrLbl.setIcon(new ImageIcon(new ImageIcon("foods\\creamymushroompasta.jpg").getImage().getScaledInstance(vgnBrgrLbl.getWidth(), vgnBrgrLbl.getHeight(), Image.SCALE_DEFAULT)));
        this.add(vgnBrgrLbl);
        
        veganDetails = new JButton("Dish Details");
        veganDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        veganDetails.setBackground(new Color(224, 255, 255));
        veganDetails.setBounds(286, 275, 115, 29);
        veganDetails.addActionListener(this);
        this.add(veganDetails);
        
        veggieBurgrLbl = new JLabel("");
        veggieBurgrLbl.setBounds(541, 117, 86, 90);
        veggieBurgrLbl.setIcon(new ImageIcon(new ImageIcon("foods\\chickenpasta.jpg").getImage().getScaledInstance(veggieBurgrLbl.getWidth(), veggieBurgrLbl.getHeight(), Image.SCALE_DEFAULT)));
        this.add(veggieBurgrLbl);
        
        veggieDetails = new JButton("Dish Details");
        veggieDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        veggieDetails.setBackground(new Color(224, 255, 255));
        veggieDetails.setBounds(523, 275, 115, 29);
        veggieDetails.addActionListener(this);
        this.add(veggieDetails);
        
        cheeseburgerLbl = new JLabel("");
        cheeseburgerLbl.setBounds(53, 347, 86, 90);
        cheeseburgerLbl.setIcon(new ImageIcon(new ImageIcon("foods\\currypasta.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        this.add(cheeseburgerLbl);
        
        cheeseburgerDetails = new JButton("Dish Details");
        cheeseburgerDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        cheeseburgerDetails.setBackground(new Color(224, 255, 255));
        cheeseburgerDetails.setBounds(44, 507, 115, 29);
        cheeseburgerDetails.addActionListener(this);
        this.add(cheeseburgerDetails);
        
        stuffedDetails = new JButton("Dish Details");
        stuffedDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        stuffedDetails.setBackground(new Color(224, 255, 255));
        stuffedDetails.setBounds(286, 507, 115, 29);
        stuffedDetails.addActionListener(this);
        this.add(stuffedDetails);
        
        chickenDetails = new JButton("Dish Details");
        chickenDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        chickenDetails.setBackground(new Color(224, 255, 255));
        chickenDetails.setBounds(523, 507, 115, 29);
        chickenDetails.addActionListener(this);
        this.add(chickenDetails);
        
        baconDetails = new JButton("Dish Details");
        baconDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        baconDetails.setBackground(new Color(224, 255, 255));
        baconDetails.setBounds(726, 507, 115, 29);
        baconDetails.addActionListener(this);
        this.add(baconDetails);
        
        stuffedLbl = new JLabel("");
        stuffedLbl.setIcon(new ImageIcon(new ImageIcon("foods\\penearabiatapasta.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        stuffedLbl.setBounds(300, 347, 86, 90);
        this.add(stuffedLbl);
        
        chickenLbl = new JLabel("");
        chickenLbl.setIcon(new ImageIcon(new ImageIcon("foods\\cheesepasta.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        chickenLbl.setBounds(541, 347, 86, 90);
        this.add(chickenLbl);
        
        baconLbl = new JLabel("");
        baconLbl.setIcon(new ImageIcon(new ImageIcon("foods\\bolognesepasta.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        baconLbl.setBounds(742, 347, 86, 90);
        this.add(baconLbl);
        
        
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == hamburgerDetails)
        {
            gui.frame.remove(gui.pastaMenuPage);
            gui.frame.add(gui.dishDetailsPage);
            gui.dishDetailsPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
            dishDetails.setrefer(gui.pastaMenuPage);
            dishDetails.setFood(restaurant.getFood("Fettucine Alfredo"));
        }
        if(e.getSource() == veganDetails)
        {
            gui.frame.remove(gui.pastaMenuPage);
            gui.frame.add(gui.dishDetailsPage);
            gui.dishDetailsPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
            dishDetails.setrefer(gui.pastaMenuPage);
            dishDetails.setFood(restaurant.getFood("Creamy Mushroom Pasta"));
        }
        if(e.getSource() == veggieDetails)
        {
            gui.frame.remove(gui.pastaMenuPage);
            gui.frame.add(gui.dishDetailsPage);
            gui.dishDetailsPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
            dishDetails.setrefer(gui.pastaMenuPage);
            dishDetails.setFood(restaurant.getFood("Chicken Pasta"));
        }   
        if(e.getSource() == cheeseburgerDetails)
        {
            gui.frame.remove(gui.pastaMenuPage);
            gui.frame.add(gui.dishDetailsPage);
            gui.dishDetailsPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
            dishDetails.setrefer(gui.pastaMenuPage);
            dishDetails.setFood(restaurant.getFood("Curry Sauce Pasta"));
        } 
        if(e.getSource() == stuffedDetails)
        {
            gui.frame.remove(gui.pastaMenuPage);
            gui.frame.add(gui.dishDetailsPage);
            gui.dishDetailsPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
            dishDetails.setrefer(gui.pastaMenuPage);
            dishDetails.setFood(restaurant.getFood("Penne Arabiata"));
        }
        if(e.getSource() == chickenDetails)
        {
            gui.frame.remove(gui.pastaMenuPage);
            gui.frame.add(gui.dishDetailsPage);
            gui.dishDetailsPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
            dishDetails.setrefer(gui.pastaMenuPage);
            dishDetails.setFood(restaurant.getFood("Cheese Pasta"));
        }
        if(e.getSource() == baconDetails)
        {
            gui.frame.remove(gui.pastaMenuPage);
            gui.frame.add(gui.dishDetailsPage);
            gui.dishDetailsPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
            dishDetails.setrefer(gui.pastaMenuPage);
            dishDetails.setFood(restaurant.getFood("Bolognese Pasta"));
        }
        if (e.getSource() == backButton) {
            gui.frame.remove(gui.pastaMenuPage);
            gui.frame.add(gui.mainPage);
            gui.mainPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
        }
    }
}