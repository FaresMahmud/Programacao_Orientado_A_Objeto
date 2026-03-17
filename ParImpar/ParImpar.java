package ExerciciosExtras;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;
        System.out.println("Digite um numero: ");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Esse numero é par");
        } else {
            System.out.println("Esse numero é impar");
        }
        teclado.close();
    }

}
