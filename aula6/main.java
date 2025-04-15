public class main{
    public static void main(String[] args){
        // tente
        // ReuntimeException -> tipo não verificado
        try {
            int vetor[] = {0};
            vetor[10] = 10;

        // catch - capturar - um erro/exeção
        } catch (Exception e) {
            System.out.println("Erro: " +e.getMessage());
           // e.printStackTrace();
        } finally {

            System.out.println("Fim do programa");
        }
    }
    public static void main2(String[] args){
        // tente
        // Re
        try {
            int vetor[] = {0};
            vetor[10] = 10;

        // catch - capturar - um erro/exeção
        } catch (Exception e) {
            System.out.println("Erro: " +e.getMessage());
           // e.printStackTrace();
        } finally {

            System.out.println("Fim do programa");
        }
    }
}
