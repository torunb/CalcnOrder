import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Categories extends JPanel implements ActionListener{

	private JButton button;
	private JButton btnHungerGames;
	private JButton btnEdtUserProfle;
	private JButton btnLogout;
	private AppMain gui;
	private MainPage mPage;
	private Login loginPage;
	/**
	 * Create the frame.
	 */
	public Categories(AppMain g, MainPage mp, Login lp) {
		gui = g;
		mPage = mp;
		loginPage=lp;
		setBounds(100, 100, 900, 600);
		this.setBackground(new Color(255, 204, 153));
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
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
		
		btnHungerGames = new JButton("HUNGER GAMES");
		btnHungerGames.setForeground(new Color(255, 255, 255));
		btnHungerGames.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		btnHungerGames.setBackground(new Color(105, 105, 105));
		btnHungerGames.setBounds(320, 177, 238, 46);
		this.add(btnHungerGames);
		btnHungerGames.addActionListener(this);
		
		btnEdtUserProfle = new JButton("EDIT USER PROFILE");
		btnEdtUserProfle.setForeground(new Color(255, 255, 255));
		btnEdtUserProfle.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		btnEdtUserProfle.setBackground(new Color(105, 105, 105));
		btnEdtUserProfle.setBounds(320, 293, 238, 46);
		this.add(btnEdtUserProfle);
		btnEdtUserProfle.addActionListener(this);
		
		btnLogout = new JButton("LOGOUT");
		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		btnLogout.setBackground(new Color(105, 105, 105));
		btnLogout.setBounds(320, 408, 238, 46);
		this.add(btnLogout);
		btnLogout.addActionListener(this);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			gui.frame.remove(gui.categoriesPage);
        	gui.frame.add(gui.mainPage);
        	gui.mainPage.setVisible(true);
        	gui.frame.repaint();
        	gui.frame.revalidate();
		}
		if (e.getSource() == btnHungerGames) {
			gui.frame.remove(gui.categoriesPage);
        	gui.frame.add(gui.gamesPage);
        	gui.gamesPage.setVisible(true);
        	gui.frame.repaint();
        	gui.frame.revalidate();
		}
		if (e.getSource() == btnEdtUserProfle) {
			gui.frame.remove(gui.categoriesPage);
        	gui.frame.add(gui.userProfilePage);
        	gui.userProfilePage.setVisible(true);
        	gui.frame.repaint();
        	gui.frame.revalidate();
		}
		if (e.getSource() == btnLogout) {
			gui.frame.remove(gui.categoriesPage);
        	gui.frame.add(gui.loginPage);
        	gui.loginPage.setVisible(true);
        	gui.frame.repaint();
        	gui.frame.revalidate();
			String url = "jdbc:mysql://localhost:3306/logininfo";
			String user = "root";
        	String password = "avatarleo85";
				try {	

					Connection conn = DriverManager.getConnection(url,user,password);
					Statement st = conn.createStatement();
					System.out.println("Middle");
					st.executeUpdate("update userinfo set tokens = \"" + mPage.getTokens() +"\" where emailaddress = \"" + loginPage.getResultSet().getString("emailaddress") + "\"");
					conn.close();
					JFrame successFrame = new JFrame();
					JOptionPane.showMessageDialog(successFrame,"Successfully logged out");

				} catch (Exception k) {
					System.out.println("Connection not establised");
				}
			}
		}
}

