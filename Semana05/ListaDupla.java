// 21/03/24
public class ListaDupla{
    private NoDuplo primeiro;
    private NoDuplo ultimo;

    public boolean estaVazia(){
        return primeiro == null;
    }

    public void insereInicio(int i){
        NoDuplo novo = new NoDuplo(i);
        // inserindo numero |5| -> 26/03/24
        if(estaVazia()){
            // se lista estiver vazia o unico elemento dela vai ser o |5|
            // lista: |3| \\
            ultimo = novo;
        }else{
            // |5|.. |6| |8| |9| |0| -> 26/03/24
            // lista |3| |...| |5| |7| \\
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

    // 26/03/24
    public int removeFim(){
        int temp = ultimo.getInfo();
        // |4| |2| |8|
        ultimo = ultimo.getAnterior();
        // |4| |2|, nó sobrepoe o nó |8|
        if(ultimo == null){
            primeiro = null;
        }else{
            ultimo.setProximo(null);
        }
        return temp;
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