package hashmap;

import java.util.HashMap;
import java.util.Map;

public class hashMapEjemplo {
    
    public static void main(String[] args){
        
        Map<String, Integer> paresNumeros = new HashMap<>();
        
        //INSERTAR ELEMENTOS
        System.out.println("Agregando elementos");
        paresNumeros.put("Uno", 1);
        paresNumeros.put("Dos", 2);
        paresNumeros.put("Tres", 3);
        paresNumeros.put("Cuatro", 4);
        paresNumeros.put("Cinco", 5);
        paresNumeros.put("Seis", 6);
        paresNumeros.put("Siete", 7);
        System.out.println("Mapping: "+paresNumeros);
        
        //ELIMINAR ELEMENTOS
        System.out.println("Eliminando elementos de HashMap");
        String campoLetra = "Dos";
        Integer campoNumero = paresNumeros.remove(campoLetra);
        System.out.println("\nPar (" +campoLetra+ ";" +campoNumero+ ") removidos");
        System.out.println("Nuevo Mapping: "+paresNumeros);
        
        //RECORRER LA COLECCION
        //Iterando con Java 8 forEach
        System.out.println("\nRecorriendo HashMap con Java 8 forEah");
        paresNumeros.forEach((letra, numero)-> {
            System.out.println(letra + ";" + numero);
        });
        
        //Iterando usando Iterator
        System.out.println("\nRecorriendo HashMap con forEach simple");
        for(Map.Entry<String, Integer> entry: paresNumeros.entrySet()){
            System.out.println(entry.getKey() + ";" + entry.getValue());
        }
        
        
    }
}
