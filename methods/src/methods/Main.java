package methods;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          sayiBulmaca();
	}
	public static void sayiBulmaca() {
		int[] sayilar= new int[] {1,2,4,5,6};
		int aranacak=4;
		boolean varM�=false;
		
		for(int sayi: sayilar) {
			if(sayi==aranacak) {
				varM�=true;
				break;
			}
		}
		
		if(varM�) {
			System.out.println("sayi mevcuttur:" +aranacak);
		}
		
		
	}

}
