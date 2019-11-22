import javax.persistence.*;

@Entity
@Table(name = "clients_table")
public class Client {
    @Id
    @Column(name = "id")
    private Integer id;

    // Getter - ID
    public Integer getId() {
        return id;
    }

    // Setter - ID
    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "clientName")
    private String clientName;

    // Getter - Client Name
    public String getName() {
        return clientName;
    }

    // Setter - Client Name
    public void setName(String recipeName) {
        this.clientName = recipeName;
    }

}
