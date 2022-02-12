import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

/**
 * This class creates foodluck frame for our project
 * @author boran
 * @version 25.07.2021
 */ 
public class MemoryGame extends JPanel
{
    // public static void main( String[] args)
    // {
    //     MemoryGame memoryGame = new MemoryGame();
    //     memoryGame.setBounds(100,100,900,600);
    // }
    
    // properties
    private JButton pizzaButton, pizza2Button, burgerButton, burger2Button, soupButton, soup2Button, pastaButton, pasta2Button, saladButton, salad2Button, wrapButton, wrap2Button;
    private JPanel panel;
    private JPanel buttonPanel;
    private int pizza, pizza2;
    private int burger, burger2;
    private int soup, soup2;
    private int pasta, pasta2;
    private int salad, salad2;
    private int wrap, wrap2;
    private ImageIcon pizzaIcon, burgerIcon, soupIcon, pastaIcon, saladIcon, wrapIcon, questionMark;
    private JButton last;
    private JLabel gameIsOver;  
    private AppMain gui;  
    private JLabel label;
    private JButton backButton;
    private MainPage mPage;
    
    
    // constructors
    public MemoryGame(AppMain g, MainPage mp)
    {
        gui = g;
        buttonPanel = new JPanel();
        buttonPanel.setBorder(new EmptyBorder(4, 4, 4, 4));
        buttonPanel.setLayout( new BorderLayout(0,0));
        this.setBounds(100,100,900,600);
        add(buttonPanel);
        buttonPanel.setBounds(100,100,900,600);

        // backButton = new JButton();
        // backButton.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("back.png")));
        // backButton.setBounds(15, 16, 74, 57);
        // buttonPanel.add(backButton, BorderLayout.WEST);
        
        label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("output-onlinepngtools-small.png")));
        label.setBounds(653, 0, 201, 184);
        this.add(label);
        
        
        last = new JButton();
        gameIsOver = new JLabel();
        
        pizzaIcon = new ImageIcon("realpizza2.png");
        burgerIcon = new ImageIcon("realburger2.png");
        soupIcon = new ImageIcon("realsoup2.png");
        pastaIcon = new ImageIcon("realpasta2.png");
        saladIcon = new ImageIcon("realsalad2.png");
        wrapIcon = new ImageIcon("realwrap2.png");
        questionMark = new ImageIcon("icons8-question-mark-50.png");
        
        
        pizza = (int) (Math.random() * 12) + 1;
        pizza2 = (int) (Math.random() * 12) + 1;
        burger = (int) (Math.random() * 12) + 1;
        burger2 = (int) (Math.random() * 12) + 1;
        salad = (int) (Math.random() * 12) + 1;
        salad2 = (int) (Math.random() * 12) + 1;
        soup = (int) (Math.random() * 12) + 1;
        soup2 = (int) (Math.random() * 12) + 1;
        pasta = (int) (Math.random() * 12) + 1;
        pasta2 = (int) (Math.random() * 12) + 1;
        wrap = (int) (Math.random() * 12) + 1;
        wrap2 = (int) (Math.random() * 12) + 1;
    
        
        do {
            pizza = (int) (Math.random() * 12) + 1;
            pizza2 = (int) (Math.random() * 12) + 1;
            burger = (int) (Math.random() * 12) + 1;
            burger2 = (int) (Math.random() * 12) + 1;
            salad = (int) (Math.random() * 12) + 1;
            salad2 = (int) (Math.random() * 12) + 1;
            soup = (int) (Math.random() * 12) + 1;
            soup2 = (int) (Math.random() * 12) + 1;
            pasta = (int) (Math.random() * 12) + 1;
            pasta2 = (int) (Math.random() * 12) + 1;
            wrap = (int) (Math.random() * 12) + 1;
            wrap2 = (int) (Math.random() * 12) + 1;
        } while (pizza == pizza2 || pizza == burger || pizza == burger2 || pizza == salad || pizza == salad2 || pizza == soup || pizza == soup2 || pizza == wrap || pizza == wrap2 || pizza == pasta || pizza == pasta2 
                || pizza2 == burger || pizza2 == burger2 || pizza2 == salad || pizza2 == salad2 || pizza2 == soup || pizza2 == soup2 || pizza2 == wrap || pizza2 == wrap2 || pizza2 == pasta || pizza2 == pasta2
                || burger == burger2 || burger == salad || burger == salad2 || burger == soup || burger == soup2 || burger == wrap || burger == wrap2 || burger == pasta || burger == pasta2
                || burger2 == salad || burger2 == salad2 || burger2 == soup || burger2 == soup2 || burger2 == wrap || burger2 == wrap2 || burger2 == pasta || burger2 == pasta2
                || soup == soup2|| soup == salad || soup == salad2 || soup == wrap || soup == wrap2 || soup == pasta || soup == pasta2
                || soup2 == salad || soup2 == salad2 || soup2 == wrap || soup2 == wrap2 || soup2 == pasta || soup2 == pasta2
                || salad == salad2 || salad == wrap || salad == wrap2 || salad == pasta || salad == pasta2   
                || salad2 == wrap || salad2 == wrap2 || salad2 == pasta || salad2 == pasta2
                || wrap == pasta || wrap ==pasta2 || wrap == wrap2
                || wrap2 == pasta || wrap2 ==pasta2 || pasta == pasta2 );
        
        panel = new JPanel();
        buttonPanel.add(panel, BorderLayout.CENTER);
        panel.setLayout( new GridLayout(4,3));
        
        for( int i = 1; i <= 12; i++)
        {
            if( pizza == i) 
            {
                pizzaButton = new JButton(); 
                pizzaButton.setIcon(questionMark);
                pizzaButton.addActionListener(new MemoryGameListener());
                panel.add(pizzaButton);
            }
            
            else if( pizza2 == i)
            {
                pizza2Button = new JButton(); 
                pizza2Button.setIcon(questionMark);
                pizza2Button.addActionListener(new MemoryGameListener());
                panel.add(pizza2Button);
            }
            
            else if( burger == i)
            {
                burgerButton = new JButton(); 
                burgerButton.setIcon(questionMark);
                burgerButton.addActionListener(new MemoryGameListener());
                panel.add(burgerButton);
            }
            
            else if( burger2 == i)
            {
                burger2Button = new JButton(); 
                burger2Button.setIcon(questionMark);
                burger2Button.addActionListener(new MemoryGameListener());
                panel.add(burger2Button);
            }
            
            else if( soup == i)
            {
                soupButton = new JButton(); 
                soupButton.setIcon(questionMark);
                soupButton.addActionListener(new MemoryGameListener());
                panel.add(soupButton);
            }
            
            else if( soup2 == i)
            {
                soup2Button = new JButton(); 
                soup2Button.setIcon(questionMark);
                soup2Button.addActionListener(new MemoryGameListener());
                panel.add(soup2Button);
            }
            
            else if( pasta == i)
            {
                pastaButton = new JButton(); 
                pastaButton.setIcon(questionMark);
                pastaButton.addActionListener(new MemoryGameListener());
                panel.add(pastaButton);
            }
            
            else if( pasta2 == i)
            {
                pasta2Button = new JButton(); 
                pasta2Button.setIcon(questionMark);
                pasta2Button.addActionListener(new MemoryGameListener());
                panel.add(pasta2Button);
            }
            
            else if( salad == i)
            {
                saladButton = new JButton(); 
                saladButton.setIcon(questionMark);
                saladButton.addActionListener(new MemoryGameListener());
                panel.add(saladButton);
            }
            
            else if( salad2 == i)
            {
                salad2Button = new JButton(); 
                salad2Button.setIcon(questionMark);
                salad2Button.addActionListener(new MemoryGameListener());
                panel.add(salad2Button);
            }
            
            else if( wrap == i)
            {
                wrapButton = new JButton(); 
                wrapButton.setIcon(questionMark);
                wrapButton.addActionListener(new MemoryGameListener());
                panel.add(wrapButton);
            }
            
            else if( wrap2 == i)
            {
                wrap2Button = new JButton(); 
                wrap2Button.setIcon(questionMark);
                wrap2Button.addActionListener(new MemoryGameListener());
                panel.add(wrap2Button);
            }
        }
    }
    
    private class MemoryGameListener implements ActionListener
    {
		@Override
        public void actionPerformed(ActionEvent e) 
        {
            if(e.getSource() == pizzaButton)
            {
                pizzaButton.setEnabled(false);
                pizzaButton.setIcon(pizzaIcon);
                
                if(last == pizza2Button)
                {
                    for( int i = 0; i < 12; i++)
                    {
                        ((JButton) panel.getComponent(i)).setEnabled(false); 
                    }
                    JOptionPane.showMessageDialog(gameIsOver, "You won the game!" + "\n" + "5 tokens added to your token pocket" + "\n" + "See you in 2 days");
                    gui.frame.remove(gui.memoryGame);
                    gui.frame.add(gui.mainPage);
                    gui.mainPage.setVisible(true);
                    gui.frame.repaint();
                    gui.frame.revalidate();
        
                }
                else
                {
                    last.setEnabled(true);
                    last.setIcon(null);
                }
                
                (last).setIcon(questionMark);
                
                if(last == pizza2Button)
                {
                    last.setIcon(pizzaIcon);
                }
                last = pizzaButton;
            }
            else if(e.getSource() == pizza2Button)
            {
                pizza2Button.setEnabled(false);
                pizza2Button.setIcon(pizzaIcon);
                
                if(last == pizzaButton)
                {
                    for( int i = 0; i < 12; i++)
                    {
                        ((JButton) panel.getComponent(i)).setEnabled(false); 
                    }
                    JOptionPane.showMessageDialog(gameIsOver, "You won the game!" + "\n" + "5 tokens added to your token pocket" + "\n" + "See you in 2 days");
                    gui.frame.remove(gui.memoryGame);
                    gui.frame.add(gui.mainPage);
                    gui.mainPage.setVisible(true);
                    gui.frame.repaint();
                    gui.frame.revalidate();

                }
                else
                {
                    last.setEnabled(true);
                    last.setIcon(null);
                }
                (last).setIcon(questionMark);
                
                if(last == pizzaButton)
                {
                    last.setIcon(pizzaIcon);
                }
                last = pizza2Button;
            }
            else if(e.getSource() == burgerButton)
            {
                burgerButton.setEnabled(false);
                burgerButton.setIcon(burgerIcon);
                
                if(last == burger2Button)
                {
                    for( int i = 0; i < 12; i++)
                    {
                        ((JButton) panel.getComponent(i)).setEnabled(false); 
                    }
                    JOptionPane.showMessageDialog(gameIsOver, "You won the game!" + "\n" + "5 tokens added to your token pocket" + "\n" + "See you in 2 days");
                    gui.frame.remove(gui.gamesPage);
                    gui.frame.add(gui.memoryGame);
                    gui.memoryGame.setVisible(true);
                    gui.frame.repaint();
                    gui.frame.revalidate();
        
                }
                else
                {
                    last.setEnabled(true);
                    last.setIcon(null);
                }
                (last).setIcon(questionMark);
                
                if(last == burger2Button)
                {
                    last.setIcon(burgerIcon);
                }
                
                last = burgerButton;
            }
            else if(e.getSource() == burger2Button)
            {
                burger2Button.setEnabled(false);
                burger2Button.setIcon(burgerIcon);
                
                if(last == burgerButton)
                {
                    for( int i = 0; i < 12; i++)
                    {
                        ((JButton) panel.getComponent(i)).setEnabled(false); 
                    }
                    JOptionPane.showMessageDialog(gameIsOver, "You won the game!" + "\n" + "5 tokens added to your token pocket" + "\n" + "See you in 2 days");
                    gui.frame.remove(gui.memoryGame);
                    gui.frame.add(gui.mainPage);
                    gui.mainPage.setVisible(true);
                    gui.frame.repaint();
                    gui.frame.revalidate();

                }
                else
                {
                    last.setEnabled(true);
                    last.setIcon(null);
                }
                (last).setIcon(questionMark);
                
                if(last == burgerButton)
                {
                    last.setIcon(burgerIcon);
                }
                
                last = burger2Button;
            }
            else if(e.getSource() == pastaButton)
            {
                pastaButton.setEnabled(false);
                pastaButton.setIcon(pastaIcon);
                
                if(last == pasta2Button)
                {
                    for( int i = 0; i < 12; i++)
                    {
                        ((JButton) panel.getComponent(i)).setEnabled(false); 
                    }
                    JOptionPane.showMessageDialog(gameIsOver, "You won the game!" + "\n" + "5 tokens added to your token pocket" + "\n" + "See you in 2 days");
                    gui.frame.remove(gui.memoryGame);
                    gui.frame.add(gui.mainPage);
                    gui.mainPage.setVisible(true);
                    gui.frame.repaint();
                    gui.frame.revalidate();

                }
                else
                {
                    last.setEnabled(true);
                    last.setIcon(null);
                }
                
                (last).setIcon(questionMark);
                
                if(last == pasta2Button)
                {
                    last.setIcon(pastaIcon);
                }
                
                last = pastaButton;
            }
            else if(e.getSource() == pasta2Button)
            {
                pasta2Button.setEnabled(false);
                pasta2Button.setIcon(pastaIcon);
                
                if(last == pastaButton)
                {
                    for( int i = 0; i < 12; i++)
                    {
                        ((JButton) panel.getComponent(i)).setEnabled(false); 
                    }
                    JOptionPane.showMessageDialog(gameIsOver, "You won the game!" + "\n" + "5 tokens added to your token pocket" + "\n" + "See you in 2 days");
                    gui.frame.remove(gui.memoryGame);
                    gui.frame.add(gui.mainPage);
                    gui.mainPage.setVisible(true);
                    gui.frame.repaint();
                    gui.frame.revalidate();

                }
                else
                {
                    last.setEnabled(true);
                    last.setIcon(null);
                }
                
                (last).setIcon(questionMark);
                
                if(last == pastaButton)
                {
                    last.setIcon(pastaIcon);
                }
                
                last = pasta2Button;
            }
            else if(e.getSource() == saladButton)
            {
                saladButton.setEnabled(false);
                saladButton.setIcon(saladIcon);
                
                if(last == salad2Button)
                {
                    for( int i = 0; i < 12; i++)
                    {
                        ((JButton) panel.getComponent(i)).setEnabled(false); 
                    }
                    JOptionPane.showMessageDialog(gameIsOver, "You won the game!" + "\n" + "5 tokens added to your token pocket" + "\n" + "See you in 2 days");
                    gui.frame.remove(gui.memoryGame);
                    gui.frame.add(gui.mainPage);
                    gui.mainPage.setVisible(true);
                    gui.frame.repaint();
                    gui.frame.revalidate();

                }
                else
                {
                    last.setEnabled(true);
                    last.setIcon(null);
                }
                
                (last).setIcon(questionMark);
                
                if(last == salad2Button)
                {
                    last.setIcon(saladIcon);
                }
                
                last = saladButton;
            }
            else if(e.getSource() == salad2Button)
            {
                salad2Button.setEnabled(false);
                salad2Button.setIcon(saladIcon);
                
                if(last == saladButton)
                {
                    for( int i = 0; i < 12; i++)
                    {
                        ((JButton) panel.getComponent(i)).setEnabled(false); 
                    }
                    JOptionPane.showMessageDialog(gameIsOver, "You won the game!" + "\n" + "5 tokens added to your token pocket" + "\n" + "See you in 2 days");
                    
                    gui.frame.remove(gui.memoryGame);
                    gui.frame.add(gui.mainPage);
                    gui.mainPage.setVisible(true);
                    gui.frame.repaint();
                    gui.frame.revalidate();
    
                }
                else
                {
                    last.setEnabled(true);
                    last.setIcon(null);
                }
                
                (last).setIcon(questionMark);
                
                if(last == saladButton)
                {
                    last.setIcon(saladIcon);
                }
                
                last = salad2Button;
            }
            else if(e.getSource() == wrapButton)
            {
                wrapButton.setEnabled(false);
                wrapButton.setIcon(wrapIcon);
                
                if(last == wrap2Button)
                {
                    for( int i = 0; i < 12; i++)
                    {
                        ((JButton) panel.getComponent(i)).setEnabled(false); 
                    }
                    JOptionPane.showMessageDialog(gameIsOver, "You won the game!" + "\n" + "5 tokens added to your token pocket" + "\n" + "See you in 2 days");
                    gui.frame.remove(gui.memoryGame);
                    gui.frame.add(gui.mainPage);
                    gui.mainPage.setVisible(true);
                    gui.frame.repaint();
                    gui.frame.revalidate();

                }
                else
                {
                    last.setEnabled(true);
                    last.setIcon(null);
                }
                
                (last).setIcon(questionMark);
                
                if(last == wrap2Button)
                {
                    last.setIcon(wrapIcon);
                }
                
                last = wrapButton;
            }
            else if(e.getSource() == wrap2Button)
            {
                wrap2Button.setEnabled(false);
                wrap2Button.setIcon(wrapIcon);
                
                if(last == wrapButton)
                {
                    for( int i = 0; i < 12; i++)
                    {
                        ((JButton) panel.getComponent(i)).setEnabled(false); 
                    }
                    JOptionPane.showMessageDialog(gameIsOver, "You won the game!" + "\n" + "5 tokens added to your token pocket" + "\n" + "See you in 2 days");
                    gui.frame.remove(gui.memoryGame);
                    gui.frame.add(gui.mainPage);
                    gui.mainPage.setVisible(true);
                    gui.frame.repaint();
                    gui.frame.revalidate();
    
                }
                else
                {
                    last.setEnabled(true);
                    last.setIcon(null);
                }
                
                (last).setIcon(questionMark);
                
                if(last == wrapButton)
                {
                    last.setIcon(wrapIcon);
                }
                
                last = wrap2Button;
            }
            else if(e.getSource() == soupButton)
            {
                soupButton.setEnabled(false);
                soupButton.setIcon(soupIcon);
                
                if(last == soup2Button)
                {
                    for( int i = 0; i < 12; i++)
                    {
                        ((JButton) panel.getComponent(i)).setEnabled(false); 
                    }
                    JOptionPane.showMessageDialog(gameIsOver, "You won the game!" + "\n" + "5 tokens added to your token pocket" + "\n" + "See you in 2 days");
                    gui.frame.remove(gui.memoryGame);
                    gui.frame.add(gui.mainPage);
                    gui.mainPage.setVisible(true);
                    gui.frame.repaint();
                    gui.frame.revalidate();

                }
                else
                {
                    last.setEnabled(true);
                    last.setIcon(null);
                }
                
                ((JButton) last).setIcon(questionMark);
                
                if(last == soup2Button)
                {
                    last.setIcon(soupIcon);
                }
                
                last = soupButton;
            }
            else if(e.getSource() == soup2Button)
            {
                soup2Button.setEnabled(false);
                soup2Button.setIcon(soupIcon);
                
                if(last == soupButton)
                {
                    for( int i = 0; i < 12; i++)
                    {
                        ((JButton) panel.getComponent(i)).setEnabled(false); 
                    }
                    JOptionPane.showMessageDialog(gameIsOver, "You won the game!" + "\n" + "5 tokens added to your token pocket" + "\n" + "See you in 2 days");
                    gui.frame.remove(gui.memoryGame);
                    gui.frame.add(gui.mainPage);
                    gui.mainPage.setVisible(true);
                    gui.frame.repaint();
                    gui.frame.revalidate();

                }
                else
                {
                    last.setEnabled(true);
                    last.setIcon(null);
                }
                
                ((JButton) last).setIcon(questionMark);
                
                if(last == soupButton)
                {
                    last.setIcon(soupIcon);
                }
                
                last = soup2Button;
            }
		}
        
    }
}

