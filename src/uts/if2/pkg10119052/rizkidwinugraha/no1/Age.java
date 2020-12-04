package uts.if2.pkg10119052.rizkidwinugraha.no1;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program Tandanya Kamu (Test Kepribadian)
 * 
 */
public class Age {
    private int yearNow;
    private int yearBirth;
    
    public Age(int yearNow){
        this.yearNow = yearNow;
    }
    
    public int getYearBirth(){
        return yearBirth;
    }
    
    public void setYearBirth(int yearBirth){
        this.yearBirth = yearBirth;
    }
    
    public int getYearNow(){
        return yearNow;
    }
    
    public void setYearNow(int yearNow){
        this.yearNow = yearNow;
    }
    
    public int hitungUmur(){
        return yearNow-yearBirth;
    }
    
    public String tandanyaKamu(int umur){
        String tanda;
        umur = hitungUmur();
        if (0>umur&&umur<=5)tanda="LAGI LUCU-LUCUNYA";
        else if (5>umur&&umur<=10)tanda="MASIH ANAK-ANAK";
        else if (10>umur&&umur<=13)tanda="MASIH REMADJA";
        else if (13>umur&&umur<=19)tanda="ALAY";
        else if (19>umur&&umur<=29)tanda="LAGI GALAU NYARI JODOH";
        else if (29>umur&&umur<=35)tanda="LAGI SIBUK NYARI UANG";
        else if (35>umur&&umur<=150)tanda="SUDAH TUA";
        else tanda="TIDAK TERDETEKSI KEHIDUPAN";
        
        return tanda;
    }
}
