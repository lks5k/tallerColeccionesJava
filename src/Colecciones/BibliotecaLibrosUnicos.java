package Colecciones;

import java.util.HashSet;
import java.util.Set;

public class BibliotecaLibrosUnicos {
    public static void main(String[] args) {

        Set<String> libros = new HashSet<>();

        libros.add("La metamorfosis");
        libros.add("El misterio del hombre que desapareció");
        libros.add("Los 4 acuerdos");
        libros.add("La carta a García");
        libros.add("Los 4 acuerdos");

        System.out.println("~~~~~~~~~~~~~~~~BIBLIOTECA DE LIBROS UNICOS~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Libros disponibles: " + libros);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Está " + "La carta a García " + "disponible?: " + libros.contains("La carta a García"));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Tenemos " + libros.size() + " libros disponibles.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }

}