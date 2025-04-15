import java.util.Scanner;

public class Main1 {

    // main
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        int x = leitor.nextInt();
        if(x > 0){
            System.out.println("Número é positivo.");
        }else if(x < 0){
            System.out.println("Número é negativo.");
        }else{
            System.out.println("Zero");
        }
        //-- if de uma linha
        // sempre use as chaves
        if(x == 2){ System.out.println("x é dois");}
        System.out.println("depois do if");
    }

}
