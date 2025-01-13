package com.cesde.cursos.gestor_cursos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cesde.cursos.gestor_cursos.model.Curso;
import com.cesde.cursos.gestor_cursos.repository.CursoRepository;

@Service
public class CursoService {
    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> getAllCursos() {
        return cursoRepository.findAll();
    }

    public Curso saveCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public void deleteCurso(Long id) {
        cursoRepository.deleteById(id);
    }
}


