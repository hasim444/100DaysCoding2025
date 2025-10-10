package javaapplication5;
import java.util.Scanner;
 public class Hasimn {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a,b;
        
        System.out.print("Masukkan angka:");
        a = input.nextInt();
        System.out.print("Masukkan angka:");
        b = input.nextInt();
        
        System.out.println("(a > b)\t: " + !(a > b));
        System.out.println("(a < b)\t: " + !(a < b));
        
    }
}
