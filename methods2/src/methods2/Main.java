package methods2;

public class Main {



	public static void main(String[] args) {
		String mesaj ="Bug�n hava �ok g�zel";
		
		String yeniMesaj=sehir();
		System.out.println(yeniMesaj);
	}
	public static void ekle() {
		System.out.println("Eklendi");

    }
	
	
	public static void sil() {
		System.out.println("Silindi");
	}
	
	
	public static void guncelle() {
		System.out.println("G�ncellendi");
	}
	
	public static String sehir()
	{
		return "Ankara";
	}
	
	
}
