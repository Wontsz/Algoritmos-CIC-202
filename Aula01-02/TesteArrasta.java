// 12/03/24
public class TesteArrasta{
    public static void main(String[] args){
        MeuVetor v1 = new MeuVetor(10);

        for(int i=0; i<=50; i+=10){
            v1.add(i);
        }
        System.out.println(v1);

        v1.adiciona(-1,3); // inserir elemento(-1) na pos x(3)
        System.out.println(v1);

        v1.adiciona(-2,27);
        System.out.println(v1);

        System.out.print("==============\n");

        double elemento = v1.remove(3);
        System.out.println("elemento exlcuido: " + elemento);
        System.out.println(v1);

        elemento = v1.remove(17);
        System.out.println("elemento excluido: " + elemento);
        System.out.println(v1);
    }
}