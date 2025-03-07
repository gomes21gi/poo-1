import java.util.Random;  // importando a classe Random para gerar números aleatórios

public class NumeroAleatorio {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            // zero até o limite - 1
            System.out.println(random.nextInt(10)+1);
        }
    }
}
