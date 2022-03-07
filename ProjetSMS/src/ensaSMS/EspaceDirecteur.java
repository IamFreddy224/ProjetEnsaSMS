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
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class EspaceDirecteur extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EspaceDirecteur frame = new EspaceDirecteur();
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
	public EspaceDirecteur() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 394);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(0, 69, 97, 286);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Calendrier");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(70, 130, 180));
		btnNewButton.setBounds(0, 11, 97, 23);
		panel.add(btnNewButton);
		
		JButton btnTche = new JButton("T\u00E2che");
		btnTche.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTche.setBackground(new Color(70, 130, 180));
		btnTche.setBounds(0, 45, 97, 23);
		panel.add(btnTche);
		
		JButton btnFperso = new JButton("F.perso");
		btnFperso.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFperso.setBackground(new Color(70, 130, 180));
		btnFperso.setBounds(0, 79, 97, 23);
		panel.add(btnFperso);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(248, 248, 255));
		panel_1.setBounds(0, 0, 544, 68);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(EspaceDirecteur.class.getResource("/imageSMS/JO.png")));
		lblNewLabel.setBounds(10, 11, 139, 46);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(EspaceDirecteur.class.getResource("/imageSMS/Acceuil.png")));
		lblNewLabel_1.setBounds(10, 11, 38, 46);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(EspaceDirecteur.class.getResource("/imageSMS/utilisss.png")));
		lblNewLabel_2.setBounds(389, 11, 46, 46);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(EspaceDirecteur.class.getResource("/imageSMS/notiffff.png")));
		lblNewLabel_3.setBounds(427, 11, 38, 46);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(EspaceDirecteur.class.getResource("/imageSMS/messsssssssage.png")));
		lblNewLabel_4.setBounds(455, 11, 46, 46);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(EspaceDirecteur.class.getResource("/imageSMS/para.png")));
		lblNewLabel_5.setBounds(496, 11, 38, 46);
		panel_1.add(lblNewLabel_5);
		
		JTextPane txtpnEspaceDirecteur = new JTextPane();
		txtpnEspaceDirecteur.setForeground(new Color(70, 130, 180));
		txtpnEspaceDirecteur.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnEspaceDirecteur.setText("Espace Directeur");
		txtpnEspaceDirecteur.setBounds(216, 94, 192, 26);
		contentPane.add(txtpnEspaceDirecteur);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(248, 248, 255));
		panel_2.setBounds(119, 158, 391, 138);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(248, 248, 255));
		panel_3.setBounds(0, 0, 391, 29);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JFormattedTextField frmtdtxtfldEmailPersonnel = new JFormattedTextField();
		frmtdtxtfldEmailPersonnel.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmtdtxtfldEmailPersonnel.setText("Email personnel");
		frmtdtxtfldEmailPersonnel.setBounds(0, 0, 153, 29);
		panel_3.add(frmtdtxtfldEmailPersonnel);
		
		JFormattedTextField frmtdtxtfldNom = new JFormattedTextField();
		frmtdtxtfldNom.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmtdtxtfldNom.setText("Nom");
		frmtdtxtfldNom.setBounds(151, 0, 104, 29);
		panel_3.add(frmtdtxtfldNom);
		
		JFormattedTextField frmtdtxtfldDocumentSigner = new JFormattedTextField();
		frmtdtxtfldDocumentSigner.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmtdtxtfldDocumentSigner.setText("Document \u00E0 signer");
		frmtdtxtfldDocumentSigner.setBounds(255, 0, 136, 29);
		panel_3.add(frmtdtxtfldDocumentSigner);
		
		JButton btnNewButton_1 = new JButton("Retour");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acceuil h = new Acceuil();
				h.show();
			}
		});
		btnNewButton_1.setBounds(107, 321, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Envoyer");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1_1.setBounds(421, 321, 89, 23);
		contentPane.add(btnNewButton_1_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(390, 94, 101, 22);
		contentPane.add(menuBar);
		
		JButton btnNewButton_2 = new JButton("Importer fichier");
		btnNewButton_2.setBounds(376, 124, 134, 23);
		contentPane.add(btnNewButton_2);
	}

}
