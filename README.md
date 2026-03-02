#   Percobaan 1

##  Soal

1.  Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method? Jelaskan!
2.  Apa yang dilakukan oleh kode program berikut?

    ```java
        Mahasiswa23[] arrayOfMahasiswa = new Mahasiswa23[3];
    ```

3.  Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan konstruktur pada baris program berikut?

    ```java
        arrayOfMahasiswa[0] = new Mahasiswa23();
    ```

4.  Apa yang dilakukan oleh kode program berikut?

    ```java
        arrayOfMahasiswa[0].nim = "244107060033";
        arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa[0].kelas = "SIB-1E";
        arrayOfMahasiswa[0].ipk = (float) 3.75;
    ```

5.  Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2?
---


##  Jawaban

1.  Tidak harus, class yang akan dibuat array tidak wajib memiliki method, tapi biasanya minimal punya atribut sebagai representasi data.
2.  Kode tersebut berfungsi untuk mendeklarasikan array bernama arrayOfMahasiswa dan juga langsung melakukan instansiasi array.
3.  hal tersebut dapat dilakukan karena pada kelas mahasiswa tidak ada pembuatan konstruktor, jadi java secara otomatis akan membuatkan konstruktor default.
4.  Kode ini berfungsi untuk yang pertama mengakses objek arrayOfMahasiswa indeks ke-0 lalu mengisi atribut nim, nama, kelas, dan ipk pada class Mahasiswa23.
5.  Karena materi nya saat ini menggunakan prinsip OOP, jadi file nya harus dipisah sesuai dengan fungsi masing masing, class Mahasiswa23 berfungsi untuk menyimpan atribut", lalu MahasiswaDemo23 berfungsi untuk menjalankan program.

---

