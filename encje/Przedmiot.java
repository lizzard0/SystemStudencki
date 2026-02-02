package com.wsis.sos.entity;

import javax.persistence.*;

@Entity
@Table(name = "przedmiot")
public class Przedmiot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "przedmiot_id")
    private Long przedmiotId;

    @Column(name = "kod", unique = true)
    private String kod;

    @Column(name = "nazwa")
    private String nazwa;

    @Column(name = "ects")
    private Integer ects;

    @Column(name = "prowadzacy_id")
    private Long prowadzacyId;

    @Column(name = "kategoria_id")
    private Long kategoriaId;

    @Column(name = "opis", columnDefinition = "TEXT")
    private String opis;

    @Column(name = "aktywny")
    private Boolean aktywny = true;

    public Przedmiot() {
    }

    public Przedmiot(String kod, String nazwa, Integer ects, Long prowadzacyId, 
                     Long kategoriaId, String opis) {
        this.kod = kod;
        this.nazwa = nazwa;
        this.ects = ects;
        this.prowadzacyId = prowadzacyId;
        this.kategoriaId = kategoriaId;
        this.opis = opis;
        this.aktywny = true;
    }

    // Gettery i Settery
    public Long getPrzedmiotId() {
        return przedmiotId;
    }

    public void setPrzedmiotId(Long przedmiotId) {
        this.przedmiotId = przedmiotId;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Integer getEcts() {
        return ects;
    }

    public void setEcts(Integer ects) {
        this.ects = ects;
    }

    public Long getProwadzacyId() {
        return prowadzacyId;
    }

    public void setProwadzacyId(Long prowadzacyId) {
        this.prowadzacyId = prowadzacyId;
    }

    public Long getKategoriaId() {
        return kategoriaId;
    }

    public void setKategoriaId(Long kategoriaId) {
        this.kategoriaId = kategoriaId;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Boolean getAktywny() {
        return aktywny;
    }

    public void setAktywny(Boolean aktywny) {
        this.aktywny = aktywny;
    }
}