import java.util.ArrayList;
import java.util.List;

public class sistemaAlunos {

    private List<Alunos> listaAlunos;

    public sistemaAlunos(){
        listaAlunos = new ArrayList<Alunos>();
    }

    public void adicionarAluno(Alunos a) {
        listaAlunos.add(a);
    }

    public List<Alunos> obterCursoIdadeMaiorMediaMaior(String curso, int idade, double media){

        List<Alunos> resultado = new ArrayList<>();

        for (Alunos a : listaAlunos) {
            if (a.getCurso().equalsIgnoreCase(curso) && a.getIdade() >= idade && a.getMediaFinal() >= media){
                resultado.add(a);
            }
        }

        return resultado;


    }

    public List<Alunos> buscarMatricula (String matriculadoAluno) {
        List<Alunos> busca = new ArrayList<>();

        for (Alunos a : listaAlunos) {
            if (a.getMatricula().equalsIgnoreCase(matriculadoAluno)) {
                busca.add(a);
            }
        }
        return busca;
    }
}
