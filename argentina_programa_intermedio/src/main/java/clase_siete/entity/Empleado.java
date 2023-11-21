package clase_siete.entity;

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

    private String nombre;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public List<Fichaje> getFichajes() {
        return fichajes;
    }

    public void setFichajes(List<Fichaje> fichajes) {
        this.fichajes = fichajes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}