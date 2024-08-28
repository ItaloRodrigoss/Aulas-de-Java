import java.util.Scanner;

public class Atividade8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita as informações ao usuário
        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempo = scanner.nextDouble();

        System.out.print("Digite a velocidade média durante a viagem (em km/h): ");
        double velocidadeMedia = scanner.nextDouble();

        // Calcula a distância percorrida
        double distanciaPercorrida = tempo * velocidadeMedia;

        // Calcula a quantidade de litros utilizados
        double litrosUsados = distanciaPercorrida / 12;

        // Exibe os resultados
        System.out.println("\nResultados da viagem:");
        System.out.printf("Tempo gasto: %.2f horas\n", tempo);
        System.out.printf("Velocidade média: %.2f km/h\n", velocidadeMedia);
        System.out.printf("Distância percorrida: %.2f km\n", distanciaPercorrida);
        System.out.printf("Quantidade de litros utilizados: %.2f litros\n", litrosUsados);

        scanner.close();
    }
}
