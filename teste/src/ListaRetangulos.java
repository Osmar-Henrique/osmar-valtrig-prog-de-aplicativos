import java.util.ArrayList;
import java.util.List;

public class ListaRetangulos {
    private List<Retangulo> retangulos;

    public ListaRetangulos() {
        retangulos = new ArrayList<Retangulo>();
    }

    public void adicionarRetangulo(Retangulo r) {
        retangulos.add(r);
    }

    public Retangulo obterMaiorArea() {
        int maiorArea = Integer.MIN_VALUE;
        Retangulo obterMaiorArea = null;

        for (Retangulo r : retangulos) {
            if (r.descobrirArea() > maiorArea){
                maiorArea = r.descobrirArea();
                obterMaiorArea = r;

            }

            }
        return obterMaiorArea;

        }
        public Retangulo obterMaiorPerimetro() {
        int maiorPerimetro = Integer.MIN_VALUE;
        Retangulo obterMaiorPerimetro = null;

        for (Retangulo r : retangulos) {
            if (r.descobrirPerimetro() > maiorPerimetro) {
                maiorPerimetro = r.descobrirPerimetro();
                obterMaiorPerimetro = r;
            }
        }
        return obterMaiorPerimetro;
        }
    }