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
import javax.swing.SwingConstants;

public class Fremplie extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fremplie frame = new Fremplie();
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
	public Fremplie() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 381);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(0, 0, 540, 64);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Fremplie.class.getResource("/imageSMS/JO.png")));
		lblNewLabel.setBounds(28, 11, 130, 42);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Fremplie.class.getResource("/imageSMS/Acceuil.png")));
		lblNewLabel_1.setBounds(10, 11, 34, 42);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Fremplie.class.getResource("/imageSMS/utilisss.png")));
		lblNewLabel_2.setBounds(387, 11, 46, 42);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Fremplie.class.getResource("/imageSMS/notiffff.png")));
		lblNewLabel_3.setBounds(429, 11, 34, 42);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Fremplie.class.getResource("/imageSMS/messsssssssage.png")));
		lblNewLabel_4.setBounds(460, 11, 46, 42);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Fremplie.class.getResource("/imageSMS/para.png")));
		lblNewLabel_5.setBounds(506, 11, 34, 42);
		panel.add(lblNewLabel_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(248, 248, 255));
		panel_1.setBounds(0, 63, 101, 279);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Calendrier");
		btnNewButton.setBounds(0, 11, 99, 23);
		panel_1.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(70, 130, 180));
		
		JButton btnNewButton_1 = new JButton("T\u00E2che");
		btnNewButton_1.setBounds(0, 45, 99, 23);
		panel_1.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBackground(new Color(70, 130, 180));
		
		JButton btnNewButton_2 = new JButton("F. perso");
		btnNewButton_2.setBounds(0, 79, 99, 23);
		panel_1.add(btnNewButton_2);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBackground(new Color(70, 130, 180));
		
		JLabel lblNewLabel_6 = new JLabel("Merci d'avoir rempli le formulaire ! Votre demande est en cours de traitement");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_6.setBounds(111, 164, 399, 35);
		contentPane.add(lblNewLabel_6);
	}
}
