package com.wsis.sos.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "faktura")
public class Faktura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "faktura_id")
    private Long fakturaId;

    @Column(name = "konto_id")
    private Long kontoId;

    @Column(name = "numer_faktury", length = 50)
    private String numerFaktury;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_wystawienia")
    private Date dataWystawienia;

    @Temporal(TemporalType.DATE)
    @Column(name = "termin_platnosci")
    private Date terminPlatnosci;

    @Column(name = "kwota")
    private Float kwota;

    @Column(name = "tytul")
    private String tytul;

    @Column(name = "status")
    private String status;

    // Konstruktory
    public Faktura() {
    }

    public Faktura(Long kontoId, String numerFaktury, Date dataWystawienia, 
                   Date terminPlatnosci, Float kwota, String tytul, String status) {
        this.kontoId = kontoId;
        this.numerFaktury = numerFaktury;
        this.dataWystawienia = dataWystawienia;
        this.terminPlatnosci = terminPlatnosci;
        this.kwota = kwota;
        this.tytul = tytul;
        this.status = status;
    }

    // Gettery i Settery
    public Long getFakturaId() {
        return fakturaId;
    }

    public void setFakturaId(Long fakturaId) {
        this.fakturaId = fakturaId;
    }

    public Long getKontoId() {
        return kontoId;
    }

    public void setKontoId(Long kontoId) {
        this.kontoId = kontoId;
    }

    public String getNumerFaktury() {
        return numerFaktury;
    }

    public void setNumerFaktury(String numerFaktury) {
        this.numerFaktury = numerFaktury;
    }

    public Date getDataWystawienia() {
        return dataWystawienia;
    }

    public void setDataWystawienia(Date dataWystawienia) {
        this.dataWystawienia = dataWystawienia;
    }

    public Date getTerminPlatnosci() {
        return terminPlatnosci;
    }

    public void setTerminPlatnosci(Date terminPlatnosci) {
        this.terminPlatnosci = terminPlatnosci;
    }

    public Float getKwota() {
        return kwota;
    }

    public void setKwota(Float kwota) {
        this.kwota = kwota;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}