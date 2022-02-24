public class Venda {
    
    private String dataVenda;
    private String produtoVendido;
    private int qtVendida;
    private int vlUnitario;
    private int vlTotal;

    public Venda() {
    }

    public Venda(String dataVenda, String produtoVendido, int qtVendida, int vlUnitario) {
        this.dataVenda = dataVenda;
        this.produtoVendido = produtoVendido;
        this.qtVendida = qtVendida;
        this.vlUnitario = vlUnitario;
    }

    
    public String getDataVenda() {
        return dataVenda;
    }
    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }
    public String getProdutoVendido() {
        return produtoVendido;
    }
    public void setProdutoVendido(String produtoVendido) {
        this.produtoVendido = produtoVendido;
    }
    public int getQtVendida() {
        return qtVendida;
    }
    public void setQtVendida(int qtVendida) {
        this.qtVendida = qtVendida;
    }

    public int getVlUnitario() {
        return vlUnitario;
    }

    public void setVlUnitario(int vlUnitario) {
        this.vlUnitario = vlUnitario;
    }

    public int getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(int vlTotal) {
        this.vlTotal = (vlUnitario*qtVendida);
    }

    @Override
    public String toString() {
        return String.format("Data da Venda: %s\nNome do Produto: %s\nQuantidade: %s\nValor unitário: %s\nValor total: %s", getDataVenda(), getProdutoVendido(), getQtVendida(), getVlUnitario(), getVlTotal());
    }
        
}
