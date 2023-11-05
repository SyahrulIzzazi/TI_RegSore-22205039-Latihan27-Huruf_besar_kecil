package ti_regsore.pkg22205039.latihan27.huruf_besar_kecil;
/*
NAMA    : Syahrul Izzazi
NIM     : 22205039
PRODI   : TI RegSore
DESKRIPSI : Program menampilkan formatting kalimat menjadi huruf besar dan kecil
*/
import java.text.SimpleDateFormat;
import java.util.Date;
public class TI_RegSore22205039Latihan27Huruf_besar_kecil {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println("Hari ini adalah hari : " + formatter.format(date));
    }
}