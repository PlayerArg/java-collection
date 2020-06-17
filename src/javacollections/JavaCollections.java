package javacollections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class JavaCollections {

    public static void main(String[] args) {
        
        List<String> lenguajesProgramacion = new ArrayList<>();
        
        //INSERTAR ELEMENTOS
        lenguajesProgramacion.add("C");
        lenguajesProgramacion.add("C++");
        lenguajesProgramacion.add("Java");
        lenguajesProgramacion.add("Python");
        lenguajesProgramacion.add("Kotlin");
        lenguajesProgramacion.add("JavaScript");
        
        System.out.println("Lista original: "+lenguajesProgramacion);
        
        //ELIMINAR ELEMENTOS
        lenguajesProgramacion.remove(4);//Se elimina el elemento con indice 4
        System.out.println("Despues de eliminar un elemento (4): "+lenguajesProgramacion);
        
        lenguajesProgramacion.remove(0);//Se elimina el elemento con indice 0
        System.out.println("Despues de eliminar un elemento (0): "+lenguajesProgramacion);
        
        //lenguajesProgramacion.removeAll(lenguajesProgramacion);
        //System.out.println("Despues de eliminar toda la lista: "+lenguajesProgramacion);
        
        //RECORRER LA COLECCION
        //Iterando con  Java8 forEach
        System.out.println("\nRecorremos la lista utilizando forEach");
        lenguajesProgramacion.forEach(lenguajeProgramacion -> {
            System.out.println(lenguajeProgramacion);
        });
        
        //Iterando con un iterator
        System.out.println("\nRecorremos la lista utilizando un iterador");
        Iterator<String> lenguajeProgramacionIterator = lenguajesProgramacion.iterator();
        while(lenguajeProgramacionIterator.hasNext()){
            String lenguajeProgramacion = lenguajeProgramacionIterator.next();
            System.out.println(lenguajeProgramacion);
        }
        
        //Iterando con forEach simple
        System.out.println("\nRecorremos la lista utilizando forEach simple");
        for(String lenguajeProgramacion: lenguajesProgramacion){
            System.out.println(lenguajeProgramacion);
        }
        
        //ORDENAR
//        lenguajesProgramacion.sort(new Comparator<String>(){
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
        
        System.out.println("\nLenguajes sin ordenar: "+lenguajesProgramacion);
        lenguajesProgramacion.sort(Comparator.naturalOrder());
        System.out.println("Lenguajes ordenados: "+lenguajesProgramacion);
        
        
    }   
    
}