package Logica;

import java.util.Random;

import javax.swing.JTextField;

public class Jugar {

	private String[] operadores;
	private int resultado;
	private int numeros;
	
	public Jugar (){
		operadores = new String[4]; 
		operadores[0] = "+";
		operadores[1] = "-";
		operadores[2] = "*";
		operadores[3] = "/";
		
		resultado = 0;
	}
	
	public String setOperador(){
		Random aleatorio = new Random(System.currentTimeMillis());
		int pos  = aleatorio.nextInt(4);
		return operadores[pos];
	}
	
	public int buscarOperador(String s){
		int a = operadores.length;
		int ret = 0;
		while (operadores.length<a){
			if(s== operadores[a-1]){
				ret = a-1;
			}
		}
		return ret;
	}
	
	public boolean verificar(){
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Jugar n = new Jugar();
//		Random aleatorio = new Random(System.currentTimeMillis());
//		int intAletorio = aleatorio.nextInt(4);
//		System.out.println(intAletorio);
//		System.out.println(n.getOperador());
	}

	public int getresultado() {
		Random aleatorio = new Random(System.currentTimeMillis());
		return resultado = aleatorio.nextInt(1233);
		
	}
	
	

}
