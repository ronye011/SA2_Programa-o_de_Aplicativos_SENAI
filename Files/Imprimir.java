package Core;

// Biblioteca
import java.util.Scanner;

public class Imprimir {
    public static void main(String[] args) {

        // Solicita do input do tamanho de elementos
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o tamanho de elementos na lista: ");
        int tamanho = leitor.nextInt();
        String[] lista = new String[tamanho];

        // Solicita os elementos
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i + 1) + "° elemento: ");
            lista[i] = leitor.next();
        }
        System.out.print("\n");
        imprimir(lista);
    }

    //Funcoes de impressao
    public static void imprimir(String dados[]) {
        for(int i = 0; i < dados.length; i++)
        {
            System.out.println(dados[i] + "- Esse é o " + (i + 1) + "° elemento");
        }
    }
}
