package Hashcode;

import Collections.list.Usuario;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarioHashSet = new HashSet<>();

        usuarioHashSet.add(new Usuario("Ezequiel"));
        usuarioHashSet.add(new Usuario("Miguel"));
        usuarioHashSet.add(new Usuario("Abner"));

        boolean result = usuarioHashSet.contains(new Usuario("Ezequiel"));
        System.out.println(result);
    }
}
