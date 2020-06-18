package linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashMapEjemplo {
    
    public static void main(String[] args){
        
        LinkedHashMap<String, String> personasCiudadMapping = new LinkedHashMap<>();
        
        //INSERTAR ELEMENTOS
        System.out.println("Agregando elementos");
        personasCiudadMapping.put("Cristian", "Las Vegas");
        personasCiudadMapping.put("Maximiliano", "Toronto");
        personasCiudadMapping.put("Florencia", "La Rioja");
        personasCiudadMapping.put("Fabian", "Paris");
        personasCiudadMapping.put("Pablo", "Belen");
        personasCiudadMapping.put("Hernan", "La Plata");
        personasCiudadMapping.put("Milagros", "Chamical");
        personasCiudadMapping.putIfAbsent("Martina", "Boston");//Solo se agrega si la clave no existe o es null
        System.out.println("Mapping: "+personasCiudadMapping);
        
        //ELIMINAR ELEMENTOS
        System.out.println("\nEliminando elementos de LinkedHashMap");
        String persona = personasCiudadMapping.remove("Milagros");
        System.out.println("Milagros se mudó de "+persona);
        System.out.println("Nuevo Mapping: "+personasCiudadMapping);
        
        //RECORRER LA COLECCION
        //Iterando con Java 8 forEach
        System.out.println("\nRecorriendo LinkedHashMap con Java 8 forEach");
        personasCiudadMapping.forEach((sujeto, ciudad) -> {
            System.out.println(sujeto+" => "+ciudad);
        });
    }
}
