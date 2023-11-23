import java.util.Scanner;
/**
 * UcapanTerimaKasih_10
 */
public class UcapanTerimaKasih_10 {

    public static String PenerimaUcapan() {
        Scanner input10 = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = input10.nextLine();
        input10.close();
        return namaOrang;
    }
    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.print("Thank you "+nama+" for being the best teacher in the world.\n"+"You inspired in me a love for learning and made me feel like I could ask you anything.");
    }
    public static void UcapanTambahan(String ucapan) {
        System.out.print(ucapan);
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
        UcapanTambahan(" I hope in the future i can be like you");
    }
}