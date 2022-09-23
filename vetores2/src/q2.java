import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeros[] = new int[8];
        int positivos[] = new int[8];
        int negativos[] = new int[8];

        System.out.println("digite 8 números inteiros: ");
        int iPos = 0, iNeg = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("-> ");
            numeros[i] = sc.nextInt();
            if (numeros[i] >= 0) {
                positivos[iPos] = numeros[i];
                iPos++;
            } else {
                negativos[iNeg] = numeros[i];
                iNeg++;
            }
        }


        System.out.printf("foram encontrados %d números positivos\n", iPos);
        for (int i = 0; i < iPos; i++) {
            System.out.println(positivos[i]);
        }
        System.out.printf("foram encontrados %d números negativos\n", iNeg);
        for (int i = 0; i < iNeg; i++) {
            System.out.println(negativos[i]);
        }
    }
}
