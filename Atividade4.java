import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar e ler o número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Calcular o antecessor e o sucessor
        int antecessor = numero - 1;
        int sucessor = numero + 1;

        // Imprimir o antecessor e o sucessor
        System.out.println("O antecessor de " + numero + " é: " + antecessor);
        System.out.println("O sucessor de " + numero + " é: " + sucessor);

        // Fechar o scanner
        scanner.close();
    }
}

