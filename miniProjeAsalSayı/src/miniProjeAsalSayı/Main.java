package miniProjeAsalSay�;

public class Main {

	public static void main(String[] args) {
		int number =43;
		boolean isPrime =true;
		
		if(number==1) {
			System.out.println("asal de�ildir");
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
			System.out.println("say� asald�r");
		}else {
			System.out.println("say� asal de�ildir");
		}

	}

}
