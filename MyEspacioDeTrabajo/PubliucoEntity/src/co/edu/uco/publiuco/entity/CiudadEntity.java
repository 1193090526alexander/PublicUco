package co.edu.uco.publiuco.entity;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ciudad")
public class CiudadEntity {
	@Id

	private UUID codigo;
	private String nombre;
	@ManyToOne
	@JoinColumn(name="departamento")
	private DepartamentoEntity departamento;
}
