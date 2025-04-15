package teste;
import java.util.Scanner;

public class PrimeiroPrograma {
    // public static void main(String[] args) {
    //     int numero = Integer.MAX_VALUE;
    //     System.out.println("Antes da soma: " + numero);

    //     numero = numero + 1;
    //     System.out.println("Depois da soma: " + numero);
    // }

    // public static void main(String[] args) {
    //     Scanner teclado = new Scanner(System.in);
    //     System.out.print("Digite um número: ");
    //     int numero = teclado.nextInt();

    //     if (numero % 2 == 0) {
    //         System.out.println("O número é par");
    //     } else {
    //         System.out.println("O número é ímpar");
    //     }

    //     teclado.close();
    // }

    // public static void main(String[] args) {
    //     Scanner teclado = new Scanner(System.in);
    //     System.out.print("Digite um número: ");
    //     int a = teclado.nextInt();

    //     System.out.print("Digite outro número: ");
    //     int b = teclado.nextInt();

    //     if (b == 0) {
    //         System.out.println("Erro: divisão por zero não permitida");
    //     } else {
    //         System.out.println("Resultado da divisão: " + (a / b));
    //     } if (a == 0) {
    //         System.out.println("Erro: divisão por zero não permitida");
    //     }

    //     teclado.close();
    // }

    // public static void main(String[] args) {
    //     Scanner teclado = new Scanner(System.in);
    //     System.out.print("Digite um nome: ");
    //     String a = teclado.nextLine();

    //     System.out.print("Digite outro nome: ");
    //     String b = teclado.nextLine();

    //     if (a.equals(b)) {
    //         System.out.println("Os nomes são iguais");
    //     } else {
    //         System.out.println("Os nomes são diferentes");

    //     teclado.close();
    // }

    //     public static void main(String[] args) {
    //         Scanner teclado = new Scanner(System.in);

    //         System.out.print("Digite o primeiro texto: ");
    //         String texto1 = teclado.nextLine();

    //         System.out.print("Digite o segundo texto: ");
    //         String texto2 = teclado.nextLine();

    //         if (texto1.equals(texto2)) {
    //             System.out.println("Os textos são iguais.");
    //         } else {
    //             System.out.println("Os textos são diferentes.");
    //         }

    //         teclado.close();
    //     }

    // public static void main(String[] args) {
    //   Scanner teclado = new Scanner(System.in);
    //   System.out.print("Digite número: ");
    //   int num1 = teclado.nextInt();
      
    //   System.out.print("Digite número: ");
    //   int num2 = teclado.nextInt();
      
    //   System.out.println("Soma: "+ (num1+num2));
    //   teclado.close();
    // }

    // public static void tabuada(int numero) {
    //     for (int i = 1; i <= 10; i++) { // usando o for para um loop, i e = a um, e i sempre vai ser menor ou igual a 10, e incrementa a cada loop
    //         System.out.println(numero + " x " + i + " = " + (numero * i));
    //     }
    // }

    // public static void main(String[] args) {
    //     tabuada(2); // Testando com o número 5
    // }

    // public static void main(String[] args) {
    //     int soma = 0;

    //     for(int i = 1; i <= 10; i++) {
    //         soma += i;
    //     }

    //     System.out.println("A soma dos números de 1 a 10 é: " + soma);
    // }

    // public static void main(String[] args) {
    //     Scanner teclado = new Scanner(System.in);
    //     System.out.print("Digite um número: ");
    //     int numero = teclado.nextInt();

    //     if (numero % 2 == 0) {
    //         System.out.println("O número é par");
    //     } else {
    //         System.out.println("O número é ímpar");
    //     }

    //     teclado.close();
    // }

    // public static void somarElementps(double[] numeros) {
    //     double soma = 0;
    //     for (double num : numeros) {
    //         soma += num;
    //     }

    //     System.out.println("A soma dos elementos é: " + soma);
    // }
    // public static void main(String[] args) {
    //     double[] numeros = {1.5, 2.5, 3.5, 4.5, 5.5};
    //     somarElementps(numeros);
    // }

    // public static void contadorNegativos(double[] numeros) {
    //     int contador = 0;

    //     for (double num : numeros) {
    //         if (num < 0) {
    //             contador++;
    //         }
    //     }
    //     System.out.println("Números negativos: " + contador);
    // }

    // public static void main(String[] args) {
    //     double[] valores = {1.5, -2.5, 3.5, -4.5, 5.5};
    //     contadorNegativos(valores);
    // }

    // public static void contarPositivos(double[] numeros) {
    //     int contador = 0;

    //     for (double num : numeros) {
    //         if (num > 0) {
    //             contador++;
    //         }
    //     }

    //     System.out.println("Total de números positivos: " + contador);
    // }

    // public static void main(String[] args) {
    //     double[] valores = {-3.5, 2.0, -1.2, 4.7, -8.9}; // Teste com valores
    //     contarPositivos(valores);
    // }
    
    // public static void main(String[] args) {
    //     Scanner teclado = new Scanner(System.in);
    //     System.out.print("Digite um número: ");
    //     int num1 = teclado.nextInt();

    //     System.out.print("Digite outro número: ");
    //     int num2 = teclado.nextInt();

    //     int soma = num1 + num2;
    //     System.out.println("A soma dos números é: " + soma);
    //     teclado.close();
    // }

    // public static void validarNumero(double num) {
    //     if (num < 0) {
    //         throw new IllegalArgumentException("Número negativo não permitido!");
    //     }
    // }

    // public static void main(String[] args) {
    //     validarNumero(-2.5);
    // }

    // public static void main(String[] args) {
    //     Scanner teclado = new Scanner(System.in);
    //     System.out.print("Digite um número: ");
    //     int num1 = teclado.nextInt();

    //     System.out.print("Digite outro número: ");
    //     int num2 = teclado.nextInt();

    //     int soma = num1 % num2;
    //     System.out.println("A divisão dos números é: " + soma);
    //     teclado.close();
    // }

    // public static int dividir(int a, int b) {
    //     if (b == 0) {
    //         return -1; // Tratando divisão por zero
    //     }
    //     return a / b;
    // }

    // public static void main(String[] args) {
    //     System.out.println(dividir(10, 2)); // Retorna 5
    //     System.out.println(dividir(10, 0)); // Retorna -1
    // }

    // public static void main(String[] args) {
    //     Scanner teclado = new Scanner(System.in);
    //     System.out.print("Digite um nome: ");
    //     String nome = teclado.nextLine();

    //     System.out.print("Digite sua idade: ");
    //     int idade = teclado.nextInt();


    //     System.out.println("Seu nome é "+nome+" sua idade "+idade);
    // }

    // public static void main(String[] args) {
    //     double x = 10.75;
    //     int y = (int) x;
    // System.out.println(y);

    // }

    // public static void main(String[] args) {
    //     Scanner teclado = new Scanner(System.in);
    //     System.out.print("Digite um número: ");
    //     int num1 = teclado.nextInt();

    //     if (num1 % 2 == 0) {
    //         System.out.println("É par "+num1);
    //     } else {
    //         System.out.println("É ímpar "+num1);
    //     }
    // }

    // public static void main(String[] args) {
    //     Scanner teclado = new Scanner(System.in);
    //     System.out.println("Digite um número de 1 a 7: ");
    //     int num = teclado.nextInt();
    //     switch (num) {
    //         case 1:
    //             System.out.println("Domingo");
    //             break;
    //         case 2:
    //             System.out.println("Segunda-feira");
    //             break;
    //         case 3:
    //             System.out.println("Terça-feira");
    //             break;
    //         case 4:
    //             System.out.println("Quarta-feira");
    //             break;
    //         case 5:
    //             System.out.println("Quinta-feira");
    //             break;
    //         case 6:
    //             System.out.println("Sexta-feira");
    //             break;
    //         case 7:
    //             System.out.println("Sábado");
    //             break;
    //         default:
    //             System.out.println("Dia inválido");
    //             break;
    //     }
    // }

    // public static void main(String[] args) {
    //     int x = 2;
    //     if(x < 0) {System.out.println(x);}
    //     else if(x > 0) {System.out.println(" x ");}
    //     else {System.out.println("m");}
    // }

    // public static void main(String[] args) {
    //     int x = 5;
    //     int soma = 0;
    //     while(x < 10) {
    //         x++;
    //         soma++;
    //     }
    //     System.out.println(soma);
    // }

    // public static void main(String[] args) {
    //     int soma = 0;
    //     for(int i=0;i<10;i++) {
    //         soma++;
    //     }
    //     System.out.println(soma);
    // }

    // public static void main(String[] args) {
    //     double d = 11.9841;
    //     System.out.println(String.format("%.3f",d));
    // }

    // public static void main(String[] args) {
    //     int v[] = {8,9,3,4,23,1,7};
    //     System.out.println(v[4]);
    // }

    // public static void main(String[] args) {
    //     try {
    //         int a = 1;
    //         int b = 4;
    //         String s = null;
    //         System.out.println(s.toLowerCase());
    //     }catch (ArithmeticException e) { System.out.print("erro 1");
    //     }catch (Exception e) { System.out.print("erro 2");
    //     }finally { System.out.print("fim");}
    // }

    public static void main(String[] args) {
        int x = 2 ;
if (x < 0){ System.out.println(x); }
else if(x > 0){System.out.println(” x ”); }
else {System.out.println(”m”) ; }
    }
}

