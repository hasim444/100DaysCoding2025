import java.util.Scanner;
public class ProjekAritmatika {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("<==== tipe data besar ke kecil ====>");

        System.out.print("Masukkan angka (double): ");
        double angka1 = input.nextDouble();
        System.out.println("1. double = " + angka1);
        float angka2 = (float) angka1;   
        System.out.println("2. float  = " + angka2);
        long angka3 = (long) angka2;     
        System.out.println("3. long   = " + angka3);
        int angka4 = (int) angka3;          
        System.out.println("4. int    = " + angka4);
        short angka5 = (short) angka4;   
        System.out.println("5. short  = " + angka5);
        byte angka6 = (byte) angka5;     
        System.out.println("6. byte   = " + angka6);

        System.out.println("<=================================>");
    }
}
