import java.util.Scanner;

public class Leccion_090 {
    public static void main(String[] args) {
        
        System.out.println("proporcione un valor:");
        var numero = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("¿Es numero par? " + esPar(numero));

    }

    // funicon static, porque la main es static.
    static boolean esPar(int numero){
        // vemos el residuo. debe ser 0
        if (numero % 2 ==0)
            return true;
        else
            return false;
    }
}
