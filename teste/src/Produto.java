public class Produto {

    private String marca;
    private String modelo;
    private double preco;
    private double estoque;

    public Produto(String marca, String modelo, double preco, double estoque) {
        setMarca(marca);
        setModelo(modelo);
        setPreco(preco);
        setEstoque(estoque);
    }

    public void adicionarEstoque (int quantidade) {
        if (quantidade > 0){
            estoque += quantidade;
            System.out.println("Valor adicionado ao estoque.");
        }
        else {
            System.out.println("Quantidade inválida.");
        }
    }

    public boolean vender (int quantidade) {
        if (quantidade > 0 && quantidade <= estoque ){
            estoque -= quantidade;
            System.out.println("Venda realizada com sucesso.");
            return true;
        }
        else {
            System.out.println("Estoque insuficiente, venda não realizada.");
            return false;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isBlank()){
            throw new IllegalArgumentException("Marca inválida.");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getEstoque() {
        return estoque;
    }

    public void setEstoque(double estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", preco=" + preco +
                ", estoque=" + estoque +
                '}';
    }
}
