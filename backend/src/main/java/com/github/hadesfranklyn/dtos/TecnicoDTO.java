package com.github.hadesfranklyn.dtos;

import java.io.Serializable;

import org.hibernate.validator.constraints.br.CPF;

import com.github.hadesfranklyn.domain.Tecnico;

public class TecnicoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;

	@CPF
	private String cpf;
	private String telefone;

	public TecnicoDTO() {
		super();
	}

	public TecnicoDTO(Tecnico obj) {
		super();
		id = obj.getId();
		nome = obj.getNome();
		cpf = obj.getCpf();
		telefone = obj.getTelefone();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
