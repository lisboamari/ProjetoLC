public abstract class Cliente {

    private String nomeCliente;
    private String tipoCliente;

    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public String getTipoCliente() {
        return tipoCliente;
    }
    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Cliente () {

    }
    
    public Cliente (String nomeCliente, String tipoCliente) {
        this.nomeCliente = nomeCliente;
        this.tipoCliente = tipoCliente;
    }
    
    @Override
    public String toString() {
        return "Dados do Cliente: " +
                "Nome do Cliente: " + nomeCliente + 
                ", Tipo de Cliente: " + tipoCliente;

    }
   
    private final List<Cliente> clientes = new ArrayList<>();
 
    // Construtor da classe Cliente populando o array clientes
    // instanciando objetos da classe Cliente
        this.clientes.add(new Cliente(
            "Guimarães","PF"));
        this.clientes.add(new Cliente(
            "Mariana","PF"));
        this.clientes.add(new Cliente(
            "Watanabe","PF"));
        this.clientes.add(new Cliente(
            "Empresa X","PJ"));
        this.clientes.add(new Cliente(
            "Empresa Y","PJ"));
        this.clientes.add(new Cliente(
            "Empreza Z","PJ"));    
    
}
