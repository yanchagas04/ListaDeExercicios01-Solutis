

// Pretende-se escrever um programa que leia do teclado uma distância
// expressa em milhas, converte-a para quilômetros e apresenta o resultado no
// console. (fórmula de conversão: 1 milha = 1.609 km).

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Insira uma distância em milhas: ");
                double milhas = sc.nextDouble();
                double quilometros = milhas * 1.609;
                System.out.println(milhas + " milhas = " + quilometros + " quilômetros");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Tente novamente.");
                sc.next();
            }
        }
        sc.close();
    }
}
