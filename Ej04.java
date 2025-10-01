import java.util.Scanner;
public class Ej04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qué números quieres sumar?");
        int numero1 = sc.nextInt();
        sc.nextLine();
        int numero2 = sc.nextInt();
        System.out.println("El resultado es " + (numero1+numero2));
    } 
}