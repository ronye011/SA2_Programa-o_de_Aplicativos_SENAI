package Core;

// Biblioteca
import java.util.Scanner;

public class Linha {
    public static void main(String[] args) {
        desenho(); // Chama a funcao
    }

    //Funcao que solicita tamanho e desenha a linha em '_'
    public static void desenho()
    {
        // Solicita do input do tamanho da linha
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o tamanho da linha: ");
        int tamanho = leitor.nextInt();

        // Imprime a linha
        for(int i = 1; i <= tamanho; i++)
        {
            System.out.print("_");
        }
    }
}
