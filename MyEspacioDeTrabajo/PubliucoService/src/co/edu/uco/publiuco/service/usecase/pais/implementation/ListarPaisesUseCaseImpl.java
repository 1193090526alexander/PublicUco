package co.edu.uco.publiuco.service.usecase.pais.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uco.publiuco.repository.CiudadRepository;
import co.edu.uco.publiuco.repository.PaisRepository;
import co.edu.uco.publiuco.service.domain.CiudadDomain;
import co.edu.uco.publiuco.service.domain.PaisDomain;
import co.edu.uco.publiuco.service.usecase.ciudad.ListarCiudadesUseCase;
import co.edu.uco.publiuco.service.usecase.pais.ListarPaisesUseCase;
@Service
public class ListarPaisesUseCaseImpl implements ListarPaisesUseCase{

	@Autowired
	private PaisRepository repository;

	@Override
	public List<PaisDomain> execute(Optional<PaisDomain> domain) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
