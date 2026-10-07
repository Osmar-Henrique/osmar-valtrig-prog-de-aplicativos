import java.util.ArrayList;
import java.util.List;

public class Concessionaria {

    //Nessa classe que irá ser colocado os métodos de como encontrar o veículo mais caro, onde está o veículos, etc.

    private List<Veiculo> veiculos; //é recomendado ter a instancia de um atributo dentro de um construtor.
    //o atributo aqui é veículos

    public Concessionaria() {
        veiculos = new ArrayList<Veiculo>();
    }

    public void adicionarVeiculo(Veiculo v) {
        veiculos.add(v);
    }

    public Veiculo obterVeiculoMaisBarato() {
        double menorPreco = Double.MAX_VALUE;
        Veiculo veiculoMaisBarato = null;

        for (Veiculo v : veiculos) {
            if (v.getPreco() < menorPreco) {
                menorPreco = v.getPreco();
                veiculoMaisBarato = v;
            }
        }
        return veiculoMaisBarato;
    }
}