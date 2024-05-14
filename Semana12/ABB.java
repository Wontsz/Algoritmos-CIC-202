public class ABB {
    private No raiz;
    public boolean estaVazia() {
        return raiz == null;
    }
    public void insere(int i) {
        No novo = new No(i);
        if (estaVazia()) 
            raiz = novo;
        else 
            insereRec(novo, raiz);
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

        // imprimir os valores em cada nó da árvore
        // em ordem crescente
        public String inOrder(){
            if(estaVazia()) return "arvore vazia";
            return inOrderRec(raiz);
        }
        
        public String inOrderRec (No atual) {
            if (atual == null) return "";
            return
                inOrderRec(atual.getEsquerda()) +
                " " + atual.getInfo() + 
                inOrderRec(atual.getDireita());
        }
    }
