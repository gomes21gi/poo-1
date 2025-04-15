import java.util.Random;

public class NumeroAleatorio {

    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            // Zero até o limite - 1
            System.out.println(random.nextInt(10)+1);
        }
    }

}
