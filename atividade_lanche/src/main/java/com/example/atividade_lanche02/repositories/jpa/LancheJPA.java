package com.example.atividade_lanche02.repositories.jpa;

import com.example.atividade_lanche02.entities.Lanche;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancheJPA extends JpaRepository<Lanche, Integer> {

}
