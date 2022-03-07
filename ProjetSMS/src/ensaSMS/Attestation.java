package ensaSMS;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Attestation extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Attestation frame = new Attestation();
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
	public Attestation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 392);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(248, 248, 255));
		panel_2.setBounds(108, 144, 437, 138);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(248, 248, 255));
		panel_3.setBounds(0, 0, 437, 29);
		panel_2.add(panel_3);
		
		JFormattedTextField frmtdtxtfldEmailPersonnel = new JFormattedTextField();
		frmtdtxtfldEmailPersonnel.setText("Email ");
		frmtdtxtfldEmailPersonnel.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmtdtxtfldEmailPersonnel.setBounds(0, 0, 153, 29);
		panel_3.add(frmtdtxtfldEmailPersonnel);
		
		JFormattedTextField frmtdtxtfldNom = new JFormattedTextField();
		frmtdtxtfldNom.setText("Matricule");
		frmtdtxtfldNom.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmtdtxtfldNom.setBounds(151, 0, 104, 29);
		panel_3.add(frmtdtxtfldNom);
		
		JFormattedTextField frmtdtxtfldDocumentSigner = new JFormattedTextField();
		frmtdtxtfldDocumentSigner.setText("Type");
		frmtdtxtfldDocumentSigner.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmtdtxtfldDocumentSigner.setBounds(255, 0, 113, 29);
		panel_3.add(frmtdtxtfldDocumentSigner);
		
		JFormattedTextField frmtdtxtfldDate = new JFormattedTextField();
		frmtdtxtfldDate.setText("Date");
		frmtdtxtfldDate.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmtdtxtfldDate.setBounds(366, 0, 71, 29);
		panel_3.add(frmtdtxtfldDate);
		
		JFormattedTextField frmtdtxtfldAnouargmailcom = new JFormattedTextField();
		frmtdtxtfldAnouargmailcom.setText("ANOUAR@gmail.com");
		frmtdtxtfldAnouargmailcom.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmtdtxtfldAnouargmailcom.setBounds(0, 29, 153, 29);
		panel_2.add(frmtdtxtfldAnouargmailcom);
		
		JFormattedTextField frmtdtxtfldbs = new JFormattedTextField();
		frmtdtxtfldbs.setText("003BS");
		frmtdtxtfldbs.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmtdtxtfldbs.setBounds(154, 29, 104, 29);
		panel_2.add(frmtdtxtfldbs);
		
		JFormattedTextField frmtdtxtfldSalaire = new JFormattedTextField();
		frmtdtxtfldSalaire.setText("Salaire");
		frmtdtxtfldSalaire.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmtdtxtfldSalaire.setBounds(255, 29, 113, 29);
		panel_2.add(frmtdtxtfldSalaire);
		
		JFormattedTextField frmtdtxtfldDate_1 = new JFormattedTextField();
		frmtdtxtfldDate_1.setText("01/01/2021");
		frmtdtxtfldDate_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		frmtdtxtfldDate_1.setBounds(366, 29, 71, 29);
		panel_2.add(frmtdtxtfldDate_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(0, 0, 570, 68);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Attestation.class.getResource("/imageSMS/Acceuil.png")));
		lblNewLabel.setBounds(10, 11, 46, 46);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Attestation.class.getResource("/imageSMS/JO.png")));
		lblNewLabel_1.setBounds(20, 11, 143, 46);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Attestation.class.getResource("/imageSMS/utilisss.png")));
		lblNewLabel_2.setBounds(418, 11, 46, 46);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Attestation.class.getResource("/imageSMS/notiffff.png")));
		lblNewLabel_3.setBounds(460, 11, 34, 46);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Attestation.class.getResource("/imageSMS/messsssssssage.png")));
		lblNewLabel_4.setBounds(486, 11, 46, 46);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Attestation.class.getResource("/imageSMS/para.png")));
		lblNewLabel_5.setBounds(524, 11, 36, 46);
		panel.add(lblNewLabel_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(248, 248, 255));
		panel_1.setBounds(0, 68, 98, 285);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Calendrier");
		btnNewButton.setBackground(new Color(70, 130, 180));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(0, 11, 98, 23);
		panel_1.add(btnNewButton);
		
		JButton btnTche = new JButton("T\u00E2che");
		btnTche.setBackground(new Color(70, 130, 180));
		btnTche.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTche.setBounds(0, 47, 98, 23);
		panel_1.add(btnTche);
		
		JButton btnFperso = new JButton("F.perso");
		btnFperso.setBackground(new Color(70, 130, 180));
		btnFperso.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFperso.setBounds(0, 88, 98, 23);
		panel_1.add(btnFperso);
		
		JTextPane txtpnAttestation = new JTextPane();
		txtpnAttestation.setForeground(new Color(70, 130, 180));
		txtpnAttestation.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnAttestation.setText("ATTESTATION");
		txtpnAttestation.setBounds(268, 93, 134, 20);
		contentPane.add(txtpnAttestation);
		
		JButton btnNewButton_1 = new JButton("Retour");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnNewButton_1.setBackground(new Color(70, 130, 180));
		btnNewButton_1.setBounds(108, 306, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnSuivant = new JButton("Suivant");
		btnSuivant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnSuivant.setBackground(new Color(70, 130, 180));
		btnSuivant.setBounds(458, 306, 89, 23);
		contentPane.add(btnSuivant);
	}
}
