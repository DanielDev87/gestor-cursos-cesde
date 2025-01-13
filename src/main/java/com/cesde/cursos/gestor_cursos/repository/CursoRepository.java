package com.cesde.cursos.gestor_cursos.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cesde.cursos.gestor_cursos.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
