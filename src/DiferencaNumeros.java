import java.util.Scanner;

public class DiferencaNumeros {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        double firstValue = reader.nextDouble();
        System.out.print("Segundo valor: ");
        double secondValue = reader.nextDouble();

        if (firstValue > secondValue) {
            System.out.printf("A diferença dos dois valores é de: %s", firstValue - secondValue);
        }
        else {
            System.out.printf("A diferença dos dois valores é de: %s", secondValue - firstValue);
        }
    }
}
