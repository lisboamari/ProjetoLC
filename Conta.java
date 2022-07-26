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

    @Override
    public String toString() {
        return "Dados da Conta: " +
                "Numero da Conta: " + numeroConta + 
                ", Nome do Cliente: " + titular;
    }
    
    private final List<Conta> contas = new ArrayList<>();
 
    // Construtor da classe Conta populando o array contas
    // instanciando objetos da classe Conta
        this.contas.add(new Conta(
            1, "Guimarães"));
        this.contas.add(new Conta(
            2, "Mariana"));
        this.contas.add(new Conta(
            3, "Watanabe"));
        this.contas.add(new Conta(
            101, "Empresa X"));
        this.contas.add(new Conta(
            102, "Empresa Y"));
        this.contas.add(new Conta(
            103, "Empreza Z"));
   
    
}
