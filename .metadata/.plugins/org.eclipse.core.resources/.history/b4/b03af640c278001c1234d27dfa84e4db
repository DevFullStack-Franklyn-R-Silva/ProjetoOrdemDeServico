package com.github.hadesfranklyn.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.hadesfranklyn.domain.Cliente;
import com.github.hadesfranklyn.domain.OrdemDeServico;
import com.github.hadesfranklyn.domain.Tecnico;
import com.github.hadesfranklyn.domain.enums.Prioridade;
import com.github.hadesfranklyn.domain.enums.Status;
import com.github.hadesfranklyn.repositories.ClienteRepository;
import com.github.hadesfranklyn.repositories.OrdemDeServicoRepository;
import com.github.hadesfranklyn.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private OrdemDeServicoRepository ordemDeServicoRepository;

	public void instanciaDB() {

		Tecnico t1 = new Tecnico(null, "Franklyn Roberto", "929.031.800-75", "(82) 93539-9999");
		Cliente c1 = new Cliente(null, "Betina Campos", "929.031.800-75", "(82) 98981-5558");
		OrdemDeServico os1 = new OrdemDeServico(null, Prioridade.ALTA, "Teste create OS", Status.ANDAMENTO, t1, c1);

		t1.getList().add(os1);
		c1.getList().add(os1);

		tecnicoRepository.saveAll(Arrays.asList(t1));
		clienteRepository.saveAll(Arrays.asList(c1));
		ordemDeServicoRepository.saveAll(Arrays.asList(os1));

	}
}
