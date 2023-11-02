package clase_dos.Lambda;

public class Calculadora {

    public int calcular(int numeroUno, int numeroDos, Operacion operacion) {
        return operacion.aplicar(numeroUno, numeroDos);
    }

}
