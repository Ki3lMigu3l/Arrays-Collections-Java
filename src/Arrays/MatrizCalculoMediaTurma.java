package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizCalculoMediaTurma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidadeDeAlunos, quantidadeDeNotas;

        System.out.print("Informe a quantidade de alunos: ");
        quantidadeDeAlunos = sc.nextInt();

        System.out.print("Informe a quantidade de notas por aluno: ");
        quantidadeDeNotas = sc.nextInt();

        double [][] notas = new double[quantidadeDeAlunos][quantidadeDeNotas];

        double total = 0d;
        for (int a = 0; a < notas.length; a++) {
            for (int n = 0; n < notas[a].length; n++) {
                System.out.printf("Informe a nota %d do (Aluno %d): ", (n + 1), (a + 1));
                notas[a][n] = sc.nextDouble();
                total += notas[a][n];
            }
        }

        double media = total / (quantidadeDeAlunos * quantidadeDeNotas);
        System.out.println("\nMédia da turma: " + media + "\n");

        for (double[] notasAluno: notas) {
            System.out.println("Notas da turma: " + Arrays.toString(notasAluno));
        }

        sc.close();
    }
}
