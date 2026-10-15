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

    public List<Alunos> obterCursoIdadeMaiorMediaMaior(String curso, int idade, int media){

        List<Alunos> resultado = new ArrayList<>();

        for (Alunos a : listaAlunos) {
            if (a.getCurso().equalsIgnoreCase(curso) && a.getIdade() >= idade && a.getMediaFinal() >= media){
                resultado.add(a);
            }
        }

        return resultado;


    }
}
