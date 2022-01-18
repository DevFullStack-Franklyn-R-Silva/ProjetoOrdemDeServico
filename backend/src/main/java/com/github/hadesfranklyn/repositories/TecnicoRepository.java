package com.github.hadesfranklyn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.hadesfranklyn.domain.Tecnico;

@Repository
public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
