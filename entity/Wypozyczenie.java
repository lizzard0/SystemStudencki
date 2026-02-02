package com.wsis.sos.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "wypozyczenie")
public class Wypozyczenie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wypozyczenie_id")
    private Long wypozyczenieId;

    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "ksiazka_id")
    private Long ksiazkaId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_wypozyczenia")
    private Date dataWypozyczenia;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_zwrotu")
    private Date dataZwrotu;

    @Temporal(TemporalType.DATE)
    @Column(name = "termin_zwrotu")
    private Date terminZwrotu;

    @Column(name = "status")
    private String status; // "AKTYWNE", "ZWROCONE", "PRZETERMINOWANE"

    @Column(name = "kara")
    private Float kara = 0.0f;

    public Wypozyczenie() {
    }

    public Wypozyczenie(Long studentId, Long ksiazkaId, Date terminZwrotu) {
        this.studentId = studentId;
        this.ksiazkaId = ksiazkaId;
        this.dataWypozyczenia = new Date();
        this.terminZwrotu = terminZwrotu;
        this.status = "AKTYWNE";
        this.kara = 0.0f;
    }

    // Gettery i Settery
    public Long getWypozyczenieId() {
        return wypozyczenieId;
    }

    public void setWypozyczenieId(Long wypozyczenieId) {
        this.wypozyczenieId = wypozyczenieId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getKsiazkaId() {
        return ksiazkaId;
    }

    public void setKsiazkaId(Long ksiazkaId) {
        this.ksiazkaId = ksiazkaId;
    }

    public Date getDataWypozyczenia() {
        return dataWypozyczenia;
    }

    public void setDataWypozyczenia(Date dataWypozyczenia) {
        this.dataWypozyczenia = dataWypozyczenia;
    }

    public Date getDataZwrotu() {
        return dataZwrotu;
    }

    public void setDataZwrotu(Date dataZwrotu) {
        this.dataZwrotu = dataZwrotu;
    }

    public Date getTerminZwrotu() {
        return terminZwrotu;
    }

    public void setTerminZwrotu(Date terminZwrotu) {
        this.terminZwrotu = terminZwrotu;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Float getKara() {
        return kara;
    }

    public void setKara(Float kara) {
        this.kara = kara;
    }
}