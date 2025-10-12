package javaapplication5;
import java.util.Scanner;
 public class Hasimn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nilai :");
        int angka = input.nextInt();
        
        if (angka >= 50){
            System.out.print("anda tidak sukses");
    }else{
        System.out.print("anda sukses");
    }
    }
}
