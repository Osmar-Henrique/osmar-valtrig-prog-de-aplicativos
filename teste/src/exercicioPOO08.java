public class exercicioPOO08 {
    public static void main(String[] args) {

        Contribuinte r1 = new Contribuinte(3500.00, "SC", "123.456.789-00", "Bartolomeu");
        Contribuinte r2 = new Contribuinte(8700.00, "PR", "576.890.123-44", "Pedro");
        Contribuinte r3 = new Contribuinte(14600.00, "RS", "789.543.201-66","André");
        Contribuinte r4 = new Contribuinte(23850.00, "MS","654.879.321-00","Felipe");
        Contribuinte r5 = new Contribuinte(47000.00, "SP", "645.899.112-37","João");

        Contribuinte[]  rendas = {r1, r2, r3, r4, r5};

        double maiorImposto = 0;
        Contribuinte maiorContribuinte = null;

        for (int i = 0; i < rendas.length; i++) {
            if (rendas[i].calcularImposto() > maiorImposto){
                maiorImposto = rendas[i].calcularImposto();
                maiorContribuinte = rendas[i];
            }
        }
        System.out.println(maiorContribuinte);

        double somaImpostos = 0;

        for (int i = 0; i < rendas.length; i++){
            
        }
        System.out.println(somaImpostos);

    }
}
