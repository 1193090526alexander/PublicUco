package co.edu.uco.publiuco.service.usecase.ciudad.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uco.publiuco.repository.CiudadRepository;
import co.edu.uco.publiuco.service.domain.CiudadDomain;
import co.edu.uco.publiuco.service.usecase.ciudad.EliminarCiudadUseCase;

@Service
public class EliminarCiudadUseCaseImpl implements EliminarCiudadUseCase {

	@Autowired
	private CiudadRepository repository;
	@Override
	public void execute(CiudadDomain domain) {
		// TODO Auto-generated method stub
		
	}

}
