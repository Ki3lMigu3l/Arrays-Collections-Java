package Collections.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> pilhaDeLivros = new ArrayDeque<>();
        pilhaDeLivros.add("Os segredos da mente milhonaria");
        pilhaDeLivros.push("O Hobbit");
        pilhaDeLivros.add("Código limpo");
        pilhaDeLivros.push("O pequeno príncipe");
        pilhaDeLivros.add("O senhor dos anéis");

        System.out.println("\nForEach Pilha de livros: ");
        for (String livro: pilhaDeLivros) {
            System.out.println("Livro: " + livro);
        }


        System.out.println("\nMétodos para obter o elemento da pilha: ");
        /*
        * Last in First out
        * Peek e Element: obtem o elemento da lista sem remover
        * */
        System.out.println("GetFirst: " + pilhaDeLivros.getFirst());
        System.out.println("Peek: " + pilhaDeLivros.peek()); // retorna false
        System.out.println("Element: " + pilhaDeLivros.element()); // retorna uma exception

        System.out.println("Poll: " + pilhaDeLivros.poll()); // obtem o próximo elemento e remove da lista
        System.out.println(pilhaDeLivros.poll()); // return false or null
        System.out.println("Pop: " + pilhaDeLivros.pop());
        System.out.println("Remove: " + pilhaDeLivros.remove()); // retorna uma exception

        System.out.println("\nForEach Pilha de livros: ");
        for (String livro: pilhaDeLivros) {
            System.out.println(livro);
        }
    }
}
