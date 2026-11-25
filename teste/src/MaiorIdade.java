import java.time.LocalDate;
import java.time.Period;

public class MaiorIdade {


    private LocalDate dataNascimento = LocalDate.of(2010,8,20);

    public MaiorIdade(LocalDate dataNascimento) {
        setDataNascimento(dataNascimento);
    }

    public boolean determinarMaiorIdade () {
        int idade = Period.between(dataNascimento, LocalDate.now()).getYears();

        if (idade >= 18) {
            return true;
        }
        else {
            return false;
        }

    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }


    public void setDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento == null || dataNascimento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Data de nascimento inválida.");
        }
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "MaiorIdade{" +
                "dataNascimento=" + dataNascimento +
                '}';
    }
}
