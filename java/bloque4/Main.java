import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personaje> gremio = new ArrayList<>();

        gremio.add(new Personaje("Thor", 10, 120));
        gremio.add(new Personaje("Frodo", 3, 50));

        Iterator<Personaje> it = gremio.iterator();

        while (it.hasNext()) {
            Personaje p = it.next();

            if (p.getNivel() < 5) {
                System.out.println("Inactivado: " + p.getNombre());
            }
        }
    }
}
