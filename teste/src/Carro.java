public class Carro {

    private double velocidade; //parametro

    public Carro(double velocidade) {
        setVelocidade(velocidade);
    }

    public void acelerarCarro(double aceleracao) { //primeiro metodo: aceleração.
        if (aceleracao < 0 || aceleracao >= 20) {
            throw new IllegalArgumentException("Aceleração inválida.");
        }
        setVelocidade(velocidade + aceleracao);

    }

    public void reduzirCarro (double reducao) { //segundo metodo: redução.
        if (reducao < 0 || reducao >= 30){
            throw new IllegalArgumentException("Redução inválida!");
        }
        setVelocidade(velocidade - reducao);
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        if (velocidade < 0) {
            throw new IllegalArgumentException("A velocidade não pode ser negativa.");
        }
        else {
            this.velocidade = velocidade;
        }
    }

    @Override
    public String toString() {
        return "Carro{" +
                "velocidade=" + velocidade +
                '}';
    }
}