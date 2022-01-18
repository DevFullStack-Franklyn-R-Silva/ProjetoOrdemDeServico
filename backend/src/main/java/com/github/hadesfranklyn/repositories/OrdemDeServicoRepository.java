package com.github.hadesfranklyn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.hadesfranklyn.domain.OrdemDeServico;

@Repository
public interface OrdemDeServicoRepository extends JpaRepository<OrdemDeServico, Integer>{

}
