public class CarroDePasseio extends Veiculo{
    public CarroDePasseio(String tipo, double peso){
        super(tipo, peso);
        calcularPrecoPorHora();
    }
    @Override
    public void calcularPrecoPorHora(){
        if (peso > 2){
            tipo = "Furgão";
            precoPorHora = (peso <= 3) ? 25.00 : 50.00;
        }else{
            switch(tipo){
                case "Hatchback":
                    precoPorHora = 13.00;
                    break;
                case "Sedan":
                    precoPorHora = 15.00;
                    break;
                case "SUV":
                    precoPorHora = 20.00;
                    break;
                default:
            }
        }
    }
}
