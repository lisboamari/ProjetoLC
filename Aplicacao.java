public class Aplicacao {
    public static void main(String[] args) throws Exception {

// Efetua testes unitários do Banco Let's Code
        System.out.println(" Banco Let's Code ");
        System.out.println(" ================\n");

// Instanciando objetos ClientePF e ClientePJ para os testes
        System.out.println(" Instanciando clientePF Guima e clientePJ WataEnterprise.");
        Cliente cliente = new ClientePF();
        cliente.setIdentificadorCliente("1");
        cliente.setNomeCliente("Guima");

        Cliente cliente2 = new ClientePJ();
        cliente2.setIdentificadorCliente("2");
        cliente2.setNomeCliente("WataEnterprise");

        Conta conta = new ContaCorrente(1, cliente);
        Conta conta2 = new ContaCorrente(2, cliente2);


        System.out.printf("\n Instancia os saldos iniciais das contas:");
        conta.depositar(2000);
        System.out.printf("\n Saldo inicial da contaPF: R$ %.2f.",conta.getSaldo());
        conta2.depositar(20000);
        System.out.printf("\n Saldo inicial da contaPJ: R$ %.2f. \n",conta2.getSaldo());
        
        System.out.printf("\n Efetua saque de R$ 500 na conta e mostra o saldo: ");
        conta.sacar(500);
        System.out.printf("\n Saldo contaPF, apos o saque: R$ %.2f. \n",conta.getSaldo());

        System.out.printf("\n Transfere valor de R$ 500 da contaPF para contaPJ e mostra saldos: ");
        conta.transferir(conta2, 500);
        System.out.printf("\n Saldo origem contaPF : R$ %.2f.",conta.getSaldo());
        System.out.printf("\n Saldo destino contaPJ: R$ %.2f. \n",conta2.getSaldo());

        System.out.printf("\n Mostra a dedução da");
        conta.gerarAcidente();
        System.out.printf(" Saldo da contaPF: R$ %.2f. \n",conta.getSaldo());

        System.out.printf("\n Transfere valor de R$ 500 da contaPF para contaPJ e mostra os saldos: ");
        conta2.transferir(conta, 500);
        System.out.printf("\n Saldo origem contaPJ : %.2f.",conta.getSaldo());
        System.out.printf("\n Saldo destino contaPF: %.2f. \n",conta2.getSaldo());
        System.out.println(" Obs.: mostra o abate da taxa de 0,5% na contaPJ.");
        
    }
}
