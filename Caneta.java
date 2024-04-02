public class Caneta{

    private String cor;
    public double tamanho;
    private String marca; 
    private boolean tampada;
    
    public Caneta(String cor, double tamanho, String marca, boolean tampada) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.marca = marca;
        this.tampada = tampada;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    




}
