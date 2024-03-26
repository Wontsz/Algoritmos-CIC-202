import java.util.Random;
public class TesteListaDupla{
    public static void main (String [] args){
        ListaDupla lista = new ListaDupla();
        Random r = new Random();

        // imprime que a lista esta vazia
        //System.out.println(lista);

        // |30| |20| |10| |50| |120|
        // lista.insereInicio(10);
        // lista.insereInicio(20);
        // lista.insereInicio(30);
        // lista.insereFim(50);
        // lista.insereFim(120);

        // System.out.println(lista);

        //26/03/24
        for(int i=1; i<=10; i++){
            lista.insereInicio(r.nextInt(10));
        }
        System.out.println(lista);
        // insere 10 nós no final da lista
        for(int i=1; i<=10; i++){
            lista.insereFim(r.nextInt(10));
        }
        System.out.println(lista);

        lista.removeInicio(); // |20| |10| |50| |120|
        System.out.println(lista);

        lista.removeFim();
        System.out.println(lista);
    }
    
}