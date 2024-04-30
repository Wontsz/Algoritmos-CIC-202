// Fila circular
public class FilaGenerica <E>{
    private int primeiro;
    private int ultimo;
    private int quantidade;
    private E[] elementos; // vetor de elementos do tipo de dado generico

    public static final int CAP_MIN = 10;

    public FilaGenerica(){
        //elementos = new Object[CAP_MIN];
        elementos = capacidade > 10 ? (E[]) new Object[capacidade] : (E[] new Object[CAP_MIN]);
        primeiro = 0;
        ultimo = elementos.length - 1;
        quantidade = 0;
    }

    public FilaGenerica(int capacidade){
        this(CAP_MIN);
    }

    public boolean estaVazia(){
        return quantidade == 0;
    }

    public boolean estaCheia(){
        return quantidade == elementos.length;
    }

    public int proxima(int posicao){
        return (posicao+1) % elementos.length
    }

    public E enfileira(){
        if(estaCheia()) return false;
        E temp = elementos[primeiro];
        primeiro = proxima(primeiro);
        quantidade--;
        return temp;
    }

    public Object desenfileira(){
        if(estaVazia()) return null;
        Object temp = elementos[primeiro];
        primeiro = proxima(primeiro);
        quantidade--;
        return temp;
    }

    @Override
    public String toString(){
        if(estaVazia()) return "fila vazia!";
        String s = "";
        int i = primeiro;
        do{
            s += elementos[i] + "\n";
            i - proxima(i);
        }while(i != proxima(ultimo));
        return s;
    }
}