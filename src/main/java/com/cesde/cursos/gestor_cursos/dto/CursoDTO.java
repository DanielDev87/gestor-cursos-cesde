package com.cesde.cursos.gestor_cursos.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CursoDTO {
    private Long id;
    private String nombre;
    private String descripcion;
    private Integer duracion;
    private BigDecimal precio;
    private LocalDateTime fechaInicio;
    private Long docenteId;

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Integer getDuracion() {
        return duracion;
    }
    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
    public BigDecimal getPrecio() {
        return precio;
    }
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Long getDocenteId() {
        return docenteId;
    }
    public void setDocenteId(Long docenteId) {
        this.docenteId = docenteId;
    }


    

}
