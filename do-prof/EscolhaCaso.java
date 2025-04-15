public class EscolhaCaso {

    public static void main(String[] args) {
        //switch - case
        int x = 2;
        // escolha
        switch (x){
            case 3:
            case 4:
            case 5:
                System.out.println("3, 4 ou 5");
                break;
            case 0: // se o valor de é zero.
                System.out.println("Zero");
                break; // quebra e vai para o final.
            case 1: // se o valor de é 1.
                System.out.println("Um");
                break;
            case 2: // se o valor de é 2.
                System.out.println("Dois");
                break;
            default: // nenhuma das opções anteriores.
                System.out.println("Nao sei o número");
        }
    }

}
