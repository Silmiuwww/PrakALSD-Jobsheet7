import java.util.Scanner;

public class DosenDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen12 data = new DataDosen12();

        System.out.println("=================================");
        System.out.println("Masukkan Data Dosen (diurutkan berdasarkan usia)");
        System.out.println("=================================");
        for (int i = 0; i < 5; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.print("NIDN : ");
            String nidn = sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Usia : ");
            int usia = sc.nextInt();
            sc.nextLine();
            data.tambah(new Dosen12(nidn, nama, usia));
        }

        data.tampil();

        System.out.println("=================================");
        System.out.print("Masukkan nama dosen yang dicari (sequential) : ");
        String cariNama = sc.nextLine();
        data.PencarianDataSequential12(cariNama);

        System.out.println("=================================");
        System.out.print("Masukkan usia dosen yang dicari (binary) : ");
        int cariUsia = sc.nextInt();
        data.PencarianDataBinary12(cariUsia);
    }
}
