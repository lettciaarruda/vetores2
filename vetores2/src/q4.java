import java.util.Arrays;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int[] listaDeNumeros = new int[11];


        for (int i = 1; i < listaDeNumeros.length; i++)
        {
            System.out.print("digite "+ i + "° números: ");
            listaDeNumeros[i] = (sc.nextInt());
        }


        Arrays.sort(listaDeNumeros);


        System.out.print("ordem crescente:    ");
        for (int j = 1; j < listaDeNumeros.length; j++)
        {
            System.out.print(listaDeNumeros[j]+ "  ");
        }
    }
}
