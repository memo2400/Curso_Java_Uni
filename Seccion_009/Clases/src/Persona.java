
// nombre en mayuscula, y public que lo podemos usar desde otro lado
// el objeto es una representacion de algo de nuestro mundo real
public class Persona {

    // valor default de String es nulo
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
        // Persona objeto1 = new Persona(); 
        var objeto1 = new Persona(); 

        // responde null
        objeto1.mostrarPersona();

        // 03:58 min

        // ciertamente esta es una mala practica
        objeto1.nombre = "Mark";
        objeto1.apellido = "Zukerberg";
        objeto1.mostrarPersona();

        var objeto2 = new Persona();
        objeto2.nombre = "Jen-Hsun";
        objeto2.apellido = "Huang";
        objeto2.mostrarPersona();

    }
}
