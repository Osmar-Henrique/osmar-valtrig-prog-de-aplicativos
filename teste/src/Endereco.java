public class Endereco {
    private String uf;
    private String cidade;
    private String cep;
    private String logradouro;
    private String numeroDaResidencia;

    public Endereco(String uf, String cidade, String cep, String logradouro, String numeroDaResidencia) {
        setUf(uf);
        setCidade(cidade);
        setCep(cep);
        setLogradouro(logradouro);
        setNumeroDaResidencia(numeroDaResidencia);
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if (uf == null || uf.isBlank()) {
            throw new IllegalArgumentException("UF INVÁLIDA.");
    }
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        if (cidade == null || cidade.isBlank()){
            throw new IllegalArgumentException("CIDADE INVÁLIDA");
        }
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if (cep == null || cidade.isBlank()){
            throw new IllegalArgumentException("CEP INVÁLIDO");
        }
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        if (logradouro == null || logradouro.isBlank()){
            throw new IllegalArgumentException("LOGRADOURO INVÁLIDO");
        }
        this.logradouro = logradouro;
    }

    public String getNumeroDaResidencia() {
        return numeroDaResidencia;
    }

    public void setNumeroDaResidencia(String numeroDaResidencia) {
        if (numeroDaResidencia == null || numeroDaResidencia.isBlank()){
            throw new IllegalArgumentException("NUMERO DA RESIDÊNCIA INVALIDO");
        }
        this.numeroDaResidencia = numeroDaResidencia;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "uf='" + uf + '\'' +
                ", cidade='" + cidade + '\'' +
                ", cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numeroDaResidencia='" + numeroDaResidencia + '\'' +
                '}';
    }
}
