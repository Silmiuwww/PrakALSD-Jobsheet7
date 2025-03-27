import java. util. Scanner;
public class MahasiswaBerprestasi12 {
    Mahasiswa12 listMhs[] = new Mahasiswa12[5];
    int idx;

    void tambah(Mahasiswa12 m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil(){
        for(Mahasiswa12 m : listMhs){
            m.tampil();
            System.out.println("----------------------------");
        }
    }

    int sequentialSearching(double cari){
        int posisi = -1;
        for (int j=0; j<listMhs.length; j++){
            if (listMhs[j].ipk == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos){
        if (pos != -1){
            System.out.println("data mahasiswa dengan IPK : "+ x +" ditemukan pada indeks "+pos);
        }else{
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos){
        if (pos != -1){
            System.out.println("nim : " + listMhs[pos].nim);
            System.out.println("nama : " + listMhs[pos].nama);
            System.out.println("kelas : " + listMhs[pos].kelas);
            System.out.println("ipk : " + x);
        }else{
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }

    int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left){
            mid = (left+right)/2;
            if (cari == listMhs[mid].ipk){
                return (mid);
            }
            else if (listMhs[mid].ipk>cari){
                return findBinarySearch(cari, left, mid-1);
            }
            else{
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }    
}

