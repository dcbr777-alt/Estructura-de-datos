public class Main {
    public static void main(String[] args) {
        Personaje[] equipo = new Personaje[5];

        equipo[0] = new Personaje("Thor", 10, 120);
        equipo[1] = new Personaje("Merlin", 8, 90);
        equipo[2] = new Personaje("Legolas", 9, 100);
        equipo[3] = new Personaje("Frodo", 5, 70);
        equipo[4] = new Personaje("Gandalf", 15, 150);

        for (int i = 0; i < equipo.length; i++) {
            if (equipo[i] != null && equipo[i].getNivel() < 10) {
                equipo[i].subirNivel();
            }
            System.out.println(equipo[i]);
        }
    }
}
