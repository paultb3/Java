package Sintaxis.diaTres;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor a iterar");
        int valor = scanner.nextInt();

        for (int i= 1; i<=valor; i++){
            System.out.println("numero: " + i);
        }


        String[] arbolGenialogico= {"abuelos","padres","hijos","nietos"};

        for (int i =0; i <= arbolGenialogico.length;i++){
            System.out.println("rama "+(i+1) + ": "+ arbolGenialogico[i]);
        }
    }
}
