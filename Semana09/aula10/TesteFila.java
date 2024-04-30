public class TesteFila{
    public static void main(String[] args){
        filaUser.enfileira("mateus");
        filaUser.enfileira(9);
        filaUser.enfileira(12);
        filaUser.enfileira(14); //indice = 4
        filaUser.enfileira("teste"); // indice = 5
        filaUser.enfileira(18); // indice = 6
        System.out.println(filaUser)
        filaUser.desenfileira(); // 7 sai da fila
        // e o indice 0 fica vago
        filaUser.enfileira(23); // indice 0
        System.out.println(filaUser);

        System.out.println("========");
        for(int i=0; i < tamanho; i++){
            System.out.println(filaUser.elementos[i]);
        }
    }
}