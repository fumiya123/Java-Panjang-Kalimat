import java.util.Scanner;

public class HitungHuruf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // input kalimat
        System.out.print("Masukkan kalimat = ");
        String kalimat = scanner.nextLine();
        
        // hitung panjang kalimat termasuk spasi, menggunakan fungsi length()
        int panjangKalimat = kalimat.length();
        
        // variabel untuk menampung jumlah huruf vokal dan konsonan
        int jumlahVokal = 0;
        int jumlahKonsonan = 0;
        
        // set huruf vokal
        String vokal = "AEIOUaeiou";
        
        // perulangan sebanyak panjang kalimat
        for (char ch : kalimat.toCharArray()) { // toCharArray() mengonversi string menjadi array dari variabel kalimat
            // memeriksa ch berisi huruf atau tidak
            if (Character.isLetter(ch)) {
                // memeriksa apakah ch memeiliki huruf yang sama dengan yang ada di variabel vokal
                if (vokal.indexOf(ch) != -1) {
                    jumlahVokal++; // jika iya tambah 1 untuk variabel jumlaVokal
                } else {
                    jumlahKonsonan++; // jika tidak tambah 1 untuk varabel jumlahKonsonan
                }
            }
        }
        
        // hasil
        System.out.println("Panjang kalimat = " + panjangKalimat);
        System.out.println("Jumlah huruf vokal = " + jumlahVokal);
        System.out.println("Jumlah huruf konsonan = " + jumlahKonsonan);
        
        scanner.close();
    }
}
