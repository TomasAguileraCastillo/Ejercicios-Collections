import java.util.LinkedList;
import java.util.Queue;

/**
 * Nombre del Package :PACKAGE_NAME
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : jueves 13 de junio de 2024
 * 13-06-2024 13:37
 * Nombre del Proyecto EjercicioCollection
 */
public class EjercicioQueue {
    public static void main(String[] args) {

        Queue continentes = new LinkedList<>();
        continentes.add("África");
        continentes.add("América");
        continentes.add("Europa");
        continentes.add("Oceanía");
        continentes.add("Asia");
        continentes.add("Antártica");

        System.out.println(continentes);



        System.out.println(continentes.remove("Antártica"));
        System.out.println(continentes);

        System.out.println(continentes.poll());
        System.out.println(continentes);

        System.out.println("peek : " + continentes.peek());
        System.out.println(continentes);


        System.out.println("element: "+continentes.element());
        System.out.println(continentes);
        System.out.println(continentes.size());




    }
}
