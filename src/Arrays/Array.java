package Arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        //Criando um Array de notas
        double[] notas = new double[3];
        notas[0] = 7.8;
        notas[1] = 8;
        notas[2] = 6.5;
        System.out.println(Arrays.toString(notas) + "\n");
        System.out.println("Primeira nota: " + notas[0]);
        System.out.println("Ultima nota: " + notas[notas.length - 1] + "\n");

        //Percorrendo Array e somando a variavel total
        double total = 0d;
        for (int i = 0; i < notas.length; i++) {
            total += notas[i];
        }
        System.out.println("Media de notas Aluno A: " + total / notas.length + "\n");

        //Elementos pre-definitos no Array
        final double notaDaUltimaUnidade = 7.2;
        double[] notasDoAlunoB = {6.8, 8.6, 10, notaDaUltimaUnidade};
        double totalDoAlunoB = 0d;
        for (int i = 0; i < notasDoAlunoB.length; i++) {
            totalDoAlunoB += notasDoAlunoB[i];
        }
        System.out.println("Media do Aluno B: " + totalDoAlunoB / notasDoAlunoB.length + "\n");

        //Percorrendo Array com Foreach
        for (double nota: notas) {
            System.out.println(nota + " ");
        }
    }
}
