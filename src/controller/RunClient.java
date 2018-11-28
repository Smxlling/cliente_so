package controller;

import java.util.Scanner;

import model.Client;

public class RunClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Client cliente =new Client("192.168.02.3",9990);
		Thread hilocliente =new Thread(cliente);
		hilocliente.start();
		
		Scanner sr=new Scanner(System.in);
		System.out.println("Escribir a quien enviar");
		String ipDestino=sr.nextLine();
		
		
	
		System.out.println("Escribir mensaje");
		String mensaje=sr.nextLine();
		
		cliente.escribir(mensaje,ipDestino);
		
		
		
	}

}
