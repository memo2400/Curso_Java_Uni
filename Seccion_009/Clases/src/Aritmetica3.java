public class Aritmetica3 {

// valor default 0
// estas variables duran mas que las de los metodos
    int operando1;
    int operando2;
    
    // el constructor no tiene nada de void ni eso
    public Aritmetica3(){

    }

    // Constructor, es un metodo especial, se llama igual que la clase, publico para ser llamado desde fuera
    public Aritmetica3(int operando1, int operando2){

        // si no hay parametro es un constructo vacio
        // asi es como se crean por default
        // aqui con el uso de this, se hace referencia a la variable de afuera, de la clase. linea 5 y 6
        // solo se ejecuta dentro de este constructor
        this.operando1 = operando1;
        this.operando2 = operando2;
        System.out.println("operador this es: " + this);

    }

    // las variables aqui dentro se crean y destruyen cuando se ejcuta bloque, duran poco
    void sumar (){

        var resultado = operando1 + operando2;
        System.out.println("Resultado suma: " + resultado);

    }

    void restar (){

        int resultado = operando1 - operando2;
        System.out.println("Resta es: " + resultado);

    }

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
        var Aritmetica2 = new Aritmetica3(15,30);
        Aritmetica2.operando1 = 15;
        Aritmetica2.operando2 = 35;

        // aqui vemos como el oerador this cambia en cada instancia/objeto
        System.out.println("Dir Memoria: aritmetica2: " + Aritmetica2);


    }

}
