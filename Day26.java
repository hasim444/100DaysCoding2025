import java.util.Scanner;
public class Mains {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan nilai : ");
        int A = input.nextInt();
        
        A += 6;
        System.out.println("setelah a +=6 _> : " +A);
        A -= 4;
        System.out.println("setelah a -=4 _> : " +A);
        A *= 2;
        System.out.println("setelah a *=2 _> : " +A);
        A /= 7;
        System.out.println("setelah a /=7 _> : " +A);
        A %= 8;
        System.out.println("setelah a %=8 _> : " +A);
        
    }
    
}
