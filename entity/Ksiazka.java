package com.wsis.sos.entity;

import javax.persistence.*;

@Entity
@Table(name = "ksiazka")
public class Ksiazka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ksiazka_id")
    private Long ksiazkaId;

    @Column(name = "isbn", unique = true)
    private String isbn;

    @Column(name = "tytul")
    private String tytul;

    @Column(name = "autor")
    private String autor;

    @Column(name = "wydawnictwo")
    private String wydawnictwo;

    @Column(name = "rok_wydania")
    private Integer rokWydania;

    @Column(name = "kategoria")
    private String kategoria;

    @Column(name = "sygnatura")
    private String sygnatura;

    @Column(name = "dostepna")
    private Boolean dostepna = true;

    public Ksiazka() {
    }

    public Ksiazka(String isbn, String tytul, String autor, String wydawnictwo, 
                   Integer rokWydania, String kategoria, String sygnatura) {
        this.isbn = isbn;
        this.tytul = tytul;
        this.autor = autor;
        this.wydawnictwo = wydawnictwo;
        this.rokWydania = rokWydania;
        this.kategoria = kategoria;
        this.sygnatura = sygnatura;
        this.dostepna = true;
    }

    // Gettery i Settery
    public Long getKsiazkaId() {
        return ksiazkaId;
    }

    public void setKsiazkaId(Long ksiazkaId) {
        this.ksiazkaId = ksiazkaId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getWydawnictwo() {
        return wydawnictwo;
    }

    public void setWydawnictwo(String wydawnictwo) {
        this.wydawnictwo = wydawnictwo;
    }

    public Integer getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(Integer rokWydania) {
        this.rokWydania = rokWydania;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public String getSygnatura() {
        return sygnatura;
    }

    public void setSygnatura(String sygnatura) {
        this.sygnatura = sygnatura;
    }

    public Boolean getDostepna() {
        return dostepna;
    }

    public void setDostepna(Boolean dostepna) {
        this.dostepna = dostepna;
    }
}