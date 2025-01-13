package com.cesde.cursos.gestor_cursos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesde.cursos.gestor_cursos.model.Docente;
import com.cesde.cursos.gestor_cursos.service.DocenteService;

@RestController
@RequestMapping("/api/docentes")
public class DocenteController {
    private final DocenteService docenteService;

    public DocenteController(DocenteService docenteService) {
        this.docenteService = docenteService;
    }

    @GetMapping
    public List<Docente> getAllDocentes() {
        return docenteService.getAllDocentes();
    }

    @PostMapping
    public Docente createDocente(@RequestBody Docente docente) {
        return docenteService.saveDocente(docente);
    }

    @DeleteMapping("/{id}")
    public void deleteDocente(@PathVariable Long id) {
        docenteService.deleteDocente(id);
    }
}
