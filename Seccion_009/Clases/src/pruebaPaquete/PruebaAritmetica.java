package pruebaPaquete;

import aritmeticaPaquete.Aritmetica3;

public class PruebaAritmetica {

    // min 4:14

    public static void main(String[] args) {
        
        // aqui se crean 2 objetos
        System.out.println("*** Metodo aritmetica ***");
        // el operador this, se crea al hacer la instancia, es como un apuntador
        // si hay una nueva instancia , el operador this cambiara
        var Aritmetica1 = new Aritmetica3(10, 8);
        Aritmetica1.sumar();
        Aritmetica1.restar();
        // lo que esta depues del @ es la memoria RAM @72ea2f77
        System.out.println("Dir Memoria: aritmetica1: " + Aritmetica1);
        System.out.println();

        // este da error, porque espra 2 argumentos, pero haciendo en constructo vacio, ya jala
        // sobrecarga de constructores
        var Aritmetica_2 = new Aritmetica3(15,30);
        // Aritmetica_2.operando1 = 20;
        // Aritmetica_2.operando2 = 35;
        Aritmetica_2.sumar();

        // aqui vemos como el oerador this cambia en cada instancia/objeto
        System.out.println("Dir Memoria: aritmetica2: " + Aritmetica_2);


    }

}
