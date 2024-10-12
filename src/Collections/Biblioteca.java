package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Biblioteca {

    private Set<String> livrosHashSet; // Sem ordem, não permite duplicidade
    private Set<String> livrosLinkedHashSet; // Mantém a ordem de inserção
    private Set<String> livrosTreeSet; // Ordenado em ordem alfabética

    public Biblioteca() {
        this.livrosHashSet = new HashSet();
        this.livrosLinkedHashSet = new LinkedHashSet();
        this.livrosTreeSet = new TreeSet();
    }

    public static void main (String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Adcionando livros
        biblioteca.adicionarLivro("Hábitos Atômicos: Um Método Fácil e Comprovado de Criar Bons Hábitos e Se Livrar dos Maus");
        biblioteca.adicionarLivro("Domain-driven Design Destilado");
        biblioteca.adicionarLivro("Código Limpo: Habilidades Práticas do Agile Software");
        biblioteca.adicionarLivro("Entendendo Algoritmos: Um Guia Ilustrado Para Programadores e Outros Curiosos");
        biblioteca.adicionarLivro("Head First Java: A Brain-Friendly Guide");
        biblioteca.adicionarLivro("O Guia do Mochileiro das Galáxias");
        biblioteca.adicionarLivro("1984");

        // Listando livros
        biblioteca.listarLivros("HashSet");
        biblioteca.listarLivros("LinkedHashSet");
        biblioteca.listarLivros("TreeSet");

        // Verificando se o livro está disponível
        System.out.println("\n'Domain-driven Design' está disponível? " + biblioteca.estaDisponivel("Domain-driven Design Destilado"));

        // Removendo um livro
        biblioteca.removerLivro("1984");
        System.out.println("\nApós remover '1984':");
        biblioteca.listarLivros("TreeSet");

        // Operações
        Set<String> secaoFiccao = new HashSet<>();
        secaoFiccao.add("1984");
        secaoFiccao.add("O Guia do Mochileiro das Galáxias");

        Set<String> secaoFantasia = new HashSet<>();
        secaoFantasia.add("O Hobbit");
        secaoFantasia.add("O senhor dos anéis");

        Set<String> uniao = Biblioteca.unirConjuntos(secaoFiccao, secaoFantasia);
        System.out.println("\nUnião das seções ficção e fantasia: " + uniao);


        // biblioteca.adicionarLivro("1984");
        Set<String> intersecao = Biblioteca.intersercao(secaoFiccao, biblioteca.livrosHashSet);
        System.out.println("Interseção da seções de ficção com a biblioteca: " + intersecao);
    }


    public void adicionarLivro (String titulo) {
        livrosHashSet.add(titulo);
        livrosLinkedHashSet.add(titulo);
        livrosTreeSet.add(titulo);
    }

    public void removerLivro (String titulo) {
        livrosHashSet.remove(titulo);
        livrosLinkedHashSet.remove(titulo);
        livrosTreeSet.remove(titulo);
    }

    public boolean estaDisponivel(String titulo) {
        return livrosHashSet.contains(titulo);
    }

    public void listarLivros (String tipoDeSet) {
        Set<String> livros;
        switch (tipoDeSet) {
            case "HashSet":
                livros = livrosHashSet;
                break;
            case "LinkedHashSet":
                livros = livrosLinkedHashSet;
                break;
            case "TreeSet":
                livros = livrosTreeSet;
                break;
            default:
                throw new RuntimeException("Tipo de Set não encontrado!");
        }

        System.out.println("\nLivros em " + tipoDeSet + ":");
        for (String livro: livros) {
            System.out.println(livro);
        }
    }

    //Método para unir dois conjuntos
    public static Set<String> unirConjuntos (Set<String> primeiroConjunto, Set<String> segundoConjunto) {
        Set<String> uniao = new HashSet<>(primeiroConjunto);
        uniao.addAll(segundoConjunto);
        return uniao;
    }

    public static Set<String> intersercao (Set<String> primeiroConjunto, Set<String> segundoConjunto) {
        Set<String> intersercao = new HashSet<>(primeiroConjunto);
        intersercao.retainAll(segundoConjunto);
        return intersercao;
    }
}
