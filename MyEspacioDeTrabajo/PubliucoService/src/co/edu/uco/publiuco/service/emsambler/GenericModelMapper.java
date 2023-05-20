package co.edu.uco.publiuco.service.emsambler;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GenericModelMapper {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
