package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
*  Todo
*   1. Coletar a quantidade de notas.
*   2. Armazenar as notas no Array.
*   3. Calcular a media a partir da soma das notas.
* */


public class CalculoMediaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de notas que deseja ter a média: ");
        int quantidadeDeNotas = sc.nextInt();
        double[] notas = new double[quantidadeDeNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota (" + "Nota " + (i + 1) + "):");
            notas[i] = sc.nextDouble();
        }
        System.out.println("Notas: " + Arrays.toString(notas) + "\n");

        double total = 0d;
        for(double nota: notas) {
            total += nota;
        }

        double media = total / notas.length;
        System.out.println("Média do aluno: " + media);

        sc.close();
    }
}
