package Sintaxis.diaUno;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los dias de las semana");
        String dayWeek = scanner.nextLine();
        dayWeek = dayWeek.toLowerCase();

        switch (dayWeek){
            case "lunes":
                System.out.println("Toca lentejas");
                break;
            case "martes":
                System.out.println("Ensalada rusa");
                break;
            case "miercoless":
                System.out.println("Arroz con pollo");
                break;
            case "jueves":
                System.out.println("Sopa");
                break;
            case "viernes" :
                System.out.println("Alluno");
                break;
            default:
                System.out.println("Ingresa correctamente los dias de las semana");
                break;
        }
    }
}
