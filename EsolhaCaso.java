public class EsolhaCaso {
    public static void main(String[] args) {
        // switch - case
        int x = 2;
        // escolha
        switch (x) {
            case 3:
            case 4:
            case 5: // ou seja, se o valor de x é 3, 4, ou 5
                System.out.println("Três, Quatro ou Cinco");
                break; // caso seja, não precisa de mais verificações
            case 0: // se o valor de é zerp
                System.out.println("Zero");
                break; // quebra e vai para o final
            case 1: // se o valor de é um
                System.out.println("Um");
                break;
            case 2: // se o valor de é dois
                System.out.println("Dois");
                break;
            default: // caso o valor de x não seja nenhum dos acima
                System.out.println("Valor inválido");
        }
    }
}
