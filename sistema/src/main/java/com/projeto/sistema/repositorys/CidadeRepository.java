package com.projeto.sistema.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.sistema.models.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{

}
