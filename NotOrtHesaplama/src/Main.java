import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat,fzk,kimya,turkce,tarih,muzik;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Matematik notu: ");
		mat=scanner.nextInt();
		
		System.out.println("Fizik notu: ");
		fzk=scanner.nextInt();
		
		System.out.println("Kimya notu: ");
		kimya=scanner.nextInt();
		
		System.out.println("Türkçe notu: ");
		turkce=scanner.nextInt();
		
		System.out.println("Tarih notu: ");
		tarih=scanner.nextInt();
		
		System.out.println("Muzik notu: ");
		muzik=scanner.nextInt();
	
		
		double toplam=(mat +fzk +turkce + tarih +kimya +muzik);
		double sonuc =toplam/6;
		while(sonuc>=60) {
			System.out.println("gecti");
			break;
		}
		System.out.println("kaldý");
		
		

	}

}
