public class Rua {
    public static void main(String[] args){
        Fila<Carro> f = new Fila<>();
        System.out.println(f);

        Carro c1 = new Carro("ABC1234",2020);
        Carro c2 = new Carro("XYZ9876",2024);

        f.enfileira(c1);
        System.out.println(f);

        f.enfileira(c2);
        System.out.println(f);

        f.enfileira(new Carro("FGH8909",2018));
        System.out.println(f);

        System.out.println(f.desenfileira() +
        "saiu da fila");
        System.out.println(f);
    }  
}
