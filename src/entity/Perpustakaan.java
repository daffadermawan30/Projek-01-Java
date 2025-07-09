package entity;

import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
	List<Buku> kumpulanBuku;
	List<Anggota> kumpulanAnggota;
	
	public Perpustakaan() {
		this.kumpulanBuku = new ArrayList<>();
		this.kumpulanAnggota = new ArrayList<>();
	}
	
	public void addBuku(Buku buku) {
        this.kumpulanBuku.add(buku);
        System.out.println("INFO: Buku '" + buku.getJudul() + "' berhasil ditambahkan.");
    }
	
	public void addAnggota(Anggota anggota) {
        this.kumpulanAnggota.add(anggota);
        System.out.println("INFO: Buku '" + anggota.getNama() + "' berhasil ditambahkan.");
    }
	
	public void showAllBooks() {
        System.out.println("\n--- Daftar Buku di Perpustakaan ---");
        for (Buku book : this.kumpulanBuku) {
            System.out.println(
                "ID: " + book.getId() + 
                ", Judul: " + book.getJudul() + 
                ", Penulis: " + book.getPenulis() + 
                ", Kategori: " + book.getCategory() + // Polymorphism in action!
                ", Status: " + (book.tersedia() ? "Dipinjam" : "Tersedia")
            );
        }
        System.out.println("------------------------------------");
    }
	
	public boolean borrowBook(String bookId) throws BukuException {
        // Cari buku berdasarkan ID
        for (Buku book : this.kumpulanBuku) {
            if (book.getId().equals(bookId)) {
                if (book.tersedia()) {
                    book.setTersedia(false);
                    System.out.println("SUCCESS: Buku '" + book.getJudul() + "' berhasil dipinjam.");
                    return true; // Operasi berhasil
                } else {
                	throw new BukuException("Buku '" + book.getJudul() + "' sedang dipinjam.");
                }
            }
        }
        // Jika loop selesai dan buku tidak ditemukan
        throw new BukuException("Buku dengan ID '" + bookId + "' tidak ditemukan.");
    }
	
	public boolean returnBook(String bookId) throws BukuException {
        // Cari buku berdasarkan ID
        for (Buku book : this.kumpulanBuku) {
            if (book.getId().equals(bookId)) {
                // Jika buku ditemukan, cek statusnya
                if (!book.tersedia()) {
                    // Jika statusnya memang dipinjam, kembalikan
                    book.setTersedia(true);
                    System.out.println("SUCCESS: Buku '" + book.getJudul() + "' berhasil dikembalikan.");
                    return true; // Operasi berhasil
                } else {
                    // Jika statusnya tidak sedang dipinjam
                    throw new BukuException("ERROR: Buku '" + book.getJudul() + "' tidak sedang dalam status dipinjam.");                    
                }
            }
        }
        throw new BukuException("Buku dengan ID '" + bookId + "' tidak ditemukan.");
    }
}
