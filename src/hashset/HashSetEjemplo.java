package hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetEjemplo {
    
    public static void main(String[] args){
        
        Set<String> diasSemana = new HashSet<>();
        
        //INSERTAR ELEMENTOS}
        System.out.println("Agregando elementos");
        diasSemana.add("Lunes");
        diasSemana.add("Martes");
        diasSemana.add("Miercoles");
        diasSemana.add("Jueves");
        diasSemana.add("Viernes");
        diasSemana.add("Sabado");
        diasSemana.add("Domingo");
        
        diasSemana.add("Lunes");//Agregando elemento duplicado, se ignora
        
        System.out.println("HashSet: "+diasSemana);
        
        //ELIMINAR ELEMENTOS 
        System.out.println("\nEliminando elementos");
        
        boolean isRemoved = diasSemana.remove("Lunes");
        System.out.println("HashSet despues de eliminar Lunes: "+diasSemana);
        //Eliminando elementos que pertenezcan a una coleccion determinada
        List<String> finSemana = new ArrayList<>();
        finSemana.add("Sabado");
        finSemana.add("Domingo");
        
        diasSemana.removeAll(finSemana);
        System.out.println("HashSet despues de eliminar fin de semana: "+diasSemana);
        
//        diasSemana.clear();
//        System.out.println("HashSet despues de eliminar todo: "+diasSemana);

        //RECORRER LA COLECCION
        //Iterando con Java 8 forEach
        System.out.println("\nRecorriendo HashSet con Java 8 forEach");
        diasSemana.forEach(diasSem ->{
            System.out.println(diasSem);
        });
        
        //Iterando mediante Iterator
        System.out.println("\nRecorriendo HashSet con Iterator");
        Iterator<String> diasSemanaIterator = diasSemana.iterator();
        while(diasSemanaIterator.hasNext()){
            String diasSem = diasSemanaIterator.next();
            System.out.println(diasSem);
        }
        
        //Iterando con Java forEach simple
        System.out.println("\nRecorriendo HashSet con Java forEach simple");
        for(String diasSem: diasSemana){
            System.out.println(diasSem);
        }
    }
    
}
