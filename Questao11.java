
import java.util.Scanner;

// Escreva um programa que tenha duas palavras como entrada, e a saída
// imprima as palavras em ordem alfabética (utilize o método compareTo da

// classe String),. Informe também, qual das palavras tem o maior número de
// caracteres.

public class Questao11 {
    public static void duasPalavras(String palavra1, String palavra2) {
        System.out.println("Em ordem alfabética: ");
        if (palavra1.compareTo(palavra2) < 0) {
            System.out.println("1. " + palavra1);
            System.out.println("2. " + palavra2);
        } else {
            System.out.println("1. " + palavra2);
            System.out.println("2. " + palavra1);
        }
        System.out.println("A palavra com mais caracteres: " + (palavra1.length() > palavra2.length() ? palavra1 : palavra2));
    }

    public static void main(String[] args) {
        System.out.println("Insira duas palavras: ");
        Scanner sc = new Scanner(System.in);
        String palavra1 = sc.nextLine();
        String palavra2 = sc.nextLine();
        duasPalavras(palavra1, palavra2);
        sc.close();
    }
}
