public class ContaCorrente extends Conta {  

        
    public ContaCorrente() {}

    public ContaCorrente(int numeroConta, Cliente cliente) {
        super(numeroConta, cliente);
        
    }

    @Override
    public void gerarAcidente() {
        saldo=saldo-9.9;
        System.out.println(" taxa de admin de R$ 9,90.");
    }
    
    @Override
    public boolean sacar(double valor) {
        if (this.cliente instanceof ClientePF) {
            if (valor < saldo) {
                saldo = saldo - valor;
                return true;
    
            } else {
                return false;
            }
        }else {
            if (valor < saldo) {
                saldo = saldo - valor*1.005;
                return true;
    
            } else {
                return false;
            }
        }
    }
    
}
