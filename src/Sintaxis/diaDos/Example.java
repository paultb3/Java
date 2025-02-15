package Sintaxis.diaDos;

import java.util.Scanner; // No es necesario importar GSSUtil

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero del año");
        int option = scanner.nextInt();

        switch (option){
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Feberero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 8:
                System.out.println("Julio");
                break;
            case 9:
                System.out.println("Agosto");
                break;
            case 10:
                System.out.println("Setiembre");
                break;
            case 11:
                System.out.println("Octubre");
                break;
            case 12:
                System.out.println("Noviembre");
                break;case 7:
                System.out.println("Diciembre");
                break;


            default:
                System.out.println("fuera del rango (1-12)");
        }
    }
}
