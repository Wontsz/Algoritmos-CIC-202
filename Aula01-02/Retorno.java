public class Retorno {
    private int contador;
    private boolean achou;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

   public boolean getAchou(){
        return achou;
    }

    public void incrementaContador(){
        contador++;
    }

    public void setAchou(boolean achou){
        this.achou = achou;
    }
}