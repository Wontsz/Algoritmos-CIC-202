import java.util.Scanner;
import java.util.Date;

public class Ordenacao{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MeuVetor v1;
        int tamanho;

        System.out.println("Digite o tamanho para o vetor, 0 encerra: ");
        tamanho = sc.nextInt();

        while(tamanho>0){
            v1 = new MeuVetor(tamanho);
            v1.preencherVetor();

            System.out.println("vetor gerado: \n" + v1);

            long inicio = new Date().getTime();
            int comparacoes = v1.bubbleSort();
            long fim = new Date().getTime();

            System.out.println("vetor ordenado: \n" + v1);
            System.out.println("tamanho: " + tamanho + " demorou: " + (fim - inicio) + "ms" + " comparacoes: " + comparacoes);
            tamanho = sc.nextInt();
        }
        sc.close(); // encerra sc
    }
}