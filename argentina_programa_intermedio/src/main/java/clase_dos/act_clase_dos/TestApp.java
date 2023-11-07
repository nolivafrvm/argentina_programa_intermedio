package clase_dos.act_clase_dos;

import java.util.List;

public class TestApp {

    public static void main(String[] args) {
        Cadena cadena = new Cadena();
        List<String> cadenasAConvertir = List.of("hola", "curso", "java", "intermedio");

        for (String cadMin: cadenasAConvertir) {
            System.out.print(cadMin.concat(", "));
        }

        List<String> cadenaConvertidas = cadena.convertirAMayuscula(cadenasAConvertir);
        System.out.println();

        for (String cadMay: cadenaConvertidas) {
            System.out.print(cadMay.concat(", "));
        }


    }

}
