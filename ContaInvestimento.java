public class ContaInvestimento extends Conta {

    public ContaInvestimento() {
    }

    public ContaInvestimento(int numeroConta, Cliente cliente) {
        super(numeroConta, cliente);

    }

    @Override
    public void gerarAcidente() {
        if (this.cliente instanceof ClientePF) {

            saldo = saldo * 1.01;
            System.out.println("Rendimentos adicionados");
        }else {
            
            saldo = saldo * 1.03;
            System.out.println("Rendimentos adicionados");
        }
    }

}
