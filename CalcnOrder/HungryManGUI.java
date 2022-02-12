import javax.swing.*;
import java.awt.*;

/**
 * Program Description 
 * @author Program Author
 * @version 01.08.2021
*/ 
public class HungryManGUI extends JPanel
{
    //Properties
    private HangHungryManModel  hangman;
    private HangmanGraphics     drawing;
    private HangmanInfo         info;
    private HangmanTextField    field;
    private AppMain             gui;
    private JLabel              label;
    private MainPage mPage;
    
    //Constructor
    public HungryManGUI(AppMain g, MainPage mp)
    {
        mPage=mp;
        gui = g;
        setBounds(100, 100, 900, 600);    
            
        label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("output-onlinepngtools-small.png")));
        //label.setBounds(653, 0, 201, 184);
        
        
        hangman = new HangHungryManModel();
        drawing = new HangmanGraphics(hangman);
        info    = new HangmanInfo(hangman, gui);
        field   = new HangmanTextField(hangman, gui, mPage);
        hangman.recognizeViews();
        
        hangman.addView(drawing);
        hangman.addView(info);
        
        
        this.setLayout(new BorderLayout());
        this.add(drawing, BorderLayout.CENTER);
        this.add(label, BorderLayout.EAST);
        this.add(info, BorderLayout.WEST);
        this.add(field, BorderLayout.NORTH);
        this.setBackground(new Color(255, 204, 153));
        this.setVisible(true);
    }
        
}