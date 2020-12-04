package uts.if2.pkg10119052.rizkidwinugraha.no1;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program Tandanya Kamu (Test Kepribadian)
 * 
 */
public class UTSIF210119052RIZKIDWINUGRAHANo1 {
    public static int yearNow, umur;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        yearNow = Calendar.getInstance().get(Calendar.YEAR);
        Age usia = new Age(yearNow);
        System.out.print("Masukkan Tahun Lahir Anda : ");
        usia.setYearBirth(input.nextInt());
        System.out.println();
        System.out.println("======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : "+usia.getYearBirth());
        System.out.println("Hari ini tahun : "+usia.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah : "+usia.hitungUmur()+"Tahun");
        System.out.println("Tandanya kamu "+usia.tandanyaKamu(umur));
    }
    
}
