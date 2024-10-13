package Collections.map;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Long, String> usuariosMap = new HashMap<>();
        usuariosMap.put(1L, "Ezequiel");
        usuariosMap.put(2L, "Miguel");
        usuariosMap.put(3L, "Abner");

        System.out.println("Métodos do Map");
        System.out.println("Size(): " + usuariosMap.size());
        System.out.println("IsEmpty(): " + usuariosMap.isEmpty());
        System.out.println("KeySet(): " + usuariosMap.keySet());
        System.out.println("Values(): " + usuariosMap.values());
        System.out.println("EntrySet(): " + usuariosMap.entrySet());

        System.out.println("ContainsKey(1L): " + usuariosMap.containsKey(1L));
        System.out.println("ContainsValue('Abner'): " + usuariosMap.containsValue("Abner"));

        System.out.println(usuariosMap.get(2L));

        System.out.println("\nKeySet Foreach:");
        for (Long chave: usuariosMap.keySet()) {
            System.out.println(chave);
        }

        System.out.println("\nValues Foreach:");
        for (String valor: usuariosMap.values()) {
            System.out.println(valor);
        }

        System.out.println("\nEntrySet Foreach:");
        for (Map.Entry<Long, String> chaveValor: usuariosMap.entrySet()) {
            System.out.println(chaveValor);
        }

        System.out.println("\nRemovendo do map:");
        System.out.println("Remove(1L): " + usuariosMap.remove(1l));
        System.out.println("Remove(3L, 'Abner'): " + usuariosMap.remove(3l, "Abner"));
    }
}
