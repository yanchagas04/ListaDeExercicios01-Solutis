

// Faça um programa que solicite ao usuário um número de 1 a 7, e imprima na
// tela o dia da semana correspondente. Suponha que Segunda corresponde a 1 ,
// Terça corresponde a 2, e assim por diante. Utilizando Array.

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        String dias[] = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado", "Domingo"};
        Scanner sc = new Scanner(System.in);
        while (true) { 
            System.out.println("Insira um número de 1 a 7: ");
            int dia = sc.nextInt();
            try {
                System.out.println("Dia da semana: " + dias[dia - 1]);
                break;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("NÚMERO INVÁLIDO! TENTE NOVAMENTE!");
            }
        }
        sc.close();
    }
}
