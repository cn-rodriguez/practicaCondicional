package practicacondicional;

import java.util.Scanner;

public class PracticaCondicional {
    public static void main(String[] args) {

        double sueldo = 0;
        int categoria;


        System.out.println("ingrese categoria");
        Scanner sc = new Scanner(System.in);
        categoria = sc.nextInt();
        switch (categoria) {
            case 1:
                sueldo = 15890 * 1.1;
                break;
            case 2:
                sueldo = 25630.89;
                break;
            case 3:
                sueldo = 35560.20 * 0.89;
                break;
            default:
                System.out.println("Ingrese una categoria valida");
                break;
        }

        if (categoria == 1 || categoria == 2 || categoria == 3) {
            System.out.println("El total del sueldo de la categoria " + categoria + " es igual a: " + sueldo);
        }
    }
}
