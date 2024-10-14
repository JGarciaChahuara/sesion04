import java.util.Scanner;

public class PeriodoAnual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número (1, 2, 3, 4, 6, 12): ");
        int numero = scanner.nextInt();
        String periodo;

        switch (numero) {
            case 1:
                periodo = "mensual";
                break;
            case 2:
                periodo = "bimestral";
                break;
            case 3:
                periodo = "trimestral";
                break;
            case 4:
                periodo = "cuatrimestral";
                break;
            case 6:
                periodo = "semestral";
                break;
            case 12:
                periodo = "anual";
                break;
            default:
                periodo = "Número fuera de rango";
        }

        System.out.println("Número = " + numero);
        System.out.println("Periodo = \"" + periodo + "\"");
        scanner.close();
    }
}
