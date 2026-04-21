import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personaje> gremio = new ArrayList<>();

        gremio.add(new Personaje("Thor", 10, 120));
        gremio.add(new Personaje("Merlin", 8, 90));

        int totalHP = 0;

        for (Personaje p : gremio) {
            if (p.getNivel() > 0) {
                totalHP += p.getHp();
            }
        }

        System.out.println("HP total: " + totalHP);
    }
}
