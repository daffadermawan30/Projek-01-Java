package entity;

public class Buku {
    String judul;
    String penulis;
    int tahun;
    String id;
    boolean tersedia = true;

    public Buku(String judul, String penulis, int tahun, String id) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
        this.id = id;
    }

    public void tampilkanInfo() {
        System.out.println("[" + id + "] " + judul + " - " + penulis + " (" + tahun + ") " +
                (tersedia ? "[Tersedia]" : "[Dipinjam]"));
    }
}
