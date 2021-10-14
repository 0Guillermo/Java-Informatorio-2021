import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("ingrese dos numeros uno a la ves");
        System.out.println("ingrese el primer numero");
        int num1 = scan.nextInt();
        System.out.println("ingrese el segundo numero");
        int num2 = scan.nextInt();
        scan.close();
        System.out.println(num1+" + "+num2 +" = "+ (num1+num2));
        System.out.println(num1+" - "+num2 +" = "+ (num1-num2));
        System.out.println(num1+" * "+num2 +" = "+ (num1*num2));
        System.out.println(num1+" / "+num2 +" = "+ (num1/num2));
        System.out.println(num1+" % "+num2 +" = "+ (num1%num2));
    }
}
