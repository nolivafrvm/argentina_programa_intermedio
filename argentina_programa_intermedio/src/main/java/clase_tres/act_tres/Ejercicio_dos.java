package clase_tres.act_tres;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio_dos {

    String separarComas(List<String> cadenas, int cantidad) {
        return cadenas.stream().filter(cad -> cad.length()>cantidad).collect(Collectors.joining(", "));
    }

}
