package com.example.atividade_lanche02.interfaces;

import com.example.atividade_lanche02.entities.Lanche;

import java.util.List;

public interface LancheRepository {
    public Lanche searchByCode(int code);
    public List<Lanche> buscar();
    public void addLanches(Lanche lanche);
    public void removeLanche(int code);
    public void updateLanche(int code, Lanche lanche);
    public boolean estaVazio();
}
