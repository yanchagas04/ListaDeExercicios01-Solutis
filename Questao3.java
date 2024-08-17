// Crie uma classe e na função main() implemente um programa que lê um
// número inteiro do teclado e imprime todos os números primos menores que ele
// (divisíveis por 1 ou por ele mesmo).

import java.util.Scanner;

public class Questao3 {
    public static boolean numeroPrimo(int n) {
        boolean primo = true; //assumimos que o número é primo
        for (int i = 2; i < n; i++) {
            if (n % i == 0 && i != n) { //até acharmos um divisor que faça com que a divisão do número por esse divisor não tenha resto              
                primo = false;          //e que esse divisor não seja o próprio número
                break;
            }
        }
        return primo;
    }

    public static void primosMenores(int n){
        for (int i = 2; i < n; i++) {
            if (numeroPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Insira um número inteiro: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Numeros primos menores que " + n + ":");
        primosMenores(n);
        sc.close();
    }
}
