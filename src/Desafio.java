import java.util.Scanner;

public class Desafio {
    static void main(String[] args) {
        String nome = "Jota";
        String tipoConta = "Corrente";
        double saldo = 1500;
        int opcao = 0;

        System.out.println("**************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***************************");
        String menu = """
                **Digite sua opcao**
                1 - Consultar saldo
                2 - Fazer pix
                3 - Receber valor
                4 - Sair
                ---------------------
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if(opcao == 1){
                System.out.println("O Saldo atual: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor do pix: ");
                double valor = leitura.nextDouble();
                if(valor >saldo) {
                    System.out.println("Nao ha saldo para realizar a transferencia");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atual: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atual: " + saldo);
            } else if (opcao == 4) {
                System.out.println("opcao invalida");
            }

        }
    }
}
