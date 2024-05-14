import java.util.Random;

public class TesteABB{
    public static void main(String[] args){
        Random r = new Random();
        ABB abb = new ABB();

        for(int i=1; i<=12; i++){
            int n = r.nextInt(12);
            System.out.print(n + " ");
            abb.insere(n);
        }
        System.out.println("\n a arvore: \n" + 
        abb.inOrder());
    }
}