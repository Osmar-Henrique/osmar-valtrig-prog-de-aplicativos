public class Veiculo {

    private String marca;

    private String modelo;

    private String placa;

    private String ano;

    private double preco;

    public Veiculo(String marca, String modelo, String placa, String ano, double preco) {
        setMarca(marca);
        setModelo(modelo);
        setPlaca(placa);
        setAno(ano);
        setPreco(preco);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("Marca não encontrada");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("Modelo não encontrada");
        }
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
            if (placa == null || placa.isBlank()) {
                throw new IllegalArgumentException("Placa não encontrada");
        }
        this.placa = placa;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
            if (ano == null || ano.isBlank()) {
                throw new IllegalArgumentException("Marca não encontrada");
        }
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("Preço inválido.");
        }
        this.preco = preco;
    }
    }
