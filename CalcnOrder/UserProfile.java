import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;

public class UserProfile extends JPanel implements ActionListener{

	private JTextField nameTextField;
	private JTextField passwordTextField;
	private JTextField emailTextField;
	private JTextField phoneTextField;
	private JTextField ddField;
	private JTextField mmField;
	private JTextField yyField;
	private JLabel slash1;
	private JLabel slash2;
	private JButton btnUpdate;
	private JTextArea addressTextArea;
	private JLabel lblCity;
	private JTextField textFieldCity;
	private JButton backButton;
	private JButton btnNewButton;
	private AppMain gui;
	private Login log;
	String email;
	String password;
	String name;
	String phoneNumber;
	String address;
	InputStream is;
	int date;
	int month;
	int year;
	String city;
	

	/**
	 * Create the panel
	 * @throws SQLException
	 * @throws IOException
	 */
	public UserProfile(AppMain g, Login login) throws SQLException, IOException {
		gui = g;
		log = login;
		setBounds(100, 100, 900, 600);
		ResultSet rs = log.getResultSet();
		

		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setBackground(new Color(255, 204, 153));
		this.setLayout(null);

		try {
			email = rs.getString("emailaddress");
			password = rs.getString("password");
			name = rs.getString("name");
			phoneNumber = rs.getString("phoneNumber");
			address = rs.getString("address");
			is = rs.getBinaryStream("picture");
			date = rs.getInt("DDField");
			month = rs.getInt("MMField");
			year = rs.getInt("YYField");
			city = rs.getString("city");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("output-onlinepngtools-small.png")));
		lblNewLabel.setBounds(336, 16, 181, 166);
		this.add(lblNewLabel);
		
		JLabel userImagelbl = new JLabel();
		userImagelbl.setBounds(61, 150, 256, 301);
		BufferedImage bufImg = null;
		bufImg = ImageIO.read(is);
		Image dimg = bufImg.getScaledInstance(userImagelbl.getWidth(), userImagelbl.getHeight(),
        Image.SCALE_SMOOTH);
		ImageIcon icon =new ImageIcon(dimg);
		userImagelbl.setIcon(icon);
		this.add(userImagelbl);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		lblName.setBounds(523, 169, 69, 20);
		this.add(lblName);
		
		JLabel lblSurname = new JLabel("Password:");
		lblSurname.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		lblSurname.setBounds(523, 218, 90, 20);
		this.add(lblSurname);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		lblEmail.setBounds(523, 271, 69, 20);
		this.add(lblEmail);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth:");
		lblDateOfBirth.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		lblDateOfBirth.setBounds(523, 325, 118, 20);
		this.add(lblDateOfBirth);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		lblPhoneNumber.setBounds(523, 378, 152, 20);
		this.add(lblPhoneNumber);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		lblAddress.setBounds(523, 485, 90, 20);
		this.add(lblAddress);
		
		btnUpdate = new JButton("UPDATE");
		btnUpdate.setBackground(new Color(128, 128, 128));
		btnUpdate.setForeground(new Color(255, 255, 255));
		btnUpdate.setFont(new Font("Microsoft YaHei", Font.PLAIN, 17));
		btnUpdate.setBounds(645, 531, 115, 25);
		this.add(btnUpdate);
		btnUpdate.addActionListener(this);
		
		nameTextField = new JTextField(name);
		nameTextField.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		nameTextField.setEditable(false);
		nameTextField.setBounds(686, 167, 146, 26);
		this.add(nameTextField);
		nameTextField.setColumns(10);
		
		passwordTextField = new JTextField(password);
		passwordTextField.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		passwordTextField.setColumns(10);
		passwordTextField.setBounds(686, 216, 146, 26);
		this.add(passwordTextField);
		
		emailTextField = new JTextField(email);
		emailTextField.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		emailTextField.setColumns(10);
		emailTextField.setBounds(686, 269, 193, 26);
		this.add(emailTextField);
		
		phoneTextField = new JTextField(phoneNumber);
		phoneTextField.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		phoneTextField.setColumns(10);
		phoneTextField.setBounds(686, 376, 193, 26);
		this.add(phoneTextField);
		
		addressTextArea = new JTextArea(address);
		addressTextArea.setFont(new Font("Microsoft YaHei", Font.PLAIN, 16));
		addressTextArea.setBounds(686, 475, 193, 40);
		this.add(addressTextArea);
		
		backButton = new JButton();
		backButton.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("back.png")));
		backButton.setBounds(15, 16, 69, 51);
		this.add(backButton);
		backButton.addActionListener(this);
		
		btnNewButton = new JButton("Previous Orders");
		btnNewButton.setForeground(new Color(240, 248, 255));
		btnNewButton.setBackground(new Color(32, 178, 170));
		btnNewButton.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		btnNewButton.setBounds(671, 16, 181, 51);
		this.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		ddField = new JTextField(date + "");
		ddField.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		ddField.setEditable(false);
		ddField.setColumns(10);
		ddField.setBounds(686, 323, 40, 26);
		this.add(ddField);
		
		mmField = new JTextField(month+"");
		mmField.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		mmField.setEditable(false);
		mmField.setColumns(10);
		mmField.setBounds(752, 323, 40, 26);
		this.add(mmField);
		
		yyField = new JTextField(year+"");
		yyField.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		yyField.setEditable(false);
		yyField.setColumns(10);
		yyField.setBounds(819, 323, 60, 26);
		this.add(yyField);
		
		slash1 = new JLabel("/");
		slash1.setFont(new Font("Tahoma", Font.BOLD, 20));
		slash1.setBounds(734, 324, 14, 20);
		this.add(slash1);
		
		slash2 = new JLabel("/");
		slash2.setFont(new Font("Tahoma", Font.BOLD, 20));
		slash2.setBounds(803, 326, 14, 20);
		this.add(slash2);
		
		lblCity = new JLabel("City:");
		lblCity.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		lblCity.setBounds(523, 431, 90, 20);
		this.add(lblCity);
		
		textFieldCity = new JTextField(city);
		textFieldCity.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		textFieldCity.setColumns(10);
		textFieldCity.setBounds(686, 425, 146, 26);
		this.add(textFieldCity);
		textFieldCity.setEditable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == backButton) {
			gui.frame.remove(gui.userProfilePage);
        	gui.frame.add(gui.mainPage);
        	gui.mainPage.setVisible(true);
        	gui.frame.repaint();
        	gui.frame.revalidate();
		}
		if (e.getSource() == btnUpdate) {
			String url = "jdbc:mysql://localhost:3306/logininfo";
			String user = "root";
        	String password = "avatarleo85";
			if (passwordTextField.getText().isEmpty() || phoneTextField.getText().isEmpty() || addressTextArea.getText().isEmpty()){
				JFrame errorFrame = new JFrame();
				JOptionPane.showMessageDialog(errorFrame,"Please fill all mandatory fields");
			}
			else{
				try {
					String userPassword = passwordTextField.getText();
					String phoneNumber = phoneTextField.getText();
					String address = addressTextArea.getText();
	
					Connection conn = DriverManager.getConnection(url,user,password);
					Statement st = conn.createStatement();
					System.out.println("Middle");
					st.executeUpdate("update userinfo set password = \"" + userPassword +"\" where emailaddress = \"" + email + "\"");
					st.executeUpdate("update userinfo set phoneNumber = \"" + phoneNumber +"\" where emailaddress = \"" + email + "\"");
					st.executeUpdate("update userinfo set address = \"" + address +"\" where emailaddress = \"" + email + "\"");
					conn.close();
					System.out.println("DONE");
					JFrame successFrame = new JFrame();
					JOptionPane.showMessageDialog(successFrame,"Information updated successfully");
					gui.frame.remove(gui.userProfilePage);
        			gui.frame.add(gui.mainPage);
        			gui.mainPage.setVisible(true);
        			gui.frame.repaint();
        			gui.frame.revalidate();
				} catch (Exception k) {
					System.out.println("Connection not establised");
				}
			}
		}

		if (e.getSource() == btnNewButton) {
			gui.frame.remove(gui.userProfilePage);
        	gui.frame.add(gui.previousOrderPage);
        	gui.previousOrderPage.setVisible(true);
        	gui.frame.repaint();
        	gui.frame.revalidate();
		}
		
	}

}
