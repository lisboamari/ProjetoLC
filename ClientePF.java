public class ClientePF extends Cliente {  

    private ContaCorrente CC = new ContaCorrente();
    private ContaPoupanca CP = new ContaPoupanca();
    private ContaInvestimento CI = new ContaInvestimento();

    public ClientePF() {}

    public ClientePF(String nome, String identificadorCliente, ContaCorrente CC) {
        super(nome, identificadorCliente);
        this.CC = CC;
        
    }

    public ClientePF(String nome, String identificadorCliente, ContaPoupanca CP) {
        super(nome, identificadorCliente);
        this.CP = CP;
        
    }

    public ClientePF(String nome, String identificadorCliente, ContaInvestimento CI) {
        super(nome, identificadorCliente);
        this.CI = CI;
        
    }

    public ContaCorrente getContaCorrente() {
        return CC;
    }

    public ContaPoupanca getContaPoupanca() {
        return CP;
    }

    public ContaInvestimento gContaInvestimento() {
        return CI;
    }

    @Override
    public String toString() {
        return "Identificador da Conta: " + identificadorCliente + "Nome:"+ nomeCliente;
    }
    
}
