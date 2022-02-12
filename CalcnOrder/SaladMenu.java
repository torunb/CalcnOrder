import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;


public class SaladMenu extends JPanel implements ActionListener
{
    
    // public static void main( String[] args)
    // {
    //     SaladMenu salad = new SaladMenu();
    //     salad.setVisible(true);
    // }
    

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
    private Restaurant res;
    
    
    
    // constructor
    public SaladMenu(AppMain g, DishDetails dd, Restaurant res)
    {
        this.res = res;
        gui =g;
        dishDetails = dd;
        setBounds(100,100,900,600);
        this.setBackground(new Color(255, 204, 153));
        this.setLayout(null);
        
        
        res.addCategory("Salads");
        res.addFood("Lettuce, tomato, onion, peppers, parsley leaves", "American Salad", new ImageIcon("foods\\americansalad.jpg"), 250, 250, 28, 20, true, true, false, true, true, false, false, false, false, "Salads", 2.3);
        res.addFood("Ciabotta loaf, tomato, black pepper, onion, bread, oil", "Bread Salad", new ImageIcon("foods\\breadsalad.jpg"), 300, 250, 25, 20, false, false, false, true, false, true, false, true, true, "Salads", 2.9);
        res.addFood("Oil, garlic, baguette, lemon juice, parmesan cheese, eggs", "Caesar Salad", new ImageIcon("foods\\caesarsalad.jpg"), 280, 250, 29, 20, false, false, false, true, false, true, true, true, false, "Salads", 4.3);
        res.addFood("Strawberry, pineapple, blueberry, kiwi, orange", "Fruit Salad", new ImageIcon("foods\\fruitsalad.jpg"), 200, 250, 23, 20, true, true, false, true, true, false, false, false, false, "Salads", 3.0);
        res.addFood("Lettuce, cucumber, onion, tomato, garlic", "Turkish Salad", new ImageIcon("foods\\turkishsalad.jpg"), 250, 250, 26, 20, true, true, true, true, true, true, false, false, false, "Salads", 3.9);
        res.addFood("Noodle, carrot, cucumber, onion, fish sauce", "Noodle Salad", new ImageIcon("foods\\noodlesalad.jpg"), 290, 250, 36, 20, true, true, true, false, false, true, true, false, true, "Salads", 4.8);
        res.addFood("Carrot, bean, mayonnaise, peppers, mustard", "Russian Salad", new ImageIcon("foods\\russiansalad.jpg"), 250, 250, 30, 20, true, false, true, true, true, true, false, false, true, "Salads", 4.0);
        
        logo = new ImageIcon("output-onlinepngtools.png");
        
        title = new JLabel("Salad Menu");
        
        label = new JLabel("American Salad");
        label.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label.setBounds(698, 453, 139, 24);
        
        label2 = new JLabel("Bread Salad");
        label2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label2.setBounds(498, 223, 164, 24);
        
        label3 = new JLabel("Caeasar Salad");
        label3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label3.setBounds(269, 223, 122, 24);
        
        label4 = new JLabel("Fruit Salad");
        label4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label4.setBounds(51, 453, 132, 24);
        
        label5 = new JLabel("Turkish Salad");
        label5.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label5.setBounds(38, 223, 122, 24);
        
        label6 = new JLabel("Noodle Salad");
        label6.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label6.setBounds(269, 453, 145, 24);
        
        label7 = new JLabel("Russian Salad");
        label7.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label7.setBounds(498, 453, 174, 24);
            
        
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
        
        JLabel lblBurgers = new JLabel("SALADS");
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
        veggiePrice.setBounds(524, 247, 69, 20);
        this.add(veggiePrice);
        
        stuffedPrice = new JLabel("29.90 \u20BA");
        stuffedPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        stuffedPrice.setBounds(295, 476, 69, 20);
        this.add(stuffedPrice);
        
        veganPrice = new JLabel("23.90 \u20BA");
        veganPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        veganPrice.setBounds(307, 247, 69, 20);
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
        cheeseburgerLbl.setBounds(53, 347, 86, 90);
        cheeseburgerLbl.setIcon(new ImageIcon(new ImageIcon("foods\\fruitsalad.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        this.add(cheeseburgerLbl);

        hambugerLbl = new JLabel("");
        hambugerLbl.setIcon(new ImageIcon(new ImageIcon("foods\\turkishsalad.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        hambugerLbl.setBounds(53, 117, 86, 90);
        this.add(hambugerLbl);
        
        hamburgerDetails = new JButton("Dish Details");
        hamburgerDetails.setBackground(new Color(224, 255, 255));
        hamburgerDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        hamburgerDetails.setBounds(38, 275, 115, 29);
        hamburgerDetails.addActionListener(this);
        this.add(hamburgerDetails);
        
        vgnBrgrLbl = new JLabel("");
        vgnBrgrLbl.setIcon(new ImageIcon(new ImageIcon("foods\\caesarsalad.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        vgnBrgrLbl.setBounds(290, 117, 86, 90);
        this.add(vgnBrgrLbl);
        
        veganDetails = new JButton("Dish Details");
        veganDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        veganDetails.setBackground(new Color(224, 255, 255));
        veganDetails.setBounds(283, 275, 115, 29);
        veganDetails.addActionListener(this);
        this.add(veganDetails);
        
        veggieBurgrLbl = new JLabel("");
        veggieBurgrLbl.setIcon(new ImageIcon(new ImageIcon("foods\\breadsalad.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        veggieBurgrLbl.setBounds(512, 117, 86, 90);
        this.add(veggieBurgrLbl);
        
        veggieDetails = new JButton("Dish Details");
        veggieDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        veggieDetails.setBackground(new Color(224, 255, 255));
        veggieDetails.setBounds(501, 275, 115, 29);
        veggieDetails.addActionListener(this);
        this.add(veggieDetails);
                
        cheeseburgerDetails = new JButton("Dish Details");
        cheeseburgerDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        cheeseburgerDetails.setBackground(new Color(224, 255, 255));
        cheeseburgerDetails.setBounds(44, 507, 115, 29);
        cheeseburgerDetails.addActionListener(this);
        this.add(cheeseburgerDetails);
        
        stuffedDetails = new JButton("Dish Details");
        stuffedDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        stuffedDetails.setBackground(new Color(224, 255, 255));
        stuffedDetails.setBounds(283, 507, 115, 29);
        stuffedDetails.addActionListener(this);
        this.add(stuffedDetails);
        
        chickenDetails = new JButton("Dish Details");
        chickenDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        chickenDetails.setBackground(new Color(224, 255, 255));
        chickenDetails.setBounds(501, 507, 115, 29);
        chickenDetails.addActionListener(this);
        this.add(chickenDetails);
        
        baconDetails = new JButton("Dish Details");
        baconDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        baconDetails.setBackground(new Color(224, 255, 255));
        baconDetails.setBounds(711, 507, 115, 29);
        baconDetails.addActionListener(this);
        this.add(baconDetails);
        
        stuffedLbl = new JLabel("");
        stuffedLbl.setIcon(new ImageIcon(new ImageIcon("foods\\noodlesalad.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        stuffedLbl.setBounds(290, 347, 86, 90);
        this.add(stuffedLbl);
        
        chickenLbl = new JLabel("");
        chickenLbl.setIcon(new ImageIcon(new ImageIcon("foods\\russiansalad.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        chickenLbl.setBounds(512, 347, 86, 90);
        this.add(chickenLbl);
        
        baconLbl = new JLabel("");
        baconLbl.setIcon(new ImageIcon(new ImageIcon("foods\\americansalad.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        baconLbl.setBounds(727, 347, 86, 90);
        this.add(baconLbl);
        
        
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == hamburgerDetails)
        {
            gui.frame.remove(gui.saladMenuPage);
            gui.frame.add(gui.dishDetailsPage);
            gui.dishDetailsPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
            dishDetails.setrefer(gui.saladMenuPage);
            dishDetails.setFood(res.getFood("Turkish Salad"));
        }
        if(e.getSource() == veganDetails)
        {
            gui.frame.remove(gui.saladMenuPage);
            gui.frame.add(gui.dishDetailsPage);
            gui.dishDetailsPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
            dishDetails.setrefer(gui.saladMenuPage);
            dishDetails.setFood(res.getFood("Caesar Salad"));
        }
        if(e.getSource() == veggieDetails)
        {
            gui.frame.remove(gui.saladMenuPage);
            gui.frame.add(gui.dishDetailsPage);
            gui.dishDetailsPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
            dishDetails.setrefer(gui.saladMenuPage);
            dishDetails.setFood(res.getFood("Bread Salad"));
        }   
        if(e.getSource() == cheeseburgerDetails)
        {
            gui.frame.remove(gui.saladMenuPage);
            gui.frame.add(gui.dishDetailsPage);
            gui.dishDetailsPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
            dishDetails.setrefer(gui.saladMenuPage);
            dishDetails.setFood(res.getFood("Fruit Salad"));
        } 
        if(e.getSource() == stuffedDetails)
        {
            gui.frame.remove(gui.saladMenuPage);
            gui.frame.add(gui.dishDetailsPage);
            gui.dishDetailsPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
            dishDetails.setrefer(gui.saladMenuPage);
            dishDetails.setFood(res.getFood("Noodle Salad"));
        }
        if(e.getSource() == chickenDetails)
        {
            gui.frame.remove(gui.saladMenuPage);
            gui.frame.add(gui.dishDetailsPage);
            gui.dishDetailsPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
            dishDetails.setrefer(gui.saladMenuPage);
            dishDetails.setFood(res.getFood("Russian Salad"));
        }
        if(e.getSource() == baconDetails)
        {
            gui.frame.remove(gui.saladMenuPage);
            gui.frame.add(gui.dishDetailsPage);
            gui.dishDetailsPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
            dishDetails.setrefer(gui.saladMenuPage);
            dishDetails.setFood(res.getFood("American Salad"));
        }
        if (e.getSource() == backButton) {
            gui.frame.remove(gui.saladMenuPage);
            gui.frame.add(gui.mainPage);
            gui.mainPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
        }
    }
}


