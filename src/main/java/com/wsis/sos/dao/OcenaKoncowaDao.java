package com.wsis.sos.dao;

import com.wsis.sos.entity.OcenaKoncowa;
import java.util.List;

public interface OcenaKoncowaDao {
    OcenaKoncowa findById(Long id);
    List<OcenaKoncowa> findAll();
    void save(OcenaKoncowa ocena);
    void update(OcenaKoncowa ocena);
    void delete(Long id);
    
    List<OcenaKoncowa> findByStudent(Long studentId);
    List<OcenaKoncowa> findByPrzedmiot(Long przedmiotId);
    List<OcenaKoncowa> findByZaliczony(Boolean zaliczony);
    List<OcenaKoncowa> findByStudentAndPrzedmiot(Long studentId, Long przedmiotId);
    List<OcenaKoncowa> findByOcenaGreaterThan(Float minOcena);
    Float calculateAverageForStudent(Long studentId);
    List<OcenaKoncowa> findByProwadzacy(String prowadzacyWpisujacy);
}