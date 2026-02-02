package com.wsis.sos.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ocena_czastkowa")
public class OcenaCzastkowa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "czastkowa_id")
    private Long czastkowaId;

    @Column(name = "ocena_id")
    private Long ocenaId;

    @Column(name = "nazwa")
    private String nazwa;

    @Column(name = "wartosc")
    private Float wartosc;

    @Column(name = "waga")
    private Float waga;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_wpisu")
    private Date dataWpisu;

    @Column(name = "prowadzacy_id")
    private Long prowadzacyId;

    public OcenaCzastkowa() {
    }

    public OcenaCzastkowa(Long ocenaId, String nazwa, Float wartosc, 
                          Float waga, Long prowadzacyId) {
        this.ocenaId = ocenaId;
        this.nazwa = nazwa;
        this.wartosc = wartosc;
        this.waga = waga;
        this.prowadzacyId = prowadzacyId;
        this.dataWpisu = new Date();
    }

    // Gettery i Settery
    public Long getCzastkowaId() {
        return czastkowaId;
    }

    public void setCzastkowaId(Long czastkowaId) {
        this.czastkowaId = czastkowaId;
    }

    public Long getOcenaId() {
        return ocenaId;
    }

    public void setOcenaId(Long ocenaId) {
        this.ocenaId = ocenaId;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Float getWartosc() {
        return wartosc;
    }

    public void setWartosc(Float wartosc) {
        this.wartosc = wartosc;
    }

    public Float getWaga() {
        return waga;
    }

    public void setWaga(Float waga) {
        this.waga = waga;
    }

    public Date getDataWpisu() {
        return dataWpisu;
    }

    public void setDataWpisu(Date dataWpisu) {
        this.dataWpisu = dataWpisu;
    }

    public Long getProwadzacyId() {
        return prowadzacyId;
    }

    public void setProwadzacyId(Long prowadzacyId) {
        this.prowadzacyId = prowadzacyId;
    }
}