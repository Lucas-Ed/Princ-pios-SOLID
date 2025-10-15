public class Quadrado implements Forma {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public int getArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Quadrado [lado=" + lado + "]";
    }
}