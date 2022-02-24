public class Produto {

    public static int length;
    
    private String codigo;
    private String nome;
    private String valor;
    private String estoque;
        
    public Produto() {
    }

    public Produto(String codigo, String nome, String valor, String estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public String getEstoque() {
        return estoque;
    }
    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return String.format("Código Produto: %s\nNome Produto: %s\nValor Unitário: %s\nQuantidade em Estoque: %s", getCodigo(), getNome(), getValor(), getEstoque());
    }

}

