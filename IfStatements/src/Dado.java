import java.util.Random;

public class Dado {
    //static nos dice que es el mismo valor para todos los dados.
    public static final int VALOR_MAXIMO = 6;
    private int valor;

    //Metodo constructor
    public Dado() {
        valor = 1;
    }

    /*
    •Devuleve el valor que tiene el dado con la cara hacia arriba.
    •@return el valor del dado.
    */
    public int daValor(){
        return valor;
    }

    /*
    • Gira el dado y devuelve su valor.
    • @return el valor del dado resultante de girar el dado.
    */
    public int gira(){
        Random random = new Random();
        valor = random.nextInt(6) + 1;
        return valor;
    }

    /*
    •Coloca el dado con un valor especifico con la cara hacia arriba.
    •@param cara el valor a colocar.
     */
    public void coloca (int cara){
        valor = cara;
    }

    public static void main(String[] args){
        Dado d1 = new Dado();
        Dado d2 = new Dado();
        System.out.println("Dado 1: " + d1.daValor());
        d2.coloca(4);
        System.out.println("Dado 2: " + d2.daValor());

        System.out.println("Dado 1: " + d1.gira());
        System.out.println("Dado 2: " + d2.gira());
    }
}
