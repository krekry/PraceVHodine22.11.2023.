import java.util.ArrayList;
import java.util.List;

public class seznamNabytku {
    private List<Nabytek> seznamNabytku = new ArrayList<>();

    public void pridejNabytek (Nabytek nabytek){
        seznamNabytku.add(nabytek);
    }

    public void odeberNabytek (Nabytek nabytek){
        seznamNabytku.remove(nabytek);
    }

    public Double celkovaHmotnostNabytku() {
        Double celkovaHmotnost = Double.valueOf(0);

        for (Nabytek nabytek : seznamNabytku) {
            celkovaHmotnost += nabytek.getHmotnost();
        }

        return celkovaHmotnost;
    }

}

