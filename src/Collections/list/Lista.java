package Collections.list;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> usuarioList = new ArrayList<>();
        Usuario usuarioMiguel = new Usuario("Miguel");
        usuarioList.add(usuarioMiguel);
        usuarioList.add(new Usuario("Ezequiel"));
        usuarioList.add(new Usuario("Abner"));
        usuarioList.add(new Usuario("Isac"));
        usuarioList.add(new Usuario("Antonio"));

        System.out.println(usuarioList.get(1) + "\n"); //Acessando pelo indice.


        for (Usuario usuario: usuarioList) {
            System.out.println(usuario.getNome());
        }

        System.out.println("\nRemovendo usuarios");

        usuarioList.remove(usuarioList.size() - 1); //Removendo o ultimo item da lista.

        //O método remove retorna um boolean o resultado esperado é "true".
        System.out.println(usuarioList.remove(new Usuario("Abner")));

        for (Usuario usuario: usuarioList) {
            System.out.println(usuario.getNome());
        }

        System.out.println("\nEzequiel está presente na lista? " + usuarioList.contains(new Usuario("Ezequiel")));
    }
}
