
import java.util.InputMismatchException;
import java.util.Scanner;

// Escreva uma classe para calcular a área de um círculo, sabendo que a área
// é A = PI * r2, onde o raio (r) deve ser informado pelo usuário e o resultado terá
// que ser arredondado.

public class Questao9 {
    public static double areaCirculo(double raio){
        double area = Math.PI * Math.pow(raio, 2);
        return Math.round(area);
    }

    public static void main(String[] args) {
        while (true) { 
            System.out.println("Insira o raio do círculo: ");
            Scanner sc = new Scanner(System.in);
            double raio;
            try {         
                raio = sc.nextDouble();
                sc.close();
                System.out.println("Área do círculo: " + areaCirculo(raio));
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Tente novamente.");
                sc.next();
            }
        }
    }
}
