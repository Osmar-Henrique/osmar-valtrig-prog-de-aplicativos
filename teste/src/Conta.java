public class Conta {

    private String nomeTitular;
    private double saldo;

    public Conta(String nomeTitular, double saldo) {
        setNomeTitular(nomeTitular);
        setSaldo(saldo);
    }

    public void sacar (double valor){
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        }
        else {
            throw new IllegalArgumentException("valor inválido.");
        }
    }

    public void depositar (double valor){
        if (valor > 0) {
            saldo += valor;
        }
        else {
            throw new IllegalArgumentException("Valor de depósito inválido");
        }
    }

    public void transferir (double valor, Conta contadestino){
        if (valor <= 0 || contadestino == null || valor > saldo){
            throw new IllegalArgumentException("Transferência inválida.");
        }
        else {
            saldo -= valor;
            contadestino.saldo += valor;
        }
    }

    public double investir (double valorInvestido, int tempo){
        double total = valorInvestido + Math.pow(1.01, tempo);
        return total;
        //pode ser também return valorinvestido + Math.pow...
    }


    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        if (nomeTitular.isBlank() || nomeTitular == null) {
            throw new IllegalArgumentException("Nome inválido.");
        }
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nomeTitular='" + nomeTitular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
