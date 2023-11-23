import java.util.Scanner;
/**
 * Ucapan_10
 */
public class Ucapan_10 {

    public static String PenerimaUcapan() {
        Scanner input10 = new Scanner(System.in);
        System.out.println("Tuliskan Nama orang yang ingin Anda beri ucapan: ");
        String namaOrang = input10.nextLine();
        input10.close();
        return namaOrang;
    }
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+"\nMay the force be with you.");
    }
}