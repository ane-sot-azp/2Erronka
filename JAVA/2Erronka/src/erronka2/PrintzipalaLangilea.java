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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
				Object[] options = {"Bai", "Ez"};
				int erantzuna = JOptionPane.showOptionDialog(null, "Programatik atera nahi duzu?", "Konfirmatu atera nahi duzun", JOptionPane.YES_NO_OPTION, 
						+ JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
				if(erantzuna == JOptionPane.YES_OPTION) {
				dispose();
				JOptionPane.showMessageDialog(null, "Eskerrik asko aplikazioa erabiltzeagatik.", "ATERA ZARA",
						JOptionPane.INFORMATION_MESSAGE);
				}else {}
			}
		});
		
		JButton btnSaioaItxi = new JButton("");
		btnSaioaItxi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options = {"Bai", "Ez"};
				int erantzuna = JOptionPane.showOptionDialog(null, "Saioa itxi nahi duzu?", "SAIOA ITXI", JOptionPane.YES_NO_OPTION, 
						+ JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
				if(erantzuna == JOptionPane.YES_OPTION) {
				dispose();
				
				Logina log = new Logina();
				log.setVisible(true);
				}else {}
			}
		});
		btnSaioaItxi.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\saioaItxi(1).png"));
		btnSaioaItxi.setBounds(10, 420, 110, 32);
		contentPane.add(btnSaioaItxi);
		btnAtera.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\itxi(2).png"));
		btnAtera.setForeground(Color.WHITE);
		btnAtera.setBackground(new Color(255, 51, 51));
		btnAtera.setBounds(956, 0, 32, 32);
		contentPane.add(btnAtera);
		
		JLabel lblBalorazioakIco_L = new JLabel("New label");
		lblBalorazioakIco_L.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\balorazioak(1).png"));
		lblBalorazioakIco_L.setBounds(771, 251, 134, 107);
		contentPane.add(lblBalorazioakIco_L);
		lblBalorazioakIco_L.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JOptionPane.showMessageDialog(null, "Produktuen balorazioetan sartu zara.", "SARTU ZARA",
						JOptionPane.INFORMATION_MESSAGE);
				LBalorazioakPanela lbalp = new LBalorazioakPanela();
				lbalp.setVisible(true);
			}
		}); 
		
		JLabel lblEskaeraIco_L = new JLabel("New label");
		lblEskaeraIco_L.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\eskaerak(1).png"));
		lblEskaeraIco_L.setBounds(771, 52, 134, 107);
		contentPane.add(lblEskaeraIco_L);
		lblEskaeraIco_L.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JOptionPane.showMessageDialog(null, "Eskaeretan sartu zara.", "SARTU ZARA",
						JOptionPane.INFORMATION_MESSAGE);
				LEskaeraPanela lep = new LEskaeraPanela();
				lep.setVisible(true);
			}
		}); 
		
		JLabel lblPiezaEskIco_L = new JLabel("New label");
		lblPiezaEskIco_L.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\piezenEskaera(1).png"));
		lblPiezaEskIco_L.setBounds(413, 251, 134, 107);
		contentPane.add(lblPiezaEskIco_L);
		lblPiezaEskIco_L.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JOptionPane.showMessageDialog(null, "Piezen eskaeran sartu zara.", "SARTU ZARA",
						JOptionPane.INFORMATION_MESSAGE);
				LPiezaEskPanela lpiep = new LPiezaEskPanela();
				lpiep.setVisible(true);
			}
		}); 
		
		JLabel lblPiezakIco_L = new JLabel("New label");
		lblPiezakIco_L.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\piezak(1).png"));
		lblPiezakIco_L.setBounds(413, 52, 134, 107);
		contentPane.add(lblPiezakIco_L);
		lblPiezakIco_L.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JOptionPane.showMessageDialog(null, "Piezetan sartu zara.", "SARTU ZARA",
						JOptionPane.INFORMATION_MESSAGE);
				LPiezaPanela lpip = new LPiezaPanela();
				lpip.setVisible(true);
			}
		}); 
		
		JLabel lblProduktPresIco_L = new JLabel("New label");
		lblProduktPresIco_L.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\produktuakPrestakuntzan(1).png"));
		lblProduktPresIco_L.setBounds(61, 251, 134, 107);
		contentPane.add(lblProduktPresIco_L);
		lblProduktPresIco_L.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JOptionPane.showMessageDialog(null, "Produktuak prestakuntzan sartu zara.", "SARTU ZARA",
						JOptionPane.INFORMATION_MESSAGE);
				LProdPrestPanela lppp = new LProdPrestPanela();
				lppp.setVisible(true);
			}
		}); 
		
		JLabel lblNewLabel_1_1 = new JLabel("Langilea");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel_1_1.setBounds(859, 419, 119, 32);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblProduktuakIco_L = new JLabel("");
		lblProduktuakIco_L.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\produktuak(1).png"));
		lblProduktuakIco_L.setBounds(61, 52, 134, 108);
		contentPane.add(lblProduktuakIco_L);
		lblProduktuakIco_L.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				LProduktuakPanela lpp = new LProduktuakPanela();
				lpp.setVisible(true);
				JOptionPane.showMessageDialog(null, "Produktuetan sartu zara.", "SARTU ZARA",
						JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		
		JLabel lblFondoa = new JLabel("");
		btnAtera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		lblFondoa.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\UTech java fondoa 1(2).png"));
		lblFondoa.setBackground(new Color(255, 255, 255));
		lblFondoa.setBounds(0, 0, 988, 455);
		contentPane.add(lblFondoa);
	}

}
