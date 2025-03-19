package com.example.atividade_lanche02.repositories;

import com.example.atividade_lanche02.entities.Lanche;
import com.example.atividade_lanche02.interfaces.LancheRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LancheRepositoryMySqlImpl implements LancheRepository {
    @Override
    public Lanche searchByCode(int code) {
        return null;
    }

    @Override
    public List<Lanche> buscar() {
        return List.of(new Lanche("asdas", "", 10, 100));
    }

    @Override
    public void addLanches(Lanche lanche) {

    }

    @Override
    public void removeLanche(int code) {

    }

    @Override
    public void updateLanche(int code, Lanche lanche) {

    }

    @Override
    public boolean estaVazio() {
        return false;
    }
}
