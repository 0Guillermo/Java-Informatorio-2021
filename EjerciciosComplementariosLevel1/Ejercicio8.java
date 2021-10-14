import java.util.Scanner;

public class Ejercicio8{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomApel,edad,direccion,ciudad;
        System.out.println("ingrese su nombre y apellido");
        nomApel = scan.nextLine();

        System.out.println("ingrese su edad");
        edad = scan.nextLine();

        System.out.println("ingrese su direccion");
        direccion = scan.nextLine();

        System.out.println("ingrese su ciudad");
        ciudad = scan.nextLine();
        scan.close();
        
        Object cadenaStr = String.format("%-1s - %-2s - %-3s - %-4s",ciudad,direccion,edad,nomApel);
        System.out.println(cadenaStr);

    }
}
