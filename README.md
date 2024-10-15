# Arrays and Collections

Este projeto foi desenvolvido para documentar o aprendizado sobre Arrays e Collections. As Collections são estruturas de dados amplamente utilizadas e fundamentais para o desenvolvimento. Compreendê-las é essencial para criar soluções. Este projeto foi dividido em 3 módulos (packages): Arrays, Equals e Collections, sendo os principais Arrays e Collections.

<div align="center">
    <h3 align="center">Linguagem utilizada</h3>
        <img width="50" src="https://user-images.githubusercontent.com/25181517/117201156-9a724800-adec-11eb-9a9d-3cd0f67da4bc.png" alt="Java" title="Java"/>
</div>

<h2 align="center">Arrays</h2>
<br>

Arrays são estruturas de dados que permitem armazenar múltiplos valores de um mesmo tipo em uma única variável. Eles têm tamanho fixo, ou seja, uma vez definido, o número de elementos que o array pode conter não pode ser alterado.

### Características:

- Tamanho fixo: O tamanho de um array é definido no momento da sua criação e não pode ser alterado.
- Acesso direto: Você pode acessar qualquer elemento diretamente através do índice.
- Homogeneidade: Todos os elementos de um array devem ser do mesmo tipo.

Cada elemento em um array pode ser acessado por meio de um índice numérico, onde o índice começa em 0.

#### Exemplo:

<p align="center">
  <img src="https://github.com/Ki3lMigu3l/Arrays-Collections-Java/blob/main/readme/Exemplo-Array.png" alt="Descrição da Imagem" width="500"/>
</p>

<br>

<h2 align="center">Equals and Hashcode</h2>

<br>

Em Java, os métodos equals() e hashCode() são fundamentais para a comparação de objetos e o funcionamento de coleções como HashSet, HashMap e HashTable. O método equals() é usado para verificar se dois objetos são considerados "iguais". A implementação padrão de equals() na classe Object compara a referência dos objetos, ou seja, dois objetos são iguais apenas se forem o mesmo objeto na memória.

#### Exemplo:

```java
@Override
public boolean equals(Object obj) {
    if (obj instanceof Usuario) {
        Usuario usuario = (Usuario) obj;

        boolean verificaNome = usuario.nome.equals(this.nome);
        boolean verificaEmail = usuario.email.equals(this.email);
        return verificaNome && verificaEmail;
    }

    return false;
}

public class Equals {
    public static void main(String[] args) {
        Usuario primeiroUsuario = new Usuario();
        primeiroUsuario.setNome("Miguel");
        primeiroUsuario.setEmail("miguel@dev.com.br");

        Usuario segundoUsuario = new Usuario();
        segundoUsuario.setNome("Miguel");
        segundoUsuario.setEmail("miguel@dev.com.br");

        System.out.println("Operador de Igualdade: " + (primeiroUsuario == segundoUsuario));
        System.out.println("Equals: " + primeiroUsuario.equals(segundoUsuario));

        System.out.println("Usuario Equals Date? " + primeiroUsuario.equals(new Date()));
    }
}

```

Neste exemplo, dois objetos da classe Usuario são considerados iguais se tiverem o mesmo nome e email.

O método hashCode() retorna um valor inteiro que representa o objeto, sendo utilizado em estruturas de dados baseadas em hash (como HashMap e HashSet). A regra geral é que se dois objetos são "iguais" segundo o método equals(), então eles devem ter o mesmo valor de hashCode().

### Collections

Neste projeto, abordamos as principais interfaces e implementações de coleções em Java: **List**, **Map**, **Queue**, **Set** e **Stack**. Essas coleções são parte do framework de collections, fornecendo estruturas de dados versáteis para diferentes necessidades de manipulação e armazenamento de dados.

<br>

### 1. List
Uma **List** é uma coleção ordenada que permite elementos duplicados. A ordem dos elementos é mantida e você pode acessar os itens pelos seus índices.

### Implementações Comuns:
- `ArrayList`: Oferece acesso rápido por índice, mas operações de inserção/remoção podem ser lentas, dependendo da posição.
- `LinkedList`: Operações de inserção e remoção são rápidas, mas o acesso por índice é mais lento que no `ArrayList`.

<br>

### 2. Map
Um **Map** é uma coleção que mapeia chaves para valores. Cada chave pode estar associada a um único valor, e não pode haver chaves duplicadas.

- `HashMap`: Implementação mais comum, não garante ordem de inserção.
- `TreeMap`: Mantém as chaves ordenadas.
- `LinkedHashMap`: Mantém a ordem de inserção das chaves.

  <br>

### 3. Queue
Um **Queue** é uma coleção projetada para manter em uma ordem específica, normalmente seguindo o principio de FIFO (First-in, First-out), onde o primeiro elemento inserido é o primeiro a ser removido.

- `LinkedList`: Suporta operações de fila e lista.
- `PriorityQueue`: Organiza elementos com base em prioridade.
  
### Exemplo:

```java
Queue<String> queue = new LinkedList<>();
queue.add("Elemento 1");
queue.add("Elemento 2");
queue.poll(); // Remove e retorna "Elemento 1"
```

<br>

### Set
Um Set é uma coleção que não permite elementos duplicados e não garante uma ordem específica (a menos que você utilize uma implementação ordenada).

- `HashSet`: Não mantém a ordem de inserção.
- `LinkedHashSet`: Mantém a ordem de inserção.
- `TreeSet`: Mantém os elementos ordenados.

<br>

### Stack
Uma Stack (pilha) é uma coleção baseada no principio de LIFO (Last-In, First-Out), onde o último elemento inserido é o primeiro a ser removido.

### Implementações Comuns:
- `ArrayDeque`: Implementação de `Deque` que é mais eficiente que `Stack` herdada de `Vector`.
- `LinkedList`: Também implementa `Deque` e pode ser usada como uma pilha.

### Características:
- LIFO: O último elemento a entrar é o primeiro a sair.
- Evita a sincronização herdada da classe `Stack`, sendo mais rápida para cenários não concorrentes.
- Útil para resolver problemas que envolvem recursão, como avaliação de expressões ou controle de fluxo.


### Conclusão
Este projeto abordou as principais coleções do Java, incluindo List, Map, Queue, Set e Stack, destacando suas implementações e cenários de uso. Também optamos por usar Deque para representar pilhas, devido à sua eficiência superior em relação à classe Stack. Com isso, garantimos um entendimento sólido das estruturas de dados disponíveis no Java, permitindo escolher a coleção adequada para cada necessidade, otimizando a performance e a organização do código.
