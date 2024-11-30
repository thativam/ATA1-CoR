public class Pedido {

    private String nomeCliente;
    private double valor;
    private boolean estoqueDisponivel;

    public Pedido(String nomeCliente, double valor, boolean estoqueDisponivel) {
        this.nomeCliente = nomeCliente;
        this.valor = valor;
        this.estoqueDisponivel = estoqueDisponivel;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isEstoqueDisponivel() {
        return estoqueDisponivel;
    }

    public void setEstoqueDisponivel(boolean estoqueDisponivel) {
        this.estoqueDisponivel = estoqueDisponivel;
    }

  
}