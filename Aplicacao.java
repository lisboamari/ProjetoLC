public class Aplicacao {
   // testa aplicacao Banco Lets Code
    public static void main(String[] args) throws Exception {
     
       private final List<ClientePF> clientesPF = new ArrayList<>();
       private final List<ClientePJ> clientesPJ = new ArrayList<>();
 
    // Construtor da classe Cliente populando o array clientesPF e clientesPJ
    // instanciando objetos das classes ClientePF e ClientePJ
        this.clientesPF.add(new ClientePF(
            "Guimarães","PF"));
        this.clientesPF.add(new ClientePF(
            "Mariana","PF"));
        this.clientesPF.add(new ClientePF(
            "Watanabe","PF"));
        this.clientesPJ.add(new ClientePJ(
            "Empresa X","PJ"));
        this.clientesPJ.add(new ClientePJ(
            "Empresa Y","PJ"));
        this.clientesPJ.add(new ClientePJ(
            "Empreza Z","PJ"));         
   
       private final List<Conta> contasCorrentes = new ArrayList<>();
    
    // Construtor da classe ContaCorrente populando o array contasCorrentes
    // instanciando objetos da classe ContaCorrente
        this.contasCorrenes.add(new ContaCorrente(
            1, "Guimarães"));
        this.contasCorrentes.add(new ContaCorrente(
            2, "Mariana"));
        this.contasCorrentes.add(new ContaCorrente(
            3, "Watanabe"));
        this.contasCorrentes.add(new ContaCorrente(
            101, "Empresa X"));
        this.contasCorrentes.add(new ContaCorrente(
            102, "Empresa Y"));
        this.contasCorrentes.add(new ContaCorrente(
            103, "Empreza Z"));     
    
       
     ContaCorrente conta = new ContaCorrente();
     conta.abrirConta();
     conta.sacar(valor);
     conta.depositar(valor);
     conta.transferencia(valor, contaDestino);
     conta.investirContaPoupanca(valor);
     conta.investirContaInvestiemento(valor);  
     conta.consultarSaldoContaCorrente();
     conta.consultarSaldoContaPoupanca();
     conta.consultarSaldoContaInvestimento();
     
   } 
     private void abrirConta() {}

     private void sacar() {};
 
     private void depositar() {};

     private void transferencia() {};

     private void investir() {};

     private void consultarSaldo() {};

}
