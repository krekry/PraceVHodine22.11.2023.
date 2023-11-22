import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> seznamCisel = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int nahodneCislo = random.nextInt(20);
            seznamCisel.add(nahodneCislo);
        }
        System.out.println("Čísla větší jak 6:");

        for (int cislo : seznamCisel){
            if (cislo > 6){
                System.out.println("číslo: " + cislo);
            }
        }
    }
}
