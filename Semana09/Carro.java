public class Carro {
    private String placa;
    private int anoFab;
    
    // construtor que atribui valores iniciais para os
    // dois atributos da classe Carro
    public Carro(String placa, int anoFab){
        this.placa = placa;
        this.anoFab = anoFab;
    }

    //getters
    public String getPlaca(){
        return placa;
    }

    public int getAnoFab(){
        return anoFab;
    }

    //setters
    public void setPlaca(String placa){
        this.placa = placa;
    }

    public void setAnoFab(int anoFab){
        this.anoFab = anoFab; 
    }

    @Override
    public String toString(){
        return "[placa=" + placa + ", anoFab=" 
        + anoFab + "]";
    }
}