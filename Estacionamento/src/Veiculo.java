public abstract class Veiculo {
    protected String tipo;
    protected double peso;
    protected double precoPorHora;

    public Veiculo(String tipo, double peso){
        this.tipo = tipo;
        this.peso = peso;
    }
    public abstract void calcularPrecoPorHora();

    public String getTipo(){
        return tipo;
    }
    public double getPeso(){
        return peso;
    }
    public double getPrecoPorHora(){
        return precoPorHora;
    }
}
