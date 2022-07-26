public class Conta {
    private int numeroConta;
    private String titular;
    private double saldo;

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

    // recebe como parâmetro a contaDestino, a qual sofrerá um crédito do valor.
    // ao mesmo tempo, esse mesmo valor deverá ser debitado da conta origem
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