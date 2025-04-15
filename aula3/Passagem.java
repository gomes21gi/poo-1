public class Passagem {

    public static void main(String[] args) {
        int x = 10;
        // No metodoC muda o valor de x para 99
        // faz um cópia
        // passagem por valor
        // passagem por referência
        // endereço de memória
        Main.metodoC(x);
        // qual é o valor de x?
        // 10 ou 99?
        System.out.println("x = "+x);
    }

}

// public class Passagem {
//     public static void main(String[] args) {
//         int x = 10;
//         // no metodoC muda o valor de x 
//         Projeto.metodoC(x);
//         System.out.println("x = " + x);
//     }
// }
