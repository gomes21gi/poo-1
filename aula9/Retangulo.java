package aula9;

public class Retangulo {
    // double altura;
    // double largura;
    private double altura;
    private double largura;
    public Retangulo(){
        System.out.println("Dentro do construtor Retangulo");
    }
    public Retangulo(double largura, double altura){
        System.out.println("Dentro do construtor Retangulo2");
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }
    public double getLargura() {
        return largura;
    }
    public boolean isQuadrado() {
        return altura == largura;
    }
    public void setAltura(double altura) {
        // this.altura = altura;
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida!");
        }
    }
    public void setLargura(double largura) {
        // this.largura = largura;
        if (largura > 0) {
            this.largura = largura;
        } else {
            System.out.println("Largura inválida!");
        }
    }
}
