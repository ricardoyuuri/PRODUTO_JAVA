package banana;

public class Produto {

    private String nome;
    private String categoria;
    private double preço;

    public Produto() {
    }

    public Produto(String nome, String categoria, double preço) {
        this.setNome(nome);
        this.setCategoria(categoria);
        this.setPreço(preço);
    }


    public String getNome() {
        return nome;
    }

    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getCategoria() {
        return categoria;
    }

    public Produto setCategoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public double getPreço() {
        return preço;
    }

    public Produto setPreço(double preço) {
        this.preço = preço;
        return this;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", preço=" + preço +
                '}';
    }
}

