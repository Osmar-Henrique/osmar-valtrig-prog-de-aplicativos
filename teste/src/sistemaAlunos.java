import java.util.ArrayList;
import java.util.List;

public class sistemaAlunos {

    private List<Alunos> listaAlunos;

    public sistemaAlunos(){
        listaAlunos = new ArrayList<Alunos>();
    }

    public void adicionarAluno(Alunos a) {
        for (Alunos aluno : listaAlunos)
            if (aluno.getMatricula().equalsIgnoreCase(a.getMatricula())){
                throw new IllegalArgumentException("Matrícula repetida!");
            }
        listaAlunos.add(a);
    }

    public List<Alunos> obterCursoIdadeMaiorMediaMaior(String curso, int idade, double media){

        List<Alunos> resultado = new ArrayList<>();

        for (Alunos a : listaAlunos) { //se eu colocar um sout(a) ali dentro do for, ele irá mostrar a lista sendo percorrida
            if (a.getCurso().equalsIgnoreCase(curso) && a.getIdade() >= idade && a.getMediaFinal() >= media){
                resultado.add(a);
            }
        }

        return resultado;
    }

    public Alunos buscarMatricula (String matriculadoAluno) {
        Alunos busca = null;

        for (Alunos a : listaAlunos) {
            if (a.getMatricula().equalsIgnoreCase(matriculadoAluno)) { //cada aluno dessa lista é A, quando um deles encaixar no if
                return a;                                              //ele encaixa no return
            }
        }
        throw new IllegalArgumentException("Matricula não encontrada!"); //se ele nunca encontrar ninguém
    }                 // que encaixa no if, ou não houver nenhum aluno para ser procurado, precisa ter um retorno que no caso seria NULL.
}
