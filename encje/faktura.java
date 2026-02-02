@Entity
@Table(name = "zapis")
public class Zapis {

    public Zapis() {
    }

    @Zapis_id
    @GeneratedValue
    @Column(name = "zapis_id")
    private Long zapis_id;


    public Long getId() {
        return zapis_id;
    }

    public void setZapis_id(Long zapis_id) {
        this.zapis_id = zapis_id;
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


    @Przedmiot_id
    @Column(name = "przedmiot_id")
    private Long przedmiot_id;

    public Long getPrzedmiot_id() {
        return przedmiot_id;
    }

    public void setPrzedmiot_id(Long przedmiot_id) {
        this.przedmiot_id = przedmiot_id;
    }


    @Grupa_id
    @Column(name = "grupa_id")
    private Long grupa_id;

    public Long getGrupa_id() {
        return grupa_id;
    }

    public void setGrupa_id(Long grupa_id) {
        this.grupa_id = grupa_id;
    }


    @Data_zapisu
    @Column(name = "data_zapisu")
    Date data_zapisu = new Date();

    public Date getData_zapisu() {
        return data_wzapisu;
    }

    public void setData_zapisu(Date data_zapisu) {
        this.data_zapisu = data_zapisu;
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


    @Rok_akademicki
    @Column(name = "rok_akademicki")
    private Long rok_akademicki;

    public Long getRok_akademicki() {
        return rok_akademicki;
    }

    public void setRok_akademicki(Long rok_akademicki) {
        this.rok_akademicki = rok_akademicki;
    }


    @Semestr
    @Column(name = "semestr")
    private Long semestr;

    public Long getSemestr() {
        return semestr;
    }

    public void setSemestr(Long semestr) {
        this.semestr = semestr;
    }

    //UNIQUE (student_id, przedmiot_id, rok_akademicki, semestr),
    //FOREIGN KEY (student_id) REFERENCES student(student_id) ON DELETE CASCADE,
    //FOREIGN KEY (przedmiot_id) REFERENCES przedmiot(przedmiot_id) ON DELETE CASCADE,
    //FOREIGN KEY (grupa_id) REFERENCES grupa_zajeciowa(grupa_id) ON DELETE CASCADE
}
