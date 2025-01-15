public class Aritmetica {

// valor default 0
// estas variables duran mas que las de los metodos
    int operando1;
    int operando2;

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
        var Aritmetica1 = new Aritmetica();
        Aritmetica1.sumar();
        Aritmetica1.operando1 = 5;
        Aritmetica1.operando2 = 7;
        Aritmetica1.sumar();
        Aritmetica1.restar();

        var Aritmetica2 = new Aritmetica();
    }

}
