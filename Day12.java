import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variabel
        String nama;
        int umur;
        double tinggi;

        // Input 
        System.out.print("Masukkan nama   : ");
        nama = sc.nextLine();

        System.out.print("Masukkan umur   : ");
        umur = sc.nextInt();

        System.out.print("Masukkan tinggi : ");
        tinggi = sc.nextDouble();
        
        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur);
        System.out.println("Tinggi : " + tinggi);
    }
}
