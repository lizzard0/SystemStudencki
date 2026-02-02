package com.wsis.sos.dao;

import com.wsis.sos.entity.Student;
import java.util.List;

public interface StudentDao {
    // Podstawowe operacje CRUD
    Student findById(Long id);
    List<Student> findAll();
    void save(Student student);
    void update(Student student);
    void delete(Long id);
    
    // Metody specyficzne dla Student
    Student findByAlbumNumber(String numerAlbumu);
    Student findByPesel(String pesel);
    Student findByEmail(String emailUczelniany);
    List<Student> findByKierunek(Long kierunekId);
    List<Student> findByActive(Boolean aktywny);
    List<Student> findByName(String imie, String nazwisko);
}