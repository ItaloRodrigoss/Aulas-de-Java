import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Informe o Salario minimo:");
        int min = scanner.nextInt();

        System.out.print("Informe o seu salario:");
        int salario = scanner.nextInt();

       int total = salario/min;

        System.out.println("O usuario ganha: "+ total +" Salarios minimos.");

    }

}
