import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una vocal de de a,b o c");
        String value = scanner.nextLine();
        char valor = value.charAt(0);


            switch (valor){

                case 'a':
                    System.out.println("Escogiste A");
                    break;

                case 'b':
                    System.out.println("Escogiste B");
                    break;

                case 'c':
                    System.out.println("Elegiste C");
                    break;

                default:
                    System.out.println("Valores fuera de rango de a,b,c");

            }

    }
}
