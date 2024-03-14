public class No{
    private int info;
    private No proximo;

    public No(int info){
        setInfo(info);
        proximo = null;
    }

    // getters
    public int getInfo(){
        return info;
    }
    public No getProximo(){
        return proximo;
    }

    // setters
    public void setInfo(int info){
        this.info = info;
    }
    public void setProximo(No proximo){
        this.proximo = proximo;
    }
    @Override
    public String toString(){
        return "|" + info + "| ->";
    }


}