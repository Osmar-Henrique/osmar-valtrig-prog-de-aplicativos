public class ex3RelObj {
    public static void main(String[] args) {

        Alunos A1 =  new Alunos("Paulo",22,"1829","Matematica",7.5);
        Alunos A2 =  new Alunos("João",21,"1817","Economia",6.2);
        Alunos A3 =  new Alunos("Mateus",26,"1778","Geografia",8.7);
        Alunos A4 =  new Alunos("Andre",19,"1903","Filosofia",5.5);
        Alunos A5 =  new Alunos("Pedro",25,"1790","Matematica",8.5);


        sistemaAlunos S1 = new sistemaAlunos();

        S1.adicionarAluno(A1);
        S1.adicionarAluno(A2);
        S1.adicionarAluno(A3);
        S1.adicionarAluno(A4);

        System.out.println(S1.obterCursoIdadeMaiorMediaMaior("Economia",16,6.2));

        System.out.println(S1.buscarMatricula("1903"));
    }
}
