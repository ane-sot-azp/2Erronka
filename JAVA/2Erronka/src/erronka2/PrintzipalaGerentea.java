package erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrintzipalaGerentea extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrintzipalaGerentea frame = new PrintzipalaGerentea();
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
	public PrintzipalaGerentea() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 490);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Gerentea");
		lblNewLabel_1.setBounds(840, 419, 138, 32);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblBalorazioakIco = new JLabel("New label");
		lblBalorazioakIco.setBounds(771, 52, 134, 107);
		lblBalorazioakIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\balorazioak(1).png"));
		contentPane.add(lblBalorazioakIco);
		
		JLabel lblEskHistoIco = new JLabel("New label");
		lblEskHistoIco.setBounds(593, 251, 134, 107);
		lblEskHistoIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\eskaerenHistorikoa(1).png"));
		contentPane.add(lblEskHistoIco);
		
		JLabel lblEskaeraIco = new JLabel("New label");
		lblEskaeraIco.setBounds(593, 52, 134, 107);
		lblEskaeraIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\eskaerak(1).png"));
		contentPane.add(lblEskaeraIco);
		
		JLabel lblPiezaEskIco = new JLabel("New label");
		lblPiezaEskIco.setBounds(413, 251, 134, 107);
		lblPiezaEskIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\piezenEskaera(1).png"));
		contentPane.add(lblPiezaEskIco);
		
		JLabel lblPiezakIco = new JLabel("New label");
		lblPiezakIco.setBounds(413, 52, 134, 107);
		lblPiezakIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\piezak(1).png"));
		contentPane.add(lblPiezakIco);
		
		JButton btnAtera = new JButton("");
		btnAtera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JOptionPane.showMessageDialog(null, "Eskerrik asko aplikazioa erabiltzeagatik.", "ATERA ZARA",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnAtera.setBounds(956, 0, 32, 32);
		btnAtera.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\itxi(2).png"));
		btnAtera.setForeground(Color.WHITE);
		btnAtera.setBackground(new Color(255, 51, 51));
		contentPane.add(btnAtera);
		
		
		JLabel lblHornitzaileakIco = new JLabel("New label");
		lblHornitzaileakIco.setBounds(239, 251, 134, 107);
		lblHornitzaileakIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\hornitzaileak(1).png"));
		contentPane.add(lblHornitzaileakIco);
		
		JLabel lblBezeroakIco = new JLabel("New label");
		lblBezeroakIco.setBounds(239, 52, 134, 107);
		lblBezeroakIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\bezeroak(1).png"));
		contentPane.add(lblBezeroakIco);
		
		JLabel lblProduktuakIco = new JLabel("");
		lblProduktuakIco.setBounds(61, 52, 134, 108);
		lblProduktuakIco.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\produktuak(1).png"));
		contentPane.add(lblProduktuakIco);
		
		JLabel lblProduktPresIco_1 = new JLabel("New label");
		lblProduktPresIco_1.setBounds(61, 251, 134, 107);
		lblProduktPresIco_1.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\produktuakPrestakuntzan(1).png"));
		contentPane.add(lblProduktPresIco_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 988, 445);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\UTech java fondoa 1(2).png"));
		contentPane.add(lblNewLabel);
	}

}
