public class Aritmetica2 {

// valor default 0
// estas variables duran mas que las de los metodos
    int operando1;
    int operando2;
    
    // el constructor no tiene nada de void ni eso
    public Aritmetica2(){

    }

    // Constructor, es un metodo especial, se llama igual que la clase, publico para ser llamado desde fuera
    public Aritmetica2(int op1, int op2){

        // si no hay parametro es un constructo vacio
        // asi es como se crean por default
        operando1 = op1;
        operando2 = op2;

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
        // constuctor nos permite asignar los valors desde la creacion del objeto/instancia
        var Aritmetica1 = new Aritmetica2(10, 8);
        Aritmetica1.sumar();
        Aritmetica1.restar();


        // este da error, porque espra 2 argumentos, pero haciendo en constructo vacio, ya jala
        // sobrecarga de constructores
        var Aritmetica2 = new Aritmetica2();
        Aritmetica2.operando1 = 15;
        Aritmetica2.operando2 = 35;
        Aritmetica2.sumar();
    }

}
