package ensaSMS;

import java.sql.*;

import javax.swing.*;
import java.sql.Connection;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;

public class FormAttes extends JFrame {

	private JPanel contentPane;
	private JTextField txtNom;
	private JTextField txtPrnom;
	private JTextField txtEmail;
	private JTextField txtTlphone;
	private JTextField txtMatricule;
	private JTextField txtTypeDattestation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormAttes frame = new FormAttes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Connection connection = null;

	/**
	 * Create the frame.
	 */
	public FormAttes() {
		connection = SqliteConnection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 373);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(0, 0, 512, 58);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(FormAttes.class.getResource("/imageSMS/utilisss.png")));
		lblNewLabel.setBounds(341, 11, 40, 33);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(FormAttes.class.getResource("/imageSMS/notiffff.png")));
		lblNewLabel_1.setBounds(391, 11, 31, 33);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(FormAttes.class.getResource("/imageSMS/messsssssssage.png")));
		lblNewLabel_2.setBounds(421, 11, 40, 25);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(FormAttes.class.getResource("/imageSMS/para.png")));
		lblNewLabel_3.setBounds(471, 11, 31, 25);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(FormAttes.class.getResource("/imageSMS/Acceuil.png")));
		lblNewLabel_4.setBounds(10, 11, 40, 23);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(FormAttes.class.getResource("/imageSMS/JO.png")));
		lblNewLabel_5.setBounds(33, 0, 134, 47);
		panel.add(lblNewLabel_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(248, 248, 255));
		panel_1.setBounds(0, 58, 100, 276);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Calendrier");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(70, 130, 180));
		btnNewButton.setBounds(0, 11, 100, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("T\u00E2che");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBackground(new Color(70, 130, 180));
		btnNewButton_1.setBounds(0, 45, 100, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("F.perso");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBackground(new Color(70, 130, 180));
		btnNewButton_2.setBounds(0, 79, 100, 23);
		panel_1.add(btnNewButton_2);
		
		JTextPane txtpnVeuillezRemplirCe = new JTextPane();
		txtpnVeuillezRemplirCe.setForeground(new Color(70, 130, 180));
		txtpnVeuillezRemplirCe.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnVeuillezRemplirCe.setText("Formulaire demande d'attestation");
		txtpnVeuillezRemplirCe.setBounds(160, 69, 244, 20);
		contentPane.add(txtpnVeuillezRemplirCe);
		
		txtNom = new JTextField();
		txtNom.setBounds(232, 97, 213, 20);
		contentPane.add(txtNom);
		txtNom.setColumns(10);
		
		txtPrnom = new JTextField();
		txtPrnom.setColumns(10);
		txtPrnom.setBounds(232, 125, 213, 20);
		contentPane.add(txtPrnom);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(232, 154, 213, 20);
		contentPane.add(txtEmail);
		
		txtTlphone = new JTextField();
		txtTlphone.setColumns(10);
		txtTlphone.setBounds(232, 186, 213, 20);
		contentPane.add(txtTlphone);
		
		txtMatricule = new JTextField();
		txtMatricule.setColumns(10);
		txtMatricule.setBounds(232, 225, 213, 20);
		contentPane.add(txtMatricule);
		
		txtTypeDattestation = new JTextField();
		txtTypeDattestation.setColumns(10);
		txtTypeDattestation.setBounds(231, 256, 175, 20);
		contentPane.add(txtTypeDattestation);
		
		JButton btnNewButton_3 = new JButton("Retour");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acceuil f = new Acceuil();
				f.show();
			}
		});
		btnNewButton_3.setBackground(new Color(70, 130, 180));
		btnNewButton_3.setBounds(110, 301, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Soumettre");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query = "insert into FormAttestation(Nom,Prénom,Email,Tel,Matricule,Type) values(?,?,?,?,?,?)";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, txtNom.getText() );
					pst.setString(2, txtPrnom.getText() );
					pst.setString(3, txtEmail.getText() );
					pst.setString(4, txtTlphone.getText() );
					pst.setString(5, txtMatricule.getText() );
					pst.setString(6, txtTypeDattestation.getText() );
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Data Saved");
					Fremplie formu = new Fremplie();
					formu.setVisible(true);
					pst.close();
					
					
					
					
				}catch(Exception e1) {
					e1.printStackTrace();
					
				}
				
			}
		});
		btnNewButton_4.setBackground(new Color(70, 130, 180));
		btnNewButton_4.setBounds(357, 301, 118, 23);
		contentPane.add(btnNewButton_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("Travail\r\nSalaire");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Travail", "Salaire"}));
		comboBox.setBounds(409, 256, 66, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_6 = new JLabel("Nom");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(114, 100, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("Pr\u00E9nom");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6_1.setBounds(114, 128, 46, 14);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("Email");
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6_2.setBounds(114, 157, 46, 14);
		contentPane.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_3 = new JLabel("Tel");
		lblNewLabel_6_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6_3.setBounds(114, 189, 46, 14);
		contentPane.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_6_5 = new JLabel("Matricule");
		lblNewLabel_6_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6_5.setBounds(114, 228, 66, 14);
		contentPane.add(lblNewLabel_6_5);
		
		JLabel lblNewLabel_6_6 = new JLabel("Type d'attestation");
		lblNewLabel_6_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6_6.setBounds(110, 259, 111, 14);
		contentPane.add(lblNewLabel_6_6);
	}
}
