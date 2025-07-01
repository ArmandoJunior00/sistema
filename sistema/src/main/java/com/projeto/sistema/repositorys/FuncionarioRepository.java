package com.projeto.sistema.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.sistema.models.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

}
