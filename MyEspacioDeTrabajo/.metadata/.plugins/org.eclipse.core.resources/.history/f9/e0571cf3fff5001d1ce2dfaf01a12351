package co.edu.uco.publiuco.entity;

import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table (name = "Departamento")
public class DepartamentoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name = "codigo")
	private UUID codigo;
	@NotBlank(message = "El nombre de la pais es obligatorio")
	@Size(max = 50, message = "El nombre de la pais no puede exceder los 50 caracteres")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "El nombre de la pais solo puede contener letras")
	@Column(name = "nombre")
	private String nombre;
	@ManyToAny
	@JoinColumn (name = "pais")
	private PaisEntity pais;

}
