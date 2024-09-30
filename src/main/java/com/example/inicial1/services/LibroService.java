package com.example.inicial1.services;

import com.example.inicial1.entities.Libro;
import com.example.inicial1.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LibroService extends BaseService<Libro, Long>{
    List<Libro> search(String filtro) throws Exception;
    Page<Libro> search(String filtro, Pageable pageable) throws Exception;
}
