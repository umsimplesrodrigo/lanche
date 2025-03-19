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
        Lanche lanche1 = new Lanche("Lanche 1", "", 10.0, 1);
        Lanche lanche2 = new Lanche("Lanche 2", "", 10.0, 1);
        Lanche lanche3 = new Lanche("Lanche 3", "", 10.0, 1);

        this.lancheFacade.cadastrar(lanche1);
        this.lancheFacade.cadastrar(lanche2);
        this.lancheFacade.cadastrar(lanche3);
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
