package ExerciciosExtras;

import java.util.Scanner;

public class DescontoCompra {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double valorCompra;
        System.out.println("Qual o valor da compra? ");
        valorCompra = teclado.nextDouble();

        if(valorCompra > 100) {
            valorCompra = valorCompra * 0.90;
        }

        System.out.println("O valor total fica " + valorCompra);
        teclado.close();
    }

}

/* JEITO CLEANCODE */
//if(valorCompra > 100) {
//valorCompra = valorCompra * 0.90;
        //}

        //System.out.println("O valor total fica " + valorCompra);