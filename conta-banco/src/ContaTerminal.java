import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

    //Conhecer e importar a classe Scanner

    //Exibir as mensagens para o usuário

    //Obter pela Scanner os valores digitados no terminal

    //Exibir a mensagem conta craiada

        Scanner Conta = new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência! ");
        agencia = Conta.next();

        System.out.println("Por favor, digite o seu nome! ");
        nomeCliente = Conta.next();

        System.out.println("Por favor, digite o número da conta! ");
        numero = Conta.nextInt();


        System.out.println("Por favor, digite o seu saldo");
        saldo = Conta.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + ", e seu saldo " + saldo + " já está disponivel para saque!");

        Conta.close();
    
    }
}
