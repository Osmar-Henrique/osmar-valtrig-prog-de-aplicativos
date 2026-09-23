public class Contribuinte {

    private String nome;

    private String cpf;

    private String uf;

    private double rendaAnual;

    public Contribuinte(double rendaAnual, String uf, String cpf, String nome) {
        setRendaAnual(rendaAnual);
        setUf(uf);
        setCpf(cpf);
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome inválido.");
        }
        this.nome = nome;

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isBlank() || cpf.length() != 11){
            throw new IllegalArgumentException("CPF inválido.");
        }
        this.cpf = cpf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if (uf == null || uf.isBlank() || uf.length() != 2){
            throw new IllegalArgumentException("UF inválida.");
        }
        this.uf = uf;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        if (rendaAnual < 0) {
            throw new IllegalArgumentException("Renda inválida.");
        }
        this.rendaAnual = rendaAnual;

    }
    public double calcularImposto() {
        return rendaAnual * calcularAliquota();
    }

    private double calcularAliquota() { //aqui foi colocado private para ser usado apenas na classe CONTRIBUINTE
        if (rendaAnual <= 4000.00) {
            return 0;
        }
        else if (rendaAnual <= 9000.00) {
            return 0.058;
        }
        else if (rendaAnual <= 25000.00) {
            return 0.15;
        }
        else if (rendaAnual <= 35000.00) {
            return 0.275;
        }
            return 0.30;

    }
    @Override
    public String toString() {
        return "Contribuinte [nome=" + nome + ", cpf=" + cpf + ", uf=" + uf
                + ", rendaAnual=" + rendaAnual + "]";
    }
}
