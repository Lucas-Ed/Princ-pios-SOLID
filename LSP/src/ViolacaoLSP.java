class RetanguloErrado {
    protected int largura;
    protected int altura;

    public void setLargura(int largura) { this.largura = largura; }
    public void setAltura(int altura) { this.altura = altura; }

    public int getArea() { return largura * altura; }
}

class QuadradoErrado extends RetanguloErrado {
    @Override
    public void setLargura(int largura) {
        this.largura = largura;
        this.altura = largura; // viola o contrato da superclasse
    }

    @Override
    public void setAltura(int altura) {
        this.largura = altura;
        this.altura = altura;
    }
}

public class ViolacaoLSP {
    public static void executar() {
        RetanguloErrado r = new QuadradoErrado();
        r.setLargura(5);
        r.setAltura(10);
        System.out.println("Área esperada: 50 | Área obtida: " + r.getArea());
    }
}