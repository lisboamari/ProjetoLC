public abstract class Cliente {

    private String nomeCliente;
    private String identificadorCliente;

    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public String getIdentificadorCliente() {
        return identificadorCliente;
    }
    public void setIdentificadorCliente(String identificadorCliente) {
        this.identificadorCliente = identificadorCliente;
    }

    public Cliente () {

    }
    
    public Cliente (String nomeCliente, String identificadorCliente) {
        this.nomeCliente = nomeCliente;
        this.identificadorCliente = identificadorCliente;
    }
    
    @Override
    public String toString() {
        return "Dados do Cliente: " +
                "Nome do Cliente: " + nomeCliente + 
                ", Identificador do Cliente: " + identificadorCliente;

    }
   
   }
