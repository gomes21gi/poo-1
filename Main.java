import java.util.Scanner;

public class Main{
    // main
    public static void main(String[] args) {
        //sout
        // System.out.println("Hello, World!");
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int x = leitor.nextInt();
        if(x > 0) {
            System.out.println("O número é positivo");
        } else if(x < 0) {
            System.out.println("O número é negativo");
        } else{
            System.out.println("O número é zero");
        }

        //-- não fazer, sempre usar {} chaves
        // if(x==2) System.out.println("x é 2");
        // System.out.println("depois do if");
    }
}