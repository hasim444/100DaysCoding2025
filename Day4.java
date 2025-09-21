public class Main {
    public static void main(String[] args) {

        // Variabel biodata berfungsi (untuk menyimpan dan menampilkan data pribadi seseorang
        String nama,prodi,hobi,alamat,tinggi;
        nama   = "Muh.Hasyim";
        int umur = 18;
        prodi  = "informatika";
        hobi   = "main bola";
        alamat   = "Malunda";
        tinggi = "170.5";

        

        //  Escape Sequence Mengatur format teks  biar output lebih rapi (misalnya pakai \n untuk baris baru, \t untuk tab, \" untuk tanda, \\ untuk backslash).).
        System.out.println("Nama\t: "+nama+"\nAsal\t: "+alamat+"\nProdi\t: "+prodi+"\nUmur\t: "+umur+"\nTinggi\t: "+tinggi);
    }
}
