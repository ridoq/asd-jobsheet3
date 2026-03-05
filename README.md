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

#   Percobaan 2

##  Soal

1.  Tambahkan method `cetakInfo()` pada class Mahasiswa kemudian modifikasi kode program pada langkah no 3.
2.  Misalkan Anda punya array baru bertipe array of Mahasiswa dengan nama `myArrayOfMahasiswa`. Mengapa kode berikut menyebabkan error?

    ```java
    Mahasiswa[] myArrayOfMahasiswa = new Mahasiswa[3];
    myArrayOfMahasiswa[0].nim = "244107060033";
    myArrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
    myArrayOfMahasiswa[0].kelas = "SIB-1E";
    myArrayOfMahasiswa[0].ipk = (float) 3.75;
    ```

---

##  Jawaban

1.  Dengan menambahkan method `cetakInfo()` pada class Mahasiswa23, proses penampilan data pada class MahasiswaDemo23 menjadi lebih ringkas. Kita cukup memanggil `arrayOfMahasiswa[i].cetakInfo()` di dalam perulangan tanpa harus menuliskan perintah System.out.println secara berulang untuk setiap atribut di main class.

2.  Kode tersebut menyebabkan error **NullPointerException**. Hal ini terjadi karena baris pertama `new Mahasiswa[3]` hanya membuat array yang mampu menampung 3 objek, namun setiap elemen di dalam array tersebut (indeks 0, 1, dan 2) masih bernilai `null` (belum diinstansiasi). Agar tidak error, harus dilakukan instansiasi objek pada indeks yang dituju terlebih dahulu, misalnya: `myArrayOfMahasiswa[0] = new Mahasiswa();`.

---