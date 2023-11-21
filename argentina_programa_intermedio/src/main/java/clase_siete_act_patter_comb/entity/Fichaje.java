package clase_siete_act_patter_comb.entity;

import javax.persistence.*;

@Entity
@Table(name="fichaje")
public class Fichaje {
    @ManyToOne
    @JoinColumn(name="empleado_id", referencedColumnName="id")
    private Empleado empleado;
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
