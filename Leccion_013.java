/*
 * var sirve para inferir el tipo de dato
 * es como python pero con unas restricciones.
 * por ejemplo 
 * var dato = 10
 * int dato = 10
 * 
 * la primera definicion de var es la que manda.
 * desde el inicion hay que poner el vaor de var
 */

public class Leccion_013 {
    
    public static void main (String[] args){

        // Variables
    //        int edad1;
    //        edad1 = 40;
    var edad = 30;
    var sueldo = 20300.50;
    var nombre = "Juan";
    // Acceder a los valores
    System.out.println("Edad: " + edad);
    System.out.println("Sueldo: " + sueldo);
    System.out.println("Nombre: " + nombre);
    // Modificar el valor de las variables
    edad = 55;
    sueldo = 300.80;
    nombre = "Carlos";
    System.out.println("Edad modificada: " + edad);
    System.out.println("Sueldo modificado: " + sueldo);
    System.out.println("Nombre: " + nombre);
    }

}
