public class ContaPoupanca extends Conta {  

        
    public ContaPoupanca() {}

    public ContaPoupanca(int numeroConta, Cliente cliente) {
        super(numeroConta, cliente);
        
    }

    @Override
    public void gerarAcidente() {
        saldo=saldo*1.005;
        System.out.println("Juros adicionados");
      }
    
}
