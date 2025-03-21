package com.example.atividade_lanche02.repositories;

import com.example.atividade_lanche02.entities.Lanche;
import com.example.atividade_lanche02.interfaces.LancheRepository;
import com.example.atividade_lanche02.repositories.jpa.LancheJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LancheRepositoryMySqlImpl implements LancheRepository {
    private final LancheJPA lancheJPA;

    @Autowired
    public LancheRepositoryMySqlImpl(LancheJPA lancheJPA) {
        this.lancheJPA = lancheJPA;
    }

    @Override
    public Lanche searchByCode(int code) {
        return this.lancheJPA.findById(code).get();
    }

    @Override
    public List<Lanche> buscar() {
        return this.lancheJPA.findAll();
    }

    @Override
    public void addLanches(Lanche lanche) {
        this.lancheJPA.save(lanche);
    }

    @Override
    public void removeLanche(int code) {
        this.lancheJPA.deleteById(code);
    }

    @Override
    public void updateLanche(int code, Lanche lanche) {
        Lanche lancheInDb = this.lancheJPA.findById(code).get();

        lancheInDb.setNome(lanche.getNome());
        lancheInDb.setImgUrl(lanche.getImgUrl());
        lancheInDb.setPreco(lanche.getPreco());

        this.lancheJPA.save(lanche);
    }

    @Override
    public boolean estaVazio() {
        return false;
    }
}
