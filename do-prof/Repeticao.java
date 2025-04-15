public class Repeticao {

    public static void main(String[] args) {
        int x = 0; // inicialização
        while(x < 10){ // decisão
            System.out.print(x+" ");
            x++; // incremento
        }
        System.out.println();
        //while(true){} loop infinito
        x = 0;
        do{// executa pelo menos 1 vez
            System.out.print(x+" ");
            x++; // incremento
        }while(x < 10);
        System.out.println();
        //<inicialização> ; <decisão> ; incremento
        for(int j =0; j < 10; j++){
            System.out.print(j+" ");
        }
        System.out.println();
        //for( ; ; ){ } // loop infinito while true
        for(int j = 10; j > 0; j--){
            System.out.print(j+" ");
        }
        System.out.println();
        for(int j =0, k =0, m =0; j < 10; j = j + 2){
            System.out.print(j+" ");
        }
        System.out.println();
    }

}
