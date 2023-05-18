package co.edu.uco.publiuco.entity;

import java.util.UUID;

import org.hibernate.annotations.ManyToAny;
import javax.persistence.*;
import javax.validation.constraints.*;

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
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name = "codigo")
	private UUID codigo;
	@NotBlank(message = "El nombre de la ciudad es obligatorio")
	@Size(max = 50, message = "El nombre de la ciudad no puede exceder los 50 caracteres")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "El nombre de la ciudad solo puede contener letras")
	@Column(name = "nombre")
	private String nombre;
	@ManyToAny
	@JoinColumn (name = "departamento")
	private DepartamentoEntity departamento;

}
