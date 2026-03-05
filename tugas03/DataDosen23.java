package tugas03;

public class DataDosen23 {
    public void dataSemuaDosen(Dosen23[] arrayOfDosen) {
        System.out.println("\n======= DATA SEMUA DOSEN =======");
        for (Dosen23 d : arrayOfDosen) {
            String jk = d.jenisKelamin ? "Pria" : "Wanita";
            System.out.println("Kode         : " + d.kode);
            System.out.println("Nama         : " + d.nama);
            System.out.println("Jenis Kelamin: " + jk);
            System.out.println("Usia         : " + d.usia);
            System.out.println("--------------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen23[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen23 d : arrayOfDosen) {
            if (d.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen23[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosen23 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalUsiaPria += d.usia;
                jmlPria++;
            } else {
                totalUsiaWanita += d.usia;
                jmlWanita++;
            }
        }

        System.out.println("Rata-rata Usia Pria   : " + (jmlPria > 0 ? (double)totalUsiaPria/jmlPria : 0));
        System.out.println("Rata-rata Usia Wanita : " + (jmlWanita > 0 ? (double)totalUsiaWanita/jmlWanita : 0));
    }

    public void infoDosenPalingTua(Dosen23[] arrayOfDosen) {
        Dosen23 tertua = arrayOfDosen[0];
        for (Dosen23 d : arrayOfDosen) {
            if (d.usia > tertua.usia) tertua = d;
        }
        System.out.println("Dosen Paling Tua: " + tertua.nama + " (" + tertua.usia + " tahun)");
    }

    public void infoDosenPalingMuda(Dosen23[] arrayOfDosen) {
        Dosen23 termuda = arrayOfDosen[0];
        for (Dosen23 d : arrayOfDosen) {
            if (d.usia < termuda.usia) termuda = d;
        }
        System.out.println("Dosen Paling Muda: " + termuda.nama + " (" + termuda.usia + " tahun)");
    }
}
