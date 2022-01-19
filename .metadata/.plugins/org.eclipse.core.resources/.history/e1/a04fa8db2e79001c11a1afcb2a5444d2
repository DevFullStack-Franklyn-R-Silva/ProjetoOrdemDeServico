package com.github.hadesfranklyn.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.hadesfranklyn.domain.Pessoa;
import com.github.hadesfranklyn.domain.Cliente;
import com.github.hadesfranklyn.dtos.ClienteDTO;
import com.github.hadesfranklyn.repositories.PessoaRepository;
import com.github.hadesfranklyn.repositories.ClienteRepository;
import com.github.hadesfranklyn.services.exceptions.DataIntegratyViolationException;
import com.github.hadesfranklyn.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private PessoaRepository pessoaRepository;

	/*
	 * Busca pelo ID
	 */
	public Cliente findById(Integer id) {
		Optional<Cliente> obj = clienteRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! " + id + ", Tipo: " + Cliente.class.getName()));
	}

	/*
	 * Busca todos os Clientes da base de dados
	 */
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	/*
	 * Cria um novo Cliente
	 */
	public Cliente create(ClienteDTO objDTO) {
		if (findByCPF(objDTO) != null) {
			throw new DataIntegratyViolationException("CPF já cadastrado na base de dados!");
		}
		return clienteRepository.save(new Cliente(null, objDTO.getNome(), objDTO.getCpf(), objDTO.getTelefone()));
	}

	/*
	 * Atualiza um Cliente
	 */
	public Cliente update(Integer id, @Valid ClienteDTO objDTO) {
		Cliente oldObj = findById(id);

		if (findByCPF(objDTO) != null && findByCPF(objDTO).getId() != id) {
			throw new DataIntegratyViolationException("CPF já cadastrado na base de dados!");
		}

		oldObj.setNome(objDTO.getNome());
		oldObj.setCpf(objDTO.getCpf());
		oldObj.setTelefone(objDTO.getTelefone());
		return clienteRepository.save(oldObj);
	}

	/*
	 * Deleta um Cliente pelo ID
	 */
	public void delete(Integer id) {
		Cliente obj = findById(id);

		if (obj.getList().size() > 0) {
			throw new DataIntegratyViolationException("Pessoa possui Ordens de Serviço, não pode ser deletado!");
		}
		clienteRepository.deleteById(id);
	}

	/*
	 * Busca Cliente pelo CPF
	 */
	private Pessoa findByCPF(ClienteDTO objDTO) {
		Pessoa obj = pessoaRepository.findByCPF(objDTO.getCpf());
		if (obj != null) {
			return obj;
		}
		return null;
	}
}
