package com.wsis.sos.dao;

import com.wsis.sos.entity.Wypozyczenie;
import java.util.Date;
import java.util.List;

public interface WypozyczenieDao {
    Wypozyczenie findById(Long id);
    List<Wypozyczenie> findAll();
    void save(Wypozyczenie wypozyczenie);
    void update(Wypozyczenie wypozyczenie);
    void delete(Long id);
    
    List<Wypozyczenie> findByStudent(Long studentId);
    List<Wypozyczenie> findByKsiazka(Long ksiazkaId);
    List<Wypozyczenie> findByStatus(String status);
    List<Wypozyczenie> findActive();
    List<Wypozyczenie> findOverdue();
    List<Wypozyczenie> findByTerminZwrotuBefore(Date date);
    List<Wypozyczenie> findByStudentAndKsiazka(Long studentId, Long ksiazkaId);
    Float sumaKarByStudent(Long studentId);
}