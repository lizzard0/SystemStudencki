@Entity
@Table(name = "wypozyczenie")
public class Wypozyczenie {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    public Wypozyczenie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
