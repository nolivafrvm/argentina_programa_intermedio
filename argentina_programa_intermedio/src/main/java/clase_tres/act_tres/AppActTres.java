package clase_tres.act_tres;

import java.util.List;

public class AppActTres {

    public static void main(String[] args) {
        Ejercicio_uno ejercicio_uno = new Ejercicio_uno();
        List<String> palabras = List.of("CuRso" , "JavA", "Intermedio", "Ejercicio", "Act 3");

        List<String> mayusculas = ejercicio_uno.convertir(palabras);
        mayusculas.forEach(cad -> System.out.println(cad));

        System.out.println("---------------------------------------------------");

        Ejercicio_dos ejercicio_dos = new Ejercicio_dos();
        String concatenacion = ejercicio_dos.separarComas(palabras, 4);
        System.out.println(concatenacion);


    }

}
