// que tengan mas de un metodo pero con diferentes parametros

public class SobrecargaDeMetodos {

    public static int fibonacciRecursivo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    public static void main(String[] args) {
        int n = 20; // Cambia este valor para obtener más números en la serie
        System.out.println("Fibonacci Recursivo:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursivo(i) + " ");
        }
    }
}



