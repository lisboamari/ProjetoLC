public class ContaPoupanca extends Conta {  

        
    public ContaPoupanca() {}

    public ContaPoupanca(int numeroConta, String titular) {
        super(numeroConta, titular);
        
    }

    @Override    
    public void gerarAcidente() {
        saldo=saldo*1.005;
        System.out.println("Juros adicionados");
      }
    
}
