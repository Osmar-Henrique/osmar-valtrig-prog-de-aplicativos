public class Aeronave {

    private String modelo;

    private int qtdPassageiros;

    private double velMax;

    private double capCombustivel;

    private double queimaMinuto;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()){
            System.out.println("Modelo inválido.");
        }
        else {
            this.modelo = modelo;
        }
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        if (qtdPassageiros <= 0){
            System.out.println("Quantidade de passageiros inválida.");
        }
        else {
            this.qtdPassageiros = qtdPassageiros;
        }
    }

    public double getVelMax() {
        return velMax;
    }

    public void setVelMax(double velMax) {
        if (velMax <= 0){
            System.out.println("Velocidade máxima inválida.");
        }
        else {
            this.velMax = velMax;
        }
    }

    public double getCapCombustivel() {
        return capCombustivel;
    }

    public void setCapCombustivel(double capCombustivel) {
        if (capCombustivel <= 0){
            System.out.println("Capacidade de combustível inválida.");
        }
        else {
            this.capCombustivel = capCombustivel;
        }
    }

    public double getQueimaMinuto() {
        return queimaMinuto;
    }

    public void setQueimaMinuto(double queimaMinuto) {
        if (queimaMinuto <= 0)
        {
            System.out.println("Queima de combustível inválida.");
        }
        else {
            this.queimaMinuto = queimaMinuto;
        }
    }

    /**
     * Construtor completo para inicializar todos os atributos da aeronave.
     *
     * @param modelo         O modelo da aeronave.
     * @param qtdPassageiros A quantidade de passageiros suportada.
     * @param velMax         A velocidade máxima da aeronave.
     * @param capCombustivel A capacidade total de combustível.
     * @param queimaMinuto   O consumo de combustível por minuto.
     */
	public Aeronave(String modelo, int qtdPassageiros, double velMax, double capCombustivel, double queimaMinuto) {
        this.modelo = modelo;
        this.qtdPassageiros = qtdPassageiros;
        this.velMax = velMax;
        this.capCombustivel = capCombustivel;
        this.queimaMinuto = queimaMinuto;

        setModelo(modelo);
        setQtdPassageiros(qtdPassageiros);
        setVelMax(velMax);
        setCapCombustivel(capCombustivel);
        setQueimaMinuto(queimaMinuto);
        //é necessário colocar esses sets aqui para que ele não permita apareça os valores negativos e modelos inexistentes no código.
    }

    /**
     * Calcula a autonomia da aeronave em minutos de voo. O cálculo é baseado na
     * capacidade total do tanque dividida pelo consumo por minuto.
     *
     * @return O tempo total de autonomia em minutos.
     */
    public double calcularAutonomia() {
        return capCombustivel / queimaMinuto;
    }

    /**
     * Calcula a distância máxima que a aeronave consegue percorrer. O cálculo
     * utiliza o tempo de autonomia multiplicado pela velocidade máxima.
     *
     * @return A distância máxima alcançável (geralmente em quilômetros).
     */
    public double calcularDistanciaMaxima() {
        return calcularAutonomia() * velMax;
    }

    /**
     * Retorna uma representação em texto com todos os dados da aeronave.
     *
     * @return Uma string contendo os valores de todos os atributos da classe.
     */
    @Override
    public String toString() {
        return "Aeronave [modelo=" + modelo + ", qtdPassageiros=" + qtdPassageiros + ", velMax=" + velMax
                + ", capCombustivel=" + capCombustivel + ", queimaMinuto=" + queimaMinuto + "]";
    }

}

