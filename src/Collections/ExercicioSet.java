package Collections;

import java.util.HashSet;
import java.util.Set;

public class ExercicioSet {
    public static void main(String[] args) {

        HashSet primeiroConjunto = new HashSet();
        primeiroConjunto.add("Ezequiel");
        primeiroConjunto.add("teste");
        primeiroConjunto.add('M');
        primeiroConjunto.add(23);
        primeiroConjunto.add(8.5);
        primeiroConjunto.add(true);

        System.out.println("Tamanho do primeiro conjunto: " + primeiroConjunto.size() + "\n");
        System.out.println("Removendo item do conjunto: " + primeiroConjunto.remove("Teste"));
        System.out.println("Removendo item do conjunto: " + primeiroConjunto.remove("teste"));
        System.out.println("Tamanho do primeiro conjunto atualizado: " + primeiroConjunto.size());

        System.out.println("\nContain Ezequiel? " + primeiroConjunto.contains("Ezequiel"));
        System.out.println("Contain o valor 1? " + primeiroConjunto.contains(1));

        Set segundoConjunto = new HashSet();
        segundoConjunto.add(1);
        segundoConjunto.add(2);
        segundoConjunto.add(3);
        segundoConjunto.add(23);

        System.out.println("\nPrimeiro conjunto: " + primeiroConjunto);
        System.out.println("Segundo conjunto: " + segundoConjunto);

        primeiroConjunto.addAll(segundoConjunto);
        System.out.println("\nUnindo os elementos do segundo conjunto ao primeiro: " + primeiroConjunto);

        primeiroConjunto.retainAll(segundoConjunto);
        System.out.println("Retain: " + primeiroConjunto);

        primeiroConjunto.clear();
        System.out.println("Limpando a colecion com clear: " + primeiroConjunto);


    }
}
