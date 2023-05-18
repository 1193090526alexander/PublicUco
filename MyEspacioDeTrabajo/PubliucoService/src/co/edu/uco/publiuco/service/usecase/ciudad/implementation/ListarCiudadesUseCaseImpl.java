package co.edu.uco.publiuco.service.usecase.ciudad.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uco.publiuco.repository.CiudadRepository;
import co.edu.uco.publiuco.service.domain.CiudadDomain;
import co.edu.uco.publiuco.service.usecase.ciudad.ListarCiudadesUseCase;
@Service
public class ListarCiudadesUseCaseImpl implements ListarCiudadesUseCase{

	@Autowired
	private CiudadRepository repository;

	@Override
	public List<CiudadDomain> execute(Optional<CiudadDomain> domain) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
