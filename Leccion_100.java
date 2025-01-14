import java.util.Scanner;

public class Leccion_100 {
    
    public static void main(String[] args) {
        generadorEmail();
    }

    static void generadorEmail(){
        System.out.println("*** Generador Emails ***");
        var consola = new Scanner (System.in);
        System.out.print("Cual es tu nombre? ");
        var nombre = consola.nextLine().toLowerCase();
        System.out.print("Cual es tu apellido? ");
        var apellido = consola.nextLine().toLowerCase();
        var dominio = "globalmentoring.com.mx";
        var dominioNvidia = "nvidia.com";
        
        System.out.println(apellido);

        if (apellido == "su"){
            var emailGenerado = nombre + "." + apellido + "@" + dominioNvidia;
            System.out.println("Felicidades! Tu email es: " + emailGenerado);
        }
        else{
            var emailGenerado = nombre + "." + apellido + "@" + dominio;
            System.out.println("Felicidades! Tu email es: " + emailGenerado);
        }
        
        // System.out.println("Felicidades! Tu email es: " + emailGenerado);
    }
}
