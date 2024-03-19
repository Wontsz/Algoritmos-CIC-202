import java.util.Random;

public class TesteLista {
    public static void main(String[] args){
        Random r = new Random();
        Lista lista = new Lista();
        System.out.println(lista);

        // for(int i=1; i<=10; i++){
        //     lista.insereInicio(r.nextInt(10));
        //     System.out.println(lista);
        // }

        // inicio: 9, 7, 5, 3, 1
        for(int i =1; i < 10; i+=2){
            lista.insereFim(i);
            System.out.println(lista);
        }

        if(lista.estaVazia()){
            System.out.println("Lista vazia, nao ha o que remover");
        }else{
            System.out.println(lista.removeInicio() + " foi removido do inicio.");
            System.out.println(lista.removeFim() + " foi removido do fim.");
        }
    }
}
