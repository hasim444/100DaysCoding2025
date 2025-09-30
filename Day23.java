import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Panjang : ");
        double panjang = input.nextDouble();
        System.out.print("Luad \t: ");
        double luas = input.nextDouble();
        double hasil;
        hasil = panjang*luas;
        System.out.println("panjang\t:"+panjang+ "cm");
        System.out.println("luas \t:"+luas+ "cm");
        
        
         
    }
}
