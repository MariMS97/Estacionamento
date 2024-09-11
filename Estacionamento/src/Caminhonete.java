public class Caminhonete extends Veiculo{
    public Caminhonete(double peso){
        super("Caminhonete", peso);
        calcularPrecoPorHora();
    }
    @Override
    public void calcularPrecoPorHora(){
        precoPorHora = (peso <= 3) ? 25.00 : 50.00;
    }
}
