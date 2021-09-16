package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String [][] sehirler =new String[3][3];
		sehirler[0][0] ="Ankara";
		sehirler[0][1] ="Bursa";
		sehirler[0][2] ="Ýstanbul";
		sehirler[1][0] ="Bilecik";
		sehirler[1][1] ="Kütahya";
		sehirler[1][2] ="Sakarya";
		sehirler[2][0] ="Kocaeli";
		sehirler[2][1] ="Ýzmir";
		sehirler[2][2] ="Aydýn";
		
		
		for(int i=0; i<=2;i++) {
			for(int j=0; j<=2; j++) {
				System.out.println(sehirler[i][j]);
			}
				
		}
	}

}
