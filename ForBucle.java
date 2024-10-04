/*
    while y dowhile
    No se sabe cuantas veces se va a repetir un bloque de instruciones o es dificil saberlo.

    for
    util cuando si se sabe o es facil determinar cuantas veces repetir un bloque de instrucciones

    for (decñaracion y/o condicion de actualizacion){
        asiganacion de permanencia
        varibales
        bloque de instrucciones
    }

    Estructuras de control repetitivas e if, podemos declararlo de la siguiente forma si solo se tiene un bloque de instruccion:
    if(condicion)
        instruccion;

    while(condicion)
        instruccion;

    for(condicion)
        instruccion;

    Lo anterior no es recomendable por suciedad en el codigo.
 */

// Dados dos nnumeros que teclee el usuario imprimir los numeros del primero que no excedan el segundo.

import java.util.Scanner;
public class ForBucle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valor, limite, cuenta = 0;
        final int MAX_VALORES = 5;

        System.out.print("Digite um valor a multiplicar: ");
        valor = scan.nextInt();
        System.out.print("Digite um limite para los multiplos: ");
        limite = scan.nextInt();

        for(int multiplo = valor; multiplo <= limite; multiplo+= valor){
            System.out.print(multiplo + "\t");
            cuenta++;
            if( cuenta % MAX_VALORES == 0){
                System.out.println();
            }

        } // cierra el for.
    } // cierra el main
} // cierra la calse ForBucle
