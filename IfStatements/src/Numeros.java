import java.util.Scanner;

public class Numeros {

    public void numberValue(int num){
        if (num > 0 ){
            System.out.printf("Tú numero: %d es positivo\n", num);
            num = 0;
        }else if (num < 0 ){
            System.out.printf("Tú numero: %d es negativo\n", num);
        }else{
            System.out.println("El numero es cero!");
        }

    }
    public static void main(String[] args) {
        Scanner lector =  new Scanner(System.in);
        Numeros numero = new Numeros();
        System.out.println("Introduzca el valor: ");
        numero.numberValue(lector.nextInt());
        lector.close();

    // Ejercicio 2
        int numeroInicio = 1;
        while (numeroInicio <= 15){
            System.out.println("numero: " + numeroInicio );
            numeroInicio++;
        }
    }
}
