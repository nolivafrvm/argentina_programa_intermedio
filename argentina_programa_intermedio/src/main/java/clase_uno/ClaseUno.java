package clase_uno;

public class ClaseUno {

    public static void main(String[] args) {

        // Ejercicio 1. a // Ejercicio basico while
        System.out.println("Ejercicio 1.a");
        int a = 5; // entero 2 a la 32
        int b = 15;
        while (a<b) {
            System.out.println(a);
            a = a + 1 ;
        }


        // Ejercicio 1. b // Ejercicio basico while solo pares
        System.out.println("Ejercicio 1.b");
        a = 5;
        b = 15;
        while (a<b) {
            if (a % 2 == 0) { // MOD en Java es %
                System.out.println("Pares");
                System.out.println(a);
            }
            a = a + 1 ;
        }

        // Ejercicio 1. c // // Ejercicio basico while, opcion par o impar
        System.out.println("Ejercicio 1.c");
        char mostrarParOImpar = 'p';
        a = 5;
        b = 15;
        while (a<b) {
            char resultado = 'p';
            if (a % 2 == 0) {
                resultado = 'p';
            } else {
                resultado = 'i';
            }
            if (mostrarParOImpar==resultado) {
                System.out.println(mostrarParOImpar);
                System.out.println(a);
            }
            a = a + 1 ;
        }


        //Ejercicio 1.4
        System.out.println("Ejercicio 1.4_impares");
        a = 5;
        for(b=15; b > a; b-=2) // b decrementa en 2 (STEP -2)
        {
            System.out.println(b);
        }

        //Ejercicio 1.4
        System.out.println("Ejercicio 1.4_pares");
        a = 5;
        for(b=15; b > a; b--) // b decrementa en 1 (STEP -1)
        {
            if (b % 2 ==0) {
                System.out.println(b);
            }
        }

        System.out.println("Ejercicio for incrementa");
        b = 14;
        for(a=5; a < b; a++) // b incrementa en 1 (STEP 1)
        {
            System.out.println(a);
        }
    }
}
