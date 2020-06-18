package treemap;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapEjemplo {
    
    public static void main(String[] args){
        
        SortedMap<String, String> fileExtensions = new TreeMap<>();
        
        //INSERTAR ELEMENTOS
        System.out.println("Agregando elementos");
        fileExtensions.put("python", ".py");
        fileExtensions.put("c++", ".cpp");
        fileExtensions.put("kotlin", ".kt");
        fileExtensions.put("golang", ".go");
        fileExtensions.put("java", ".java");
        fileExtensions.put("JavaScript", ".js");
        System.out.println("Mapping: "+fileExtensions);
        
        //ELIMINAR ELEMENTOS
        System.out.println("\nEliminando elementos");
        String nameFiles = "golang";
        String extension = fileExtensions.remove(nameFiles);
        System.out.println("Mapping despues de eliminar golang: "+fileExtensions);
        
        //RECORRER LA COLECCION
        //Iterando con Java 8 forEach
        System.out.println("\nRecorriendo TreeMap con Java 8 forEach");
        fileExtensions.forEach((file, ext) -> {
            System.out.println(file+" -> "+ext);
        });
    }
}
