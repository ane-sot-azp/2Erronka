package erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrintzipalaGarraioa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrintzipalaGarraioa frame = new PrintzipalaGarraioa();
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
	public PrintzipalaGarraioa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 490);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Garraiolaria");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel_1_1.setBounds(812, 419, 166, 32);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnAtera = new JButton("");
		btnAtera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JOptionPane.showMessageDialog(null, "Eskerrik asko aplikazioa erabiltzeagatik.", "ATERA ZARA",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnAtera.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\itxi(2).png"));
		btnAtera.setForeground(Color.WHITE);
		btnAtera.setBackground(new Color(255, 51, 51));
		btnAtera.setBounds(956, 0, 32, 32);
		contentPane.add(btnAtera);
		
		JLabel lblNewLabel_1 = new JLabel("Eskaerak:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel_1.setBounds(10, 11, 138, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\benat\\Downloads\\UTech java fondoa 1(2).png"));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setBounds(0, 0, 988, 445);
		contentPane.add(lblNewLabel);
	}
}
