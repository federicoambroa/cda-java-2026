package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> nombres = List.of(
                "Juan Melo",
                "Ana Perez",
                "Carlos Melo",
                "Luisa Gomez",
                "Melo Suarez",
                "Lucas Strione"
        );

        // Invocar un método que imprima un listado de nombres (Lista de String)
        imprimirNombres(nombres);

        // Invocar un método que dada una lista de String y un String como parámetro, retorne si la lista contiene el String (si al menos un elemento es igual)
        String nombreBuscado = "Juan Melo";
        boolean contieneNombre = contieneElemento(nombres, nombreBuscado);
        System.out.println("La lista contiene '" + nombreBuscado + "': " + (contieneNombre ? "Si": "No"));

        // Invocar un método que dada una lista de String y un String como parámetro, retorne una nueva lista con los elementos de la misma que contienen ese String (ejemplo el String "Juan Melo" contiene al String "Melo")
        String textoParcial = "Melo";
        List<String> nombresFiltrados = filtrarPorTexto(nombres, textoParcial);
        System.out.println("Elementos que contienen '" + textoParcial + "': " + nombresFiltrados);

        // invocar un método que genere un Map (clave Long y valor String).
        Map<Long, String> mapaNombres = generarMapa();

        // Luego invocar a un método que dado este Map retorne si una clave existe o no
        Long claveBuscada = 2L;
        System.out.println("Existe la clave " + claveBuscada + ": " + (existeClave(mapaNombres, claveBuscada)? "Si": "No"));

        // Luego otro método que dado ese mismo map retorne el valor de una clave.
        System.out.println("Valor de la clave " + claveBuscada + ": " + obtenerValorPorClave(mapaNombres, claveBuscada));
    }

    public static void imprimirNombres(List<String> nombres) {
        System.out.println("Listado de nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
    public static boolean contieneElemento(List<String> nombres, String valorBuscado) {
        for (String nombre : nombres) {
            if (nombre.equals(valorBuscado)) {
                return true;
            }
        }
        return false;
    }
    public static List<String> filtrarPorTexto(List<String> nombres, String texto) {
        List<String> resultado = new ArrayList<>();
        for (String nombre : nombres) {
            if (nombre.contains(texto)) {
                resultado.add(nombre);
            }
        }
        return resultado;
    }
    public static Map<Long, String> generarMapa() {
        return Map.of(
                1L, "Juan Melo",
                2L, "Ana Perez",
                3L, "Carlos Melo",
                4L, "Federico Ambroa",
                5L, "Santiago Lofiego",
                6L, "Carla Dalpiaz"
        );
    }
    public static boolean existeClave(Map<Long, String> mapa, Long clave) {
        return mapa.containsKey(clave);
    }
    public static String obtenerValorPorClave(Map<Long, String> mapa, Long clave) {
        return mapa.get(clave);
    }
}