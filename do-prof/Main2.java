public class Main2 {
    // static -> mudar de escopo -> escopo de classe
    // vai ser global -> tem apenas uma vez carregado na memória
    // visibilidade static retorno nome_do_metodo ( lista de parâmetros)
    public static void main(String[] args) {
        metodoA();
        int i = metodoB();
        metodoC(2.0);
        metodoC(1,1.0);
    }
    public static void metodoC(double x, int y, int w){

    }
    // a ordem dos parâmetros é importante.
    public static void metodoC(double x, int y){

    }
    public static void metodoC(int x, double y){

    }
    //metodoC(double)
    // sobrecarga de método : polimorfismo
    public static void metodoC(double x){

    }
    // assinatura de método
    // nome ( lista de parametros )
    // metodoC(int)
    public static void metodoC(int x){
        x = 99;
    }

    // No java pode ter apenas 1 retorno
    public static int metodoB(){
        int x = 0;
        if(x == 1){return -1;}
        return 0;
    }

    public static void metodoA(){
        //sout
        System.out.println("metodoA");
        // Chamada recursiva
        // metodoA();
    }


}
