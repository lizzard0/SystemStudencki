package com.wsis.sos.dao;

import com.wsis.sos.entity.Platnosc;
import java.util.Date;
import java.util.List;

public interface PlatnoscDao {
    Platnosc findById(Long id);
    List<Platnosc> findAll();
    void save(Platnosc platnosc);
    void update(Platnosc platnosc);
    void delete(Long id);
    
    List<Platnosc> findByFaktura(Long fakturaId);
    List<Platnosc> findByIdentyfikatorTransakcji(String identyfikatorTransakcji);
    List<Platnosc> findByDataPlatnosciBetween(Date start, Date end);
    List<Platnosc> findByKwotaGreaterThan(Float minKwota);
    Float sumaPlatnosciByFaktura(Long fakturaId);
    List<Platnosc> findLatestByFaktura(Long fakturaId, int limit);
}