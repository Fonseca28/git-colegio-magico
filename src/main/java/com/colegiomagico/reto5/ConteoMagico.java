package com.colegiomagico.reto5;

/**
 * Suma todos los números desde 1 hasta limite usando un ciclo while.
 */
public class ConteoMagico {

    public static int contar(int limite) {
        int valor=0;
        int i= 1;
        while (i<=limite) {
            valor+=i;
            i++;
        }
        return valor; // TODO: Cambia esto
    }

    public static void main(String[] args) {
        System.out.println("Conteo hasta 4: " + contar(4));
    }
}
