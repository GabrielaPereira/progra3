package visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Logica.Jugar;
import Logica.Validaciones;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;

public class Juego extends JFrame {

	private JPanel contentPane;
	private JTextField txt_n;
	private JTextField txt_n2;
	private JTextField txt_n3;
	private JLabel lbl_nombre;
	private JLabel lbl_operador;
	private JLabel lbl_operador2;
	private JLabel lbl_res;
	private Jugar j; 
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego frame = new Juego();
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
	public Juego() {
				
		j = new Jugar();
		Validaciones validar = new Validaciones();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		txt_n = new JTextField();
		txt_n.addKeyListener(new KeyAdapter() {
			
			public void keyTyped(KeyEvent e) {
				validar.validarNumeros(e);
			}
		});
		
		txt_n.setBounds(10, 86, 33, 20);
		contentPane.add(txt_n);
		txt_n.setColumns(10);
		
		txt_n2 = new JTextField();
		txt_n2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				validar.validarNumeros(e);
			}
		});
		txt_n2.setBounds(86, 86, 28, 20);
		contentPane.add(txt_n2);
		txt_n2.setColumns(10);
		
		txt_n3 = new JTextField();
		txt_n3.addKeyListener(new KeyAdapter() {
			
			public void keyTyped(KeyEvent e) {
				validar.validarNumeros(e);
			}
		});
		txt_n3.setColumns(10);
		txt_n3.setBounds(149, 86, 28, 20);
		contentPane.add(txt_n3);
		
		
		lbl_operador = new JLabel("");
		lbl_operador.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_operador.setBounds(53, 89, 22, 14);
		contentPane.add(lbl_operador);
		lbl_operador.setText(j.setOperador());
		
		JLabel lbl_igual = new JLabel("=");
		lbl_igual.setBounds(187, 89, 46, 14);
		contentPane.add(lbl_igual);
		
		JButton btnNewButton = new JButton("Verificar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				j.verificar(numeros, operadores);
			}
		});
		btnNewButton.setBounds(106, 129, 121, 36);
		contentPane.add(btnNewButton);
		
		lbl_nombre = new JLabel(" ");
		lbl_nombre.setBounds(10, 40, 217, 14);
		contentPane.add(lbl_nombre);
		
		lbl_operador2 = new JLabel("/");
		lbl_operador2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_operador2.setBounds(125, 89, 28, 14);
		contentPane.add(lbl_operador2);
		
		lbl_res = new JLabel("");
		lbl_res.setBounds(214, 89, 88, 14);
		contentPane.add(lbl_res);
		lbl_res.setText(Integer.toString(j.getresultado()));
	
	}

	public void setNombre (String Nombre){
		lbl_nombre.setText("Bienvenido " +Nombre.toString());
	}
	
	public void guardarOperadores (){
		
	}
	
	
}
