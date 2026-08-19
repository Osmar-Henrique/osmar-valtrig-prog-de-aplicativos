public class exemploMetodoRetorno {

    public static double somarNumeros (int num1, int num2){
        double soma = num1 + num2;
        return soma; //colocar return 0; isso aqui para parar de dar erro, depois coririgir
        //pode ser também return num1 + num2; dessa forma, não precisa criar uma variável.
    }


    public static void main(String[] args) {

        double soma = somarNumeros(10,2);

        System.out.println(soma);

        System.out.println(somarNumeros(5,4));  //existe duas formas de printar, tanto a de cima com a variável criada
                                                //como também a de colocar desta forma.

    }
}
