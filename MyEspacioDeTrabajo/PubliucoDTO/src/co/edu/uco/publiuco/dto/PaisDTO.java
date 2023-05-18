package co.edu.uco.publiuco.dto;

import java.util.UUID;

import lombok.Builder;
@Builder

public class PaisDTO {
	private UUID codigo;
	private String nombre;

}
