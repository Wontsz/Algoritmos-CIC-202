// aula 05/03/2024

public class TesteRandomico{
    public static void main (String[] args){
        MeuVetor v1 = new MeuVetor(6); // definindo o tamanho do vetor
        MeuVetor v2 = new MeuVetor(6);

        v1.preencherVetor(); // limite ate o numero 60
        System.out.println(v1);

        v2.preencherVetor(20); // limite ate o numero 20
        System.out.println(v2);
    }
}