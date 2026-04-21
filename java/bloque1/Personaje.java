public class Personaje {
    private String nombre;
    private int nivel;
    private int hp;

    public Personaje(String nombre, int nivel, int hp) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.hp = hp;
    }

    public String getNombre() { return nombre; }
    public int getNivel() { return nivel; }
    public int getHp() { return hp; }

    public void subirNivel() {
        this.nivel++;
        this.hp += 10;
    }

    public String toString() {
        return "[Nv." + nivel + "] " + nombre + " | HP:" + hp;
    }
}
