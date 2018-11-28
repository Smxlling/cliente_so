package model;
import java.net.*;
import java.io.*;
public class Client implements Runnable{
	private int port;
	private String inetAddres;
	private Socket miSocket;
	
		public Client(String inetAddres,int port) {
			this.inetAddres=inetAddres;
			this.port=port;
			
			try {
				this.miSocket = new Socket("192.168.0.11",8888);
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		public void escribir(String mensaje,String ipDestino) {
			
			
			PaqueteInformacion envio =new PaqueteInformacion();
			try {
				
				envio.setIp(ipDestino);
				envio.setMensaje(mensaje);
				
				ObjectOutputStream dos = new ObjectOutputStream(miSocket.getOutputStream());
				dos.writeObject(envio);
				
				
				
				
				dos.close();
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				System.out.println("Eirecci�n IP del host no pudo ser determinada");
				e.printStackTrace();
			}catch(IOException io) {
				System.out.println("Error de E / S al crear el socket.");
			}catch(SecurityException se) {
				System.out.println("Existe un administrador de seguridad y su checkConnectm�todo no permite la operaci�n.");
			}catch(IllegalArgumentException ia) {
				System.out.println("El par�metro del puerto est� fuera del rango especificado de valores de puerto v�lidos, que est� entre 0 y 65535, inclusive");
				
			}
			
				
				
			
			
			
			
			
		}


		
		public void run() {
			// TODO Auto-generated method stub
			/*		ServerSocket miServer;
			
			
			PaqueteInformacion recivido=new PaqueteInformacion();
			try {
				while(true){
				miServer = new ServerSocket(9990);
				Socket miSocket = miServer.accept();
				
				ObjectInputStream ois=new ObjectInputStream(miSocket.getInputStream());
				
				try {
					recivido=(PaqueteInformacion) ois.readObject();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("NO se encontro la clase");
				}
				System.out.println("Mensaje: "+recivido.getMensaje());
				}
			}catch(IOException e) {
				
			}*/
		}
	
}
