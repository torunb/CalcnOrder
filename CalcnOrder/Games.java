import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Games extends JPanel implements ActionListener{

	private JButton button;
	private JButton hangmanButton;
	private JButton btnFoodmemory;
	private JButton btnFoodluck;
	private AppMain gui;
	private HungryManGUI guiHangman;
	private MainPage mPage;
	

	/**
	 * Create the frame.
	 */
	public Games(AppMain g) {
		gui = g;
		setBounds(100, 100, 900, 600);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setBackground(new Color(255, 204, 153));
		this.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("output-onlinepngtools-small.png")));
		label.setBounds(679, 16, 184, 176);
		this.add(label);
		
		button = new JButton("");
		button.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("back.png")));
		button.setBounds(15, 16, 74, 57);
		this.add(button);
		button.addActionListener(this);
		
		hangmanButton = new JButton("HangHungryMan");
		hangmanButton.setBackground(new Color(221, 160, 221));
		hangmanButton.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		hangmanButton.setBounds(324, 157, 229, 51);
		this.add(hangmanButton);
		hangmanButton.addActionListener(this);
		
		btnFoodmemory = new JButton("FoodMemory");
		btnFoodmemory.setBackground(new Color(240, 128, 128));
		btnFoodmemory.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		btnFoodmemory.setBounds(324, 287, 229, 51);
		this.add(btnFoodmemory);
		btnFoodmemory.addActionListener(this);
		
		btnFoodluck = new JButton("FoodLuck");
		btnFoodluck.setBackground(new Color(127, 255, 212));
		btnFoodluck.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		btnFoodluck.setBounds(324, 410, 229, 51);
		this.add(btnFoodluck);
		btnFoodluck.addActionListener(this);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("hangman-game.png")));
		label_1.setBounds(185, 144, 87, 77);
		this.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("memory.png")));
		label_2.setBounds(185, 269, 102, 77);
		this.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("game.png")));
		label_3.setBounds(185, 401, 102, 71);
		this.add(label_3);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == hangmanButton) {
			gui.frame.remove(gui.gamesPage);
            gui.frame.add(gui.hangmanPage);
            gui.hangmanPage.setVisible(true);
            gui.frame.repaint();
			gui.frame.revalidate();
		}
		if(e.getSource() == btnFoodmemory){
			gui.frame.remove(gui.gamesPage);
			gui.frame.add(gui.memoryGame);
			gui.frame.pack();
			gui.frame.setBounds(100, 100, 900, 600);
            gui.memoryGame.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
			
		}
		if(e.getSource() == btnFoodluck){
			gui.frame.remove(gui.gamesPage);
			gui.frame.add(gui.luckyFoodPage);
			gui.frame.pack();
			gui.frame.setBounds(100, 100, 900, 600);
            gui.memoryGame.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
		}
		if (e.getSource() == button) {
			gui.frame.remove(gui.gamesPage);
            gui.frame.add(gui.categoriesPage);
            gui.categoriesPage.setVisible(true);
            gui.frame.repaint();
            gui.frame.revalidate();
		}
		
	}

}
