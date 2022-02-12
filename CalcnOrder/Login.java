import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


public class Login extends JPanel implements ActionListener{

	private JTextField emailAddress;
	private JPasswordField passwordField;
	private JButton btnLogin;
	private JButton questionMarkButton;
	private JButton btnRegster;
	private AppMain gui; 
	private ResultSet rs;
	private MainPage mainPage;

	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// 	EventQueue.invokeLater(new Runnable() {
	// 		public void run() {
	// 			try {
	// 				Login frame = new Login();
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
	public Login(AppMain g, MainPage mp) {
		gui = g;
		mainPage = mp;
		setBounds(100, 100, 900, 600);
		this.setBackground(new Color(255, 204, 153));
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLayout(null);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Microsoft YaHei", Font.PLAIN, 25));
		lblEmail.setBounds(641, 86, 88, 34);
		this.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 25));
		lblPassword.setBounds(631, 195, 142, 34);
		this.add(lblPassword);
		
		emailAddress = new JTextField();
		emailAddress.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		emailAddress.setBounds(567, 136, 253, 26);
		this.add(emailAddress);
		emailAddress.setColumns(10);
		
		
		JLabel lblForRegistration = new JLabel("Don't have an account? Register!");
		lblForRegistration.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		lblForRegistration.setBounds(518, 365, 360, 35);
		this.add(lblForRegistration);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField.setColumns(10);
		passwordField.setBounds(610, 252, 163, 26);
		this.add(passwordField);
		
		btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		btnLogin.setBackground(new Color(102, 102, 102));
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBounds(631, 311, 133, 46);
		this.add(btnLogin);
		btnLogin.addActionListener(this);
		
		questionMarkButton = new JButton();
		questionMarkButton.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("question.png")));
		questionMarkButton.setBounds(815, 487, 48, 41);
		questionMarkButton.setBackground(new Color(255, 204, 153));
		this.add(questionMarkButton);
		
		btnRegster = new JButton("REGISTER");
		btnRegster.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		btnRegster.addActionListener(this);

		
		btnRegster.setForeground(Color.WHITE);
		btnRegster.setBackground(new Color(102, 102, 102));
		btnRegster.setBounds(631, 420, 132, 46);
		this.add(btnRegster);
		
		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("output-onlinepngtools.png")));
		lblNewLabel_2.setBounds(55, 117, 360, 338);
		this.add(lblNewLabel_2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String url = "jdbc:mysql://localhost:3306/logininfo";
		String user = "root";
        String password = "avatarleo85";
		boolean status = false;
		if(e.getSource() == btnLogin){
			try {
				String email = emailAddress.getText();
				String userPassword = passwordField.getText();
				String sql = "select* from userinfo where emailaddress = ? and password = ?";
				Connection conn = DriverManager.getConnection(url,user,password);
				PreparedStatement st = conn.prepareStatement(sql);
				st.setString(1, email);
				st.setString(2,userPassword);
				rs = st.executeQuery();
				if(rs.next()){
					status=true;
					gui.userProfilePage= new UserProfile(gui, this);
					mainPage.setUserName(rs.getString("name"));
					mainPage.setTokens(Integer.parseInt(rs.getString("tokens")));
				}
				else{
					JFrame errorFrame = new JFrame();
					JOptionPane.showMessageDialog(errorFrame,"Invalid Credentials");
				}
			} catch (Exception k) {
				JOptionPane.showMessageDialog(this, k.getMessage());
			}
			if (status) {
				emailAddress.setText(null);
				passwordField.setText(null);
				gui.frame.remove(gui.loginPage);
        		gui.frame.add(gui.mainPage);
        		gui.mainPage.setVisible(true);
        		gui.frame.repaint();
        		gui.frame.revalidate();
			}
		}

		if (e.getSource() == btnRegster) {
			gui.frame.remove(gui.loginPage);
        	gui.frame.add(gui.registrationPage);
        	gui.registrationPage.setVisible(true);
        	gui.frame.repaint();
        	gui.frame.revalidate();
			emailAddress.setText(null);
			passwordField.setText(null);
		}
		
	}

	public ResultSet getResultSet(){
		return rs;
	}
}
