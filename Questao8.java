
import java.util.Scanner;

// Criar uma classe Java que receba uma palavra (String) retorne uma
// mensagem caso a
// palavra fornecida seja uma palavra que pode ser lida da esquerda pra direita
// ou da direita pra esquerda obtendo-se a mesma palavra. Ex.: Ana, arara, osso,
// etc.

public class Questao8 {
    public static void palindromo(String palavra) {
        String palavraInvertida = "";
        for (int i = palavra.length() - 1; i >= 0; i--){
            palavraInvertida = palavraInvertida + palavra.charAt(i);
        }
        if (palavra.equals(palavraInvertida)) {
            System.out.println("A palavra " + palavra + " é um palindromo!");
        } else {
            System.out.println("A palavra " + palavra + " não é um palindromo!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Insira uma palavra: ");
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        palindromo(palavra);
        sc.close();
    }
}
