package co.edu.uco.publiuco.service.domain;

import java.util.UUID;

public class CiudadDomain {
	
	private UUID codigo;
	private String nombre;
	private DepartamentoDomain departamento;
	
	
	public UUID getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public DepartamentoDomain getDepartamento() {
		return departamento;
	}
	private void setCodigo(UUID codigo) {
		this.codigo = codigo;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private void setDepartamento(DepartamentoDomain departamento) {
		this.departamento = departamento;
	}

	 
}
