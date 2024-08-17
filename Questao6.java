// Imprima produto dos números de ímpares de 15 a 30, usando os tipos de
// dados int e float.

import java.util.ArrayList;

public class Questao6 {
    public static void main(String[] args) {
        ArrayList<Integer> impares = new ArrayList<>(); 
        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0) {
                impares.add(i);
            }
        }
        int produtoInt = 1;
        float produtoFloat = 1;
        for (int i : impares) {
            produtoInt *= i;
            produtoFloat *= i;
        }
        System.out.println("Produtos dos ímpares de 15 a 30, usando int: " + produtoInt); //passa do limite que números inteiros suportam
        System.out.println("Produtos dos ímpares de 15 a 30, usando float: " + produtoFloat);
    }    
}
