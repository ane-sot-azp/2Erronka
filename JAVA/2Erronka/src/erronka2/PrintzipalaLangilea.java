package erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class PrintzipalaLangilea extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrintzipalaLangilea frame = new PrintzipalaLangilea();
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
	public PrintzipalaLangilea() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 490);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAtera = new JButton("");
		btnAtera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAtera.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\itxi(2).png"));
		btnAtera.setForeground(Color.WHITE);
		btnAtera.setBackground(new Color(255, 51, 51));
		btnAtera.setBounds(956, 0, 32, 32);
		contentPane.add(btnAtera);
		
		JLabel lblBalorazioakIco = new JLabel("New label");
		lblBalorazioakIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\balorazioak(1).png"));
		lblBalorazioakIco.setBounds(771, 251, 134, 107);
		contentPane.add(lblBalorazioakIco);
		
		JLabel lblEskaeraIco = new JLabel("New label");
		lblEskaeraIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\eskaerak(1).png"));
		lblEskaeraIco.setBounds(771, 52, 134, 107);
		contentPane.add(lblEskaeraIco);
		
		JLabel lblPiezaEskIco = new JLabel("New label");
		lblPiezaEskIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\piezenEskaera(1).png"));
		lblPiezaEskIco.setBounds(413, 251, 134, 107);
		contentPane.add(lblPiezaEskIco);
		
		JLabel lblPiezakIco = new JLabel("New label");
		lblPiezakIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\piezak(1).png"));
		lblPiezakIco.setBounds(413, 52, 134, 107);
		contentPane.add(lblPiezakIco);
		
		JLabel lblProduktPresIco = new JLabel("New label");
		lblProduktPresIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\produktuakPrestakuntzan(1).png"));
		lblProduktPresIco.setBounds(61, 251, 134, 107);
		contentPane.add(lblProduktPresIco);
		
		JLabel lblNewLabel_1_1 = new JLabel("Langilea");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel_1_1.setBounds(859, 419, 119, 32);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblProduktuakIco = new JLabel("");
		lblProduktuakIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\produktuak(1).png"));
		lblProduktuakIco.setBounds(61, 52, 134, 108);
		contentPane.add(lblProduktuakIco);
		
		JLabel lblNewLabel = new JLabel("");
		btnAtera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JOptionPane.showMessageDialog(null, "Eskerrik asko aplikazioa erabiltzeagatik.", "ATERA ZARA",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\UTech java fondoa 1(2).png"));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(0, 0, 988, 455);
		contentPane.add(lblNewLabel);
	}

}
