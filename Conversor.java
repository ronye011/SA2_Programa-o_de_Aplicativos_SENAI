package Core;

// Biblioteca
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        // Solicita do input das horas
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a hora a ser convertido em segundos: ");
        int horas = leitor.nextInt();

        // Calculo | Process
        int segundos = horas * 3600;

        // Output
        System.out.println("A hora em segundos é igual à: " + segundos);
    }
}
