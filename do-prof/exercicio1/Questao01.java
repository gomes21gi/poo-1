public class Questao01 {

    public static int triangulo(int a, int b, int c) {
        if(a == b && a == c) return 0;
        if(a == b || a == c) return 1;
        if(a + b > c && a + c > b && b + c > a) return 2;
        return -1;
    }

}
