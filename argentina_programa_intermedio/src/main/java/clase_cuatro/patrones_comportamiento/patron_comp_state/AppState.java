package clase_cuatro.patrones_comportamiento.patron_comp_state;

public class AppState {
    public static void main(String[] args) {
        MaquinaExpendedora maquinaExpendedora = new MaquinaExpendedora();

        maquinaExpendedora.insertarDinero();
        maquinaExpendedora.expulsarDinero();
        maquinaExpendedora.dispensar();

        maquinaExpendedora.insertarDinero();
        maquinaExpendedora.dispensar();
        maquinaExpendedora.expulsarDinero();

        maquinaExpendedora.insertarDinero();
        maquinaExpendedora.dispensar();
    }
}
