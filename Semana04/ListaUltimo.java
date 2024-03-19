public class ListaUltimo extends Lista{
    // private No primeiro

    private No ultimo;

    // construtor padrão

    public No getUltimo(){
        return ultimo;
    }

    @Override // sobrepor os métodos da classe mae (Lista)
    public void insereFim(int i){
        No novo = new No(i);
        if(estaVazia()){
            setPrimeiro(novo);
        }else{
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }
}