package co.edu.uco.publiuco.service.usecase.departamento.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uco.publiuco.entity.CiudadEntity;
import co.edu.uco.publiuco.entity.DepartamentoEntity;
import co.edu.uco.publiuco.entity.PaisEntity;
import co.edu.uco.publiuco.repository.CiudadRepository;
import co.edu.uco.publiuco.repository.DepartamentoRepository;
import co.edu.uco.publiuco.repository.PaisRepository;
import co.edu.uco.publiuco.service.domain.CiudadDomain;
import co.edu.uco.publiuco.service.domain.DepartamentoDomain;
import co.edu.uco.publiuco.service.domain.PaisDomain;
import co.edu.uco.publiuco.service.usecase.ciudad.RegistrarCiudadUseCase;
import co.edu.uco.publiuco.service.usecase.departamento.RegistrarDepartamentoUseCase;
import co.edu.uco.publiuco.service.usecase.pais.RegistrarPaisUseCase;

@Service
public class RegistrarDepartamentoUseCaseImpl implements RegistrarDepartamentoUseCase{
	
	@Autowired
	private DepartamentoRepository repository;

	@Override
	public void excecute(DepartamentoDomain domain) {
		//Creas las reglas de negocio 
		//specification pattern o un validator pattern
		validarNombreDepartamento(domain.getNombre());
		//Aqui deberas crear el emsamblador 
		DepartamentoEntity entity = null;
		repository.save(entity);
	}
    private void validarNombreDepartamento(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre de la departamento es obligatorio");
        }

        if (!nombre.matches("^[a-zA-Z]+$")) {
            throw new IllegalArgumentException("El nombre de la departamento solo puede contener letras");
        }

        if (nombre.length() > 50) {
            throw new IllegalArgumentException("El nombre de la departamento no puede exceder los 50 caracteres");
        } 
    }
}
