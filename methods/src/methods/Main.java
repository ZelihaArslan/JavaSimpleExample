package methods;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          sayiBulmaca();
	}
	public static void sayiBulmaca() {
		int[] sayilar= new int[] {1,2,4,5,6};
		int aranacak=4;
		boolean varMý=false;
		
		for(int sayi: sayilar) {
			if(sayi==aranacak) {
				varMý=true;
				break;
			}
		}
		
		if(varMý) {
			System.out.println("sayi mevcuttur:" +aranacak);
		}
		
		
	}

}
