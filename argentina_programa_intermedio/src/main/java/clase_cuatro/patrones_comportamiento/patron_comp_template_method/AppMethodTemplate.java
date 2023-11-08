package clase_cuatro.patrones_comportamiento.patron_comp_template_method;

public class AppMethodTemplate {

    public static void main(String[] args) {

        Personaje guerrero = new Guerrero();
        Personaje arquero = new Arquero();

        guerrero.atacar();
        arquero.atacar();
    }

}
