import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Litros registrado na bomba: ");
        double litros = entrada.nextDouble();


        System.out.println("Para álcool digite: A  ");
        System.out.println("Para gasolina digite: G ");
        System.out.print("Insira o comando desejado: ");
        String leia = entrada.next();


        if (leia.equalsIgnoreCase("A") && litros <= 20 ) {
            double valor = 1.90 * litros;
            double desc = valor * 0.03;
            double valorTotal = valor - desc;
            System.out.printf("Valor  R$: %.2f " , valorTotal);

        } else if (leia.equalsIgnoreCase("A") && litros > 20){
            double valor = 1.90 * litros;
            double desc = valor * 0.05;
            double valorTotal = valor - desc;
            System.out.printf("Valor  R$: %.2f " , valorTotal);

        } else if (leia.equalsIgnoreCase("G") && litros <= 20){
            double valor = 2.50 * litros;
            double desc = valor * 0.04;
            double valorTotal = valor - desc;
            System.out.printf(" valor  R$: %.2f " , valorTotal);

        } else if (leia.equalsIgnoreCase("G") && litros > 20){
            double valor = 2.50 * litros;
            double desc = valor * 0.06;
            double valorTotal = valor - desc;
            System.out.printf(" valor  R$: %.2f " , valorTotal);

        } else {
            System.out.println( "Comando incorreto !!");
        }



    }
}
