package co.edu.uco.publiuco.service.usecase.departamento.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uco.publiuco.repository.CiudadRepository;
import co.edu.uco.publiuco.repository.DepartamentoRepository;
import co.edu.uco.publiuco.repository.PaisRepository;
import co.edu.uco.publiuco.service.domain.CiudadDomain;
import co.edu.uco.publiuco.service.domain.DepartamentoDomain;
import co.edu.uco.publiuco.service.domain.PaisDomain;
import co.edu.uco.publiuco.service.usecase.ciudad.EliminarCiudadUseCase;
import co.edu.uco.publiuco.service.usecase.departamento.EliminarDepartamentoUseCase;
import co.edu.uco.publiuco.service.usecase.pais.EliminarPaisUseCase;

@Service
public class EliminarDepartamentoUseCaseImpl implements EliminarDepartamentoUseCase {

	@Autowired
	private DepartamentoRepository repository;

	@Override
	public void execute(DepartamentoDomain domain) {
		// TODO Auto-generated method stub
		
	}
}
