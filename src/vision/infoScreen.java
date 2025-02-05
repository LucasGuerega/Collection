package vision;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.event.ChangeListener;

import control.dvDao;
import model.dvd;

import javax.swing.event.ChangeEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class infoScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private boolean editable = true;
	private JPanel contentPane;
	private JTextField txtTitle;
	private JLabel lblSubtitulo;
	private JTextField txtSubTitle;
	private JLabel lblVolume;
	private JTextField txtVol;
	private JLabel lblClassificao;
	private JTextField txtClassificao;
	private JLabel lblDuracao;
	private JTextField txtDuracao;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 * @param d 
	 */
	public infoScreen(dvd d) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1024, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		int bordax = 453;
		int borday = 352;
		
		JLabel btnNewButton = new JLabel("");
		btnNewButton.setIcon(new ImageIcon(new ImageIcon(mainScreen.class.getResource("/imgs/cover"+d.getTitulo()+".png")).getImage()
				.getScaledInstance(bordax, borday, Image.SCALE_DEFAULT)));
		btnNewButton.setBounds(0, 0, 453, 352);
		contentPane.add(btnNewButton);


		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Titulo:");
		lblNewLabel.setFont(new Font("STALKER1", Font.PLAIN, 45));
		lblNewLabel.setBounds(463, 52, 179, 87);
		contentPane.add(lblNewLabel);
		
		txtTitle = new JTextField();
		txtTitle.setText(d.getTitulo());
		txtTitle.setEditable(editable);
		txtTitle.setFont(new Font("STALKER1", Font.PLAIN, 42));
		txtTitle.setBounds(683, 52, 315, 87);
		contentPane.add(txtTitle);
		txtTitle.setColumns(10);
		
		lblSubtitulo = new JLabel("SubTitulo:");
		lblSubtitulo.setFont(new Font("STALKER1", Font.PLAIN, 45));
		lblSubtitulo.setBounds(463, 142, 210, 87);
		contentPane.add(lblSubtitulo);
		
		txtSubTitle = new JTextField();
		txtSubTitle.setText(d.getSubTitulo());
		txtSubTitle.setFont(new Font("STALKER1", Font.PLAIN, 42));
		txtSubTitle.setEditable(editable);
		txtSubTitle.setColumns(10);
		txtSubTitle.setBounds(683, 142, 315, 87);
		contentPane.add(txtSubTitle);
		
		lblVolume = new JLabel("Volume:");
		lblVolume.setFont(new Font("STALKER1", Font.PLAIN, 45));
		lblVolume.setBounds(463, 240, 210, 87);
		contentPane.add(lblVolume);
		
		txtVol = new JTextField();
		txtVol.setText(String.valueOf(d.getVolume()));
		txtVol.setFont(new Font("STALKER1", Font.PLAIN, 42));
		txtVol.setEditable(editable);
		txtVol.setColumns(10);
		txtVol.setBounds(683, 240, 315, 87);
		contentPane.add(txtVol);
		
		lblClassificao = new JLabel("Classificação:");
		lblClassificao.setFont(new Font("STALKER1", Font.PLAIN, 45));
		lblClassificao.setBounds(460, 431, 300, 87);
		contentPane.add(lblClassificao);
		
		txtClassificao = new JTextField();
		txtClassificao.setText(d.getClassificacao());
		txtClassificao.setFont(new Font("STALKER1", Font.PLAIN, 42));
		txtClassificao.setEditable(editable);
		txtClassificao.setColumns(10);
		txtClassificao.setBounds(772, 433, 226, 87);
		contentPane.add(txtClassificao);
		
		lblDuracao = new JLabel("Duração:");
		lblDuracao.setFont(new Font("STALKER1", Font.PLAIN, 45));
		lblDuracao.setBounds(463, 338, 210, 87);
		contentPane.add(lblDuracao);
		
		txtDuracao = new JTextField();
		txtDuracao.setText(String.valueOf(d.getDuração())+" min");
		txtDuracao.setFont(new Font("STALKER1", Font.PLAIN, 42));
		txtDuracao.setEditable(editable);
		txtDuracao.setColumns(10);
		txtDuracao.setBounds(683, 338, 315, 87);
		contentPane.add(txtDuracao);
		
		JButton bntDel = new JButton("Deletar DVD");
		bntDel.setForeground(new Color(255, 255, 255));
		bntDel.setBackground(new Color(255, 0, 0));
		bntDel.setFont(new Font("STALKER1", Font.PLAIN, 25));
		bntDel.setBounds(234, 408, 189, 69);
		contentPane.add(bntDel);
		
		JButton btnEdit = new JButton("Editar Info");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dvDao dao = new dvDao();
				d.setTitulo(txtTitle.getText());
				dao.editInfo(d);
			}
		});
		btnEdit.setForeground(new Color(255, 255, 255));
		btnEdit.setBackground(new Color(0, 255, 0));
		btnEdit.setFont(new Font("STALKER1", Font.PLAIN, 25));
		btnEdit.setBounds(10, 408, 189, 69);
		contentPane.add(btnEdit);
		
		
	}
}
