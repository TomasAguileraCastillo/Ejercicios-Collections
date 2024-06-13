import java.util.ArrayList;

/**
 * Nombre del Package :
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : miércoles 12 de junio de 2024
 * 12-06-2024 19:54
 * Nombre del Proyecto Default (Template) Project
 */
public class Main {
    public static void main(String[] args) {
        //Incorporación de ciudades al ArrayList
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Santiago");
        ciudades.add("Iquique");
        ciudades.add("Arica");
        ciudades.add("Concepción");
        ciudades.add("La Serena");
        ciudades.add("Puerto Montt");


//Incorporación de más ciudades desde una colección distinta llamada otrasCiudades
        ArrayList<String> otrasCiudades = new ArrayList();
        otrasCiudades.add("Rancagua");
        otrasCiudades.add("Punta Arenas");
        otrasCiudades.add("San Bernardo");
        otrasCiudades.add("la pobla");
        ciudades.addAll(otrasCiudades);
        System.out.println(ciudades);

        System.out.println("ciudad uno" + ciudades.get(8));
        System.out.println(ciudades.get(9));

        ciudades.remove(9);
        System.out.println(ciudades);

        ciudades.set(8, "San bekalbo");

        System.out.println(ciudades);
        System.out.println(ciudades.size());

        System.out.println(ciudades);
        System.out.println("san bekalbo " + ciudades.indexOf("san bekalbo"));
        System.out.println("Arica " + ciudades.lastIndexOf("Arica"));

        System.out.println();

            for (int i = 0; i < ciudades.size(); i++) {

                System.out.println(ciudades.get(i) + " " + ciudades.indexOf(i));

            }












    }
}