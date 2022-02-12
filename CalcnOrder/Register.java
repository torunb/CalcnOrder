import java.awt.Color;
import java.awt.Component;
import java.sql.*;
import java.io.InputStream;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JPasswordField;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Register extends JPanel implements ActionListener{

	private JTextField nameTextField;
	private JTextField emailTextField;
	private JTextField phoneNumberTextField;
	private JPasswordField passwordField;
	private JTextArea addressTextArea;
	private JButton btnRegster;
	private JLabel userPicturelbl;
	private JButton btnAddPicture;
	private JButton button;
	private JTextField textFieldCity;
	private JTextField dayField;
	private JTextField monthField;
	private JTextField yearField;
	private AppMain gui;
	private ImageIcon uploadIcon;
	private String pathOfImage;
	/**
	 * Launch the application.
	 
	 public static void main(String[] args) {
	 	EventQueue.invokeLater(new Runnable() {
	 		public void run() {
	 			try {
	 				JFrame frame = new JFrame();
	 				frame.getContentPane().add(new Register());
	 				frame.setVisible(true);
	 			} catch (Exception e) {
	 				e.printStackTrace();
	 			}
	 		}
	 	});
	 }
	 */

	/**
	 * Create the frame.
	 */
	public Register(AppMain g) {
		gui = g;
		setBounds(100, 100, 900, 600);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setBackground(new Color(255, 204, 153));
		this.setLayout(null);
		
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("output-onlinepngtools-small.png")));
		label.setBounds(334, 16, 210, 164);
		this.add(label);
		
		JLabel lblName = new JLabel("Name: *");
		lblName.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblName.setBounds(108, 180, 88, 28);
		this.add(lblName);
		
		JLabel lblDateOFbirth = new JLabel("Date of Birth: *");
		lblDateOFbirth.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblDateOFbirth.setBounds(110, 321, 143, 28);
		this.add(lblDateOFbirth);
		
		JLabel lblEmailAddress = new JLabel("Email Address: *");
		lblEmailAddress.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblEmailAddress.setBounds(108, 224, 157, 28);
		this.add(lblEmailAddress);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number: *");
		lblPhoneNumber.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblPhoneNumber.setBounds(108, 365, 175, 28);
		this.add(lblPhoneNumber);
		
		JLabel lblAddress = new JLabel("Address: *");
		lblAddress.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblAddress.setBounds(108, 462, 98, 28);
		this.add(lblAddress);
		
		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		nameTextField.setBounds(312, 183, 146, 26);
		this.add(nameTextField);
		nameTextField.setColumns(10);
		
		emailTextField = new JTextField();
		emailTextField.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		emailTextField.setColumns(10);
		emailTextField.setBounds(312, 227, 263, 26);
		this.add(emailTextField);

		
		phoneNumberTextField = new JTextField();
		phoneNumberTextField.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		phoneNumberTextField.setColumns(10);
		phoneNumberTextField.setBounds(312, 368, 221, 26);
		this.add(phoneNumberTextField);
		
		addressTextArea = new JTextArea();
		addressTextArea.setFont(new Font("Microsoft YaHei", Font.PLAIN, 16));
		addressTextArea.setBounds(314, 452, 261, 54);
		this.add(addressTextArea);
		
		btnRegster = new JButton("REGISTER");
		btnRegster.setForeground(new Color(255, 255, 255));
		btnRegster.setBackground(new Color(105, 105, 105));
		btnRegster.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		btnRegster.setBounds(681, 500, 143, 29);
		this.add(btnRegster);
		btnRegster.addActionListener(this);
		
		userPicturelbl = new JLabel();
		userPicturelbl.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("user (2).png")));
		userPicturelbl.setBounds(685, 137, 178, 144);
		this.add(userPicturelbl);
		
		btnAddPicture = new JButton("Add Picture");
		btnAddPicture.setBackground(new Color(211, 211, 211));
		btnAddPicture.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
		btnAddPicture.setBounds(681, 302, 143, 29);
		this.add(btnAddPicture);
		btnAddPicture.addActionListener(this);
		
		button = new JButton();
		button.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("back.png")));
		button.setBounds(15, 16, 73, 54);
		button.setBackground(new Color(255, 204, 153));
		this.add(button);
		button.addActionListener(this);
		
		JLabel lblPassword = new JLabel("Password: *");
		lblPassword.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblPassword.setBounds(108, 277, 157, 28);
		this.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField.setBounds(312, 280, 146, 26);
		this.add(passwordField);
		
		JLabel lblCity = new JLabel("City: *");
		lblCity.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblCity.setBounds(108, 409, 98, 28);
		add(lblCity);
		
		textFieldCity = new JTextField();
		textFieldCity.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		textFieldCity.setColumns(10);
		textFieldCity.setBounds(312, 410, 146, 26);
		add(textFieldCity);
		
		dayField = new JTextField("DD");
		dayField.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		dayField.setBounds(312, 324, 44, 26);
		add(dayField);
		dayField.addFocusListener(new FocusListener() {
		    public void focusGained(FocusEvent e) {
		        dayField.setText("");
		    }
		    public void focusLost(FocusEvent e) {
		    	if(dayField.getText().isEmpty())
		    		dayField.setText("DD");
		    	else
		    		return;
		    }
		});
		
		monthField = new JTextField("MM");
		monthField.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		monthField.setBounds(383, 324, 44, 26);
		add(monthField);
		monthField.addFocusListener(new FocusListener() {
		    public void focusGained(FocusEvent e) {
		        monthField.setText("");
		    }

		    public void focusLost(FocusEvent e) {
		    	if(monthField.getText().isEmpty())
		    		monthField.setText("MM");
		    	else 
		    		return;
		    }
		});
		
		yearField = new JTextField("YYYY");
		yearField.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		yearField.setBounds(454, 324, 79, 26);
		add(yearField);
		yearField.addFocusListener(new FocusListener() {
		    public void focusGained(FocusEvent e) {
		        yearField.setText("");
		    }

		    public void focusLost(FocusEvent e) {
		    	if(yearField.getText().isEmpty())
		    		yearField.setText("YYYY");
		    	else
		    		return;
		    }
		});
		
		JLabel label_2 = new JLabel("/");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_2.setBounds(359, 327, 25, 22);
		add(label_2);
		
		JLabel label_3 = new JLabel("/");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_3.setBounds(433, 327, 25, 22);
		add(label_3);
	}

	public ImageIcon resizeImage(String imagePath){
		ImageIcon myIcon = new ImageIcon(imagePath);
		Image img = myIcon.getImage();
		Image newImg = img.getScaledInstance(userPicturelbl.getWidth()-18, userPicturelbl.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(newImg);
		return image;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String url = "jdbc:mysql://localhost:3306/logininfo";
		String user = "root";
        String password = "avatarleo85";
		boolean status = false;
		if(e.getSource() == btnRegster){
			if (emailTextField.getText().isEmpty() || passwordField.getText().isEmpty() || phoneNumberTextField.getText().isEmpty() ||
			addressTextArea.getText().isEmpty() || nameTextField.getText().isEmpty() || textFieldCity.getText().isEmpty() || 
			dayField.getText().isEmpty()|| monthField.getText().isEmpty()|| yearField.getText().isEmpty()){
				JFrame errorFrame = new JFrame();
				JOptionPane.showMessageDialog(errorFrame,"Please fill all mandatory fields");
			}
			else{
				try {
					String email = emailTextField.getText();
					String userPassword = passwordField.getText();
					String city = textFieldCity.getText();
					String phoneNumber = phoneNumberTextField.getText();
					String address = addressTextArea.getText();
					int date = Integer.parseInt(dayField.getText());
					int month = Integer.parseInt(monthField.getText());
					int year = Integer.parseInt(yearField.getText());
					String name = nameTextField.getText();
					String sql = "INSERT INTO userinfo values (?,?,?,?,?,?,?,?,?,?,?)";

					Connection conn = DriverManager.getConnection(url,user,password);
					PreparedStatement st = conn.prepareStatement(sql);
					
					InputStream is= new FileInputStream(new File(pathOfImage));
					st.setString(1,email);
					st.setString(2, userPassword);
					st.setString(3, name);
					st.setInt(4, date);
					st.setInt(5, month);
					st.setInt(6, year);
					st.setString(7, phoneNumber);
					st.setString(8, city);
					st.setString(9, address);
					st.setBlob(10, is);
					st.setInt(11,0);

					st.executeUpdate();
					conn.close();
					status = true;
				} catch (Exception k) {
					System.out.println("Connection not establised");
				}
				if (status){
					JFrame successFrame = new JFrame();
					JOptionPane.showMessageDialog(successFrame,"Registration Successful!");
					gui.frame.remove(gui.registrationPage);
        			gui.frame.add(gui.loginPage);
        			gui.loginPage.setVisible(true);
        			gui.frame.repaint();
        			gui.frame.revalidate();
					emailTextField.setText("");
					passwordField.setText("");
					nameTextField.setText("");
					addressTextArea.setText("");
					phoneNumberTextField.setText("");
					dayField.setText("");
					monthField.setText("");
					yearField.setText("");
				}
			}
		}	
		if (e.getSource() == button) {
			gui.frame.remove(gui.registrationPage);
        	gui.frame.add(gui.loginPage);
        	gui.loginPage.setVisible(true);
        	gui.frame.repaint();
        	gui.frame.revalidate();
			for(Component j : this.getComponents())
			{
				if(j instanceof JTextField){ 
        		JTextField textField = (JTextField) j;
        		textField.setText("");
				}
    		}
			textFieldCity.setText("");
			userPicturelbl.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("user (2).png")));
		}

		if(e.getSource() ==btnAddPicture){
			JFileChooser file = new JFileChooser();
			file.setCurrentDirectory(new File(System.getProperty("user.home")));
			FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
          	file.addChoosableFileFilter(filter);
          	int result = file.showSaveDialog(null);
			if(result == JFileChooser.APPROVE_OPTION){
			File selectedFile = file.getSelectedFile();
			String path = selectedFile.getAbsolutePath();
			pathOfImage =path;
			uploadIcon = resizeImage(path);
			userPicturelbl.setIcon(uploadIcon);
			}
		}
	}
}
