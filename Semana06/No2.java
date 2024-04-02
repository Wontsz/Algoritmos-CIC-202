public class No2<Info>{
    private Info info;
    //elemento abaixo do nó na pilha
    private No2 proximo;

    // construtor
    public No2(Info info){
        this.info = info;
        this.proximo = null;
    }

    //getters
    public Info getInfo(){
        return info;
    }
    public No2 getProximo(){
        return proximo;
    }

    //setters
    public void setInfo(Info info){
        this.info = info;
    }
    public void setProximo(No2 proximo){
        this.proximo = proximo;
    }

    @Override
    public String toString(){
        return "|" + info + "|";
    }
}