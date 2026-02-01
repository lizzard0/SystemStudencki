@Entity
@Table(name = "student")
public class Student {

    public Student() {
    }

    @Student_id
    @GeneratedValue
    @Column(name = "student_id")
    private Long student_id;


    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    
    @Urzytkownik_id
    @Column(name = "urzytkownik_id")
    private Long urzytkownik_id;


    public Long getUrzytkownik_id() {
        return urzytkownik_id;
    }

    public void setUrzytkownik_id(Long urzytkownik_id) {
        this.urzytkownik_id = urzytkownik_id;
    }


    @Numer_albumu
    @Column(name = "numer_albumu")
    private Long numer_albumu;


    public Long getNumer_albumu() {
        return numer_albumu;
    }

    public void setNumer_albumu(Long numer_albumu) {
        this.numer_albumu = numer_albumu;
    }


    @Imie
    @Column(name = "imie")
    private String imie;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }


    @Nazwisko
    @Column(name = "nazwisko")
    private String nazwisko;

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }


    @Pesel
    @Column(name = "pesel")
    private Long pesel;


    public Long getPesel() {
        return pesel;
    }

    public void setPesel(Long pesel) {
        this.pesel = pesel;
    }


    @Data_urodzenia
    @Column(name = "data_urodzenia")
    Date data_urodzenia = new Date();

    public Date getData_urodzenia() {
        return data_urodzenia;
    }

    public void setData_urodzenia(Date data_urodzenia) {
        this.data_urodzenia = data_urodzenia;
    }

    //plec CHAR(1) CHECK (plec IN ('M', 'K')),

    @Adres
    @Column(name = "adres")
    private String adres;

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }


    @Telefon
    @Column(name = "telefon")
    private Long telefon;


    public Long getTelefon() {
        return telefon;
    }

    public void setTelefon(Long telefon) {
        this.telefon = telefon;
    }


    @Email_uczelniany
    @Column(name = "email_uczelniany")
    private String email_uczelniany;

    public String getEmail_uczelniany() {
        return email_uczelniany;
    }

    public void setEmail_uczelniany(String email_uczelniany) {
        this.email_uczelniany = email_uczelniany;
    }


    @Kierunek_id
    @Column(name = "kierunek_id")
    private Long kierunek_id;


    public Long getKierunek_id() {
        return kierunek_id;
    }

    public void setKierunek_id(Long kierunek_id) {
        this.kierunek_id = kierunek_id;
    }


    @Rok_rozpoczecia
    @Column(name = "rok_rozpoczecia")
    Date rok_rozpoczecia = new Date();

    public Date getRok_rozpoczecia() {
        return rok_rozpoczecia;
    }

    public void setRok_rozpoczecia(Date rok_rozpoczecia) {
        this.rok_rozpoczecia = rok_rozpoczecia;
    }
    
    //FOREIGN KEY (uzytkownik_id) REFERENCES uzytkownik(uzytkownik_id) ON DELETE CASCADE
}
