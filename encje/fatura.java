@Entity
@Table(name = "zapis_na_przedmiot")
import java.util.*;
public class ZapisNaPrzedmiot {

    public ZapisNaPrzedmiot() {
        }

    @Faktura_id
    @GeneratedValue
    @Column(name = "faktura_id")
    private Long faktura_id;

    public Long getFaktura_id() {
        return faktura_id;
    }

    public void setFaktura_id(Long faktura_id) {
        this.faktura_id = faktura_id;
    }


    @Konto_id
    @Column(name = "konto_id")
    private Long konto_id;

    public Long getKonto_id() {
        return konto_id;
    }

    public void setKonto_id(Long konto_id) {
        this.konto_id = konto_id;
    }

    @Numer_faktury
    @Column(name = "numer_faktury")
    private Long numer_faktury; // max 50

    public Long getNumer_faktury() {
        return numer_faktury;
    }

    public void setNumer_faktury(Long numer_faktury) {
        this.numer_faktury = numer_faktury;
    }

    
    @Data_wystawienia
    @Column(name = "data_wystawienia")
    Date data_wystawienia = new Date();

    public Date getData_wystawienia() {
        return data_wystawienia;
    }

    public void setData_wystawienia(Date data_wystawienia) {
        this.data_wystawienia = data_wystawieniad;
    }


    @Termin_platnosci
    @Column(name = "termin_platnosci")
    Date termin_platnosci = new Date();

    public Date getData_wystawienia() {
        return termin_platnosci;
    }

    public void setTermin_platnoscia(Date termin_platnosci) {
        this.termin_platnosci = termin_platnosci;
    }


    @Kwota
    @Column(name = "kwota")
    private float kwota;

    public Date getKwota() {
        return kwota;
    }

    public void setKwota(float kwota) {
        this.kwota = kwota;
    }


    @Tytul
    @Column(name = "tytul")
    private Long tytul;

    public Long getTytul() {
        return tytul;
    }

    public void setTytul(Long tytul) {
        this.tytul = tytul;
    }

    @Status
    @Column(name = "status")
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String ststus) {
        this.status = status;
    }
}
