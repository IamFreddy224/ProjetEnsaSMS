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
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterProf extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterProf frame = new InterProf();
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
	public InterProf() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 360);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(0, 0, 489, 61);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(InterProf.class.getResource("/imageSMS/utilisss.png")));
		lblNewLabel_1.setBounds(329, 11, 46, 39);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(InterProf.class.getResource("/imageSMS/notiffff.png")));
		lblNewLabel_2.setBounds(368, 11, 38, 39);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(InterProf.class.getResource("/imageSMS/messsssssssage.png")));
		lblNewLabel_3.setBounds(400, 11, 38, 26);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(448, 11, 31, 27);
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setIcon(new ImageIcon(InterProf.class.getResource("/imageSMS/para.png")));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(58, 2, 138, 56);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(InterProf.class.getResource("/imageSMS/JO.png")));
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acceuil b = new Acceuil();
				b.show();
				
			}
		});
		btnNewButton_4.setBackground(new Color(248, 248, 255));
		btnNewButton_4.setIcon(new ImageIcon(InterProf.class.getResource("/imageSMS/Acceuil.png")));
		btnNewButton_4.setBounds(0, 11, 46, 31);
		panel.add(btnNewButton_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(248, 248, 255));
		panel_1.setBounds(0, 60, 100, 261);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Calendrier");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(70, 130, 180));
		btnNewButton.setBounds(0, 11, 99, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("T\u00E2che");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBackground(new Color(70, 130, 180));
		btnNewButton_1.setBounds(0, 45, 99, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("F. perso");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBackground(new Color(70, 130, 180));
		btnNewButton_2.setBounds(0, 79, 99, 23);
		panel_1.add(btnNewButton_2);
		
		JTextPane txtpnCommentPuisjeVous = new JTextPane();
		txtpnCommentPuisjeVous.setForeground(new Color(70, 130, 180));
		txtpnCommentPuisjeVous.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnCommentPuisjeVous.setText("Comment puis-je vous aider ?");
		txtpnCommentPuisjeVous.setBounds(138, 95, 262, 46);
		contentPane.add(txtpnCommentPuisjeVous);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(70, 130, 180));
		panel_2.setBounds(110, 182, 106, 84);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JTextPane txtpnAttestation = new JTextPane();
		txtpnAttestation.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnAttestation.setBackground(new Color(70, 130, 180));
		txtpnAttestation.setText("ATTESTATION");
		txtpnAttestation.setBounds(7, 11, 86, 20);
		panel_2.add(txtpnAttestation);
		
		JButton btnNewButton_3 = new JButton("Selectionner");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormAttes attes = new FormAttes();
				attes.setVisible(true);
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_3.setBounds(7, 50, 89, 23);
		panel_2.add(btnNewButton_3);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(70, 130, 180));
		panel_2_1.setBounds(226, 182, 106, 84);
		contentPane.add(panel_2_1);
		
		JTextPane txtpnAutorisation = new JTextPane();
		txtpnAutorisation.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnAutorisation.setText("AUTORISATION");
		txtpnAutorisation.setBackground(new Color(70, 130, 180));
		txtpnAutorisation.setBounds(7, 11, 89, 20);
		panel_2_1.add(txtpnAutorisation);
		
		JButton btnNewButton_3_1 = new JButton("Selectionner");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormAuto auto = new FormAuto();
				auto.setVisible(true);
			}
		});
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_3_1.setBounds(7, 50, 89, 23);
		panel_2_1.add(btnNewButton_3_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBackground(new Color(70, 130, 180));
		panel_2_2.setBounds(342, 182, 106, 84);
		contentPane.add(panel_2_2);
		
		JTextPane txtpnGrade = new JTextPane();
		txtpnGrade.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnGrade.setForeground(new Color(0, 0, 0));
		txtpnGrade.setText("GRADE");
		txtpnGrade.setBackground(new Color(70, 130, 180));
		txtpnGrade.setBounds(23, 11, 51, 20);
		panel_2_2.add(txtpnGrade);
		
		JButton btnNewButton_3_2 = new JButton("Selectionner");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormGrade grade = new FormGrade();
				grade.setVisible(true);
			}
		});
		btnNewButton_3_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_3_2.setBounds(7, 50, 89, 23);
		panel_2_2.add(btnNewButton_3_2);
	}
}
