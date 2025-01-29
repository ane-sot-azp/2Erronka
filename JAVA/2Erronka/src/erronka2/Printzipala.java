package erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

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
		setBounds(100, 100, 985, 469);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEskHisto_2 = new JLabel("Historikoa");
		lblEskHisto_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEskHisto_2.setBounds(800, 221, 81, 18);
		contentPane.add(lblEskHisto_2);
		
		JLabel lblEskaHisto_1 = new JLabel("Eskaeren");
		lblEskaHisto_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEskaHisto_1.setBounds(804, 204, 74, 18);
		contentPane.add(lblEskaHisto_1);
		
		JLabel lblEsakerak = new JLabel("Eskaerak");
		lblEsakerak.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEsakerak.setBounds(804, 23, 71, 18);
		contentPane.add(lblEsakerak);
		
		JLabel lblEskaera = new JLabel("Eskaera");
		lblEskaera.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEskaera.setBounds(627, 221, 62, 23);
		contentPane.add(lblEskaera);
		
		JLabel lblPiezen = new JLabel("Piezen");
		lblPiezen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPiezen.setBounds(631, 204, 53, 18);
		contentPane.add(lblPiezen);
		
		JLabel lblPiezak = new JLabel("Piezak");
		lblPiezak.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPiezak.setBounds(639, 23, 50, 18);
		contentPane.add(lblPiezak);
		
		JLabel lblEskaeraIco_1 = new JLabel("New label");
		lblEskaeraIco_1.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\ikonEskaeraHistorikoa(1).png"));
		lblEskaeraIco_1.setBounds(771, 251, 134, 107);
		contentPane.add(lblEskaeraIco_1);
		
		JLabel lblPiezaEskIco = new JLabel("New label");
		lblPiezaEskIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\ikonPiezaEskaera(1).png"));
		lblPiezaEskIco.setBounds(593, 251, 134, 107);
		contentPane.add(lblPiezaEskIco);
		
		JLabel lblEskaeraIco = new JLabel("New label");
		lblEskaeraIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\ikonEskaera(1).png"));
		lblEskaeraIco.setBounds(771, 52, 134, 107);
		contentPane.add(lblEskaeraIco);
		
		JLabel lblPiezakIco = new JLabel("New label");
		lblPiezakIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\ikonPieza(1).png"));
		lblPiezakIco.setBounds(593, 52, 134, 107);
		contentPane.add(lblPiezakIco);
		
		JLabel lblBalorazioak = new JLabel("Balorazioak");
		lblBalorazioak.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBalorazioak.setBounds(444, 221, 91, 23);
		contentPane.add(lblBalorazioak);
		
		JLabel lblLangileakIco_1_1 = new JLabel("New label");
		lblLangileakIco_1_1.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\ikonBalorazioa(1).png"));
		lblLangileakIco_1_1.setBounds(413, 251, 134, 107);
		contentPane.add(lblLangileakIco_1_1);
		
		JLabel lblBezeroak = new JLabel("Bezeroak");
		lblBezeroak.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBezeroak.setBounds(265, 221, 74, 23);
		contentPane.add(lblBezeroak);
		
		JLabel lblLangileakIco_1 = new JLabel("New label");
		lblLangileakIco_1.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\ikonBezeroa(1).png"));
		lblLangileakIco_1.setBounds(239, 251, 134, 107);
		contentPane.add(lblLangileakIco_1);
		
		JLabel lblProdPrsTxt_1_1 = new JLabel("Prestakuntzan");
		lblProdPrsTxt_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProdPrsTxt_1_1.setBounds(70, 221, 115, 18);
		contentPane.add(lblProdPrsTxt_1_1);
		
		JLabel lblProdPrsTxt_1 = new JLabel("Produktuak");
		lblProdPrsTxt_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProdPrsTxt_1.setBounds(80, 204, 89, 18);
		contentPane.add(lblProdPrsTxt_1);
		
		JLabel lblProduktPresIco = new JLabel("New label");
		lblProduktPresIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\ikonProduktuaPrestakuntzan(1).png"));
		lblProduktPresIco.setBounds(61, 251, 134, 107);
		contentPane.add(lblProduktPresIco);
		
		JLabel lblHornitzailtxt = new JLabel("Hornitzaileak");
		lblHornitzailtxt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHornitzailtxt.setBounds(433, 23, 102, 18);
		contentPane.add(lblHornitzailtxt);
		
		JLabel lbLangileaktxt = new JLabel("Langileak");
		lbLangileaktxt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbLangileaktxt.setBounds(265, 23, 74, 23);
		contentPane.add(lbLangileaktxt);
		
		JButton btnNewButton = new JButton("<--");
		btnNewButton.setIcon(null);
		btnNewButton.setBounds(0, 0, 59, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblProdtxt = new JLabel("Produktuak");
		lblProdtxt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProdtxt.setBounds(80, 23, 89, 18);
		contentPane.add(lblProdtxt);
		
		JLabel lblProduktuakIco = new JLabel("New label");
		lblProduktuakIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\ikonProduktua(1).png"));
		lblProduktuakIco.setBounds(61, 52, 134, 107);
		contentPane.add(lblProduktuakIco);
		
		JLabel lblLangileakIco = new JLabel("New label");
		lblLangileakIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\ikonLangilea(1).png"));
		lblLangileakIco.setBounds(239, 52, 134, 107);
		contentPane.add(lblLangileakIco);
		
		JLabel lblHornitzaileakIco = new JLabel("New label");
		lblHornitzaileakIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\ikonHornitzailea(1).png"));
		lblHornitzaileakIco.setBounds(413, 52, 134, 107);
		contentPane.add(lblHornitzaileakIco);
		
		JLabel lblFondoa = new JLabel("New label");
		lblFondoa.setSize(100, 100);
		lblFondoa.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\UTech java fondoa 1(1).png"));
		lblFondoa.setBounds(0, 0, 973, 434);
		contentPane.add(lblFondoa);
		
		JLabel label = new JLabel("New label");
		label.setBounds(814, 228, 48, 14);
		contentPane.add(label);
	}
}
