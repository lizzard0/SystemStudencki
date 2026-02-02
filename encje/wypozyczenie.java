@Entity
@Table(name = "wypozyczenie")
public class Wypozyczenie {

    public Wypozyczenie() {
    }

    @Wypozyczenie_id
    @GeneratedValue
    @Column(name = "wypozyczenie_id")
    private Long wypozyczenieid;

    public Long getWypozyczenie_id() {
        return wypozyczenie_id;
    }

    public void setWypozyczenie_id(Long wypozyczenie_id) {
        this.wypozyczenie_id = wypozyczenie_id;
    }


    @Student_id
    @Column(name = "student_id")
    private Long student_id;


    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    @Ksiazka_id
    @GeneratedValue
    @Column(name = "ksiazka_id")
    private Long ksiazka_id;

    public Long getKsiazka_id() {
        return ksiazka_id;
    }

    public void setKsiazka_id(Long ksiazka_id) {
        this.ksiazka_id = ksiazka_id;
    }


    @Data_wypozyczenia
    @Column(name = "data_wypozyczenia")
    Date data_wypozyczenia = new Date();

    public Date getData_wystawienia() {
        return data_wypozyczenia;
    }

    public void setData_wypozyczenia(Date data_wypozyczenia) {
        this.data_wypozyczenia = data_wypozyczenia;
    }


    @Data_zwrotu
    @Column(name = "data_zwrotu")
    Date data_zwrotu = new Date();

    public Date getData_zwrotu() {
        return data_zwrotu;
    }

    public void setData_zwrotu(Date data_zwrotu) {
        this.data_zwrotu = data_zwrotu;
    }


    @Termin_zwrotu
    @Column(name = "termin_zwrotu")
    Date termin_zwrotu = new Date();

    public Date getTermin_zwrotu() {
        return termin_zwrotu;
    }

    public void setTermin_zwrotu(Date termin_zwrotu) {
        this.termin_zwrotu = termin_zwrotu;
    }


    @Status
    @Column(name = "status")
    private String ststus;

    public String getStatus() {
        return ststus;
    }

    public void setStstus(String status) {
        this.status = status;
    }


    @Kara
    @Column(name = "kara")
    private float kara;

    public Float getKara() {
        return kara;
    }

    public void setKara(float kara) {
        this.kara = kara;
    }


    //FOREIGN KEY (student_id) REFERENCES student(student_id) ON DELETE CASCADE,
    //FOREIGN KEY (ksiazka_id) REFERENCES ksiazka(ksiazka_id) ON DELETE CASCADE

}
