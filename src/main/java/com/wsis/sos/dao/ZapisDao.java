package com.wsis.sos.dao;

import com.wsis.sos.entity.Zapis;
import java.util.List;

public interface ZapisDao {
    Zapis findById(Long id);
    List<Zapis> findAll();
    void save(Zapis zapis);
    void update(Zapis zapis);
    void delete(Long id);
    
    List<Zapis> findByStudent(Long studentId);
    List<Zapis> findByPrzedmiot(Long przedmiotId);
    List<Zapis> findByStudentAndSemestr(Long studentId, Integer semestr);
    List<Zapis> findByRokAkademicki(String rokAkademicki);
    List<Zapis> findByStatus(String status);
    List<Zapis> findByStudentAndPrzedmiot(Long studentId, Long przedmiotId);
    Integer countZapisyByPrzedmiot(Long przedmiotId);
}