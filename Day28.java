import java.util.Scanner;
public class Hasimm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a,b,c;
        
        System.out.print("Masukkan a: ");
        a = input.nextInt();
        System.out.print("Masukkan b: ");
        b = input.nextInt();
        System.out.print("Masukkan c: ");
        c = input.nextInt();
        // input untuk hasil
        System.out.println("hasil dari a,b,c");
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a!=b);
        System.out.println(a!=c);
    }
}
