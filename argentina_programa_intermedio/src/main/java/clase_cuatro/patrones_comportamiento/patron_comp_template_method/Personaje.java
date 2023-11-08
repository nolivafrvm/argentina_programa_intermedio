package clase_cuatro.patrones_comportamiento.patron_comp_template_method;

public abstract class Personaje {

    public void atacar() {
        prepararArma();
        apuntarObjetivo();
        disparar();
        recogerRecompensas();
    }

    protected abstract void prepararArma();
    protected abstract void apuntarObjetivo();
    protected abstract void disparar();

    // Método con implementación por defecto
    protected void recogerRecompensas() {
        System.out.println("El personaje recoge recompensas después del ataque.");
    }

}
