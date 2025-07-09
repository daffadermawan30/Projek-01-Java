package app;

import java.util.Scanner;

import entity.Anggota;
import entity.BukuException;
import entity.BukuFiksi;
import entity.BukuNonFiksi;
import entity.Perpustakaan;

public class Main {

    public static void main(String[] args) {
        // 1. Inisialisasi objek-objek utama
        Perpustakaan library = new Perpustakaan();
        Scanner scanner = new Scanner(System.in);

        // 2. Menambahkan beberapa data awal ke perpustakaan
        System.out.println("Memuat data awal...");
        library.addBuku(new BukuFiksi("Bumi", "Tere Liye", 2012, "F001"));
        library.addBuku(new BukuNonFiksi("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 1998, "NF001"));
        library.addBuku(new BukuFiksi("Laskar Pelangi", "Andrea Hirata", 2003 ,"F002"));
        library.addAnggota(new Anggota("M001", "Andi", "Tangerang"));
        library.addAnggota(new Anggota("M002", "Budi", "Jakarta"));
        System.out.println("Data berhasil dimuat.\n");

        // 3. Loop utama aplikasi
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("===== Sistem Perpustakaan Digital =====");
            System.out.println("1. Tampilkan Semua Buku");
            System.out.println("2. Pinjam Buku");
            System.out.println("3. Kembalikan Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer scanner

            switch (choice) {
                case 1:
                    library.showAllBooks();
                    break;
                case 2:
                    System.out.print("Masukkan ID Buku yang akan dipinjam: ");
                    String borrowBookId = scanner.nextLine();
                    // 4. Menggunakan try-catch untuk menangani error
                    try {
                        library.borrowBook(borrowBookId);
                    } catch (BukuException e) {
                        // Blok 'catch' akan dieksekusi jika borrowBook melempar BookException
                        System.out.println("GAGAL: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Masukkan ID Buku yang akan dikembalikan: ");
                    String returnBookId = scanner.nextLine();
                    try {
                        library.returnBook(returnBookId);
                    } catch (BukuException e) {
                        System.out.println("GAGAL: " + e.getMessage());
                    }
                    break;
                case 4:
                    isRunning = false;
                    System.out.println("Terima kasih telah menggunakan sistem kami.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
            System.out.println(); // Memberi spasi untuk tampilan yang lebih rapi
        }

        scanner.close(); // Menutup scanner setelah selesai digunakan
    }
}
