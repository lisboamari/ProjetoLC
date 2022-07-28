public class ClientePJ extends Cliente {  
        
    private ContaCorrente CC = new ContaCorrente();
    private ContaInvestimento CI = new ContaInvestimento();
        
    public ClientePJ() {}

    public ClientePJ(String nome, String identificadorCliente, ContaCorrente CC) {
        super(nome, identificadorCliente);
        this.CC = CC;
        
    }

    public ClientePJ(String nome, String identificadorCliente, ContaInvestimento CI) {
        super(nome, identificadorCliente);
        this.CI = CI;
        
    }

    public ContaCorrente getContaCorrente() {
        return CC;
    }


    public ContaInvestimento gContaInvestimento() {
        return CI;
    }

    // @Override

    @Override
    public String toString() {
        return "Identificador da Conta: " + identificadorCliente + "Nome:"+ nomeCliente;
    }

    
}
