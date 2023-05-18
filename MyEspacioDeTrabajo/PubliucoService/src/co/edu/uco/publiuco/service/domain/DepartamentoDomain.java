package co.edu.uco.publiuco.service.domain;

import java.util.UUID;

public class DepartamentoDomain {
	
	private UUID codigo;
	private String nombre;
	private PaisDomain pais;
	
	public UUID getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public PaisDomain getPais() {
		return pais;
	}
	private void setCodigo(UUID codigo) {
		this.codigo = codigo;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private void setPais(PaisDomain pais) {
		this.pais = pais;
	}
	
	

}
