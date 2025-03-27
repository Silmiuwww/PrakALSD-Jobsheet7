import java. util. Scanner;
public class DataDosen12 {
    Dosen12[] listDosen = new Dosen12[5];
    int idx = 0;

    void tambah(Dosen12 d) {
        if (idx < listDosen.length) {
            listDosen[idx] = d;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Dosen12 d : listDosen) {
            d.tampil();
            System.out.println("-----------------------------");
        }
    }

    void PencarianDataSequential12(String cari) {
        int count = 0;
        for (int i = 0; i < listDosen.length; i++) {
            if (listDosen[i].nama.equalsIgnoreCase(cari)) {
                System.out.println("Data ditemukan pada indeks ke-" + i);
                listDosen[i].tampil();
                count++;
            }
        }
        if (count > 1) {
            System.out.println("PERINGATAN: Terdapat lebih dari satu data yang ditemukan!");
        } else if (count == 0) {
            System.out.println("Data tidak ditemukan!");
        }
    }

    void PencarianDataBinary12(int cari) {
        int left = 0, right = listDosen.length - 1, count = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (listDosen[mid].usia == cari) {
                for (int i = 0; i < listDosen.length; i++) {
                    if (listDosen[i].usia == cari) {
                        System.out.println("Data ditemukan pada indeks ke-" + i);
                        listDosen[i].tampil();
                        count++;
                    }
                }
                if (count > 1) {
                    System.out.println("PERINGATAN: Terdapat lebih dari satu data yang ditemukan!");
                }
                return;
            } else if (listDosen[mid].usia < cari) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Data tidak ditemukan!");
    }
}
