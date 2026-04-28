package Colecciones;

import java.util.ArrayList;
import java.util.List;

public class ListaTareas {
    public static void main(String[] args) {

        List<String> tarea = new ArrayList<>();

        tarea.add("Estudiar Java");
        tarea.add("Corregir CV");
        tarea.add("Sacar los perros a pasear");
        tarea.add("Comprar patines");

        System.out.println("~~~~~~~~~~~~~~~~~LISTA TAREAS~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Mi lista de tareas: " + tarea);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        tarea.remove(3);
        System.out.println("Tarea completada. Pendientes: " + tarea);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Tareas pendientes: " + tarea.size());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
}
