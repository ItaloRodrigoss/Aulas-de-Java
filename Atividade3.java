import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar e ler os valores de A e B
        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        // Declarar a variável C
        int C;

        // Verificar se A e B são iguais
        if (A == B) {
            // Somar A e B e atribuir o resultado a C
            C = A + B;
        } else {
            // Multiplicar A por B e atribuir o resultado a C
            C = A * B;
        }

        // Imprimir o valor de C
        System.out.println("O valor de C é: " + C);

        // Fechar o scanner
        scanner.close();
    }
}



