public class Questao02 {

    public static double calcularPrecoTotalComDesconto(double valorUnitario, int quantidade){
        double valorTotal = valorUnitario * quantidade;
        double percentual = 0.05;
        if(quantidade > 5 && quantidade < 11){
            percentual = 0.1;
        }else if(quantidade > 10){
            percentual = 0.15;
        }
        return valorTotal - valorTotal * percentual;
    }

}
