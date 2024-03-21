public class TesteListaDupla{
    public static void main (String [] args){
        ListaDupla lista = new ListaDupla();

        // imprime que a lista esta vazia
        System.out.println(lista);

        // |30| |20| |10| |50| |120|
        lista.insereInicio(10);
        lista.insereInicio(20);
        lista.insereInicio(30);
        lista.insereFim(50);
        lista.insereFim(120);

        System.out.println(lista);

        lista.removeInicio(); // |20| |10| |50| |120|
        System.out.println(lista);
    }
}