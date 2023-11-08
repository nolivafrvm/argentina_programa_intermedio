package clase_cuatro.patrones_comportamiento.patron_comp_template_method;

public class Guerrero extends Personaje{
    @Override
    protected void prepararArma() {
        System.out.println("El guerrero prepara su espada.");
    }

    @Override
    protected void apuntarObjetivo() {
        System.out.println("El guerrero apunta al enemigo.");
    }

    @Override
    protected void disparar() {
        System.out.println("El guerrero realiza un corte con su espada.");
    }
}
