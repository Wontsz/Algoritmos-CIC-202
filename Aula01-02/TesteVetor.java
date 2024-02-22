// arquivo de inicio da compilaçao
public class TesteVetor{
    public static void main(String[] args){
        MeuVetor v1 = new MeuVetor(10); // vetor de 10 pos
        //  Classe           Metodo Constr
        // imprime ultimaPos = -1
        System.out.println("Ultima posicao de pois de instanciar: " + v1.getUltimaPos());

        v1.setUltimaPos(4);

        System.out.println("ultima posicao depois do parametro: " + v1.getUltimaPos());
        
        //22-2-24
        if(v1.add(12)){
            System.out.println("Elemento inserido com sucesso!");
            System.out.println("Ultima posição após atribuição: " + v1.getUltimaPos());
        }else{
            System.out.println("Vetor esta cheio!");
        }

        if(v1.add(23)){
            System.out.println("Elemento inserido com sucesso!");
            System.out.println("Ultima posição após atribuição: " + v1.getUltimaPos());
        }else{
            System.out.println("Vetor está cheio!");
        }
    }
}