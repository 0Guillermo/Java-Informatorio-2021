import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("ingrese un numero");
        int num = scan.nextInt();
        System.out.println("ingrese el segundo numero");
        int num2 = scan.nextInt();
        scan.close();
        int resultado = 0;
        for (int i=1; i<=num2; i++){
            resultado += num;
        }
        System.out.println("el resultado de:");
        System.out.println(num+"*"+num2+" = "+resultado);
    }
    
}
