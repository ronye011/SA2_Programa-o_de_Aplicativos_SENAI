package Core;

// Biblioteca
import java.util.Scanner;

public class Media_de_20 {
    public static void main(String[] args) {
        // Array de inicialização
        float[] valores = new float[20];

        // Input de valores
        Scanner leitor = new Scanner(System.in);
        for(int i = 0; i < 20; i++) {
            System.out.print("Digite " + (i + 1) + " valores: ");
            valores[i] = leitor.nextFloat();
        }

        // Soma do array
        float sum = 0;
        for (float v : valores) {
            sum += v;
        }

        // Média
        System.out.println("\nMedia dos valores: " + sum / valores.length);

        // Teste de número maximo e minimo da lista
        float max = 0;
        float min = valores[0];
        for (float valor : valores) {
            if (max < valor) {
                max = valor;
            }
            if (min > valor) {
                min = valor;
            }
        }
        System.out.println("O maior dos valores é: " + max + "\nO menor dos valores é: " + min);
    }
}
