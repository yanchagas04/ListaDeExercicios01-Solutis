// Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e
// 100, usando os tipos de dados int e double .

public class Questao7 {

    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {

            if (i % 3 == 0) {
                System.out.println(i + "/2 = " + (int) i / 2 + "   (int)");
                System.out.println(i + "/2 = " + (double) i / 2 + " (double)");
            }
        }
    }
}
