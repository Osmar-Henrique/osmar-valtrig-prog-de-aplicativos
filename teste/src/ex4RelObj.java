public class ex4RelObj {
    public static void main(String[] args) {

        Produto p1 = new Produto("Votorantim", "cimento", 120.00, 30);
        Produto p2 = new Produto("Votorantim", "Cal", 62.00, 12);
        Produto p3 = new Produto("Tigre", "cano pvc", 32.00, 40);
        Produto p4 = new Produto("Amanco", "cano pvc", 28.90, 22);
        Produto p5 = new Produto("Celite", "privada", 500.00, 4);
        Produto p6 = new Produto("Hidra", "chuveiro", 120.00, 9);


        MaterialDeConstrucao Material = new MaterialDeConstrucao();


        Material.adicionaMaterial(p1);
        Material.adicionaMaterial(p2);
        Material.adicionaMaterial(p3);
        Material.adicionaMaterial(p4);
        Material.adicionaMaterial(p5);
        Material.adicionaMaterial(p6);

        System.out.println(Material.produtoPorMarcaEpreco("Votorantim",63.00,150.00));
        System.out.println(Material.produtoMaisCaro("Votorantim"));
    }

}
