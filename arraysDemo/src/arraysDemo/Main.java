package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1="Zeliha";
		String ogrenci2="Fatma";
		
		System.out.println(ogrenci1);
		System.out.println("---------------------");
		
		String[] ogrenciler = new String[3];
		ogrenciler[0]="Zeliha";
		ogrenciler[1]="Fatma";
		ogrenciler[2]="Çaðla";
		
		for(int i=0; i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("---------------------");
		
		for(String o:ogrenciler) {
			System.out.println(o);
		}

	}

}
