package entity;

public class BukuNonFiksi extends Buku {

	public BukuNonFiksi(String judul, String penulis, int tahun, String id) {
		super(judul, penulis, tahun, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return "Non Fiksi";
	}

}
