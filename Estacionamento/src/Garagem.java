public class Garagem {
    public boolean aceitarVeiculo(Veiculo veiculo){
        if(veiculo instanceof Motocicleta && veiculo.getPeso() > 400){
            return false;
        }else if(veiculo instanceof Caminhonete && veiculo.getPeso() > 6){
            return false;
        }
        return true;
    }
    public void calcularPreco(Veiculo veiculo){
        if (aceitarVeiculo(veiculo)) {
            System.out.println("Tipo de Veículo: " + veiculo.getTipo());
            System.out.println("Peso: " + veiculo.getPeso() + "ton");
            System.out.println("Preço Hora: R$ " + veiculo.getPrecoPorHora());
        }else {
            System.out.println("Veículo não aceito na garagem.");
        }
    }
}
