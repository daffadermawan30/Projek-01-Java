package entity;

public class BukuException extends Exception {
	public BukuException(String message) {
        // 'super(message)' memanggil constructor dari parent class (Exception)
        // untuk menyimpan pesan error tersebut.
        super(message);
    }
}
