package visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class Inicio {

	private JFrame frame;
	private JTextField txt_nombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_empezar = new JButton("Empezar");
		btn_empezar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Juego j = new Juego();
				j.setVisible(true);
				j.setNombre(txt_nombre.getText());
			}
		});
		btn_empezar.setBounds(155, 185, 119, 37);
		frame.getContentPane().add(btn_empezar);
		
		JLabel lbl_bienvenido = new JLabel("Bienvenido!!");
		lbl_bienvenido.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_bienvenido.setBounds(155, 29, 119, 37);
		frame.getContentPane().add(lbl_bienvenido);
		
		JLabel lbl_nombre = new JLabel("Ingrese su nombre: ");
		lbl_nombre.setBounds(155, 103, 119, 37);
		frame.getContentPane().add(lbl_nombre);
		
		txt_nombre = new JTextField();
		lbl_nombre.setLabelFor(txt_nombre);
		txt_nombre.setBounds(155, 137, 119, 37);
		frame.getContentPane().add(txt_nombre);
		txt_nombre.setColumns(10);
		
		
	}
	
	

}
