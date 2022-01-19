package com.github.hadesfranklyn.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.hadesfranklyn.domain.OrdemDeServico;
import com.github.hadesfranklyn.repositories.OrdemDeServicoRepository;
import com.github.hadesfranklyn.services.exceptions.ObjectNotFoundException;

@Service
public class OrdemDeServicoService {

	@Autowired
	private OrdemDeServicoRepository ordemDeServicoRepository;

	public OrdemDeServico findById(Integer id) {
		Optional<OrdemDeServico> obj = ordemDeServicoRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + OrdemDeServico.class.getName()));
	}

	public List<OrdemDeServico> findAll() {
		return ordemDeServicoRepository.findAll();
	}

}
