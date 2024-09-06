import java.util.Random;

public class GeneraNumeros {
    public static void main(String[] args){
        Random random = new Random();
        //Generar un real entre 1 y 15
        float numero = random.nextFloat() * 15 +1;
        System.out.println("real: " + numero);

        // Genera un numero entre -10 y 9
        int num = random.nextInt(20) -10;
        System.out.println("num: " + num);

        // Generar un entero entre 1 y 6
        int valor  = random.nextInt(6) + 1;
        int otroValor = (int) (random.nextFloat() * 6) + 1;
        // (random.nextFloat() arroja un entero [0,1) despues al multiplicarlo *6 arroja [0,6)
        // como 6 abierto tenemos: [0,5] y al sumar +1 [1, 6]
        System.out.println("valor: " + valor);
        System.out.println("otroValor: " + otroValor);


    }
}
