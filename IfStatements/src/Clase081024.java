import java.util.Scanner;
public class Clase081024 {
    public static void main(String[] args) {
        double datoReal, promedio, suma = 0;
        int contador = 0;
        Scanner scan= new Scanner(System.in);
        final String instruccion = "Inserta un número positivo para promediar o negativo para terminar.";
        System.out.println(instruccion);
        datoReal = scan.nextDouble();

        while(datoReal >= 0){
            suma = suma + datoReal;
            contador = contador + 1;
            System.out.println(instruccion);
            datoReal = scan.nextDouble();
        }
        if (contador == 0){
            System.out.println("No hay nada por promediar");
        }else {
            promedio = suma / contador;
            System.out.println("Promedio: " + promedio);
            System.out.println("Numero de valores: " + contador);
        }
    }
}
