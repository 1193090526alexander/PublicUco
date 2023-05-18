package co.edu.uco.publiuco.service.usecase.pais.implementation;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uco.publiuco.entity.CiudadEntity;
import co.edu.uco.publiuco.entity.PaisEntity;
import co.edu.uco.publiuco.repository.CiudadRepository;
import co.edu.uco.publiuco.repository.PaisRepository;
import co.edu.uco.publiuco.service.domain.CiudadDomain;
import co.edu.uco.publiuco.service.domain.PaisDomain;
import co.edu.uco.publiuco.service.usecase.ciudad.RegistrarCiudadUseCase;
import co.edu.uco.publiuco.service.usecase.pais.RegistrarPaisUseCase;
import jakarta.persistence.Entity;

@Service
public class RegistrarPaisUseCaseImpl implements RegistrarPaisUseCase{
	
	@Autowired
	private PaisRepository repository;

	@Override
	public void excecute(PaisDomain domain) {
		//Creas las reglas de negocio 
		//specification pattern o un validator pattern
		validarNombrePais(domain.getNombre());
		generarUUID();
		//Aqui deberas crear el emsamblador 
		PaisEntity entity = null;
		repository.save(entity);
		
	}
    private void validarNombrePais(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre de la pais es obligatorio");
        }

        if (!nombre.matches("^[a-zA-Z]+$")) {
            throw new IllegalArgumentException("El nombre de la pais solo puede contener letras");
        }

        if (nombre.length() > 50) {
            throw new IllegalArgumentException("El nombre de la pais no puede exceder los 50 caracteres");
        }
        
    }
    private void generarUUID() {
    	UUID uuid = UUID.randomUUID();
    }

}
