public class ex5RelObj {
    public static void main(String[] args) {

        Conta c1 = new Conta("Pedro", 2000.00);
        Conta c2 = new Conta("André", 3000.00);
        Conta c3 = new Conta("Simão", 300.00);
        Conta c4 = new Conta("João", 89.00);


        c1.sacar(200);
        System.out.println("Saldo de C1 é: " + c1);
        c2.depositar(400.00);
        System.out.println("Saldo de c2 é: " +c2);
        c3.transferir(80.00, c4);
        System.out.println("Saldo de c3 é: " +c3);
        c4.investir(70.00, 10);
        System.out.println("Total de rendimento é: " + c4);



    }
}
