package entidades;

public class Datos {

	//Atributos
	private int codigoIdentificador=0;
	private String nombreVeterinario;
	private String apellidoVeterinario;
	private String numeroColegiado;
	private String nombrePropietario;
	private String apellidoPropietario;
	private int numeroMascotas=0;
	
	//Getters & Setters
	public int getCodigoIdentificador() {
		return codigoIdentificador;
	}
	public void setCodigoIdentificador(int codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	}
	public String getNombreVeterinario() {
		return nombreVeterinario;
	}
	public void setNombreVeterinario(String nombreVeterinario) {
		this.nombreVeterinario = nombreVeterinario;
	}
	public String getApellidoVeterinario() {
		return apellidoVeterinario;
	}
	public void setApellidoVeterinario(String apellidoVeterinario) {
		this.apellidoVeterinario = apellidoVeterinario;
	}
	public String getNumeroColegiado() {
		return numeroColegiado;
	}
	public void setNumeroColegiado(String numeroColegiado) {
		this.numeroColegiado = numeroColegiado;
	}
	public String getNombrePropietario() {
		return nombrePropietario;
	}
	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}
	public String getApellidoPropietario() {
		return apellidoPropietario;
	}
	public void setApellidoPropietario(String apellidoPropietario) {
		this.apellidoPropietario = apellidoPropietario;
	}
	public int getNumeroMascotas() {
		return numeroMascotas;
	}
	public void setNumeroMascotas(int numeroMascotas) {
		this.numeroMascotas = numeroMascotas;
	}
	
	@Override
	public String toString() {
		return "datos [Codigo Identificador=" + codigoIdentificador + "Nombre Veterinario=" + nombreVeterinario + ", Apellido Veterinario=" + apellidoVeterinario + ", "
				+ "Nombre Propietario=" + nombrePropietario + ", Apellido Propietario=" + apellidoPropietario + ", "
				+ "Numero Mascotas=" + numeroMascotas + "]";
	}

}
