package com.example.inicial1.services;

import com.example.inicial1.entities.Domicilio;
import com.example.inicial1.entities.Libro;
import com.example.inicial1.repositories.BaseRepository;
import com.example.inicial1.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio, Long> implements DomicilioService{
    @Autowired
    private DomicilioRepository domicilioRepository;

    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository){
        super(baseRepository);
    }

    @Override
    public List<Domicilio> search(String filtro) throws Exception {
        try {
            // List<Domicilio> domicilios = domicilioRepository.findByCalleContaining(filtro);
            List<Domicilio> domicilios = domicilioRepository.search(filtro);
            // List<Domicilio> domicilios = domicilioRepository.searchNativo(filtro);
            return domicilios;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Domicilio> search(String filtro, Pageable pageable) throws Exception {
        try {
            // Page<Domicilio> domicilios = domicilioRepository.findByCalleContaining(filtro, pageable);
            Page<Domicilio> domicilios = domicilioRepository.search(filtro, pageable);
            // Page<Domicilio> domicilios = domicilioRepository.searchNativo(filtro, pageable);
            return domicilios;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
