public class No {
    private int info;
    private No esquerda;
    private No direita;

    public int getInfo(){
        return info;
    }

    public No getEsquerda(){
        return esquerda;
    }

    public No getDireita(){
        return direita;
    }

    public void setInfo(int info){
        this.info = info;
    }

    public void setEsquerda(No esquerda){
        this.esquerda = esquerda;
    }

    public void setDireita(No direita){
        this.direita = direita;
    }

    public No(int info){
        this.info = info;
    }

    @Override
    public String toString(){
        return "[" + info + info "]";
    }
}