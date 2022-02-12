import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;


public class WrapMenu extends JPanel implements ActionListener
{
    
    // public static void main( String[] args)
    // {
    //     WrapMenu wrap = new WrapMenu();
    //     wrap.setVisible(true);
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
    private JButton fishDetails;
    private JLabel vgnBrgrLbl;
    private JButton veggieDetails;
    private JLabel veggieBurgrLbl;
    private JButton chickenDetails;
    private JLabel cheeseburgerLbl;
    private JButton turkeyDetails;
    private JButton veganDetails;
    private JButton meatDetails;
    private JButton cheesyDetails;
    private JLabel stuffedLbl;
    private JLabel chickenLbl;
    private JLabel baconLbl;
    private AppMain gui;
    private JButton backButton;
    private String refer = "WrapMenuPage";
    private DishDetails dishDetails;
    private Restaurant res;
    
    
    
    // constructor
    public WrapMenu(AppMain g, DishDetails dd, Restaurant res)
    {
        gui =g;
        dishDetails = dd;
        this.res = res;
        res.addCategory("Wraps");
        res.addFood("tortilla, 80 gr chicken, cheddar, pepper, tomato", "Chicken Wrap", new ImageIcon("foods\\chickenwrap.jpg"), 540, 25, 20, 20, true, true, false, false ,false, true, true,true, true, "Wraps", 3.8);
        res.addFood("tortilla, 80 gr turkey, cheddar, pepper, tomato", "Turkey Wrap", new ImageIcon("foods\\turkeywrap.jpg"), 510, 25, 20, 20, true, true, false, false ,false, true, true,true, true, "Wraps", 3.9);
        res.addFood("tortilla, 80 gr falafel, cheddar, pepper, tomato", "Vegetarian Wrap", new ImageIcon("foods\\vegetarianwrap.jpg"), 300, 25, 20, 20, true, true, false, true ,false, true, true,true, true, "Wraps",4.0);
        res.addFood("tortilla, 40 gr chicken, cheddar, mozarella, parmesan, pepper, tomato, salad", "Cheessy Wrap", new ImageIcon("foods\\cheesysaladwrap.jpg"), 490, 25, 20, 20, true, true, false, false ,false, true, true,true, true, "Wraps",4.3);
        res.addFood("tortilla, 80 gr fish, salad, pepper, tomato", "Fish Wrap", new ImageIcon("foods\\fishwrap.jpg"), 480, 25, 20, 20, true, true, false, false ,false, true, true,true, true, "Wraps",4.5);
        res.addFood("tortilla, 80 gr meat, cheddar, pepper, tomato", "Meat Wrap", new ImageIcon("foods\\meatwrap.jpg"), 640, 25, 20, 20, true, true, false, false ,false, true, true,true, true, "Wraps",4.5);
        res.addFood("tortilla, 80 gr falafel, salad, pepper, tomato", "Vegan Wrap", new ImageIcon("foods\\veganwrap.jpg"), 240, 25, 20, 20, true, true, false, true ,true, true, true,true, true, "Wraps",4.6);
        
        setBounds(100,100,900,600);
        this.setBackground(new Color(255, 204, 153));
        this.setLayout(null);
        
        logo = new ImageIcon("output-onlinepngtools.png");
        
        title = new JLabel("Wrap Menu");
        
        label = new JLabel("Cheessy Wrap");
        label.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label.setBounds(647, 453, 139, 24);
        
        label2 = new JLabel("Chicken Wrap");
        label2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label2.setBounds(444, 223, 139, 24);
        
        label3 = new JLabel("Vegetarian Wrap");
        label3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label3.setBounds(227, 223, 174, 24);
        
        label4 = new JLabel("Turkey Wrap");
        label4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label4.setBounds(37, 453, 132, 24);
        
        label5 = new JLabel("Fish Wrap");
        label5.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label5.setBounds(53, 223, 122, 24);
        
        label6 = new JLabel("Vegan Wrap");
        label6.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label6.setBounds(242, 453, 145, 24);
        
        label7 = new JLabel("Meat Wrap");
        label7.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        label7.setBounds(458, 453, 174, 24);
            
        
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
        
        JLabel lblBurgers = new JLabel("WRAPS");
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
        
        stuffedPrice = new JLabel("27.90 \u20BA");
        stuffedPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        stuffedPrice.setBounds(273, 476, 69, 20);
        this.add(stuffedPrice);
        
        veganPrice = new JLabel("23.90 \u20BA");
        veganPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        veganPrice.setBounds(273, 247, 69, 20);
        this.add(veganPrice);
        
        baconPrice = new JLabel("29.90 \u20BA");
        baconPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        baconPrice.setBounds(679, 476, 69, 20);
        this.add(baconPrice);
        
        chickenPrice = new JLabel("26.90 \u20BA");
        chickenPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
        chickenPrice.setBounds(472, 476, 69, 20);
        this.add(chickenPrice);
        
        cheeseburgerLbl = new JLabel("");
        cheeseburgerLbl.setBounds(53, 347, 86, 90);
        cheeseburgerLbl.setIcon(new ImageIcon(new ImageIcon("foods\\turkeywrap.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        this.add(cheeseburgerLbl);

        hambugerLbl = new JLabel("");
        hambugerLbl.setIcon(new ImageIcon(new ImageIcon("foods\\fishwrap.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        hambugerLbl.setBounds(53, 117, 86, 90);
        this.add(hambugerLbl);
        
        fishDetails = new JButton("Dish Details");
        fishDetails.setBackground(new Color(224, 255, 255));
        fishDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        fishDetails.setBounds(38, 275, 115, 29);
        this.add(fishDetails);
        fishDetails.addActionListener(this);
        
        vgnBrgrLbl = new JLabel("");
        vgnBrgrLbl.setIcon(new ImageIcon(new ImageIcon("foods\\vegetarianwrap.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        vgnBrgrLbl.setBounds(259, 117, 86, 90);
        this.add(vgnBrgrLbl);
        
        veggieDetails = new JButton("Dish Details");
        veggieDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        veggieDetails.setBackground(new Color(224, 255, 255));
        veggieDetails.setBounds(242, 275, 115, 29);
        this.add(veggieDetails);
        veggieDetails.addActionListener(this);

        
        veggieBurgrLbl = new JLabel("");
        veggieBurgrLbl.setIcon(new ImageIcon(new ImageIcon("foods\\chickenwrap.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        veggieBurgrLbl.setBounds(458, 117, 86, 90);
        this.add(veggieBurgrLbl);
        
        chickenDetails = new JButton("Dish Details");
        chickenDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        chickenDetails.setBackground(new Color(224, 255, 255));
        chickenDetails.setBounds(453, 275, 115, 29);
        this.add(chickenDetails);
        chickenDetails.addActionListener(this);
        
        turkeyDetails = new JButton("Dish Details");
        turkeyDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        turkeyDetails.setBackground(new Color(224, 255, 255));
        turkeyDetails.setBounds(44, 507, 115, 29);
        this.add(turkeyDetails);
        turkeyDetails.addActionListener(this);

        
        veganDetails = new JButton("Dish Details");
        veganDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        veganDetails.setBackground(new Color(224, 255, 255));
        veganDetails.setBounds(242, 507, 115, 29);
        this.add(veganDetails);
        veganDetails.addActionListener(this);

        
        meatDetails = new JButton("Dish Details");
        meatDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        meatDetails.setBackground(new Color(224, 255, 255));
        meatDetails.setBounds(453, 507, 115, 29);
        this.add(meatDetails);
        meatDetails.addActionListener(this);

        
        cheesyDetails = new JButton("Dish Details");
        cheesyDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
        cheesyDetails.setBackground(new Color(224, 255, 255));
        cheesyDetails.setBounds(657, 508, 115, 29);
        this.add(cheesyDetails);
        cheesyDetails.addActionListener(this);

        
        stuffedLbl = new JLabel("");
        stuffedLbl.setIcon(new ImageIcon(new ImageIcon("foods\\veganwrap.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        stuffedLbl.setBounds(259, 347, 86, 90);
        this.add(stuffedLbl);
        
        chickenLbl = new JLabel("");
        chickenLbl.setIcon(new ImageIcon(new ImageIcon("foods\\meatwrap.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        chickenLbl.setBounds(472, 347, 86, 90);
        this.add(chickenLbl);
        
        baconLbl = new JLabel("");
        baconLbl.setIcon(new ImageIcon(new ImageIcon("foods\\cheesysaladwrap.jpg").getImage().getScaledInstance(cheeseburgerLbl.getWidth(), cheeseburgerLbl.getHeight(), Image.SCALE_DEFAULT)));
        baconLbl.setBounds(673, 347, 86, 90);
        this.add(baconLbl);
    }

      public String getName(){
        return refer;
      }
    
        @Override
        public void actionPerformed(ActionEvent e) {
    		if (e.getSource() == backButton) {
    			gui.frame.remove(gui.wrapMenuPage);
          gui.frame.add(gui.mainPage);
          gui.mainPage.setVisible(true);
          gui.frame.repaint();
          gui.frame.revalidate();

    		}
    		if (e.getSource() == cheesyDetails) {
    			gui.frame.remove(gui.wrapMenuPage);
            	gui.frame.add(gui.dishDetailsPage);
            	gui.mainPage.setVisible(true);
            	gui.frame.repaint();
            	gui.frame.revalidate();
              dishDetails.setrefer(gui.wrapMenuPage);
              dishDetails.setFood(res.getFood("Cheessy Wrap"));
              
    		}
    		if (e.getSource() == fishDetails) {
    			gui.frame.remove(gui.wrapMenuPage);
          gui.frame.add(gui.dishDetailsPage);
          gui.mainPage.setVisible(true);
          gui.frame.repaint();
          gui.frame.revalidate();
          dishDetails.setrefer(gui.wrapMenuPage);
          dishDetails.setFood(res.getFood("Fish Wrap"));
    		}
    		if (e.getSource() == veggieDetails) {
    			gui.frame.remove(gui.wrapMenuPage);
          gui.frame.add(gui.dishDetailsPage);
          gui.mainPage.setVisible(true);
          gui.frame.repaint();
          gui.frame.revalidate();
          dishDetails.setrefer(gui.wrapMenuPage);
          dishDetails.setFood(res.getFood("Vegetarian Wrap"));


    		}
    		if (e.getSource() == chickenDetails) {
    			gui.frame.remove(gui.wrapMenuPage);
          gui.frame.add(gui.dishDetailsPage);
          gui.mainPage.setVisible(true);
          gui.frame.repaint();
          gui.frame.revalidate();
          dishDetails.setrefer(gui.wrapMenuPage);
          dishDetails.setFood(res.getFood("Chicken Wrap"));
    		}
    		if (e.getSource() == turkeyDetails) {
    			gui.frame.remove(gui.wrapMenuPage);
          gui.frame.add(gui.dishDetailsPage);
          gui.mainPage.setVisible(true);
          gui.frame.repaint();
          gui.frame.revalidate();
          dishDetails.setrefer(gui.wrapMenuPage);
          dishDetails.setFood(res.getFood("Turkey Wrap"));
    		}
    		if (e.getSource() == veganDetails) {
    			gui.frame.remove(gui.wrapMenuPage);
          gui.frame.add(gui.dishDetailsPage);
          gui.mainPage.setVisible(true);
          gui.frame.repaint();
          gui.frame.revalidate();
          dishDetails.setrefer(gui.wrapMenuPage);
          dishDetails.setFood(res.getFood("Vegan Wrap"));
    		}
    		if (e.getSource() == meatDetails) {
    			gui.frame.remove(gui.wrapMenuPage);
          gui.frame.add(gui.dishDetailsPage);
          gui.mainPage.setVisible(true);
          gui.frame.repaint();
          gui.frame.revalidate();
          dishDetails.setrefer(gui.wrapMenuPage);
          dishDetails.setFood(res.getFood("Meat Wrap"));

    		}
      }
}


