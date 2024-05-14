public class ABB{
    private No raiz;
    public boolean estaVazia(){
        return raiz == null;
    }
    public void insere(int i){
        No novo = new No(i);
    }
    void insereRec(No novo, No atual) {
        if (novo.getInfo() <= atual.getInfo()) {
            if (atual.getEsquerda() == null) 
                atual.setEsquerda(novo);
            else 
                insereRec(novo, atual.getEsquerda());
            }
        else {
            if (atual.getDireita() == null) 
                atual.setDireita(novo);
            else 
                insereRec(novo, atual.getDireita());
        }
    }
}