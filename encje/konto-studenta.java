@Entity
@Table(name = "konto_studenta")
import java.util.*;
public class KontoStudenta {

    public KontoStudenta() {
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

    @Student_id
    @Column(name = "student_id")
    private Long student_id;

    public Long getStudento_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    @Saldo
    @Column(name = "saldo")
    private float saldo = 0.00;

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Zadluzenie
    @Column(name = "zadluzenie")
    private float zadluzenie = 0.00;

    public Float getZadluzenie() {
        return zadluzenie;
    }

    public void setZadluzenie(float zadluzenie) {
        this.zadluzenie = zadluzenie;
    }

    @Data_ostatniej_aktualizacji
    @Column(name = "data_ostatniej_aktualizacji")
    Date data_ostatniej_aktualizacji = new Date();

    public Date getData_ostatniej_aktualizacji() {
        return data_ostatniej_aktualizacji;
    }

    public void setData_ostatniej_aktualizacji(Date data_ostatniej_aktualizacji) {
        this.data_ostatniej_aktualizacji = data_ostatniej_aktualizacji;
    }
}
