// aula 05/03/2024
import java.util.Scanner;

public class TesteRandomico{
    public static void main (String[] args){
        MeuVetor v1 = new MeuVetor(6); // definindo o tamanho do vetor
        MeuVetor v2 = new MeuVetor(6);

        v1.preencherVetor(); // limite ate o numero 60
        System.out.println("v1: " + v1);

        v2.preencherVetor(20); // limite ate o numero 20
        System.out.println("v2: " + v2);

        // Busca Simples
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Digite um valor para a busca simples: ");
        // int valorPesquisado = sc.nextInt();

        // int posicao = v1.buscaSimples(valorPesquisado);

        // if(posicao != -1){
        //     System.out.println("Valor encontrado na posicao de indice " + posicao);
        // }else{ // posição == -1
        //     System.out.println("Valor nao encontrado");
        // }

        // // Busca Binária
        // v2.bubbleSort(); // para que a busca binaria funcione o vetor deve estar ordenado

        // System.out.println("Digite um valor para busca binaria: ");
        // valorPesquisado = sc.nextInt();
        // posicao = v2.buscaBinaria(valorPesquisado);

        // if(posicao != -1){
        //     System.out.println("Valor encontrado na posicao de indice " + posicao);
        // }else{
        //     System.out.println("Valor nao encontrado");
        // }
    }
}