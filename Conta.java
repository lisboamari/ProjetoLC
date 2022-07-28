public abstract class Conta {
    private int numeroConta;
    private String titular;
    protected double saldo;

    public Conta() {
    }

    public Conta(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }
    public double getNumeroConta() {
        return this.numeroConta;
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

    public abstract void gerarAcidente();

    @Override
    public String toString() {
        return "Dados da Conta: " +
                "Numero da Conta: " + numeroConta +
                ", Nome do Cliente: " + titular;
    }

}
