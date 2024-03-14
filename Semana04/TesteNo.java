public class TesteNo{
    public static void main(String[] args){
        No no1 = new No(10); // no1: proximo = null; info = 10;
        No no2 = new No(20); // no2: proximo = null; info = 20;

        System.out.println("no1: " + no1);
        System.out.println("no2: " + no2);

        no1.setProximo(no2);
        System.out.println("Proximo de no1: " + no1.getProximo());
        // no2.setProximo(no2);
        // System.out.println("Proximo de no2: " + no2.getProximo());
    }
}