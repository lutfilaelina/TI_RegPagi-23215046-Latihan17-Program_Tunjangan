/*
 *
 * @author 
 * NAMA     : Lutfi Laeli Nur Afiyah
 * KELAS    : Teknik Informatika 
 * NIM      : 23215046
 * Deskripsi Program : Program Tunjangan
 */

package Pertemuan6; 
import java.util.Scanner;

public class Latihan17 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("===============Program Tunjangan===============");
        
        //Meminta input gaji pokok
        System.out.print("Berapa gaji pokok Anda perbulan?: Rp. "); 
        double gajiPokok = scanner.nextDouble(); 

        //Meminta input status pernikahan pegawai
        System.out.print("Status Anda? (Menikah/Belum)    : ");
        String status = scanner.next().toLowerCase(); 
        
        /*variabel status yang telah diinput akan diubah menjadi lowercase 
          dengan method .toLowerCase() sehingga nantinya dapat memudahkan 
          pengecekan kondisi tanpa adanya kesalahan dalam memperhatikan 
          perbedaan huruf besar dan kecil.
        */

        //Perhitungan tunjangan
        double tunjangan = 0;
        if (status.equals("menikah")) {
            tunjangan = 0.35 * gajiPokok;
        }
        /*Jika user memasukkan status selain "menikah", maka dia akan mendapatkan 
          0 tunjangan.
          Saya sengaja tidak menuliskan kemungkinan else dari if di atas, supaya 
          syntax program ini lebih efisien.
        */ 

        //Total gaji
        double totalGaji = gajiPokok + tunjangan; 

        //Menampilkan hasil
        System.out.println("\n==========Hasil Perhitungan Gaji Anda==========");
        System.out.println("Gaji Pokok       : Rp " +  gajiPokok);
        System.out.println("Tunjangan        : Rp " +  tunjangan);
        System.out.println("Total Gaji       : Rp " +  totalGaji); 
        System.out.println("(Developed by : Lutfi Laeli Nur Afiyah)");

    }
}


