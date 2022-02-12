import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class HangmanTextField extends JPanel implements ActionListener
{
    // Properties
    private HangHungryMan hangman;
    private JTextField field;
    private AppMain gui;
    private MainPage mPage;
    
    // Constructors
    public HangmanTextField(HangHungryMan hangman, AppMain gui, MainPage mp)
    {
        this.gui = gui;
        mPage = mp;
        this.hangman = hangman;
        field = new JTextField(10);
        field.addActionListener(this);
        this.setBackground(new Color(255, 204, 153));
        add(field);
    }
    
    // Methods
    public void actionPerformed(ActionEvent e)
    {
        hangman.tryChar(field.getText().charAt(0));
        field.setText("");
        if(hangman.isGameOver() || hangman.lost())
        {
            if( hangman.won())
            {
                JLabel label = new JLabel();
                JOptionPane.showMessageDialog(label, "You won!" + "\n" + "5 tokens added to your token pocket" + "\n" + "See you in 2 days");
                mPage.addTokens(5);
                mPage.setTokens(mPage.getTokens());
                gui.frame.remove(gui.hangmanPage);
                gui.frame.add(gui.mainPage);
                gui.mainPage.setVisible(true);
                gui.frame.repaint();
                gui.frame.revalidate();
                hangman.newGame();
            }
            else
            {
                JLabel label = new JLabel();
                JOptionPane.showMessageDialog(label, "You lost the game!" +"\n" +"See you in 2 days");
                gui.frame.remove(gui.hangmanPage);
                gui.frame.add(gui.mainPage);
                gui.mainPage.setVisible(true);
                gui.frame.repaint();
                gui.frame.revalidate();
                hangman.newGame();
            }
        }
    }
}