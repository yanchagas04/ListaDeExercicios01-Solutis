// Os motoristas se preocupam com a quilometragem obtida por seus
// automóveis. Um
// motorista monitorou vários tanques cheios de gasolina registrando a
// quilometragem dirigida e a quantidade de combustível em litros utilizados para
// cada tanque cheio. Desenvolva um aplicativo Java que receba como entrada
// os quilômetros dirigidos e os litros de gasolina consumidos (ambos com
// inteiros) para cada tanque cheio. O programa deve calcular e exibir o consumo
// em quilômetros/litro para cada tanque cheio e imprimir a quilometragem
// combinada e a soma total de litros de combustível consumidos até esse ponto.
// Todos os cálculos de média devem produzir resultados de ponto flutuante.

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao12 {
    public static int [] cadeiaParaVetorDeInteiro (String cadeia) throws ArrayIndexOutOfBoundsException{
        String [] vet = cadeia.split(" ");
        int [] vetInt = new int[vet.length];
        for (int i = 0; i < vet.length; i++) {
            vetInt[i] = Integer.parseInt(vet[i]);
        }
        return vetInt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) { 
            try {
                System.out.println("Insira os valores dos quilômetros dirigidos (separados por espaços):");
                int [] quilometros = cadeiaParaVetorDeInteiro(sc.nextLine());
                System.out.println("Insira os valores dos litros de gasolina consumidos (separados por espaços):");
                int [] litros = cadeiaParaVetorDeInteiro(sc.nextLine());
                int litrosTotal = 0;
                int quilometragemTotal = 0;
                for (int i = 0; i < quilometros.length; i++) {
                    quilometragemTotal += quilometros[i];
                    litrosTotal += litros[i];
                    DecimalFormat df = new DecimalFormat("#.00");
                    df.setRoundingMode(RoundingMode.HALF_EVEN);
                    System.out.println("Consumo do tanque " + (i + 1) + ": " + df.format((double) quilometros[i] / litros[i]) + " km/l");
                }
                System.out.println("Quilometragem total: " + quilometragemTotal + " km");
                System.out.println("Litros total: " + litrosTotal + " l");
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Entrada inválida. Tente novamente.");
                sc.next();
            }
        }
        sc.close();
    }
}
