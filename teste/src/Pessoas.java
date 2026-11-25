import java.time.LocalDate;
import java.time.Period;

public class Pessoas {

    private String nome;
    private LocalDate dataNascimento = LocalDate.of(2001, 10,11);

    public Pessoas(String nome, LocalDate dataNascimento) {
        setNome(nome);
        setDataNascimento(dataNascimento);
    }

    public int obterIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isBlank() || nome == null){
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento.isAfter(LocalDate.now()) || dataNascimento == null) {
            throw new IllegalArgumentException("Idade inválida.");
        }
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoas{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
