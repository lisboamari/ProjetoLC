public class Conta {
    private int numeroConta;
    private String titular;
    private double saldo;

    public Conta() {}
    
    public Conta(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }
    
    public boolean sacar(double valor) {
        if (valor < saldo) {
            saldo = saldo - valor;
            return true;

        } else {
            return false;
        }
    }

    public boolean depositar(double valor) {
        saldo = saldo + valor;
        return true;
    }

    public boolean transferir(Conta contaDestino, double valor) {
        boolean retirou = sacar(valor);
        if (retirou) {
            contaDestino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

 
    
}
