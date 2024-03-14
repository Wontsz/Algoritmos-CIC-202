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
}
