import java.util.Scanner;
public class MahasiswaDemo12 {
    public static void main(String[] args) {
        MahasiswaBerprestasi12 list = new MahasiswaBerprestasi12();
        Scanner sc = new Scanner(System.in);
        int jumMhs = 5;

        for (int i=0; i<jumMhs; i++){
            System.out.println("-------------------------------");
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 
            list.tambah(new Mahasiswa12(nim, nama, kelas, ipk));
        }

        list.tampil();
        System.out.println("--------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------------------------");
        System.out.print("Masukkan IPK mahasiswa yang dicari: ");
        double cari = sc.nextDouble();

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        System.out.println("======================================");
        System.out.println("Pencarian data");
        System.out.println("======================================");
        System.out.print("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK : ");
        double cari2 = sc.nextDouble();

        System.out.println("======================================");
        System.out.println("menggunakan binary searching");
        System.out.println("======================================");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2= (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

    }
}
