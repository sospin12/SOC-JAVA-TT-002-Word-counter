import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        contarPalabras("Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años, sino que tambien ingresó como texto de relleno en documentos electrónicos, quedando esencialmente igual al original. Fue popularizado en los 60s con la creación de las hojas \"Letraset\", las cuales contenian pasajes de Lorem Ipsum, y más recientemente con software de autoedición, como por ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum.");
    }

    public static void contarPalabras(String oracion) {
        //Organizamos el texto para que podamos analizarlo las palabras como tal
        oracion = oracion.replaceAll("[^a-zA-Z ]", "");

        //Dividimos la oracion en palabras
        String[] palabrasOracion = oracion.split("\\s+");

        //Map para establecer keys: palabras sin repetir a un value: integer que va sumando. 
        Map<String, Integer> contadorPalabras = new HashMap<>();

        // Recorremos las palabras y contamos las frecuencias.
        for (String palabra : palabrasOracion) {
            contadorPalabras.put(palabra, contadorPalabras.getOrDefault(palabra, 0) + 1);
        }

        //mostramos los resultados
        for (Map.Entry<String, Integer> entry : contadorPalabras.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
