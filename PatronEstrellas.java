import java.util.Scanner;

public class PatronEstrellas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int filas;

       System.out.print("Dijita un numero: ");
       filas = scan.nextInt();

        for(int fila = 1; fila <= filas; fila++) {
            System.out.print(fila + "\t");
            for( int estrella = 1; estrella <= fila; estrella++) {
                System.out.print("*\t");
            }
            System.out.println();
        } // cierre del for
    } // cierre del main
} // cierre de la clase PatronEstrellas
