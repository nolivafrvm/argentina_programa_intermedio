package clase_cinco;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="empleado")
public class Empleado {
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="empleado_id", referencedColumnName="id")
    private List<Fichaje> fichajes;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}