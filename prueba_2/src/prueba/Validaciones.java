package prueba;

import java.awt.event.KeyEvent;

public class Validaciones {

	int a;
	
	public void validarNumeros(KeyEvent e){
		a = e.getKeyChar();
		if(!Character.isDigit(a)){
			e.consume();
		}
	}
	

}
