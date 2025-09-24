import java.util.Scanner;
public class projek_belajar {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long angka1;
        long angka2;
        long c;
        System.out.print("angka = ");
        angka1 = input.nextInt();
        System.out.print("angka = ");
        angka2 = input.nextInt();
        c = angka1 * angka2;
        System.out.println(angka1 + " × " + angka2 + " = " + c);
        c = angka1 / angka2;
        System.out.println(angka1 + " : " + angka2 + " = " + c);
        c = angka1 % angka2;
        System.out.println(angka1 + " % " + angka2 + " = " + c);
        
    }
}
