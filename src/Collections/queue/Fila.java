package Collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> filaDoBanco = new LinkedList<>();

        /*
        *   Offer e Add: Os dois métodos adicionam elementos na lista
        *   A diferença entre eles são o comportamento quando a fila está cheia
        * */
        filaDoBanco.add("Ezequiel"); // retorna false
        filaDoBanco.offer("Miguel"); // lança uma exception
        filaDoBanco.add("Abner");
        filaDoBanco.offer("Isac");
        filaDoBanco.add("Nascimento");
        filaDoBanco.offer("Antonio");

        /*
        * Peek e Element: Obtem o próximo elemento da fila sem remover
        * A diferença entre os métodos são os comportamentos com a fila vazia
        * */
        System.out.println(filaDoBanco.peek()); // retorna null
        System.out.println(filaDoBanco.element()); // lança uma exception

        Queue<String> filaDoBancoVazia = new LinkedList<>();
        System.out.println(filaDoBancoVazia.peek());
        //System.out.println(filaDoBancoVazia.element()); -> lançará uma exception



        /*
        * Poll e Remove: obtem o próximo elemento da fila removendo o elemento
        * A diferença no comportamento ocorre quando a fila está vazia
        * */
        System.out.println(filaDoBanco.poll()); // retorna false
        System.out.println(filaDoBanco.remove()); // lança uma exception

        System.out.println("\nPercorrendo Fila: ");
        for (String clienteNaFila : filaDoBanco) {
            System.out.println(clienteNaFila);
        }

        // O método size() retorna um int com o tamanho da lista
        System.out.println("\nTamanho da fila: " + filaDoBanco.size());

        // Verificando se contem o cliente "Ezequiel" na fila do banco.
        System.out.println("O cliente Ezequiel ainda está na fila? " + filaDoBanco.contains("Ezequiel"));

        // O método clear() é responsável por limpar a nossa fila
        filaDoBanco.clear();

        // O método isEmpty() retorna um valor booleano e indica se a fila está vazia ou não
        filaDoBanco.isEmpty();


    }
}
