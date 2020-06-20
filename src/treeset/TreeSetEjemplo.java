package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEjemplo {
    
    public static void main(String[] args){
        
        TreeSet<String> redesSociales = new TreeSet<>();
        
        //INSTERTAR ELEMENTOS
        System.out.println("Agregando elementos");
        redesSociales.add("Instagram");
        redesSociales.add("Facebook");
        redesSociales.add("Twitter");
        redesSociales.add("Youtube");
        redesSociales.add("WhatsApp");
        
        redesSociales.add("Instagram");//Elemento duplicado (ignorado)
        redesSociales.add("instagram");//Elemento duplicado (permitido x minusculas)
        System.out.println("Set de redes: "+redesSociales);
        
        //ELIMINAR ELEMENTOS
        System.out.println("\nEliminando elementos");
        boolean isRemoved = redesSociales.remove("instagram");
        if (isRemoved){
            System.out.println("Set de redes despues de eliminar \"instagram\": "+redesSociales);
        }
        
        String elemento = redesSociales.pollFirst();//Se elimina el primer elemento
        System.out.println("Set de redes despues de eliminar el primer elemento \""+(elemento)+"\": "+redesSociales);
        
        elemento = redesSociales.pollLast();//Se elimina el ultimo elemento
        System.out.println("Set de redes despues de eliminar el ultimo elemento \""+(elemento)+"\": "+redesSociales);
        
        //RECORRER LA COLECCION
        //Iterando con Java 8 forEach
        System.out.println("\nRecorriendo TreeSet con Java 8 forEach");
        redesSociales.forEach(redes -> {
            System.out.println(redes);
        });
        
        //Iterando con forEach simple
        System.out.println("\nRecorriendo TreeSet con forEach simple");
        for(String i: redesSociales){
            System.out.println(i);
        }
        
        //Iterando mediante Iterator
        System.out.println("\nRecorriendo TreeSet mediante Iterator");
        Iterator<String> redesSocialesIterator = redesSociales.iterator();
        while(redesSocialesIterator.hasNext()){
            String redes = redesSocialesIterator.next();
            System.out.println(redes);
        }
    }
}
