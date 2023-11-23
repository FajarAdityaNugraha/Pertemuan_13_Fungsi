import java.util.Scanner;

/**
 * StudiKasus10
 */
public class StudiKasus10 {
    static String[] namaMhs;
    static int[][] nilaiTgs = new int[5][7];
    public static void inputNilai() {
        Scanner input10 = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMhs = input10.nextInt();
        namaMhs = new String[jmlMhs];
        System.out.print("Masukkan jumlah tugas: ");
        int jmlTgs = input10.nextInt();
        nilaiTgs = new int[jmlMhs][jmlTgs];
        for (int i = 0; i < namaMhs.length; i ++){
            System.out.println("Masukkan Nama mahasiswa :");
            namaMhs[i] = input10.next();
            System.out.println("Masukkan Nilai Tugas Mahasiswa " + namaMhs[i] + ": ");
            for (int j = 0; j < nilaiTgs[i].length; j++){
                nilaiTgs[i][j] = input10.nextInt();
            }
        }
        System.out.println();
    }
    public static void tampilkanNilaiMhs(){
        System.out.println("\nSeluruh Nilai Mahasiswa :");
        System.out.printf("| %-10s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |\n", "NAMA", "MINGGU 1", "MINGGU 2", "MINGGU 3", "MINGGU 4", "MINGGU 5", "MINGGU 6", "MINGGU 7");
        for (int i = 0; i < namaMhs.length; i++) {
            System.out.printf("| %-10s", namaMhs[i]);
            for (int j = 0; j < nilaiTgs[i].length; j++) {
                System.out.printf(" | %-15s", nilaiTgs[i][j]);
            }
            System.out.println(" |");
        }
        System.out.println();
    }
    public static int mingguNilaiTertinggi(){
        int mingguTertinggi =  0;
        int nilaiTertinggi = 0;

        for (int j = 0; j < nilaiTgs[0].length; j++){
            int totalNilaiPerminggu = 0;
            for (int i = 0; i < namaMhs.length; i++){
                totalNilaiPerminggu += nilaiTgs[i][j];
            }
            if (totalNilaiPerminggu > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiPerminggu;
                mingguTertinggi = j + 1;
            }
        }
        return mingguTertinggi;
   }
   public static void mhsNilaiTertinggi (int minggu){
    int nilaiTertinggi = 0;
    String mhsNilaiTertinggi = "";

    for (int i = 0; i < namaMhs.length; i++){
        if (nilaiTgs[i][minggu - 1] > nilaiTertinggi){
            nilaiTertinggi = nilaiTgs[i][minggu -  1];
            mhsNilaiTertinggi = namaMhs[i];
        }
    }
    System.out.println("Mahasiswa dengan nilai tertinggi adalah " + mhsNilaiTertinggi + " dengan nilai " + nilaiTertinggi + ", pada minggu ke-" + minggu + ".");
   }
   public static void main(String[] args) {
    inputNilai();
    tampilkanNilaiMhs();
    int mingguTertinggi =  mingguNilaiTertinggi();
    System.out.println("Pada minggu ke-" + mingguTertinggi + " terdapat nilai mahasiswa yang lebih tinggi dibandingkan nilai mahasiswa di minggu lain.");
    mhsNilaiTertinggi(mingguTertinggi);
   }
}