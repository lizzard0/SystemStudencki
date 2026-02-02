package com.wsis.sos.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "uzytkownik_id")
    private Long uzytkownikId;

    @Column(name = "numer_albumu", unique = true)
    private String numerAlbumu;

    @Column(name = "imie")
    private String imie;

    @Column(name = "nazwisko")
    private String nazwisko;

    @Column(name = "pesel", unique = true, length = 11)
    private String pesel;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_urodzenia")
    private Date dataUrodzenia;

    @Column(name = "plec", length = 1)
    private Character plec; // 'M' lub 'K'

    @Column(name = "adres")
    private String adres;

    @Column(name = "telefon")
    private String telefon;

    @Column(name = "email_uczelniany", unique = true)
    private String emailUczelniany;

    @Column(name = "kierunek_id")
    private Long kierunekId;

    @Temporal(TemporalType.DATE)
    @Column(name = "rok_rozpoczecia")
    private Date rokRozpoczecia;

    @Column(name = "aktywny")
    private Boolean aktywny = true;

    public Student() {
    }

    public Student(String numerAlbumu, String imie, String nazwisko, String pesel, 
                   Date dataUrodzenia, Character plec, String emailUczelniany) {
        this.numerAlbumu = numerAlbumu;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
        this.emailUczelniany = emailUczelniany;
        this.aktywny = true;
    }

    // Gettery i Settery
    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getUzytkownikId() {
        return uzytkownikId;
    }

    public void setUzytkownikId(Long uzytkownikId) {
        this.uzytkownikId = uzytkownikId;
    }

    public String getNumerAlbumu() {
        return numerAlbumu;
    }

    public void setNumerAlbumu(String numerAlbumu) {
        this.numerAlbumu = numerAlbumu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public Character getPlec() {
        return plec;
    }

    public void setPlec(Character plec) {
        this.plec = plec;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmailUczelniany() {
        return emailUczelniany;
    }

    public void setEmailUczelniany(String emailUczelniany) {
        this.emailUczelniany = emailUczelniany;
    }

    public Long getKierunekId() {
        return kierunekId;
    }

    public void setKierunekId(Long kierunekId) {
        this.kierunekId = kierunekId;
    }

    public Date getRokRozpoczecia() {
        return rokRozpoczecia;
    }

    public void setRokRozpoczecia(Date rokRozpoczecia) {
        this.rokRozpoczecia = rokRozpoczecia;
    }

    public Boolean getAktywny() {
        return aktywny;
    }

    public void setAktywny(Boolean aktywny) {
        this.aktywny = aktywny;
    }
}