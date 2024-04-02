public class TesteNo2{
    public static void main(String[] args){
        Carta c1 = new Carta(2, "ouros");
        Carta c2 = new Carta(3, "copas");

        No2<Carta> no1 = new No2<Carta>(c1);
        No2<Carta> no2 = new No2<Carta>(c2);

        No2<String> no3 = new No2<>("Hello World");

        No2<No2> no4 = new No2<>(no1);

        System.out.println("carta 1: " + c1);
        System.out.println("no 1: " + no1);
        System.out.println("carta 2: " + c2);
        System.out.println("no 2: " + no2);
        System.out.println("no 3: " + no3);
        System.out.println("no 4: " + no4);
    }
}