import java.util.Scanner;

public class Calculadora{

    public static void decision(Scanner teclado){

        System.out.println("Digite o primeiro numero: ");
        double num1 = teclado.nextInt();

        System.out.println("Digite o segundo numero: ");
        double num2 = teclado.nextInt();

        teclado.nextLine();

        System.out.println("Digite um operador: ");
        char simb = teclado.nextLine().charAt(0);


        System.out.println(Calculadora.calculadora(num1,num2,simb));

    }



    public static double calculadora(double a, double b, char simb){

        switch (simb) {
            case '+' -> {
                return a + b;
            }
           
            case '-' -> {
                return a - b;
            }
           
            case '*' -> {
                return a * b;
            }
           
            case '/' -> {
                if(b == 0){
                    System.out.println("Não é possível dividir por zero!");
                    return 0;
                }
                return a / b;
            }
             
            default -> {
                System.out.println("Error");
                return 0;
            }
        }
    }
}