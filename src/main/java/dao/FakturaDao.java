package com.wsis.sos.dao;

import com.wsis.sos.entity.Faktura;
import java.util.Date;
import java.util.List;

public interface FakturaDao {
    Faktura findById(Long id);
    List<Faktura> findAll();
    void save(Faktura faktura);
    void update(Faktura faktura);
    void delete(Long id);
    
    List<Faktura> findByKonto(Long kontoId);
    List<Faktura> findByNumerFaktury(String numerFaktury);
    List<Faktura> findByStatus(String status);
    List<Faktura> findByTerminPlatnosciBefore(Date date);
    List<Faktura> findZalegle();
    List<Faktura> findByKwotaGreaterThan(Float minKwota);
    Float sumaFakturByKonto(Long kontoId);
}