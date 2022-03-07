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
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormAuto extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomEtPrnom;
	private JTextField txtEmail;
	private JTextField txtTlphone;
	private JTextField txtDure;
	private JTextField txtDure_1;
	private JTextField txtRemplaant;
	private JTextField txtRaison;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormAuto frame = new FormAuto();
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
	public FormAuto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 410);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(0, 0, 514, 64);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(FormAuto.class.getResource("/imageSMS/Acceuil.png")));
		lblNewLabel.setBounds(10, 11, 25, 25);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(FormAuto.class.getResource("/imageSMS/JO.png")));
		lblNewLabel_1.setBounds(45, 0, 150, 42);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(FormAuto.class.getResource("/imageSMS/utilisss.png")));
		lblNewLabel_2.setBounds(341, 11, 46, 31);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(FormAuto.class.getResource("/imageSMS/notiffff.png")));
		lblNewLabel_3.setBounds(379, 11, 33, 25);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(FormAuto.class.getResource("/imageSMS/messsssssssage.png")));
		lblNewLabel_4.setBounds(422, 11, 39, 25);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(FormAuto.class.getResource("/imageSMS/para.png")));
		lblNewLabel_5.setBounds(471, 11, 33, 25);
		panel.add(lblNewLabel_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(248, 248, 255));
		panel_1.setBounds(0, 64, 102, 307);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Calendrier");
		btnNewButton.setBackground(new Color(70, 130, 180));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(0, 11, 99, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("T\u00E2che");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBackground(new Color(70, 130, 180));
		btnNewButton_1.setBounds(0, 45, 99, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("F.perso");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBackground(new Color(70, 130, 180));
		btnNewButton_2.setBounds(0, 79, 99, 23);
		panel_1.add(btnNewButton_2);
		
		JTextPane txtpnVeuillezRemplirLe = new JTextPane();
		txtpnVeuillezRemplirLe.setForeground(new Color(70, 130, 180));
		txtpnVeuillezRemplirLe.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnVeuillezRemplirLe.setText("Formulaire demande d'autorisation");
		txtpnVeuillezRemplirLe.setBounds(170, 73, 227, 20);
		contentPane.add(txtpnVeuillezRemplirLe);
		
		txtNomEtPrnom = new JTextField();
		txtNomEtPrnom.setText("Nom et Pr\u00E9nom : ");
		txtNomEtPrnom.setColumns(10);
		txtNomEtPrnom.setBounds(132, 100, 312, 20);
		contentPane.add(txtNomEtPrnom);
		
		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setColumns(10);
		txtEmail.setBounds(132, 131, 312, 20);
		contentPane.add(txtEmail);
		
		txtTlphone = new JTextField();
		txtTlphone.setText("T\u00E9l\u00E9phone");
		txtTlphone.setColumns(10);
		txtTlphone.setBounds(132, 163, 312, 20);
		contentPane.add(txtTlphone);
		
		txtDure = new JTextField();
		txtDure.setText("Matricule");
		txtDure.setColumns(10);
		txtDure.setBounds(132, 194, 312, 20);
		contentPane.add(txtDure);
		
		txtDure_1 = new JTextField();
		txtDure_1.setText("Dur\u00E9e");
		txtDure_1.setColumns(10);
		txtDure_1.setBounds(132, 228, 312, 20);
		contentPane.add(txtDure_1);
		
		txtRemplaant = new JTextField();
		txtRemplaant.setText("Rempla\u00E7ant");
		txtRemplaant.setColumns(10);
		txtRemplaant.setBounds(132, 259, 312, 20);
		contentPane.add(txtRemplaant);
		
		txtRaison = new JTextField();
		txtRaison.setText("Raison : ");
		txtRaison.setColumns(10);
		txtRaison.setBounds(132, 290, 200, 20);
		contentPane.add(txtRaison);
		
		JButton btnNewButton_3 = new JButton("Soumettre");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fremplie newAutoform = new Fremplie();
				newAutoform.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(342, 321, 112, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Retour");
		btnNewButton_4.setBounds(114, 321, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("R\u00E9union\r\nFormation\r\nGarde des contr\u00F4les\r\nComp\u00E9tition");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"R\u00E9union", "Formation", "Garde des contr\u00F4les", "Comp\u00E9tition"}));
		comboBox.setBounds(342, 290, 102, 22);
		contentPane.add(comboBox);
	}

}
