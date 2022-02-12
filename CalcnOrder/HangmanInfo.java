import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * A simple Java class!
*/
public class HangmanInfo extends JPanel implements HungryManView, ActionListener
{
    // Properties
    private HangHungryMan hangman;
    private JLabel        numberOfIncorrectTries;
    private JLabel        usedLetters;
    private JLabel        partsFound;
    private JLabel        maxToken;
    private JButton       backButton;
    private AppMain       gui;
    
    // Constructors
    public HangmanInfo(HangHungryMan hangman, AppMain g)
    {
        this.setBackground(new Color(255, 204, 153));
        gui = g;
        setPreferredSize(new Dimension(400,600));
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.hangman = hangman;
        numberOfIncorrectTries = new JLabel("Wrong guesses you made: " + this.hangman.getNumOfIncorrectTries() + "/" + this.hangman.getMaxAllowedIncorrectTries());
        usedLetters = new JLabel("Used letters: " + this.hangman.getUsedLetters());
        partsFound = new JLabel("Known so far: " + this.hangman.getKnownSoFar());
        maxToken = new JLabel("Max token that you can earn: 5");
        backButton = new JButton();
        backButton.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("back.png")));
        backButton.setBounds(15, 16, 74, 57);
        backButton.addActionListener(this);
        add(backButton);
        add(numberOfIncorrectTries);
        add(usedLetters);
        add(partsFound);
    }
    
    // Methods
    public void update()
    {
        numberOfIncorrectTries.setText("Wrong guesses you made: " + this.hangman.getNumOfIncorrectTries() + "/" + this.hangman.getMaxAllowedIncorrectTries());
        usedLetters.setText("Used letters: " + this.hangman.getUsedLetters());
        partsFound.setText("Known so far: " + this.hangman.getKnownSoFar());
        maxToken = new JLabel("Max token that you can earn: 5");
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if( e.getSource() == backButton)
        {
            gui.frame.remove(gui.hangmanPage);
            gui.frame.add(gui.mainPage);
            gui.mainPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
        }
    }
    
    
}