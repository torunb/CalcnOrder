import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

/**
 * This class creates foodluck frame for our project
 * @author boran
 * @version 25.07.2021
 */ 
public class LuckyFood extends JPanel
{   
    // properties
    private JButton burgerButton;
    private JButton broccoli1Button;
    private JButton broccoli2Button;
    private JPanel panel;
    //private JPanel buttonPanel;
    private int burger;
    private int broccoli1;
    private int broccoli2;
    private AppMain gui;
    private MainPage mPage;
    
    
    // constructors
    public LuckyFood(AppMain g, MainPage mp)
    {
        gui=g;
        mPage = mp;
        //buttonPanel = new JPanel();
        this.setBorder(new EmptyBorder(4, 4, 4, 4));
        this.setLayout( new BorderLayout());
        this.setBackground(new Color(255, 204, 153));
        setBounds(100, 100, 900, 600);
        
        burger = (int) (Math.random() * 64) + 1;
        broccoli1 = (int) (Math.random() * 64) + 1;
        broccoli2 = (int) (Math.random() * 64) + 1;
        
        do {
            burger = (int) (Math.random() * 64) + 1;
            broccoli1 = (int) (Math.random() * 64) + 1;
            broccoli2 = (int) (Math.random() * 64) + 1;
        } while (burger == broccoli1 || broccoli1 == broccoli2 || burger == broccoli2);
        
        panel = new JPanel();
        this.add(panel, BorderLayout.CENTER);
        panel.setLayout( new GridLayout(8,8));
        LuckyFoodListener listener = new LuckyFoodListener();
        
        for( int i = 1; i <= 64; i++)
        {
            if( burger == i) 
            {
                burgerButton = new JButton("" + i); 
                burgerButton.addActionListener(listener);
                panel.add(burgerButton);
            }
            
            else if( broccoli1 == i)
            {
                broccoli1Button = new JButton("" + i); 
                broccoli1Button.addActionListener(listener);
                panel.add(broccoli1Button);
            }
            
            else if( broccoli2 == i)
            {
                broccoli2Button = new JButton("" + i); 
                broccoli2Button.addActionListener(listener);
                panel.add(broccoli2Button);
            }
            
            else
            {
                JButton normal = new JButton("" + i); 
                normal.addActionListener(listener);
                panel.add(normal);
            }
        }
    }
    
    private class LuckyFoodListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if( e.getSource() == burgerButton || e.getSource() == broccoli1Button || e.getSource() == broccoli2Button)
            {
                if(e.getSource() == burgerButton)
                {
                    burgerButton.setText(null);
                    broccoli1Button.setText(null);
                    broccoli2Button.setText(null);
                    ImageIcon burgerImage = new ImageIcon("realburger.png");
                    ImageIcon broccoliImage = new ImageIcon("realvegetable.png");
                    burgerButton.setIcon(burgerImage);
                    broccoli1Button.setIcon(broccoliImage);
                    broccoli2Button.setIcon(broccoliImage);
                    JLabel label = new JLabel();
                    JOptionPane.showMessageDialog(label, "You won the game!" + "\n" + "5 tokens added to your token pocket" + "\n" + "See you in 2 days");
                    MainPage.tokens = MainPage.tokens+5;
                    
                    gui.frame.remove(gui.luckyFoodPage);
                    gui.frame.add(gui.mainPage);
                    gui.mainPage.setVisible(true);
                    gui.frame.repaint();
                    gui.frame.revalidate();
                }
                else
                {
                    burgerButton.setText(null);
                    broccoli1Button.setText(null);
                    broccoli2Button.setText(null);
                    ImageIcon burgerImage = new ImageIcon("realburger.png");
                    ImageIcon broccoliImage = new ImageIcon("realvegetable.png");
                    burgerButton.setIcon(burgerImage);
                    broccoli1Button.setIcon(broccoliImage);
                    broccoli2Button.setIcon(broccoliImage);
                    JLabel label = new JLabel();
                    JOptionPane.showMessageDialog(label, "Sorry you lost the game!" + "\n" + "See you in 2 days");
                    gui.frame.remove(gui.luckyFoodPage);
                    gui.frame.add(gui.mainPage);
                    gui.mainPage.setVisible(true);
                    gui.frame.repaint();
                    gui.frame.revalidate();
                }
                
                for( int i = 0; i < 64; i++)
                {
                    ((JButton) panel.getComponent(i)).setEnabled(false); // when burger or broccoli is pressed make all button unable to press
                }
            }
            else
            {
                ((JButton) e.getSource()).setEnabled(false); // when normal button is pressed make unable to press that just pressed
            }
            
        }
        
    }
}
