public class MeuVetor{
    // private -> conceito de encapsulamento (proteger os arquivos dentro do codigo) todos atributos precisam ser privados
    private int[] v; // vetor é um₢onjunto de valores por isso o [] // private -> conceito de encapsulamento (proteger os arquivos dentro do codigo)
    private int ultimaPos;
    
    // Metodo construtor e metodos publicos
    public MeuVetor(int capacidade){
        v = new int[capacidade]; // definindo o tamanho do vetor
        ultimaPos = -1;
    }

    // Método Get/ - buscando um valor
    public int getUltimaPos(){ //Getter do UltimaPos
        return ultimaPos;
    }

    // Getter do Vetor
    public int[] getV(){
        return v;
    }

    // Setters - receber/atribuir um valor
    public void setUltimaPos(int pos){
        // estrutura condicional
        if(pos >= 0 && pos < v.length){ // .length = o tamanho do vetor
            ultimaPos = pos;
        }else{
            ultimaPos = v.length-1;
        }
    }
}