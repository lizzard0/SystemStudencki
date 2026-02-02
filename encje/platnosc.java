package com.wsis.sos.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "platnosc")
public class Platnosc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "platnosc_id")
    private Long platnoscId;

    @Column(name = "faktura_id")
    private Long fakturaId;

    @Column(name = "kwota")
    private Float kwota;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_platnosci")
    private Date dataPlatnosci;

    @Column(name = "identyfikator_transakcji", unique = true)
    private String identyfikatorTransakcji;

    public Platnosc() {
    }

    public Platnosc(Long fakturaId, Float kwota, String identyfikatorTransakcji) {
        this.fakturaId = fakturaId;
        this.kwota = kwota;
        this.identyfikatorTransakcji = identyfikatorTransakcji;
        this.dataPlatnosci = new Date();
    }

    // Gettery i Settery
    public Long getPlatnoscId() {
        return platnoscId;
    }

    public void setPlatnoscId(Long platnoscId) {
        this.platnoscId = platnoscId;
    }

    public Long getFakturaId() {
        return fakturaId;
    }

    public void setFakturaId(Long fakturaId) {
        this.fakturaId = fakturaId;
    }

    public Float getKwota() {
        return kwota;
    }

    public void setKwota(Float kwota) {
        this.kwota = kwota;
    }

    public Date getDataPlatnosci() {
        return dataPlatnosci;
    }

    public void setDataPlatnosci(Date dataPlatnosci) {
        this.dataPlatnosci = dataPlatnosci;
    }

    public String getIdentyfikatorTransakcji() {
        return identyfikatorTransakcji;
    }

    public void setIdentyfikatorTransakcji(String identyfikatorTransakcji) {
        this.identyfikatorTransakcji = identyfikatorTransakcji;
    }
}