package com.cesde.cursos.gestor_cursos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cesde.cursos.gestor_cursos.model.Docente;
import com.cesde.cursos.gestor_cursos.repository.DocenteRepository;

@Service
public class DocenteService {
    private final DocenteRepository docenteRepository;

    public DocenteService(DocenteRepository docenteRepository) {
        this.docenteRepository = docenteRepository;
    }

    public List<Docente> getAllDocentes() {
        return docenteRepository.findAll();
    }

    public Docente saveDocente(Docente docente) {
        return docenteRepository.save(docente);
    }

    public void deleteDocente(Long id) {
        docenteRepository.deleteById(id);
    }
}
