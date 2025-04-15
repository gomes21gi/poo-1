package aula10;

public class Main {
    Retangulo r1 = new Retangulo();
    r1.altura = 10;
    r1.largura = 20;

    Retangulo r2 = new Retangulo();
    r2.altura = 10;
    r2.largura = 20;

    // Retangulo r3 = r2;
    Object 0 = null;
    System.out.println(r1); // false
    System.out.println(r1.hashCode()); // true
    System.out.println(r2.hashCode()); // true

    // if (r3 == r2) {
    if(r1.equals.r2) {
    // if(r1hashCode() == r2.hashCode()) {
        System.out.println("Os retângulos são iguais.");
    } else {
        System.out.println("Os retângulos são diferentes.");
    }
}
