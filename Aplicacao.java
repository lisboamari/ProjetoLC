public class Aplicacao {

    public static void main(String[] args) throws Exception {

        Cliente cliente = new ClientePF();
        cliente.setIdentificadorCliente("1");
        cliente.setNomeCliente("Guima");

        Cliente cliente2 = new ClientePJ();

        cliente2.setIdentificadorCliente("2");
        cliente2.setNomeCliente("WataEnterprise");

        Conta conta = new ContaCorrente(1, cliente);
        Conta conta2 = new ContaCorrente(2, cliente2);

        conta.depositar(2000);
        System.out.println(conta.getSaldo());

        conta2.depositar(20000);
        System.out.println(conta2.getSaldo());

        conta.sacar(500);
        System.out.println(conta.getSaldo());

        conta.transferir(conta2, 500);
        System.out.println(conta.getSaldo());
        System.out.println(conta2.getSaldo());

        conta.gerarAcidente();
        System.out.println(conta.getSaldo());

        conta2.transferir(conta, 500);
        System.out.println(conta.getSaldo());
        System.out.println(conta2.getSaldo());
    }
}
