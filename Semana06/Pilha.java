public class Pilha{
    private No topo;

    public boolean estaVazia(){
        return topo == null;
    }

    // empilhar um novo nó na pilha
    public void push(int info){
        No novo = new No(info);
        // |7| .. |4| |5| |3|
        if(!estaVazia()){
            novo.setProximo(topo);
        }
        topo = novo;
    }

    // desempilhar o nó que esta no topo da pilha
    public int pop(){
        int temp = topo.getInfo();
        // |7| |4| |5| |3|
        topo = topo.getProximo();
        // |4| |5| |3|
        return temp;
    }

    @Override
    public String toString(){
        String s = "pilha: ";
        if(estaVazia()){
            s += "vazia";
        }else{
            No aux = topo;
            while(aux != null){
                s += aux + "\n";
                aux = aux.getProximo();
            }
        }
        return s + "\n";
    }

}