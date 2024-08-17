
import java.util.Scanner;

public class Questao2 { 
    public static int maiorEntreEles(int i, int j) {
        return i > j ? i : j;
    }
    public static void main(String[] args) {
        System.out.println("Digite dois números inteiros: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println("Maior entre " + i + " e " + j + " = " + maiorEntreEles(i, j));
        sc.close();
    }
}