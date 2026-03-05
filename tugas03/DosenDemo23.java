package tugas03;
import java.util.Scanner;

public class DosenDemo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen23[] arrayOfDosen = new Dosen23[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            String dummy = sc.nextLine().toUpperCase();
            boolean jk = (dummy.equalsIgnoreCase("PRIA"));
            System.out.print("Usia          : ");
            int usia = Integer.parseInt(sc.nextLine());
            
            arrayOfDosen[i] = new Dosen23(kode, nama, jk, usia);
            System.out.println("-".repeat(30));
        }

        // Menggunakan Foreach untuk menampilkan data (sesuai instruksi)
        System.out.println("\n=== MENAMPILKAN DATA DOSEN ===");
        for (Dosen23 dosen : arrayOfDosen) {
            System.out.println("Dosen: " + dosen.nama + " [" + dosen.kode + "]");
        }

        // Memanggil Method dari DataDosen
        DataDosen23 dataDosen = new DataDosen23();
        dataDosen.dataSemuaDosen(arrayOfDosen);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        dataDosen.infoDosenPalingMuda(arrayOfDosen);

        sc.close();
    }
}
