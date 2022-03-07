package ensaSMS;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.*;
import java.sql.Connection;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;

public class InterfaceRecrue extends JFrame {

	private JPanel contentPane;
	private JTextField txtNom;
	private JTextField txtEmail;
	private JTextField txtTlphone;
	private JTextField txtMatricule;
	private JTextField txtDiscipline;
	private JTextField txtCin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceRecrue frame = new InterfaceRecrue();
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
	public InterfaceRecrue() {
		connection = SqliteConnection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 408);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(0, 0, 552, 59);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(InterfaceRecrue.class.getResource("/imageSMS/JO.png")));
		lblNewLabel_1.setBounds(10, 5, 134, 45);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(InterfaceRecrue.class.getResource("/imageSMS/Acceuil.png")));
		lblNewLabel_2.setBounds(10, 11, 37, 28);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(InterfaceRecrue.class.getResource("/imageSMS/notiffff.png")));
		lblNewLabel_4.setBounds(416, 11, 37, 28);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(InterfaceRecrue.class.getResource("/imageSMS/messsssssssage.png")));
		lblNewLabel_5.setBounds(449, 11, 46, 28);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(InterfaceRecrue.class.getResource("/imageSMS/para.png")));
		lblNewLabel_6.setBounds(505, 11, 37, 28);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel = new JLabel("Formulaire de Candidature");
		lblNewLabel.setBounds(154, 11, 209, 31);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setForeground(new Color(248, 248, 255));
		btnNewButton_2.setBackground(new Color(248, 248, 255));
		btnNewButton_2.setIcon(new ImageIcon(InterfaceRecrue.class.getResource("/imageSMS/utilisss.png")));
		btnNewButton_2.setBounds(364, 5, 42, 45);
		panel.add(btnNewButton_2);
		
		JTextPane txtpnRemplissezSoigneusementLe = new JTextPane();
		txtpnRemplissezSoigneusementLe.setForeground(new Color(70, 130, 180));
		txtpnRemplissezSoigneusementLe.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnRemplissezSoigneusementLe.setText("Remplissez soigneusement le formulaire suivant suivant ");
		txtpnRemplissezSoigneusementLe.setBounds(132, 70, 298, 20);
		contentPane.add(txtpnRemplissezSoigneusementLe);
		
		txtNom = new JTextField();
		txtNom.setBounds(132, 101, 279, 20);
		contentPane.add(txtNom);
		txtNom.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(132, 163, 279, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtTlphone = new JTextField();
		txtTlphone.setBounds(132, 194, 279, 20);
		contentPane.add(txtTlphone);
		txtTlphone.setColumns(10);
		
		txtMatricule = new JTextField();
		txtMatricule.setBounds(132, 220, 279, 20);
		contentPane.add(txtMatricule);
		txtMatricule.setColumns(10);
		
		txtDiscipline = new JTextField();
		txtDiscipline.setColumns(10);
		txtDiscipline.setBounds(132, 251, 279, 20);
		contentPane.add(txtDiscipline);
		
		JButton btnNewButton = new JButton("Soumettre");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query = "insert into CandidatureDB(NOM,CIN,Email,Tel,Matricules,Discipline) values(?,?,?,?,?,?)";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, txtNom.getText() );
					pst.setString(2, txtCin.getText());
					pst.setString(3, txtEmail.getText() );
					pst.setString(4, txtTlphone.getText() );
					pst.setString(5, txtMatricule.getText() );
					pst.setString(6, txtDiscipline.getText() );
					
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
		btnNewButton.setBackground(new Color(70, 130, 180));
		btnNewButton.setBounds(366, 316, 111, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Retour");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acceuil d = new Acceuil();
				d.show();
			}
		});
		btnNewButton_1.setBackground(new Color(70, 130, 180));
		btnNewButton_1.setBounds(73, 316, 89, 23);
		contentPane.add(btnNewButton_1);
		
		txtCin = new JTextField();
		txtCin.setColumns(10);
		txtCin.setBounds(132, 132, 279, 20);
		contentPane.add(txtCin);
		
		JLabel lblNewLabel_3 = new JLabel("Nom");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(40, 104, 74, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("CIN");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(40, 135, 74, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Email");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_2.setBounds(40, 166, 74, 14);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("TEL");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_3.setBounds(40, 200, 74, 14);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Adresse");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_4.setBounds(40, 223, 74, 14);
		contentPane.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("Discipline");
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_5.setBounds(40, 254, 74, 14);
		contentPane.add(lblNewLabel_3_5);
		
		JButton btnNewButton_3 = new JButton("Importer");
		btnNewButton_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_3.setBounds(230, 316, 89, 23);
		contentPane.add(btnNewButton_3);
	}
}
