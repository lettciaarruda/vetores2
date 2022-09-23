import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);


        double temperatura[] = new double[13];
        int i, maiorM=0, menorM=0;
        double menorT = 0;
        double maiorT = 0;


        for (i=1; i<13; i++) {

            System.out.println("Digite a temperatura média do mês "+ i +":");
            temperatura[i]=sc.nextDouble();

            if (maiorT < temperatura[i]) {
                maiorT = temperatura[i];
                maiorM =i;

            }else if  (menorT>temperatura[i]) {
                menorT = temperatura[i];
                menorM=i;
            }
        }

        System.out.println("Maior temperatura do ano: " +maiorT + " Ocorreu no mês: ");

        switch (maiorM) {
            case 1:
                System.out.print("Janeiro");
                break;
            case 2:
                System.out.print("Fevereiro");
                break;
            case 3:
                System.out.print("Março");
                break;
            case 4:
                System.out.print("Abril");
                break;
            case 5:
                System.out.print("Maio");
                break;
            case 6:
                System.out.print("Junho");
                break;
            case 7:
                System.out.print("Julho");
                break;
            case 8:
                System.out.print("Agosto");
                break;
            case 9:
                System.out.print("Setembro");
                break;
            case 10:
                System.out.print("Outubro");
                break;
            case 11:
                System.out.print("Novembro");
                break;
            case 12:
                System.out.print("Dezembro");
                break;

        }

        System.out.println();
        System.out.println("Menor temperatura do ano: "+ menorT + " Ocorreu no mês: ");
        switch (menorM) {
            case 1:
                System.out.print("Janeiro");
                break;
            case 2:
                System.out.print("Fevereiro");
                break;
            case 3:
                System.out.print("Março");
                break;
            case 4:
                System.out.print("Abril");
                break;
            case 5:
                System.out.print("Maio");
                break;
            case 6:
                System.out.print("Junho");
                break;
            case 7:
                System.out.print("Julho");
                break;
            case 8:
                System.out.print("Agosto");
                break;
            case 9:
                System.out.print("Setembro");
                break;
            case 10:
                System.out.print("Outubro");
                break;
            case 11:
                System.out.print("Novembro");
                break;
            case 12:
                System.out.print("Dezembro");
                break;

        }

    }
}