public class TesteVetor{
    public static void main(String[] args){
        MeuVetor v1 = new MeuVetor(10); // vetor de 10 pos
    //  Classe           Metodo Constr
    // impriime ultimaPos = -1
    System.out.println("Ultima posicao de pois de instanciar:" + v1.getUltimaPos());

    v1.setUltimaPos(20);

    System.out.println("ultima posicao depois do parametro 27 " + v1.getUltimaPos());
    }
}