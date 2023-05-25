import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o valor que você recebe por hora R$:  ");
        double valor = entrada.nextDouble();

        System.out.println("Insira as horas trabalhadas por mês: ");
        double horas = entrada.nextDouble();

        double salBruto = valor * horas ;
        System.out.printf("O seu salário bruto ( %.2f * %.2f ) R$: %.2f " ,valor, horas , salBruto);

        if( salBruto <= 900 ){
            double ir = 0.00 ;
            double inss = salBruto * 0.1;
            double fgts = salBruto * 0.11;
            double tdesc = ir + inss + fgts ;
            double saliq = salBruto - ir - inss ;

            System.out.printf(" \nImposto de renda  R$: %.2f " , ir );
            System.out.printf(" \nINSS (10%%) R$: %.2f " , inss );
            System.out.printf(" \nFGTS (11%%)  R$: %.2f " , fgts );
            System.out.printf(" \nTotal de descontos  R$: %.2f " , tdesc );
            System.out.printf(" \nSalario Líquido  R$: %.2f " , saliq );

         } else if ( salBruto <= 1500){
            double ir = salBruto * 0.05 ;
            double inss = salBruto * 0.1;
            double fgts = salBruto * 0.11;
            double tdesc = ir + inss + fgts ;
            double saliq = salBruto - ir - inss ;

            System.out.printf(" \nImposto de renda (5%%) R$: %.2f " , ir );
            System.out.printf(" \nINSS (10%%) R$: %.2f " , inss );
            System.out.printf(" \nFGTS (11%%) R$: %.2f " , fgts );
            System.out.printf(" \nTotal de descontos  R$: %.2f " , tdesc );
            System.out.printf(" \nSalario Líquido  R$: %.2f " , saliq );

        } else if ( salBruto <= 2500){
            double ir = salBruto * 0.1 ;
            double inss = salBruto * 0.1;
            double fgts = salBruto * 0.11;
            double tdesc = ir + inss + fgts ;
            double saliq = salBruto - ir - inss ;

            System.out.printf(" \nImposto de renda (10%%)  R$: %.2f " , ir );
            System.out.printf(" \nINSS (10%%) R$: %.2f " , inss );
            System.out.printf(" \nFGTS (11%%) R$: %.2f " , fgts );
            System.out.printf(" \nTotal de descontos  R$: %.2f " , tdesc );
            System.out.printf(" \nSalario Líquido  R$: %.2f " , saliq );

        } else {
            double ir = salBruto * 0.2 ;
            double inss = salBruto * 0.1;
            double fgts = salBruto * 0.11;
            double tdesc = ir + inss + fgts ;
            double saliq = salBruto - ir - inss ;

            System.out.printf(" \nImposto de renda (20%%)  R$: %.2f " , ir );
            System.out.printf(" \nINSS (10%%)  R$: %.2f " , inss );
            System.out.printf(" \nFGTS (11%%) R$: %.2f " , fgts );
            System.out.printf(" \nTotal de descontos  R$: %.2f " , tdesc );
            System.out.printf(" \nSalario Líquido  R$: %.2f " , saliq );

        }


    }
}
