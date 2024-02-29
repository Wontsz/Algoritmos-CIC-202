// 22-2-24
public class MeuVetor{
    // private -> conceito de encapsulamento (proteger os arquivos dentro do codigo) todos atributos precisam ser privados
    private int[] v; // vetor é um₢onjunto de valores por isso o [] // private -> conceito de encapsulamento (proteger os arquivos dentro do codigo)
    private int ultimaPos;
    
    // Metodo construtor e metodos publicos
    public MeuVetor(int capacidade){
        v = new int[capacidade]; // definindo o tamanho do vetor
        ultimaPos = -1;
    }

    // Método Get/de acesso - buscando um valor
    public int getUltimaPos(){ //Getter do UltimaPos
        return ultimaPos;
    }

    // Getter do Vetor
    public int[] getV(){
        return v;
    }

    // Método Setters/modificadores - receber/atribuir um valor a um atributo
    public void setUltimaPos(int pos){
        // estrutura condicional
        if(pos >= 0 && pos < v.length){ // .length = o tamanho do vetor
            ultimaPos = pos;
        }else{
            ultimaPos = v.length-1;
        }
    }

    // Aula 02 22-2-24 
    public boolean estaCheio(){
        return ultimaPos == v.length-1;
    }

    //verificar c o vetor esta vazio
    public boolean estaVazio(){
        return ultimaPos == -1;
    }

    public void adicionaNaPosicao(int elemento, int posicao){
        v[posicao] = elemento;
    }
    private void redimensiona (int novaCapacidade){
        int[] temp = new int[novaCapacidade];
        for(int i=0; i<=ultimaPos; i++){
            temp[i] = v[i];
            v = temp;
        }
    }
    
    public void add(int elemento){
        if(estaCheio()){
            redimensiona(v.length*2);
        }
        ultimaPos++; // ultimaPos = ultimaPos + 1
        v[ultimaPos] = elemento;
    }

    // Aula 03 29-02-24

    public int remove(){
        if(estaVazio()){
            return 0;
        }
        int aux = v[ultimaPos--];
        if (v.length >= 10 && ultimaPos <= v.length/4) {
            redimensiona(v.length/2);
        }
        return aux;
    }
    
    @Override // metodo proprio de uma classe (sobrepor) sobrepoe um objeto (v1 por s)
    public String toString(){
        String s = "";
        if(estaVazio()){
            s = s + "esta vazio!";
        }else{
            for(int i=0; i<=ultimaPos; i++){
                s = s + v[i] + " ";
            }
        }
        return s + "\n";
    }
}