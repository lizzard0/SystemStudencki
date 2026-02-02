package com.wsis.sos.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "konto_studenta")
public class KontoStudenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "konto_id")
    private Long kontoId;

    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "saldo")
    private Float saldo = 0.0f;

    @Column(name = "zadluzenie")
    private Float zadluzenie = 0.0f;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_ostatniej_aktualizacji")
    private Date dataOstatniejAktualizacji;

    public KontoStudenta() {
    }

    public KontoStudenta(Long studentId, Float saldo, Float zadluzenie) {
        this.studentId = studentId;
        this.saldo = saldo;
        this.zadluzenie = zadluzenie;
        this.dataOstatniejAktualizacji = new Date();
    }

    // Gettery i Settery
    public Long getKontoId() {
        return kontoId;
    }

    public void setKontoId(Long kontoId) {
        this.kontoId = kontoId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Float getZadluzenie() {
        return zadluzenie;
    }

    public void setZadluzenie(Float zadluzenie) {
        this.zadluzenie = zadluzenie;
    }

    public Date getDataOstatniejAktualizacji() {
        return dataOstatniejAktualizacji;
    }

    public void setDataOstatniejAktualizacji(Date dataOstatniejAktualizacji) {
        this.dataOstatniejAktualizacji = dataOstatniejAktualizacji;
    }
}