package clase_dos.Lambda;

public class Test {

    public static void main(String[] args) {

        int unNumero = 10;
        int otroNumero = 5;

        Calculadora calc = new Calculadora();

        Operacion opera = (a, b) -> {
            a = a + 15;
            b = a + 20;
            return a + b + a;
        };
        int suma = calc.calcular(unNumero, otroNumero, (a, b) -> {
            a = a + 15;
            b = a + 20;
            return a + b + a;
        });
        System.out.println( "La suma de " + unNumero + " y " + otroNumero + " es: " + suma);

        int resta = calc.calcular(unNumero, otroNumero, (a, b) -> a - b);
        System.out.println( "La resta de " + unNumero + " y " + otroNumero + " es: " + resta);

        int producto = calc.calcular(unNumero, otroNumero, (a, b) -> a * b);
        System.out.println( "El producto de " + unNumero + " y " + otroNumero + " es: " + producto);

        int cociente = calc.calcular(unNumero, otroNumero, (a, b) -> a / b);
        System.out.println( "El cociente de " + unNumero + " y " + otroNumero + " es: " + cociente);
    }

}
