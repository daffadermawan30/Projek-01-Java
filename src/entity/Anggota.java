package entity;

public class Anggota {
    private String id;
    private String nama;
    private String alamat;

    public Anggota(String id, String nama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
    }

    public void tampilkanInfo() {
        System.out.println("[" + id + "] " + nama + " - " + alamat);
    }

	public String getId() {
		return this.id;
	}

	public String getNama() {
		return this.nama;
	}

	public String getAlamat() {
		return this.alamat;
	}


    
    
}
