import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        
        System.out.println("sebelum menukar nilai variabel");
        System.out.println("nilai a : " +a);
        System.out.println("nilai b : " +b);
        
        //menukar nilai variabel
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("sesuda menukar nilai variab");
        System.out.println("nilai a :"+a);
        System.out.println("nilai b :"+b);
        
        
        
    }
}

