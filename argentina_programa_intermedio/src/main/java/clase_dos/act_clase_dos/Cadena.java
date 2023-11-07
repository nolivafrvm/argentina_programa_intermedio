package clase_dos.act_clase_dos;

import java.util.ArrayList;
import java.util.List;

public class Cadena {


    public List<String> convertirAMayuscula(List<String> cadenas) {
        ManejoString manejoString = (palabra) -> palabra.toUpperCase();
        List<String> arrayMayuscula = new ArrayList<>();
        for (String cadena : cadenas) {
            arrayMayuscula.add(manejoString.convertirMayuscula(cadena));
        }
        return arrayMayuscula;
    }
}
