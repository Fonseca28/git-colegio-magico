package com.colegiomagico.reto6;

/**
 * Usa Switch. Gryffindor -> Valentia, Ravenclaw -> Inteligencia, otro -> Desconocido.
 */
public class SombreroClasificador {

    public static String clasificar(String casa) {
        String elegida = "";
        switch (casa){
            case "Gryffindor":
                elegida = "Valentia";
                break;
            case "Ravenclaw":
                elegida = "Inteligencia";
                break;
            case "Muggle":
                elegida = "Desconocido";
                break;
        }
        return elegida; // TODO: Cambia esto
    }

    public static void main(String[] args) {
        System.out.println("Gryffindor: " + clasificar("Gryffindor"));
    }
}
