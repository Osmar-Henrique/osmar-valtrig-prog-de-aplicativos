import java.time.LocalDate;
import java.time.Period;

public class exemploData {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        System.out.println(hoje);

        LocalDate dataNascimentoOsmar = LocalDate.of(1990, 8 , 24);

        System.out.println("Eu nasci em: " + dataNascimentoOsmar);


        LocalDate dataNascimentoHenrique = LocalDate.of(2001,10,11);

        if (dataNascimentoOsmar.isAfter(dataNascimentoHenrique)){
            System.out.println("Henrique é mais velho.");
        }
        else {
            System.out.println("Henrique é mais novo.");
        }

        int idadeOsmar = Period.between(dataNascimentoOsmar,hoje).getYears();

        System.out.println("O Osmar tem: " + idadeOsmar + " anos");
    }
}
