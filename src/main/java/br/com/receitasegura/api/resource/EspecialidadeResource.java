package br.com.receitasegura.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.receitasegura.api.repository.EspecialidadeRepository;

@RestController
@RequestMapping("/especialidades")
public class EspecialidadeResource {

	@Autowired
	private EspecialidadeRepository especialidadeRepository;
	
	/*
	@GetMapping()
	public List<Especialidade> listar() {
		// return especialidadeRepository.findAll();
		return null;
	}
	*/
	
}
