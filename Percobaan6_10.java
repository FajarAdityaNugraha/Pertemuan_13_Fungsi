import java.util.Scanner;
/**
 * Percobaan6_10
 */
public class Percobaan6_10 {
static int hitungLuas (int pjg, int lb) {
        int Luas=pjg*lb;
        return Luas;
    }
    static int hitungVolume (int tinggi, int a, int b) {
        int volume = hitungLuas(a,b)*tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        int p,l,t,L,vol;
        System.out.println("Masukkan panjang");
        p=input10.nextInt();
        System.out.println("Masukkan lebar");
        l=input10.nextInt();
        System.out.println("Masukkan tinggi");
        t=input10.nextInt();
        L=hitungLuas(p,l);
        System.out.println("Luas Persegi Panjang adalah "+L);
        vol=hitungVolume(t, p, l);
        System.out.println("Volume Balok adalah "+vol);
    }
}