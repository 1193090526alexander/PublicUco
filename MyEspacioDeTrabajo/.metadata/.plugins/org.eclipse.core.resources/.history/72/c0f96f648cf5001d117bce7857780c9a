package co.edu.uco.publiuco.entity;

import java.util.UUID;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "Ciudad")
public class CiudadEntity {
	@Id
	@Column (name = "codigo")
	private UUID codigo;
	@Column (name = "nombre" )
	private String nombre;
	@ManyToAny
	@JoinColumn (name = "departamento")
	private DepartamentoEntity departamento;

}
