package linkedlist;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEjemplo {
    
    public static void main(String[] args){
        
        LinkedList<String> animales = new LinkedList<>();
        
        //INSTERTAR ELEMENTOS
        System.out.println("Agrendo elementos a la lista");
        animales.add("Lobo");
        animales.add("Caballo");
        animales.add("Perro");
        animales.add("Gato");
        animales.add("Tigre");
        System.out.println("Lista original: "+animales);
        
        animales.add(1, "Leon");//Se agrega un elemento en el indice 1
        System.out.println("Lista con Leon en posicion (1): "+animales);
        
        animales.addFirst("Cuervo");//Se agrega un elemento en la primera posicion de la lista
        System.out.println("Lista con Cuervo en la primera posicion: "+animales);
        
        
        animales.addLast("Tiburon");
        System.out.println("Lista con Tiburon en la ultima posicion: "+animales);
        
        //ELIMINAR ELEMENTOS
        System.out.println("\nEliminando elementos de la lista");
        
        animales.remove(4);//Eliminando el elemento con indice 4
        System.out.println("Lista despues de eliminar un elemento (4): "+animales);
        
        String elemento = animales.removeFirst();//Eliminando el primer elemento de la lista
        System.out.println("Lista despues de eliminar el primer elemento: "+animales);
        
        elemento = animales.removeLast();
        System.out.println("Lista despues de eliminar el ultimo elemento: "+animales);
        
        //RECORRER LA COLECCION
        //Iterando con Java 8 forEach
        System.out.println("\nRecorriendo LinkedList con Java 8 forEach");
        animales.forEach(animal -> {
            System.out.println(animal);
        });
        
        //Iterando usando Iterator
        System.out.println("\nRecorriendo LinkedList usando Iterator");
        Iterator<String> animalesIterator = animales.iterator();
        while (animalesIterator.hasNext()){
            String animal = animalesIterator.next();
            System.out.println(animal);
        }
        
        //Iterando usando Iterator en forma descenciente
        System.out.println("\nRecorriendo LinkedList usando Iterator en forma descendente");
        Iterator<String> animalesIteratorDescendiente = animales.descendingIterator();
        while (animalesIteratorDescendiente.hasNext()){
            String animal = animalesIteratorDescendiente.next();
            System.out.println(animal);
        }
        
        //Iterando con forEach simple
        System.out.println("\nRecorriendo LinkedList con forEach simple");
        for(String animal: animales){
            System.out.println(animal);
        }
        
        //ORDENAR
//        System.out.println("\nLista sin ordenar: "+animales);
//        animales.sort(new Comparator<String>(){
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//            
//        });
//        System.out.println("Lista ordenada: "+animales);
        
        System.out.println("\nLinkedList sin ordenar: "+animales);
        animales.sort(Comparator.naturalOrder());
        System.out.println("LinkedList ordenada: "+animales);
    }
}
