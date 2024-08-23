import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar e ler os valores de A, B e C
        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int C = scanner.nextInt();

        // Calcular a soma de A e B
        int soma = A + B;

        // Imprimir a soma
        System.out.println("A soma entre A e B é: " + soma);

        // Verificar se a soma é menor que C e imprimir o resultado
        if (soma < C) {
            System.out.println("A soma é menor que C.");
        } else {
            System.out.println("A soma não é menor que C.");
        }

        // Fechar o scanner
        scanner.close();
    }
}