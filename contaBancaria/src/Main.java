import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int escolha = 0;
        Scanner in = new Scanner(System.in);
        String nome;
        String cpf;
        int depositar;
        int sacar;
        int saldo = 0;

            do {
                        System.out.println("Bem vindo ao APP do banco!");
                        System.out.println("Por favor escolhe a sua opção");
                        System.out.println("");
                        System.out.println("  MENU   ");
                        System.out.println("1. Cadastrar cliente");
                        System.out.println("2. Cadastrar conta corrente ");
                        System.out.println("3. Cadastrar conta poupança ");
                        System.out.println("4. Efetuar deposito");
                        System.out.println("5. Efetuar saque");
                        System.out.println("6. Efetuar transferencia");
                        System.out.println("7. Para sair ");
                        escolha = in.nextInt();


                    switch (escolha) {
                    case 1:
                        System.out.println("Por favor entre o seu nome completo:");
                        nome = in.nextLine();
                        System.out.println("Entre o seu CPF");
                        cpf = in.nextLine();
                        System.out.println("Para voltar tecla 0");
                        escolha = in.nextInt();
                        break;
                    case 2:

                        break;
                    case 3:
                        break;
                    case 4:
                        System.out.println("Saldo atual:" + saldo);
                        System.out.println("Quantos que você deseja depositar?");
                        depositar = in.nextInt();
                        saldo = depositar + saldo;
                        System.out.println("Saldo atual:" + saldo);
                        System.out.println("Para voltar tecla 0");
                        escolha = in.nextInt();

                        break;
                    case 5:
                        System.out.println("Saldo atual:" + saldo);
                        System.out.println("Quantos que você deseja sacar?");
                        sacar = in.nextInt();
                        saldo = saldo - sacar;
                        System.out.println("Saldo atual:" + saldo);
                        System.out.println("Para voltar tecla 0");
                        escolha = in.nextInt();
                        break;

                        case 6:
                            System.out.println("Precisa tranferir para qual conta? ");

                            break;

                }

            }while (escolha != 7);
    }
}