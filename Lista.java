package Core;

// Biblioteca
import java.util.Arrays;

public class Lista {
    public static void main(String[] args) {
        // Lista
        int[] lists = {5, 7, 2, 9, 4, 1, 3};

        // Teste de número maximo e minimo da lista
        int max = 0;
        int min = lists[0];
        for (int list : lists) {
            if (max < list) {
                max = list;
            }
            if (min > list) {
                min = list;
            }
        }

        // Impressão das informações
        System.out.println("O tamanho da lista é: " + lists.length +
                "\nO maior valor da lista é: " + max +
                "\nO menor valor da lista é: " + min);

        // Soma dos valores
        int sum = Arrays.stream(lists).sum();
        System.out.println("A soma dos valores da lista é igual a: " + sum);

        // Ordenação
        Arrays.sort(lists);
        System.out.println("A lista ordenada em ordem crecente é igual a: " + Arrays.toString(lists));

        for(int i = 0; i < lists.length; i++){
            for(int j = 0; j < lists.length; j++){
                if (lists[i] > lists[j]){
                    int temp = lists[i];
                    lists[i] = lists[j];
                    lists[j] = temp;
                }
            }
        }
        System.out.println("A lista ordenada em ordem decrescente é igual a: " + Arrays.toString(lists));
    }
}