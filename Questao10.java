
import java.util.Scanner;

// Escreva uma classe que conte a quantidade de vogais, espaços em
// brancos e consoantes de uma cadeia de caracteres.

public class Questao10 {
    public static void vogaisEspacosConsoantes(String palavra) {
        int vogais = 0, espacos = 0, consoantes = 0;
        palavra = palavra.toLowerCase();
        for (char c : palavra.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                vogais++;
            else if (c == ' ')
                espacos++;
            else if (c >= 'a' && c <= 'z')
                consoantes++;
        }
        System.out.println("Vogais: " + vogais + "\nEspacos em branco: " + espacos + "\nConsoantes: " + consoantes);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma cadeia de caracteres: ");
        String palavra = sc.nextLine();
        vogaisEspacosConsoantes(palavra);
        sc.close();
    }
}
