import java.time.LocalDate;

public class Usuarioexemplo {
    public static void main(String[] args) {

        MaiorIdade m = new MaiorIdade(LocalDate.of(1990,12,11));

        if (m.determinarMaiorIdade()) {
            System.out.println("Maior de 18");
        }
        else {
            System.out.println("Menor de 18");
        }

    }
}
