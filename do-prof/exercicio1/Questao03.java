public class Questao03 {

    public static String categoriaImc(double peso, double altura){
        double imc = peso/(altura*altura);
        if(imc < 18.5) return "Abaixo do peso";
        if(imc < 24.9) return "Peso normal";
        if(imc < 29.9) return "Sobrepeso";
        return "Obesidade";
    }

}
