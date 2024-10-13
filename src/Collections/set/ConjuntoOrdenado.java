package Collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoOrdenado {
    public static void main(String[] args) {

        //HashSet
        Set<String> candidatosAprovados = new HashSet<>();
        candidatosAprovados.add("Ezequiel");
        candidatosAprovados.add("Miguel");
        candidatosAprovados.add("Abner");
        candidatosAprovados.add("Isac");

        for (String candidato: candidatosAprovados) {
            System.out.println(candidato);
        }

        //TreeSet
        Set<String> candidadosAprovadosOrdenados = new TreeSet<>();
        candidadosAprovadosOrdenados.add("Ezequiel");
        candidadosAprovadosOrdenados.add("Miguel");
        candidadosAprovadosOrdenados.add("Abner");
        candidadosAprovadosOrdenados.add("Isac");

        System.out.println("\nLista Set com TreeSet");
        for (String candidato: candidadosAprovadosOrdenados) {
            System.out.println(candidato);
        }

        //SortedSet -> Armazena elementos de forma ordenada e sem duplicatas.
        SortedSet<Integer> sortedSetNums = new TreeSet<>();
        sortedSetNums.add(1);
        sortedSetNums.add(2);
        sortedSetNums.add(120);
        sortedSetNums.add(6);

        for (int numeros: sortedSetNums) {
            System.out.println(numeros);
        }

    }
}
