package ensaSMS;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class EspaceRH extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EspaceRH frame = new EspaceRH();
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
	public EspaceRH() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 405);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(0, 0, 562, 63);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(EspaceRH.class.getResource("/imageSMS/JO.png")));
		lblNewLabel_1.setBounds(23, 11, 136, 41);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(EspaceRH.class.getResource("/imageSMS/Acceuil.png")));
		lblNewLabel_2.setBounds(10, 11, 46, 41);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(EspaceRH.class.getResource("/imageSMS/utilisss.png")));
		lblNewLabel_3.setBounds(412, 11, 46, 41);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(EspaceRH.class.getResource("/imageSMS/notiffff.png")));
		lblNewLabel_4.setBounds(457, 11, 46, 41);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(EspaceRH.class.getResource("/imageSMS/messsssssssage.png")));
		lblNewLabel_5.setBounds(480, 11, 46, 41);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(EspaceRH.class.getResource("/imageSMS/para.png")));
		lblNewLabel_6.setBounds(516, 11, 46, 41);
		panel.add(lblNewLabel_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(248, 248, 255));
		panel_1.setBounds(0, 62, 97, 304);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Calendrier");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(70, 130, 180));
		btnNewButton.setBounds(0, 11, 97, 23);
		panel_1.add(btnNewButton);
		
		JButton btnTche = new JButton("T\u00E2che");
		btnTche.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTche.setBackground(new Color(70, 130, 180));
		btnTche.setBounds(0, 42, 97, 23);
		panel_1.add(btnTche);
		
		JButton btnFperso = new JButton("F.perso");
		btnFperso.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFperso.setBackground(new Color(70, 130, 180));
		btnFperso.setBounds(0, 75, 97, 23);
		panel_1.add(btnFperso);
		
		JLabel lblNewLabel = new JLabel("Responsable RH");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(70, 130, 180));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(241, 84, 161, 47);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Attestation");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Attestation attest1 = new Attestation();
				attest1.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(70, 130, 180));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(107, 181, 125, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Autorisation");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EspaceDirecteur newAtt = new EspaceDirecteur();
				newAtt.setVisible(true);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_1.setBackground(new Color(70, 130, 180));
		btnNewButton_1_1.setBounds(249, 181, 129, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Ordre de Mission");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1_2.setBackground(new Color(70, 130, 180));
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_2.setBounds(388, 181, 148, 23);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Recrutement");
		btnNewButton_1_3.setBackground(new Color(70, 130, 180));
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_3.setBounds(153, 260, 161, 23);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("Avancement");
		btnNewButton_1_4.setBackground(new Color(70, 130, 180));
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_4.setBounds(324, 260, 157, 23);
		contentPane.add(btnNewButton_1_4);
		
		JButton btnNewButton_2 = new JButton("Retour");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acceuil c = new Acceuil();
				c.show();
			
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_2.setBounds(271, 332, 89, 23);
		contentPane.add(btnNewButton_2);
	}

}
