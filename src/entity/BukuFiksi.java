package entity;

public class BukuFiksi extends Buku {

	public BukuFiksi(String judul, String penulis, int tahun, String id) {
		super(judul, penulis, tahun, id);
		// TODO Auto-generated constructor stub
	}

	public String getCategory() {
		return "Fiksi";
	}
}
