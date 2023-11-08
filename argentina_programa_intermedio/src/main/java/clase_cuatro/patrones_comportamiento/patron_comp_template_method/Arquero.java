package clase_cuatro.patrones_comportamiento.patron_comp_template_method;

public class Arquero extends Personaje {

    @Override
    protected void prepararArma() {
        System.out.println("El arquero prepara su arco y flechas.");
    }

    @Override
    protected void apuntarObjetivo() {
        System.out.println("El arquero apunta al enemigo a la distancia.");
    }

    @Override
    protected void disparar() {
        System.out.println("El arquero dispara una flecha al enemigo.");
    }

}
