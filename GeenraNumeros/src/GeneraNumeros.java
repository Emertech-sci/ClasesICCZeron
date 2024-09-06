import java.util.Random;

public class GeneraNumeros {
    public static void main(String[] args){
        Random random = new Random();
        //Generar un real entre 1 y 15
        float numero = random.nextFloat() * 14 +1;
        System.out.println("real: " + numero);

        // Genera un numero entre -10 y 9
        int num = random.nextInt(20) -10;
        System.out.println("num: " + num);

        //


    }
}
