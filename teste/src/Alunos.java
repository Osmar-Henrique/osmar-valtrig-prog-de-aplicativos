public class Alunos {

    private String nome;
    private int idade;
    private String matricula;
    private String curso;
    private double mediaFinal;

    public Alunos(String nome, int idade, String matricula, String curso, double mediaFinal) {
        setNome(nome);
        setIdade(idade);
        setMatricula(matricula);
        setCurso(curso);
        setMediaFinal(mediaFinal);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                ", mediaFinal=" + mediaFinal +
                '}';
    }
}
