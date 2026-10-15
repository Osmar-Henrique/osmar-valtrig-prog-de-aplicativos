public class ex2RelObj {
    public static void main(String[] args) {

        Floricultura f1 = new Floricultura("Petunia", 15.00,"João");
        Floricultura f2 = new Floricultura("Petunia", 15.00,"João");
        Floricultura f3 = new Floricultura("Petunia", 15.00,"João");
        Floricultura f4 = new Floricultura("Rosas", 22.00,"Marcia");
        Floricultura f5 = new Floricultura("Petunia", 15.00,"Claudia");
        Floricultura f6 = new Floricultura("Margarida", 19.00,"João");
        Floricultura f7 = new Floricultura("Girassol", 12.00,"João");
        Floricultura f8 = new Floricultura("Orquidea", 35.00,"João");

        Vendas v1 = new Vendas();

        v1.adicionarVendas(f1);
        v1.adicionarVendas(f2);
        v1.adicionarVendas(f3);
        v1.adicionarVendas(f4);
        v1.adicionarVendas(f5);
        v1.adicionarVendas(f6);
        v1.adicionarVendas(f7);
        v1.adicionarVendas(f8);

        System.out.println(v1.listarFloresPorCliente("João"));

    }

}
