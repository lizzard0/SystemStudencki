package com.wsis.sos.dao;

import com.wsis.sos.entity.Przedmiot;
import java.util.List;

public interface PrzedmiotDao {
    Przedmiot findById(Long id);
    List<Przedmiot> findAll();
    void save(Przedmiot przedmiot);
    void update(Przedmiot przedmiot);
    void delete(Long id);
    
    List<Przedmiot> findByKod(String kod);
    List<Przedmiot> findByNazwa(String nazwa);
    List<Przedmiot> findByProwadzacy(Long prowadzacyId);
    List<Przedmiot> findByKategoria(Long kategoriaId);
    List<Przedmiot> findActive();
    List<Przedmiot> findByEctsRange(Integer minEcts, Integer maxEcts);
}