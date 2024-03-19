public class Lista {
    private No primeiro;

    public boolean estaVazia(){
        return primeiro == null;
    }

    public void insereInicio(int i){
        No novo = new No(i);
        if(!estaVazia()){ // verdadeiro se a lista nn estiver vazia
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }

    // get
    public No getPrimeiro(){
        return primeiro;
    }

    public void setPrimeiro(No primeiro){
        this.primeiro = primeiro();
    }

    @Override
    public String toString() {
        String s = "lista";
        if(estaVazia()){
            s += "vazia";
        }else{
            No temp = primeiro; // primeiro -> proximo
            while (temp != null) {
                s += temp;
                temp = temp.getProximo();
            }
            s += "\\\\";
        }
        return s + "\n";
    }

    public void insereFim(int i){
        No novo = new No(i);

        if(estaVazia()){
            primeiro = novo;
        }else{
            No aux = primeiro;
            while(aux.getProximo() != null){ // percorre ate a ultima pos
                aux = aux.getProximo();
            }
            aux.setProximo(novo);
        }
    }

    // remove elementos no inicio da lista
    public int removeInicio(){
        int temp = primeiro.getInfo();
        primeiro = primeiro.getProximo(); // substituindo um elemento por outro
        return temp;
    }

    // remove elemento no final da lista
    public int removeFim(){
        int temp;
        if(primeiro.getProximo() == null){
            temp = primeiro.getInfo();
            primeiro = null;
        }else{
            No aux = primeiro;
            // objetivo do while: atingir a penultima posicao da lista
            while(aux.getProximo().getProximo() != null){ // chega na penultima posição
                aux = aux.getProximo();
            }
            temp = aux.getProximo().getInfo();
            aux.setProximo(null);
        }
        return temp;
    }
}

