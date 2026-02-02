package com.wsis.sos.dao;

import com.wsis.sos.entity.KontoStudenta;
import java.util.List;

public interface KontoStudentaDao {
    KontoStudenta findById(Long id);
    List<KontoStudenta> findAll();
    void save(KontoStudenta konto);
    void update(KontoStudenta konto);
    void delete(Long id);
    
    KontoStudenta findByStudentId(Long studentId);
    List<KontoStudenta> findBySaldoLessThan(Float maxSaldo);
    List<KontoStudenta> findByZadluzenieGreaterThan(Float minZadluzenie);
    List<KontoStudenta> findByZadluzenieBetween(Float min, Float max);
    void updateSaldo(Long kontoId, Float zmiana);
    void updateZadluzenie(Long kontoId, Float zmiana);
    Float getTotalZadluzenie();
}