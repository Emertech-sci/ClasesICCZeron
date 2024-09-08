public class Tarea01 {
    public static void main(String[] args){

        /*
        Ejercicio 1
         */
        int resultadoEntero = 0, ent1 = 16, ent2 = 55,ent3 = 9, ent4 = 25;
        //resultadoEntero = 0, ent1 = 16, ent2 = 55,ent3 = 9, ent4 = 25;
        double resultadoReal, real1 = 23.0, real2 = 9.5, real3 = 6.2;

        resultadoEntero = ent4 / ent1 - ent2;
        // resultadoEntero = -54
        resultadoReal = ent4 + ent1 - ent3;
        //reusltadoReal = 32.0
        real1 = ent2 * ent4 + real2;
        // real1 = 1384.5
        ent4 = (int)(ent2 / ent1) + (int)(real1 - real2);
        // ent4 = (int)(55 / 16)+(int)(1384.5 - 9.5)
        // ent4 = (int) (3) + (int) (1375)
        // ent4 = 1378
        boolean bol1 = (ent3 >= ent4) || (ent2 == resultadoEntero);
        // bol1 = false || false
        // bol1 = false
        System.out.println("resultadoEntero: " + resultadoEntero);
        System.out.println("resultadoReal: " + resultadoReal);
        System.out.println("real1: " + real1);
        System.out.println("ent4: " + ent4);
        System.out.println("bool1: " + bol1);

        /*
        Ejercicio 2
         */
        int n = 45, m = 60;
        if (n >= m * 2 - 10){
            System.out.println("hola");
        }else{
            System.out.println("qué tal");
        }
        System.out.println("ahí nos vemos");
        // La condición del if es falsa pues 40 no es mayor o igual a 110, por lo que se imprimirá lo siguiente:
        // >>qué tal
        // >>ahí nos vemos
        // Lo anterior se imprime en dos lineas distintas pues una linea ejecuta qué tal y hace un salto de linea donde se ejecutara ahí nos vemos
        String cad = "Número ";
        int num = 99;
        cad = cad + num;
        if (cad.length() < 9){
            System.out.println(cad + "...");
        }else{
            System.out.println(cad);
            System.out.println(cad + "$$");
        }
        // El ultimo valor que se leda a la variable cad va a concatenar Número + 99, que va a arrojar la cadena "Número 99"
        // Despues el if va a evaluar si la longitud del nuevo valor de cad en menor a 9 caracrteres, como no es menor sino igual a 9
        // ejecutara el contenido en else:
        // >>Número 99
        // >>Número 99$$
        // Se ejecutara lo anterior en dos lineas distintas, una para cada println()

    }
}
