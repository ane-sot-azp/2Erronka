package erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Printzipala extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Printzipala frame = new Printzipala();
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
	public Printzipala() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 490);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Administratzailea");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel_1.setBounds(731, 419, 247, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblEskHistoIco = new JLabel("New label");
		lblEskHistoIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\eskaerenHistorikoa(1).png"));
		lblEskHistoIco.setBounds(771, 251, 134, 107);
		contentPane.add(lblEskHistoIco);
		lblEskHistoIco.addMouseListener(new MouseAdapter () {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JOptionPane.showMessageDialog(null, "Eskaera Historikotara sartu zara.", "SARTU ZARA",
						JOptionPane.INFORMATION_MESSAGE);
				EskHistorikoPanela ehp = new EskHistorikoPanela();
				ehp.setVisible(true);
				
				
			}
		}); 
		
		JLabel lblPiezaEskIco = new JLabel("New label");
		lblPiezaEskIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\piezenEskaera(1).png"));
		lblPiezaEskIco.setBounds(593, 251, 134, 107);
		contentPane.add(lblPiezaEskIco);
		lblPiezaEskIco.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JOptionPane.showMessageDialog(null, "Piezen eskaeran sartu zara.", "SARTU ZARA",
						JOptionPane.INFORMATION_MESSAGE);
				PiezaEskPanela piep = new PiezaEskPanela();
				piep.setVisible(true);
			}
		}); 
		
		JLabel lblEskaeraIco = new JLabel("New label");
		lblEskaeraIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\eskaerak(1).png"));
		lblEskaeraIco.setBounds(771, 52, 134, 107);
		contentPane.add(lblEskaeraIco);
		lblEskaeraIco.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JOptionPane.showMessageDialog(null, "Eskaeretan sartu zara.", "SARTU ZARA",
						JOptionPane.INFORMATION_MESSAGE);
				EskaeraPanela ep = new EskaeraPanela();
				ep.setVisible(true);
			}
		}); 
		
		JLabel lblPiezakIco = new JLabel("New label");
		lblPiezakIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\piezak(1).png"));
		lblPiezakIco.setBounds(593, 52, 134, 107);
		contentPane.add(lblPiezakIco);
		lblPiezakIco.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JOptionPane.showMessageDialog(null, "Piezen eskaeran sartu zara.", "SARTU ZARA",
						JOptionPane.INFORMATION_MESSAGE);
				PiezaPanela pip = new PiezaPanela();
				pip.setVisible(true);
			}
		}); 
		
		JLabel lblBalorazioakIco = new JLabel("New label");
		lblBalorazioakIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\balorazioak(1).png"));
		lblBalorazioakIco.setBounds(413, 251, 134, 107);
		contentPane.add(lblBalorazioakIco);
		lblBalorazioakIco.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JOptionPane.showMessageDialog(null, "Produktuen balorazioetan sartu zara.", "SARTU ZARA",
						JOptionPane.INFORMATION_MESSAGE);
				BalorazioakPanela balp = new BalorazioakPanela();
				balp.setVisible(true);
			}
		}); 
		
		JLabel lblBezeroakIco = new JLabel("New label");
		lblBezeroakIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\bezeroak(1).png"));
		lblBezeroakIco.setBounds(239, 251, 134, 107);
		contentPane.add(lblBezeroakIco);
		lblBezeroakIco.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JOptionPane.showMessageDialog(null, "Bezeroetan sartu zara.", "SARTU ZARA",
						JOptionPane.INFORMATION_MESSAGE);
				BezeroakPanela bp = new BezeroakPanela();
				bp.setVisible(true);
			}
		}); 
		
		JLabel lblProduktPresIco = new JLabel("New label");
		lblProduktPresIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\produktuakPrestakuntzan(1).png"));
		lblProduktPresIco.setBounds(61, 251, 134, 107);
		contentPane.add(lblProduktPresIco);
		lblProduktPresIco.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JOptionPane.showMessageDialog(null, "Produktuen prestakuntzan sartu zara.", "SARTU ZARA",
						JOptionPane.INFORMATION_MESSAGE);
				ProdPrestPanela ppp = new ProdPrestPanela();
				ppp.setVisible(true);
			}
		}); 
		
		JButton btnAtera = new JButton("");
		btnAtera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JOptionPane.showMessageDialog(null, "Eskerrik asko aplikazioa erabiltzeagatik.", "ATERA ZARA",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnAtera.setForeground(new Color(255, 255, 255));
		btnAtera.setBackground(new Color(255, 51, 51));
		btnAtera.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\itxi(2).png"));
		btnAtera.setBounds(956, 0, 32, 32);
		contentPane.add(btnAtera);
		
		JLabel lblProduktuakIco = new JLabel("");
		lblProduktuakIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\produktuak(1).png"));
		lblProduktuakIco.setBounds(61, 52, 134, 108);
		contentPane.add(lblProduktuakIco);
		lblProduktuakIco.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				ProduktuakPanela pp = new ProduktuakPanela();
				pp.setVisible(true);
				JOptionPane.showMessageDialog(null, "Produktuetan sartu zara.", "SARTU ZARA",
						JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		
		JLabel lblLangileakIco = new JLabel("New label");
		lblLangileakIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\langileak(1).png"));
		lblLangileakIco.setBounds(239, 52, 134, 107);
		contentPane.add(lblLangileakIco);
		lblLangileakIco.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JOptionPane.showMessageDialog(null, "Langileetan sartu zara.", "SARTU ZARA",
						JOptionPane.INFORMATION_MESSAGE);
				LangileakPanela lp = new LangileakPanela();
				lp.setVisible(true);
			}
		}); 
			
		
		JLabel lblHornitzaileakIco = new JLabel("New label");
		lblHornitzaileakIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\hornitzaileak(1).png"));
		lblHornitzaileakIco.setBounds(413, 52, 134, 107);
		contentPane.add(lblHornitzaileakIco);
		lblHornitzaileakIco.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JOptionPane.showMessageDialog(null, "Hornitzailetan sartu zara.", "SARTU ZARA",
						JOptionPane.INFORMATION_MESSAGE);
				HornitzailePanela hp = new HornitzailePanela();
				hp.setVisible(true);
			}
		}); 
		
		JLabel lblFondoa = new JLabel("");
		lblFondoa.setSize(100, 100);
		lblFondoa.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\UTech java fondoa 1(1).png"));
		lblFondoa.setBounds(0, 0, 988, 445);
		contentPane.add(lblFondoa);
		
		JLabel label = new JLabel("New label");
		label.setBounds(814, 228, 48, 14);
		contentPane.add(label);
	}
}
