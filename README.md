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
