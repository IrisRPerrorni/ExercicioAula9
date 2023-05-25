import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){

        int result = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Telefonou para a vítima? Responda com S para sim ou N para não: ");
        String leia = entrada.next();
        if(leia.equalsIgnoreCase("S")){
           result += 1;

        } else if (leia.equalsIgnoreCase("N")){
            result += 0;

        } else {
            System.out.print(" Comando incorreto ! Digite  S ou N ");
            System.exit(0);

        }

        System.out.print("Esteve no local do crime? Responda com S para sim ou N para não: ");
        String insira = entrada.next();
        if(insira.equalsIgnoreCase("S")){
            result += 1;

        } else if (insira.equalsIgnoreCase("N")){
            result += 0;

        } else {
            System.out.print(" Comando incorreto ! Digite  S ou N ");
            System.exit(0);
        }

        System.out.print("Mora perto da vítima? Responda com S para sim ou N para não: ");
        String mora = entrada.next();
        if(mora.equalsIgnoreCase("S")){
            result += 1;

        } else if (mora.equalsIgnoreCase("N")){
            result += 0;

        } else {
            System.out.print(" Comando incorreto ! Digite  S ou N ");
            System.exit(0);
        }
        System.out.print("Devia para a vítima? Responda com S para sim ou N para não: ");
        String devia = entrada.next();
        if(devia.equalsIgnoreCase("S")){
            result += 1;

        } else if (devia.equalsIgnoreCase("N")){
            result += 0;

        } else {
            System.out.print(" Comando incorreto ! Digite  S ou N ");
            System.exit(0);
        }
        System.out.print("Já trabalhou com a vítima? Responda com S para sim ou N para não: ");
        String trab = entrada.next();
        if(trab.equalsIgnoreCase("S")){
            result += 1;

        } else if (trab.equalsIgnoreCase("N")){
            result += 0;

        } else {
            System.out.print(" Comando incorreto ! Digite  S ou N ");
            System.exit(0);
        }

        System.out.println(" Numero de resposta Sim: " + result );
        if (result < 2){
            System.out.println(" A pessoa é Inocente!");

        } else if ( result == 2){
            System.out.println(" A pessoa é Suspeita!");

        }else if (result == 3 || result == 4 ){
            System.out.println(" A pessoa é Cumplice!");

        } else if (result == 5 ){
            System.out.println(" A pessoa é o Assasino!");
        }



    }
}
