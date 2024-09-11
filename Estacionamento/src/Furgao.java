public class Furgao extends Veiculo{
    public Furgao(double peso){
        super("Furgão", peso);
        calcularPrecoPorHora();
    }
    @Override
    public void calcularPrecoPorHora(){
        precoPorHora = (peso <= 3) ? 25.00 : 50.00;
    }
}
