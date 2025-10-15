public class Retangulo implements Forma {
    private int largura;
    private int altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public int getArea() {
        return largura * altura;
    }

    @Override
    public String toString() {
        return "Retângulo [largura=" + largura + ", altura=" + altura + "]";
    }
}