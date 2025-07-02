package app;

import entity.Buku;
import entity.Anggota;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // --- Daftar Buku ---
        ArrayList<Buku> daftarBuku = new ArrayList<>();
        daftarBuku.add(new Buku("Laskar Pelangi", "Andrea Hirata", 2005, "B001"));
        daftarBuku.add(new Buku("Bumi", "Tere Liye", 2014, "B002"));

        System.out.println("Daftar Buku:");
        for (Buku b : daftarBuku) {
            b.tampilkanInfo();
        }

        // --- Daftar Anggota ---
        ArrayList<Anggota> daftarAnggota = new ArrayList<>();
        daftarAnggota.add(new Anggota("A001", "Daffa Dermawan", "Bandung"));
        daftarAnggota.add(new Anggota("A002", "Putri Ayu", "Jakarta"));

        System.out.println("\nDaftar Anggota:");
        for (Anggota a : daftarAnggota) {
            a.tampilkanInfo();
        }
    }
}
