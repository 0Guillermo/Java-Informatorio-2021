import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("calcular la potencia de dos numeros");
        System.out.println("ingrese el primer numero");
        int num1 = scan.nextInt();
        System.out.println("ingrese el segundo numero");
        int num2 = scan.nextInt();
        scan.close();
        int total = 1;
        for (int i=1; i<=num2; i++){
            total *= num1; 
        }
        System.out.println("el resultado de:");
        System.out.println(num1 + " elevado a " + num2 + " = "+total);
    }
}
