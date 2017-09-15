package prueba;

import java.util.Random;

public class juego {
	String operadores[];
	int resultado;
	
	public juego(){
		operadores = new String[4]; 
		operadores[0] = "+";
		operadores[1] = "-";
		operadores[2] = "*";
		operadores[3] = "/";
	}
	
	public int genOperador (){
		Random aleatorio = new Random();
		int pos  = aleatorio.nextInt(4);
		return pos;
	}
	public String mostrarOperador(int p){
		return operadores[p];
	}
	public int getresultado() {
		Random aleatorio = new Random(System.currentTimeMillis());
		return resultado = aleatorio.nextInt(1233);
	}
	
	public boolean verificarCuenta(){
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
