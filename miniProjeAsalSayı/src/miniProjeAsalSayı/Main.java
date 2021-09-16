package miniProjeAsalSayý;

public class Main {

	public static void main(String[] args) {
		int number =43;
		boolean isPrime =true;
		
		if(number==1) {
			System.out.println("asal deðildir");
			return;
		}
		if(number<1) {
			System.out.println("gecersiz");
			return;
		}
		
		for(int i=2;i<number;i++) {
			if(number %i == 0) {
				isPrime =false;
			}
		}
		if(isPrime ==true)
		{
			System.out.println("sayý asaldýr");
		}else {
			System.out.println("sayý asal deðildir");
		}

	}

}
