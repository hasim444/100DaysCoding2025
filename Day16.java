import java.util.Scanner;
public class tugas {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte angka1;
        byte angka2;
        System.out.print("Aritmatika perkalian dan pembagian");
        System.out.print("masukan angka1 :");
        angka1 = input.nextByte();
        System.out.print("masukan angka2 :");
        angka2 = input.nextByte();
        int hasil, hasil2;
        hasil = angka1 * angka2;
        hasil2 = angka1 / angka2;
        System.out.println("perkalian : "+hasil);
        System.out.println("pembagian : "+ hasil2);
        
    }
    
}
