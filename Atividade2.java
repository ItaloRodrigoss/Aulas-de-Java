import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int numb = scanner.nextInt();

        int valor = numb;

        if (numb % 2 == 0) {
            System.out.println("O número é par");

        } else {
            System.out.println("O número é Impar");
        }
        // Verificar se o número é positivo ou negativo
        if (numb > 0) {
            System.out.println("O número é positivo.");
        } else if (numb < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
    }
}



