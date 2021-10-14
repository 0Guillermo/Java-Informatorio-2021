import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String texto,letra;
        int contador = 0;
        System.out.println("ingrese una oracion o una palabra");
        texto = scan.nextLine();
        System.out.println("ingrese la letra que quiera saber cuantas veces se repite en la oracion o palabra");
        letra = scan.nextLine();

        char[] chars = texto.toCharArray();

        for (char ch: chars){
            char c1 = letra.charAt(0);
            if (ch==c1){
                contador = contador +1;   
            }
        }
        System.out.println("se encontro "+contador+" coincidencia");
    }
}
