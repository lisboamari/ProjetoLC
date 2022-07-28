public class ContaInvestimento extends Conta {  

        
    public ContaInvestimento() {}

    public ContaInvestimento(int numeroConta, String titular) {
        super(numeroConta, titular);
        
    }

    @Override
    public void gerarAcidente() {
        saldo=saldo*1.01;
        System.out.println("Rendimentos adicionados");        
    }
    
}
