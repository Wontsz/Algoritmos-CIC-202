// Fila circular
public class Fila{
    private int primeiro;
    private int ultimo;
    private int quantidade;
    private Object[] elementos;

    public static final int CAP_MIN = 10;

    public Fila(){
        elementos = new Object[CAP_MIN];
        primeiro = 0;
        ultimo = elementos.length - 1;
        quantidade = 0;
    }

    public Fila(int capacidade){
        elementos = new Object[elementos]

        primeiro = 0;
        ultimo= elementos.length -1;
        quantidade = 0;
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

    public boolean enfileira(Object o){
        if(estaCheia()) return false;
        ultimo = proxima(ultimo);
        elementos[ultimo] = o;
        quantidade++;
        return true;
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
        if(primeiro <= ultimo){
            for(int i = primeiro; i<=ultimo; i++) s += elementos[i] + " ";
        }else{ // ultimo < primeiro = fila circular
            int i = primeiro;
            do{
                s += elementos[i] + " ";
                i = proxima(i);
            }while(i != ultimo);
        }
        return s;
    }
}