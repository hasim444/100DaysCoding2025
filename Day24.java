import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double L,K,r,d;
        System.out.print("masukkan : ");
        r = input.nextDouble();
        d = 2*r;
        
        L = r*r;
        K = d;
        System.out.println("L :" + L);
        System.out.println("K :" + d);
         
    }
}
