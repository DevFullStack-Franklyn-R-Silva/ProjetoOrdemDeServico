package com.github.hadesfranklyn.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tecnico")
public class Tecnico extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "tecnico")
	private List<OrdemDeServico> list = new ArrayList<>();

	public Tecnico() {
		super();
	}

	public Tecnico(Integer id, String nome, String cpf, String telefone) {
		super(id, nome, cpf, telefone);
	}

	public List<OrdemDeServico> getList() {
		return list;
	}

	public void setList(List<OrdemDeServico> list) {
		this.list = list;
	}

}
