import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.event.*;

public class PreviousOrders extends JPanel implements ActionListener{

	private JButton button;
	private JTextArea textArea;
	private AppMain gui;

	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// 	EventQueue.invokeLater(new Runnable() {
	// 		public void run() {
	// 			try {
	// 				PreviousOrders frame = new PreviousOrders();
	// 				frame.setVisible(true);
	// 			} catch (Exception e) {
	// 				e.printStackTrace();
	// 			}
	// 		}
	// 	});
	// }

	/**
	 * Create the frame.
	 */
	public PreviousOrders(AppMain g) {
		gui =g;
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setBackground(new Color(255, 204, 153));
		this.setLayout(null);
		
		button = new JButton("");
		button.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("back.png")));
		button.setBounds(15, 16, 71, 57);
		this.add(button);
		button.addActionListener(this);
		
		JLabel lblNewLabel = new JLabel("PREVIOUS ORDERS");
		lblNewLabel.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblNewLabel.setBounds(346, 16, 193, 57);
		this.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("output-onlinepngtools-small.png")));
		label.setBounds(691, 0, 188, 169);
		this.add(label);
		
		textArea = new JTextArea("");
		textArea.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		textArea.setBackground(new Color(176, 196, 222));
		textArea.setBounds(0, 155, 894, 405);
		this.add(textArea);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			gui.frame.remove(gui.previousOrderPage);
        	gui.frame.add(gui.userProfilePage);
        	gui.userProfilePage.setVisible(true);
        	gui.frame.repaint();
        	gui.frame.revalidate();
		}
		
	}

	public void setOrders(String str){ 
		textArea.setText(textArea.getText() + str+ "\n"); 
	}
}
