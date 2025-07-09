package entity;

abstract class Buku {
    private String judul;
    private String penulis;
    private int tahun;
    private String id;
    private boolean tersedia;

    public Buku(String judul, String penulis, int tahun, String id) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
        this.id = id;
        this.tersedia = false;
    }

    public void tampilkanInfo() {
        System.out.println("[" + id + "] " + judul + " - " + penulis + " (" + tahun + ") " +
                (tersedia ? "[Tersedia]" : "[Dipinjam]"));
    }
    
    public abstract String getCategory();

	public String getJudul() {
		return this.judul;
	}

	public String getPenulis() {
		return this.penulis;
	}

	public int getTahun() {
		return this.tahun;
	}

	public String getId() {
		return this.id;
	}

	public boolean tersedia() {
		return this.tersedia;
	}
	public void setTersedia(boolean tersedia) {
		this.tersedia = tersedia;
	}
    
}
