import java.util.Map;
import java.util.TreeMap;

/**
 * Nombre del Package :PACKAGE_NAME
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : jueves 13 de junio de 2024
 * 13-06-2024 13:46
 * Nombre del Proyecto EjercicioCollection
 */
public class EjercicioMap {
    public static void main(String[] args) {
        Map<String, Integer> planetas = new TreeMap<>();
        planetas.put("Mercurio", 10);
        planetas.put("Venus", 20);
        planetas.put("Marte", 15);
        planetas.put("Jupiter", 50);
        System.out.printf("\n"+planetas);

        System.out.println();

        planetas.remove("Venus");
        System.out.println(planetas);


        System.out.println(planetas.get("Jupiter"));



        System.out.println(planetas.containsKey("Tierra"));
        System.out.println(planetas.containsKey("Jupiter"));
        System.out.println();

        planetas.keySet().forEach(System.out::println);


        System.out.println();

        for (Map.Entry<String, Integer> entry : planetas.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }







    }
}
