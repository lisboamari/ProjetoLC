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
   
   }
