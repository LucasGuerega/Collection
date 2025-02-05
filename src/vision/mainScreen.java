package vision;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.dvd;

import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainScreen frame = new mainScreen();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton linha = new JButton("");
		linha.setBackground(new Color(255, 0, 0));
		linha.setEnabled(false);
		linha.setBounds(0, 356, 1008, 15);
		contentPane.add(linha);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 372, 1006, 357);
		contentPane.add(panel);

		int bordax = 40;
		int borday = 352;

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 1006, 357);
		contentPane.add(panel_1);

		JButton btnDVD = new JButton("");
		btnDVD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dvd d = new dvd();
				d.setTitulo("Jiraya");
				d.setVolume(1);
				d.setSubTitulo("O Incrível Ninja");
				d.setClassificacao("Livre");
				d.setDuração(115);
						
				infoScreen frame = new infoScreen(d);
				
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
				frame.setResizable(false);
			}
		});
		btnDVD.setIcon(new ImageIcon(new ImageIcon(mainScreen.class.getResource("/imgs/labelJiraya.png")).getImage()
				.getScaledInstance(bordax, borday, Image.SCALE_DEFAULT)));
		btnDVD.setBounds(0, 0, 40, 352);
		panel_1.add(btnDVD);

		JButton btnDVD1 = new JButton("");
		btnDVD1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dvd d = new dvd();
				d.setTitulo("Yu-Gi-Oh!");
				d.setVolume(1);
				d.setSubTitulo("O Coração das Cartas");
				d.setClassificacao("Livre");
				d.setDuração(63);
						
				infoScreen frame = new infoScreen(d);
				
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
				frame.setResizable(false);
			}
		});
		btnDVD1.setIcon(new ImageIcon(new ImageIcon(mainScreen.class.getResource("/imgs/labelYGO.png")).getImage()
				.getScaledInstance(bordax, borday, Image.SCALE_DEFAULT)));
		btnDVD1.setBounds(0, 0, 40, 352);
		panel.add(btnDVD1);
	}
}
