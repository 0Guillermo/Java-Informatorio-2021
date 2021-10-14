import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        int total = 1;
        for (int i=2; i<=num; i++){
            total = total * i;
        }
        System.out.println("el factorial de "+ num +" es " + total );
    }
}
