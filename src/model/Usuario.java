package model;

public class Usuario {
	private String nombre;
	private String Apellido;
	private String nombreUsuario;
	private int estadoLogin;
	private int estado;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public int getEstadoLogin() {
		return estadoLogin;
	}
	public void setEstadoLogin(int estadoLogin) {
		this.estadoLogin = estadoLogin;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	

}
