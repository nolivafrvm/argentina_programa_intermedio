package clase_tres;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Colecciones {

    public static void main(String[] args) {
        // ForEach
        List<Integer> enteros = new ArrayList<>();
        enteros.add(162);
        enteros.add(125);
        enteros.add(1123);
        enteros.add(321);

        enteros.forEach(numero -> System.out.println(numero));

//        enteros.forEach(numero -> enteros.remove(numero)); ConcurrentModificationException

        enteros.forEach(numero -> {
            numero += 10;
            System.out.println(numero);
        });

        enteros.forEach(numero -> System.out.println(numero));

        enteros.forEach(numero -> {
            if (numero % 2==0) {
                System.out.println("Es par ".concat(String.valueOf(numero)));
            }
        });


        // ANY MATCH

        List<Integer> numerosAnyMatch = new ArrayList<>();
        numerosAnyMatch.add(51);
        numerosAnyMatch.add(15);
        numerosAnyMatch.add(24);
        numerosAnyMatch.add(231);

        boolean resultado = numerosAnyMatch.stream().anyMatch(numero -> numero > 10);
        if (resultado) {
            System.out.println("Hay al menos un numero mayor a 10");
        } else {
            System.out.println("No hay numeros mayores a 10");
        }


        // ALL MATCH

        List<Integer> numerosAllMatch = new ArrayList<>();
        numerosAnyMatch.add(51);
        numerosAnyMatch.add(15);
        numerosAnyMatch.add(24);
        numerosAnyMatch.add(231);

        boolean resultadoAllMatch = numerosAllMatch.stream().allMatch(numero -> numero > 10);
        if (resultadoAllMatch) {
            System.out.println("Todos los numeros son mayores a 10");
        } else {
            System.out.println("Hay al menos un numero menor/igual a 10");
        }

        // Map
        List<Persona> personas = new ArrayList<>();

        Persona personaUno = new Persona("Juan", "Perez", 'H');
        Persona personaDos = new Persona("Maria", "Rodriguez", 'M');
        Persona personaTres = new Persona("Jose", "Gomez", 'M');

        personas.add(personaUno);
        personas.add(personaDos);
        personas.add(personaTres);

        List<String> nombres = personas.stream().map(p -> p.getNombre()).collect(Collectors.toList());
        nombres.forEach(nombre -> System.out.println(nombre));

        List<String> apellidos = personas.stream().map(p -> p.getApellido()).collect(Collectors.toList());
        apellidos.forEach(apellido -> System.out.println(apellido));

        List<Character> sexo = personas.stream().map(p -> p.getSexo()).collect(Collectors.toList());
        sexo.forEach(sex -> System.out.println(sex));

        List<String> numerosString = new ArrayList<>();
        numerosString.add( "1");
        numerosString.add( "2");
        numerosString.add( "3");
        List<Integer> numeros = numerosString.stream().mapToInt(numero -> Integer.valueOf(numero)).boxed().collect(Collectors.toList()); // boxed -> Stream<Integer>

        // Aplanacion de collections

        List<Integer> numerosCollection = new ArrayList<>();
        numerosCollection.add( 4);
        numerosCollection.add( 1);
        numerosCollection.add( 8);
        Integer resultadoMin = Collections.min(numerosCollection);
        System.out.println("resultadoMin ".concat(String.valueOf(resultadoMin)));

        Integer resultadoMax = Collections.max(numerosCollection);
        System.out.println("resultadoMax ".concat(String.valueOf(resultadoMin)));

        int suma = numerosCollection.stream().mapToInt(Integer::intValue).sum();
        System.out.println("suma ".concat(String.valueOf(suma)));

        // Joining

        List<String> textos = new ArrayList<>();
        textos.add( "Primero" );
        textos.add( "Segundo" );
        textos.add( "Tercero" );
        String textoResultante = textos.stream().collect(Collectors.joining());
        System.out.println(textoResultante);

        String textoResultanteDelimiter = textos.stream().collect(Collectors.joining(","));
        System.out.println(textoResultanteDelimiter);






    }



}
