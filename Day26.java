import java.util.Scanner;
public class Mains {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan nilai : ");
        int angka = input.nextInt();
        
        angka += 6;
        System.out.println("setelah angka +=6 _> : " +angka);
        angka -= 4;
        System.out.println("setelah angka +=4 _> : " +angka);
        angka *= 2;
        System.out.println("setelah angka +=2 _> : " +angka);
        angka /= 7;
        System.out.println("setelah angka +=7 _> : " +angka);
        angka %= 8;
        System.out.println("setelah angka +=8 _> : " +angka);
        
    }
    
}
