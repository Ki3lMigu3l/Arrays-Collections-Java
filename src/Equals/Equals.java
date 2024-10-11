package Equals;

import java.util.Date;

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
