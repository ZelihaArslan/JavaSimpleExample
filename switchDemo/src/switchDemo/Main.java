package switchDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		
		switch(grade) {
		case 'A':
			System.out.println("M�kemmel ge�tiniz");
			break;
		case 'B':
			System.out.println("�ok g�zel ge�tiniz");
			break;
		case 'C':
			System.out.println("�yi, ge�tiniz");
			break;
		case 'D':
			System.out.println("Fena de�il b�te kald�n�z");
			break;
		case 'F':
			System.out.println("Maalesef Kald�n�z");
			break;
			default:
				System.out.println("Ge�ersiz not girdiniz");
		
		}

	}

}
