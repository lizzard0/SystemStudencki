package com.wsis.sos.dao;

import com.wsis.sos.entity.OcenaCzastkowa;
import java.util.Date;
import java.util.List;

public interface OcenaCzastkowaDao {
    OcenaCzastkowa findById(Long id);
    List<OcenaCzastkowa> findAll();
    void save(OcenaCzastkowa ocena);
    void update(OcenaCzastkowa ocena);
    void delete(Long id);
    
    List<OcenaCzastkowa> findByOcenaId(Long ocenaId);
    List<OcenaCzastkowa> findByNazwa(String nazwa);
    List<OcenaCzastkowa> findByProwadzacy(Long prowadzacyId);
    List<OcenaCzastkowa> findByWartoscGreaterThan(Float minWartosc);
    Float calculateWeightedAverageForOcena(Long ocenaId);
    List<OcenaCzastkowa> findByDataWpisuBetween(Date start, Date end);
}