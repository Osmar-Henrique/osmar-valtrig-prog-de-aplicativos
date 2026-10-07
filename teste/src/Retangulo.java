public class Retangulo {

    private int altura;
    private int largura;

    public Retangulo(int altura, int largura) {
        setAltura(altura);
        setLargura(largura);
    }

    public int descobrirArea() {
        int area = altura * largura;
        return area;
    }

    public int descobrirPerimetro() {
        int perimetro = altura + largura;
        return perimetro;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    @Override
    public String toString() {
        return "Retangulo{" + "altura=" + altura + ", largura=" + largura + '}';
    }
}
