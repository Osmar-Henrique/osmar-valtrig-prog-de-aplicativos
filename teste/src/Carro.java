public class Carro {

    private double velocidade;

    public Carro(double velocidade) {
        setVelocidade(velocidade);
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        if (velocidade >= 0 && velocidade <= 20) {
            double novaVelocidade = this.getVelocidade() + velocidade;
            this.setVelocidade(novaVelocidade);
        }
        else {
            throw new IllegalArgumentException("A aceleração deve ser maior!");
        }
    }
}