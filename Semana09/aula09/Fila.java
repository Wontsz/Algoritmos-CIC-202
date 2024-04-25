public class Fila <E>{
    private No<E> primeiro;
    private No<E> ultimo;

    // estamos usando o construtor padrão

    public boolean estaVazia(){
        return primeiro == null;
    }

    public void enfileira(E i){
        No<E> novo = new No<>(i); // |8|
        // |5| > |7| > |9|
        if(estaVazia()){
            primeiro = novo;
        }else{ // lista não está vazia
            ultimo.setProximo(novo);
            // |8| > |5| > |7| > |9|
        }
        ultimo = novo;
    }

    public E desenfileira(){
        if(estaVazia()) return null;
        E temp = primeiro.getInfo();

        // |8| > |5| > |7| > |9|
        primeiro = primeiro.getProximo();
        // |8| > |5| > |7|

        if(primeiro == null){
            ultimo = null;
        }
        return temp;
    }
    @Override
    public String toString(){
        if(estaVazia()) return "fila vazia";
        String s = "";
        No<E> aux = primeiro;
        while(aux != ultimo){
            s += aux + " - ";
            aux = aux.getProximo();
        }
        s += aux;
        return s;
    }

}

class No <E>{
    private E info;
    private No<E> proximo;

    // construtor
    public No(E info){
        this.info = info;
        setProximo(null);
    }

    public E getInfo(){
        return info;
    }

    public No<E> getProximo(){
        return proximo;
    }

    public void setInfo(E info){
        this.info = info;
    }

    public void setProximo(No<E> proximo){
        this.proximo = proximo;
    }

    @Override
    public String toString(){
        return "" + info;
    }
}
