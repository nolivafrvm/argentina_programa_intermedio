package clase_dos.act_clase_dos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class TestApp {

    public static void main(String[] args) {
        Cadena cadena = new Cadena();
        List<String> cadenasAConvertir = List.of("hola", "curso", "java", "intermedio");

        for (String cadMin: cadenasAConvertir) {
            System.out.print(cadMin.concat(", "));
        }

//        Stream
//                Collection


        List<String> cadenaConvertidas = cadena.convertirAMayuscula(cadenasAConvertir);
        System.out.println();

        for (String cadMay: cadenaConvertidas) {
            System.out.print(cadMay.concat(", "));
        }


    }

}
