package entity;

public class Anggota {
    String id;
    String nama;
    String alamat;

    public Anggota(String id, String nama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
    }

    public void tampilkanInfo() {
        System.out.println("[" + id + "] " + nama + " - " + alamat);
    }
}
