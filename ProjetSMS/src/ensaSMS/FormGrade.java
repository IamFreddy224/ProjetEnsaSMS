package ensaSMS;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;

public class FormGrade extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtEmail;
	private JTextField txtTlphone;
	private JTextField txtMatricule;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormGrade frame = new FormGrade();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormGrade() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 374);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(0, 0, 506, 66);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(FormGrade.class.getResource("/imageSMS/JO.png")));
		lblNewLabel.setBounds(20, 11, 135, 44);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(FormGrade.class.getResource("/imageSMS/Acceuil.png")));
		lblNewLabel_1.setBounds(10, 24, 37, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(FormGrade.class.getResource("/imageSMS/utilisss.png")));
		lblNewLabel_2.setBounds(341, 11, 46, 31);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(FormGrade.class.getResource("/imageSMS/notiffff.png")));
		lblNewLabel_3.setBounds(386, 11, 37, 27);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(FormGrade.class.getResource("/imageSMS/messsssssssage.png")));
		lblNewLabel_4.setBounds(422, 11, 32, 33);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(FormGrade.class.getResource("/imageSMS/para.png")));
		lblNewLabel_5.setBounds(464, 11, 32, 27);
		panel.add(lblNewLabel_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(248, 248, 255));
		panel_1.setBounds(0, 65, 100, 270);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("F.perso");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(70, 130, 180));
		btnNewButton.setBounds(0, 81, 99, 23);
		panel_1.add(btnNewButton);
		
		JButton btnTche = new JButton("T\u00E2che");
		btnTche.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTche.setBackground(new Color(70, 130, 180));
		btnTche.setBounds(0, 46, 99, 23);
		panel_1.add(btnTche);
		
		JButton btnCalendrier = new JButton("Calendrier");
		btnCalendrier.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCalendrier.setBackground(new Color(70, 130, 180));
		btnCalendrier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCalendrier.setBounds(0, 11, 99, 23);
		panel_1.add(btnCalendrier);
		
		JTextPane txtpnFormulaireDemandeDavancement = new JTextPane();
		txtpnFormulaireDemandeDavancement.setForeground(new Color(70, 130, 180));
		txtpnFormulaireDemandeDavancement.setText("Formulaire demande d'Avancement");
		txtpnFormulaireDemandeDavancement.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnFormulaireDemandeDavancement.setBounds(197, 77, 227, 20);
		contentPane.add(txtpnFormulaireDemandeDavancement);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(209, 130, 241, 20);
		contentPane.add(textField);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(209, 161, 241, 20);
		contentPane.add(txtEmail);
		
		txtTlphone = new JTextField();
		txtTlphone.setColumns(10);
		txtTlphone.setBounds(209, 201, 241, 20);
		contentPane.add(txtTlphone);
		
		txtMatricule = new JTextField();
		txtMatricule.setColumns(10);
		txtMatricule.setBounds(209, 232, 241, 20);
		contentPane.add(txtMatricule);
		
		JButton btnNewButton_3 = new JButton("Soumettre");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fremplie grade = new Fremplie();
				grade.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(335, 295, 115, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("Retour");
		btnNewButton_3_1.setBounds(123, 295, 89, 23);
		contentPane.add(btnNewButton_3_1);
		
		JLabel lblNewLabel_6 = new JLabel("Nom");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setForeground(new Color(0, 0, 0));
		lblNewLabel_6.setBounds(119, 133, 57, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("Email");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_6_1.setBounds(119, 164, 57, 14);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("Tel");
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_6_2.setBounds(119, 204, 57, 14);
		contentPane.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_3 = new JLabel("Matricule");
		lblNewLabel_6_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_6_3.setBounds(119, 235, 57, 14);
		contentPane.add(lblNewLabel_6_3);
	}
}
