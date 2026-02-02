package com.wsis.sos.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "zapis")
public class Zapis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "zapis_id")
    private Long zapisId;

    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "przedmiot_id")
    private Long przedmiotId;

    @Column(name = "grupa_id")
    private Long grupaId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_zapisu")
    private Date dataZapisu;

    @Column(name = "status")
    private String status; // "ZAPISANY", "WYPISANY", "ZALICZONY", "NIEZALICZONY"

    @Column(name = "rok_akademicki")
    private String rokAkademicki;

    @Column(name = "semestr")
    private Integer semestr;

    public Zapis() {
    }

    public Zapis(Long studentId, Long przedmiotId, Long grupaId, 
                 String rokAkademicki, Integer semestr) {
        this.studentId = studentId;
        this.przedmiotId = przedmiotId;
        this.grupaId = grupaId;
        this.rokAkademicki = rokAkademicki;
        this.semestr = semestr;
        this.dataZapisu = new Date();
        this.status = "ZAPISANY";
    }

    // Gettery i Settery
    public Long getZapisId() {
        return zapisId;
    }

    public void setZapisId(Long zapisId) {
        this.zapisId = zapisId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getPrzedmiotId() {
        return przedmiotId;
    }

    public void setPrzedmiotId(Long przedmiotId) {
        this.przedmiotId = przedmiotId;
    }

    public Long getGrupaId() {
        return grupaId;
    }

    public void setGrupaId(Long grupaId) {
        this.grupaId = grupaId;
    }

    public Date getDataZapisu() {
        return dataZapisu;
    }

    public void setDataZapisu(Date dataZapisu) {
        this.dataZapisu = dataZapisu;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRokAkademicki() {
        return rokAkademicki;
    }

    public void setRokAkademicki(String rokAkademicki) {
        this.rokAkademicki = rokAkademicki;
    }

    public Integer getSemestr() {
        return semestr;
    }

    public void setSemestr(Integer semestr) {
        this.semestr = semestr;
    }
}