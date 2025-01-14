
// nombre en mayuscula, y public que lo podemos usar desde otro lado
// el objeto es una representacion de algo de nuestro mundo real
public class Persona {

    String nombre;
    String apellido;

    void mostrarPersona(){

        System.out.println("El nombre es: " + nombre);
        System.out.println("El apellido: "+ apellido);
    }

    public static void main(String[] args) {
        System.out.println("Creacion de objetos/instacias de la clase persona ");
        
        // reservamos espacio de memoria, del objeto porque no pasamos parametros
        // variable que guarda = objeto creado
        Persona objeto1 = new Persona(); 
        // var objeto2 = new Persona();     // segun esta jala,pero no es cierto

        // responde null
        objeto1.mostrarPersona();
        // objeto1.nombre
        // objeto1.

        // 03:58 min
    }
}
