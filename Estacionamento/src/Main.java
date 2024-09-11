public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Garagem garagem = new Garagem();

        while(true){
            System.out.println("Deseja informar um novo veículo?(sim/nao)");
            String resposta = scanner.nextLine();
            if(resposta.equalsIgnoreCase("nao")){
                break;
            }

            System.out.println("Informe o tipo de veículo (Motocicleta, Hatchback, Sedan, SUV, Caminhonete, Furgão):");
            String tipo = scanner.nextLine();

            System.out.println("Informe o peso do veículo em toneladas (use ponto para separar decimal):");
            double peso = scanner.nextDouble();
            scanner.nextLine();

            Veiculo veiculo;

            switch(tipo.toLowerCase()){
                case "motocicleta":
                    veiculo = new Motocicleta(peso);
                    break;
                case "hatchback":
                case "sedan":
                case "suv":
                    veiculo = new CarroDePasseio(tipo, peso);
                    break;
                case "caminhonete":
                    veiculo = new Caminhonete(peso);
                    break;
                case "furgão":
                    veiculo = new Furgao(peso);
                    break;
                default:
                    System.out.println("Tipo de veículo inválido.");
                    continue;
            }
            garagem.calcularPreco(veiculo);
        }
        scanner.close();
    }
}