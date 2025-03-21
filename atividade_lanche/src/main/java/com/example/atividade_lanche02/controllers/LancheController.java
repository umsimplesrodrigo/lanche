package com.example.atividade_lanche02.controllers;

import com.example.atividade_lanche02.entities.Lanche;
import com.example.atividade_lanche02.facade.LancheFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class LancheController {
    private final LancheFacade lancheFacade;

    @Autowired
    public LancheController(LancheFacade lancheFacade) {
        this.lancheFacade = lancheFacade;

    }

    @GetMapping("")
    public List<Lanche> get() {
        return lancheFacade.buscar();
    }

    @GetMapping("/{codigo}")
    public Lanche getLanche(@PathVariable int codigo) {
        return lancheFacade.buscarPorCodigo(codigo);
    }

    @PostMapping("")
    public void cadastrar(@RequestBody Lanche lanche) {
        lancheFacade.cadastrar(lanche);
    }
}
