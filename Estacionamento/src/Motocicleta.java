public class Motocicleta extends Veiculo {
    public Motocicleta (double peso){
        super("Motocicleta", peso);
        calcularPrecoPorHora();
    }

    @Override
    public void calcularPrecoPorHora(){
        if(peso <= 100){
            precoPorHora = 2.00;
        }else if(peso <= 299.9){
            precoPorHora = 4.00;
        }else{
            precoPorHora = 10.00;
        }
    }
}
