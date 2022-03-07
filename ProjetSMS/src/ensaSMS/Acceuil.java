package ensaSMS;
import java.sql.*;

import javax.swing.*;
import java.sql.Connection;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;

public class Acceuil {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	public void show()
	{
		this.frame.setVisible(true);
	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acceuil window = new Acceuil();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Connection connection = null;
	

	/**
	 * Create the application.
	 */
	public Acceuil() {
		initialize();
		connection = SqliteConnection.dbConnector();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 568, 409);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(0, 0, 552, 79);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Acceuil.class.getResource("/imageSMS/JO.png")));
		lblNewLabel.setBounds(194, 11, 186, 57);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(250, 144, 90, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Connexion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query = "select * from Personnel where Username = ? and MotDePasse=?  ";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, textField.getText() );
					pst.setString(2, passwordField.getText() );
					
					ResultSet rs = pst.executeQuery();
					int count = 0;
					while(rs.next()) {
						count = count +1;
						
					}
					if (count == 1) {
						
						InterProf inter = new InterProf();
						inter.setVisible(true);
						frame.dispose();
						 
					}else if (count > 1) {
						JOptionPane.showMessageDialog(null, "Duplicate Username and password");
						
					}else {
						JOptionPane.showMessageDialog(null, "Username and password is not correct Try again...");
						
					}
					
					rs.close();
					pst.close();
				
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
				finally {
					try {
						
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, e1);
					}
				}
				
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(70, 130, 180));
		btnNewButton.setBounds(248, 237, 104, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Espace recrutement");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfaceRecrue recrue = new InterfaceRecrue();
				recrue.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(347, 310, 176, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Bienvenue sur notre plateforme");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(70, 130, 180));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(138, 90, 279, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Se souvenir du nom d'utilisateur");
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBounds(192, 207, 209, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(250, 175, 90, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(136, 147, 77, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mot de Passe");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(137, 178, 76, 14);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
