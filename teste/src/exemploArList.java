import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exemploArList {
    public static void main(String[] args) {

        List<Integer> idades = new ArrayList<>();    //informar qual o tipo de objeto que vai aqui Integer, Double String,
                                                    // não pode ser int ou qualquer tipo básico

        idades.add(30);
        idades.add(55);
        idades.add(44);
        idades.add(67);
        idades.add(21);
        idades.add(19);
        idades.add(47);
        idades.add(35);
        idades.add(23);

        Collections.sort(idades); //põe em ordem.

        System.out.println(idades);

        System.out.println(idades.contains(67)); //verifica se esse valor está no array
        System.out.println(idades.contains(72));

        System.out.println(idades.indexOf(157527830)); //ele aponta -1 porque não existe.

        System.out.println(idades.getFirst()); //pega o primeiro index.
        System.out.println(idades.getLast()); //pega o último index.

        System.out.println(idades.size());


    }
}
