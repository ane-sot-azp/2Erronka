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
		
		JLabel lblProdPrsTxt_1_1 = new JLabel("Prestakuntzan");
		lblProdPrsTxt_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProdPrsTxt_1_1.setBounds(61, 221, 115, 18);
		contentPane.add(lblProdPrsTxt_1_1);
		
		JLabel lblProdPrsTxt_1 = new JLabel("Produktuak");
		lblProdPrsTxt_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProdPrsTxt_1.setBounds(80, 204, 89, 18);
		contentPane.add(lblProdPrsTxt_1);
		
		JLabel lblProduktPresIco = new JLabel("New label");
		lblProduktPresIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\ikonProduktua(1).png"));
		lblProduktPresIco.setBounds(61, 251, 134, 107);
		contentPane.add(lblProduktPresIco);
		
		JLabel lblHornitzailtxt = new JLabel("Hornitzaileak");
		lblHornitzailtxt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHornitzailtxt.setBounds(433, 23, 102, 18);
		contentPane.add(lblHornitzailtxt);
		
		JButton btnLangileakIkusi_1 = new JButton("Sartu");
		btnLangileakIkusi_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLangileakIkusi_1.setBounds(433, 170, 91, 23);
		contentPane.add(btnLangileakIkusi_1);
		
		JLabel lbLangileaktxt = new JLabel("Langileak");
		lbLangileaktxt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbLangileaktxt.setBounds(265, 22, 74, 23);
		contentPane.add(lbLangileaktxt);
		
		JButton btnLangileakIkusi = new JButton("Sartu");
		btnLangileakIkusi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLangileakIkusi.setBounds(265, 170, 91, 23);
		contentPane.add(btnLangileakIkusi);
		
		JButton btnNewButton = new JButton("<--");
		btnNewButton.setIcon(null);
		btnNewButton.setBounds(0, 0, 59, 23);
		contentPane.add(btnNewButton);
		
		JButton btnProdukIkusi = new JButton("Sartu");
		btnProdukIkusi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnProdukIkusi.setBounds(80, 170, 91, 23);
		contentPane.add(btnProdukIkusi);
		
		JLabel lblProdtxt = new JLabel("Produktuak");
		lblProdtxt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProdtxt.setBounds(80, 24, 89, 18);
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
	}
}
