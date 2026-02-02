package com.wsis.sos.dao;

import com.wsis.sos.entity.Ksiazka;
import java.util.List;

public interface KsiazkaDao {
    Ksiazka findById(Long id);
    List<Ksiazka> findAll();
    void save(Ksiazka ksiazka);
    void update(Ksiazka ksiazka);
    void delete(Long id);
    
    Ksiazka findByIsbn(String isbn);
    List<Ksiazka> findByTytul(String tytul);
    List<Ksiazka> findByAutor(String autor);
    List<Ksiazka> findByWydawnictwo(String wydawnictwo);
    List<Ksiazka> findByKategoria(String kategoria);
    List<Ksiazka> findAvailable();
    List<Ksiazka> findByRokWydania(Integer rokWydania);
    List<Ksiazka> searchByKeyword(String keyword);
}