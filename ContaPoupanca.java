public class ContaPoupanca extends Conta {  

        
    public ContaPoupanca() {}

    public ContaPoupanca(int numeroConta, String titular) {
        super(numeroConta, titular);
        
    }

    public void gerarAcidente() {
        saldo=saldo*0.005;
        System.out.println("Juros adicionados");
      }
    
}
