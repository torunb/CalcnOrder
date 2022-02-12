import javax.swing.*;
import java.awt.*;

/**
 * A simple Java class!
*/
public class HangmanGraphics extends JPanel implements HungryManView
{
    // Properties
    private HangHungryMan hangman;
    
    // Constructors
    public HangmanGraphics(HangHungryMan hangman)
    {
        this.setBackground(new Color(255, 204, 153));
        setPreferredSize(new Dimension(250,450));
        this.hangman = hangman;
    }
    
    // Methods
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        
        if(hangman.getNumOfIncorrectTries() == 1)
        {
            g.fillRect(20, 400, 300, 30);
        }
        
        if(hangman.getNumOfIncorrectTries() == 2)
        {
            g.fillRect(20, 400, 300, 30);
            g.fillRect(30, 100, 10, 300);
        }
        
        if(hangman.getNumOfIncorrectTries() == 3)
        {
            g.fillRect(20, 400, 300, 30);
            g.fillRect(30, 100, 10, 300);
            g.fillRect(40, 100, 150, 10);
        }
        
        if(hangman.getNumOfIncorrectTries() == 4)
        {
            g.fillRect(20, 400, 300, 30);
            g.fillRect(30, 100, 10, 300);
            g.fillRect(40, 100, 150, 10);
            g.fillRect(170, 110, 6, 30);
        }
        
        if(hangman.getNumOfIncorrectTries() == 5)
        {
            g.fillRect(20, 400, 300, 30);
            g.fillRect(30, 100, 10, 300);
            g.fillRect(40, 100, 150, 10);
            g.fillRect(170, 110, 6, 30);
            g.drawOval(143, 140, 60, 60);
        }
        if(hangman.getNumOfIncorrectTries() == 6)
        {
            g.fillRect(20, 400, 300, 30);
            g.fillRect(30, 100, 10, 300);
            g.fillRect(40, 100, 150, 10);
            g.fillRect(170, 110, 6, 30);
            g.drawOval(143, 140, 60, 60);
            g.drawLine(173, 200, 173, 280);
        }
        if(hangman.getNumOfIncorrectTries() == 7)
        {
            g.fillRect(20, 400, 300, 30);
            g.fillRect(30, 100, 10, 300);
            g.fillRect(40, 100, 150, 10);
            g.fillRect(170, 110, 6, 30);
            g.drawOval(143, 140, 60, 60);
            g.drawLine(173, 200, 173, 280);
            g.drawLine(173, 200, 213, 240);
        }
        if(hangman.getNumOfIncorrectTries() == 8)
        {
            g.fillRect(20, 400, 300, 30);
            g.fillRect(30, 100, 10, 300);
            g.fillRect(40, 100, 150, 10);
            g.fillRect(170, 110, 6, 30);
            g.drawOval(143, 140, 60, 60);
            g.drawLine(173, 200, 173, 280);
            g.drawLine(173, 200, 213, 240);
            g.drawLine(173, 200, 133, 240);
        }
        if(hangman.getNumOfIncorrectTries() == 9)
        {
            g.fillRect(20, 400, 300, 30);
            g.fillRect(30, 100, 10, 300);
            g.fillRect(40, 100, 150, 10);
            g.fillRect(170, 110, 6, 30);
            g.drawOval(143, 140, 60, 60);
            g.drawLine(173, 200, 173, 280);
            g.drawLine(173, 200, 213, 240);
            g.drawLine(173, 200, 133, 240);
            g.drawLine(173, 280, 213, 320);
        }
        if(hangman.getNumOfIncorrectTries() == 10)
        {
            g.fillRect(20, 400, 300, 30);
            g.fillRect(30, 100, 10, 300);
            g.fillRect(40, 100, 150, 10);
            g.fillRect(170, 110, 6, 30);
            g.drawOval(143, 140, 60, 60);
            g.drawLine(173, 200, 173, 280);
            g.drawLine(173, 200, 213, 240);
            g.drawLine(173, 200, 133, 240);
            g.drawLine(173, 280, 213, 320);
            g.drawLine(173, 280, 133, 320);
        }
    }
    
    public void update()
    {
        repaint();
    }
    
}