package aritmeticaPaquete;

// Los paquetes nos sirve para ornanizar los archivos y clases.
// hay cambios por hacerse paquete, el paquete debe empezar en minusculas

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
    public void sumar (){

        var resultado = operando1 + operando2;
        System.out.println("Resultado suma: " + resultado);

    }

    // public nos ayuda a acceder desde otro archivo al metodo
    public void restar (){

        int resultado = operando1 - operando2;
        System.out.println("Resta es: " + resultado);

    }

    
}



