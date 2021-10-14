import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("ingrese un numero para imprimir la secuencia de numeros");
        int num = scan.nextInt();
        scan.close();
        for (int i=1; i<=num; i++){
            List<Integer> lista = new ArrayList<Integer>();
            for (int g=1; g<=i; g++){
                lista.add(g);
            }
            System.out.println(lista);
        }
    }
}
