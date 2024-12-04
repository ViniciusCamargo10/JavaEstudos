import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar que o usuário digite a idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();  // Lê um número inteiro

        // Verificar a categoria de idade com if
        if (idade < 18) {
            System.out.println("Você é menor de idade.");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("Você é adulto.");
        } else {
            System.out.println("Você é idoso.");
        }

        // Fechar o scanner
        scanner.close();

        for (int i = 2; i < 10; i++) {
            System.out.println(i);

        }
        int contador = 2;
        while (contador <= 10) {
            System.out.println("Contador: " + contador);
            contador += 2;
        }
    }
}