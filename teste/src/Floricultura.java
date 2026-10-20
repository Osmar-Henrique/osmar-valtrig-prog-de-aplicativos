public class Floricultura {

    //os atributos do objeto é o que ele é.
    private String flor;
    private double preco;
    private String nome;

    public Floricultura(String flor, double preco, String nome) {
        setFlor(flor);
        setPreco(preco);
        setNome(nome);
    }

    public String getFlor() {
        return flor;
    }

    public void setFlor(String flor) {
        if (flor == null || flor.isBlank()) {
            throw new IllegalArgumentException("Flor inexistente.");
        }
        this.flor = flor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inexistente.");
        }
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Floricultura{" +
                "flor='" + flor + '\'' +
                ", preco=" + preco +
                ", nome='" + nome + '\'' +
                '}';
    }
}
