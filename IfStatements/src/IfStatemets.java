import java.util.Scanner;
import java.util.Random;

public class IfStatemets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Pensé en un número del 1 al 10, cúal sera");

        byte numeroUsuario = scanner.nextByte();

        int numeroAleatorio = random.nextInt(10) +1;
        if (numeroUsuario < 1 || numeroUsuario > 10) {
            System.out.println("nel perrito te dije que entre 1 y 10!");
        } else {
            if (numeroUsuario == numeroAleatorio) {
                    System.out.println("Ahuevooooo perroooooo!");
                } else{
                System.out.println("ese weeeey!");

            }
        }
    }
}
