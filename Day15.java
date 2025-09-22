package ProjekAritmarima;
import java.util.Scanner;

public class hasim {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int angka;
        int bilangan;
        int c;
        System.out.print("masukkan bilangan = ");
        bilangan = input.nextInt();
        System.out.print("masukkan angka = ");
        angka = input.nextInt();
        c = bilangan + angka;
        System.out.printf(bilangan + " + " + angka + " = ");
        System.out.println(c);
    }
    
}
