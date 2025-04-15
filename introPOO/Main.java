package introPOO;

public class Main {
    public static void main (String[] args) {
        Retangulo r= new Retangulo ();
        System.out.println("Altura:" + r.altura);
        System.out.println("Largura:" + r.largura);

        r.altura = 3.5;
        r.largura = 4.5;
        r.imprimir();

        r.altura = 9.5;
        r.largura = 34;
        r.imprimir();

        r.altura = 10;
        r.largura = 20;
        r.imprimir();

    }
} {
    
}
