package switchDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		
		switch(grade) {
		case 'A':
			System.out.println("Mükemmel geçtiniz");
			break;
		case 'B':
			System.out.println("Çok güzel geçtiniz");
			break;
		case 'C':
			System.out.println("Ýyi, geçtiniz");
			break;
		case 'D':
			System.out.println("Fena deðil büte kaldýnýz");
			break;
		case 'F':
			System.out.println("Maalesef Kaldýnýz");
			break;
			default:
				System.out.println("Geçersiz not girdiniz");
		
		}

	}

}
