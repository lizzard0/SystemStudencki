package com.wsis.sos.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ocena_koncowa")
public class OcenaKoncowa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ocena_id")
    private Long ocenaId;

    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "przedmiot_id")
    private Long przedmiotId;

    @Column(name = "ocena")
    private Float ocena;

    @Column(name = "ocena_slownie")
    private String ocenaSlownie;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_wpisu")
    private Date dataWpisu;

    @Column(name = "prowadzacy_wpisujacy")
    private String prowadzacyWpisujacy;

    @Column(name = "zaliczony")
    private Boolean zaliczony = false;

    public OcenaKoncowa() {
    }

    public OcenaKoncowa(Long studentId, Long przedmiotId, Float ocena, 
                        String ocenaSlownie, String prowadzacyWpisujacy) {
        this.studentId = studentId;
        this.przedmiotId = przedmiotId;
        this.ocena = ocena;
        this.ocenaSlownie = ocenaSlownie;
        this.prowadzacyWpisujacy = prowadzacyWpisujacy;
        this.dataWpisu = new Date();
        this.zaliczony = (ocena != null && ocena >= 3.0);
    }

    // Gettery i Settery
    public Long getOcenaId() {
        return ocenaId;
    }

    public void setOcenaId(Long ocenaId) {
        this.ocenaId = ocenaId;
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

    public Float getOcena() {
        return ocena;
    }

    public void setOcena(Float ocena) {
        this.ocena = ocena;
        this.zaliczony = (ocena != null && ocena >= 3.0);
    }

    public String getOcenaSlownie() {
        return ocenaSlownie;
    }

    public void setOcenaSlownie(String ocenaSlownie) {
        this.ocenaSlownie = ocenaSlownie;
    }

    public Date getDataWpisu() {
        return dataWpisu;
    }

    public void setDataWpisu(Date dataWpisu) {
        this.dataWpisu = dataWpisu;
    }

    public String getProwadzacyWpisujacy() {
        return prowadzacyWpisujacy;
    }

    public void setProwadzacyWpisujacy(String prowadzacyWpisujacy) {
        this.prowadzacyWpisujacy = prowadzacyWpisujacy;
    }

    public Boolean getZaliczony() {
        return zaliczony;
    }

    public void setZaliczony(Boolean zaliczony) {
        this.zaliczony = zaliczony;
    }
}