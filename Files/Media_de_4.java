package Core;

// Biblioteca
import java.util.Scanner;

public class Media_de_4 {
    public static void main(String[] args) {

        // Array de inicialização
        float[] valor = new float[10];

        // Input de valores
        Scanner leitor = new Scanner(System.in);
        for(int i = 0; i < 4; i++) {
            System.out.print("Digite " + (i + 1) + " valor: ");
            valor[i] = leitor.nextFloat();
        }

        // Soma do array
        float sum = 0;
        for (float v : valor) {
            sum += v;
        }

        // Média
        float med = (sum / valor.length);

        // Resultado
        if (med > 1)
        {
            System.out.println("\nPositivo");
        }
        else {
            System.out.println("\nNegativo");
        }
    }
}
