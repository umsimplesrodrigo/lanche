package com.example.atividade_lanche02.facade;

import java.util.List;

import com.example.atividade_lanche02.applications.LancheApplication;
import com.example.atividade_lanche02.entities.Lanche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class LancheFacade {
    private LancheApplication lancheApplication;

    @Autowired
    public LancheFacade(LancheApplication lancheApplication) {
        this.lancheApplication = lancheApplication;
    }

    public void cadastrar(Lanche lanche){
        this.lancheApplication.cadastrar(lanche);
    }

    public void atualizar(int codigo, Lanche lanche){
        this.lancheApplication.atualizar(codigo, lanche);
    }

    public void remover(int codigo){
        this.lancheApplication.remover(codigo);
    }

    public List<Lanche> buscar(){
        return this.lancheApplication.buscar();
    }

    public Lanche buscarPorCodigo(int codigo){
        return this.lancheApplication.buscarPorCodigo(codigo);
    }

    public double calcularLanche(Lanche lanche, int quantidade){
        return this.lancheApplication.calcularLanche(lanche, quantidade);
    }

    public boolean estaVazio(){
        return this.lancheApplication.estaVazio();
    }
}
