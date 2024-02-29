// arquivo de inicio da compilaçao
public class TesteVetor{
    public static void main(String[] args){
        MeuVetor v1 = new MeuVetor(4); // vetor de 10 pos
        //  Classe           Metodo Constr
        // imprime ultimaPos = -1
        System.out.println("Ultima posicao de pois de instanciar: " + v1.getUltimaPos());

        v1.setUltimaPos(2);
        System.out.println("ultima posicao depois do parametro: " + v1.getUltimaPos());
        System.out.println("vetor apos setUltimapos: " + v1);
        
        // 22-2-24 Aula 01
        // if(v1.add(100)){
        //     System.out.println("Elemento inserido com sucesso!");
        //     System.out.println("Ultima posicao apos atribuicao: " + v1.getUltimaPos());
        //     System.out.println("vetor apos setUltimapos: " + v1);
        // }else{
        //     System.out.println("Vetor esta cheio!");
        // }

        // 29/02-24 Aula 03

        // adiciona um elemento em uma posição e imprime a ulitma posição
        v1.adicionaNaPosicao(4, 2);
        System.out.println("Ultima posicao apos atribuicao: " + v1.getUltimaPos());
        System.out.println("vetor apos setUltimapos: " + v1);

        // incluir elementos no vetor
        for(int i=0; i<=100; i++){
           v1.add(i);
           System.out.println("adicionou: " + i + " capacidade: " + v1.getV().length); 
        }

        // Excluir elemntos do vetor e vai diminuir a capacidade
        while(!v1.estaVazio()){  // ! é negação
            System.out.println(v1.remove() + " foi removido, capacidade: " + v1.getV().length);
        }
    }
}