// 21/03/24
public class ListaDupla{
    private NoDuplo primeiro;
    private NoDuplo ultimo;

    public boolean estaVazia(){
        return primeiro == null;
    }

    public void insereInicio(int i){
        NoDuplo novo = new NoDuplo(i);
        if(estaVazia()){
            // lista: |3|
            ultimo = novo;
        }else{
            // lista |3| |...| |5| |7|
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
        }
        primeiro = novo;
    }

    public void insereFim(int i){
        NoDuplo novo = new NoDuplo(i);
        if(estaVazia()){
            // lista: |3|
            primeiro = novo;
        }else{
            // lista: |5| |7| .. |3|
            novo.setAnterior(ultimo);
            ultimo.setProximo(novo);
        }
        ultimo = novo; // ultimo = 3 
    }

    public int removeInicio(){
        // lista: |5| |7| |3|
        // lista: |5| null
        int aux = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        // |5| = |7| ->> |7| |3|
        if(estaVazia()){
            ultimo = null;
        }else{
            primeiro.setAnterior(null);
        }
        return aux;
    }

    @Override
    public String toString(){
        String s = "Lista: ";
        if(estaVazia()){
            s += "vazia";
        }else{
            NoDuplo temp = primeiro;
            while(temp != null){
                s += temp;
                temp = temp.getProximo();
            }
            s += "\\\\";
        }
        return s;
    }
}