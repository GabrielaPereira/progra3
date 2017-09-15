package prueba;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ItemEvent;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal {

	private JFrame frame;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
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
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		juego j = new juego();
		ArrayList auxNros = new ArrayList();
		ArrayList auxOp = new ArrayList();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 493, 297);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_op2 = new JLabel("op");
		lbl_op2.setBounds(109, 100, 25, 28);
		frame.getContentPane().add(lbl_op2);
		lbl_op2.setVisible(false);
		
		JLabel lbl_op1 = new JLabel("op");
		lbl_op1.setBounds(240, 100, 25, 28);
		frame.getContentPane().add(lbl_op1);
		lbl_op1.setVisible(false);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 104, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		textField_2.setVisible(false);
		
		textField_1 = new JTextField();
		textField_1.setBounds(144, 104, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		textField_1.setVisible(false);
		
		textField = new JTextField();
		textField.setBounds(271, 104, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setVisible(false);
		
		JCheckBox chckbx_1 = new JCheckBox("1");
		chckbx_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if (chckbx_1.isSelected()){
					textField.setVisible(true);
					textField_1.setVisible(true);
					lbl_op1.setVisible(true);
				}else{
					textField.setVisible(false);
					textField_1.setVisible(false);
					lbl_op1.setVisible(false);
				}
			}
		});
		chckbx_1.setBounds(10, 36, 54, 23);
		frame.getContentPane().add(chckbx_1);
		
		JCheckBox chckbx_2 = new JCheckBox("2");
		chckbx_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chckbx_2.isSelected() && chckbx_1.isSelected()){
					textField_2.setVisible(true);
					lbl_op2.setVisible(true);
				}else{
					textField_2.setVisible(false);
					lbl_op2.setVisible(false);
				}
			}
		});
		chckbx_2.setBounds(66, 36, 54, 23);
		frame.getContentPane().add(chckbx_2);
				
		JButton btn_op = new JButton("Generar Operadores");
		btn_op.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lbl_op2.setText(j.mostrarOperador(j.genOperador()));
				lbl_op1.setText(j.mostrarOperador(j.genOperador()));
				
			}
		});
		btn_op.setBounds(213, 36, 144, 23);
		frame.getContentPane().add(btn_op);
		
		JButton btn_verificar = new JButton("Verificar");
		btn_verificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j.verificarCuenta();
			}
		});
		btn_verificar.setBounds(144, 178, 89, 23);
		frame.getContentPane().add(btn_verificar);
		
		JLabel lbl_resultado = new JLabel("= ");
		lbl_resultado.setBounds(367, 107, 77, 14);
		frame.getContentPane().add(lbl_resultado);
		lbl_resultado.setText("= " + j.getresultado());
		
		
	}
}
