import java.util.Scanner;

public class Main{

    public static void main(String []args){

        Scanner user = new Scanner (System.in);

        System.out.println("\t===Calculadora===\n");
        
        int escolha;
        
        do{
            System.out.println("1 - Calculo\n");

            System.out.println("0 - Encerrar programa\n");

            escolha = user.nextInt();

            if(escolha == 1){
                Calculadora.decision(user);
            }

        }while(escolha != 0);

        System.out.println("Programa encerrado!");

        user.close();

    }

}