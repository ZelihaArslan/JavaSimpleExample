package stringsDemo;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = "Bug�n hava �ok g�zel";
		
		System.out.println(mesaj);
		
		
		  System.out.println("Eleman say�s�:" +mesaj.length());
		  System.out.println("5.eleman:" + mesaj.charAt(4)); //dizinin 4. eleman�
		  System.out.println(mesaj.concat(" Ya�as�n!")); //bu kelime ile c�mleyi birle�tir 
		  System.out.println(mesaj.startsWith("B"));
		  System.out.println(mesaj.endsWith(".")); //c�mlenin sonu nokta ile bitiyorsa  true bitmiyorsa false 
		  char[] karakterler =new char[25]; mesaj.getChars(0, 5,karakterler, 0); //karakterler ad�ndaki diziye ilk 5 karakteri getir
		  System.out.println(karakterler); 
		  System.out.println(mesaj.indexOf('a')); //mesaj�n i�inde ka��nc� eleman ilk buldu�u
		  System.out.println(mesaj.lastIndexOf('a')); //aramaya sa�dan ba�lar
		 	
	
		String yeniMesaj =mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5)); //2.indexten itibarenini al�r 5 e kadar
		
		for(String kelime: mesaj.split(" ")) { //bo�luklara kadar olan kelimeleri tek tek al�r
			System.out.println(kelime); 
		}
		
		System.out.println(mesaj.toLowerCase()); //k���k harfe �evir
		System.out.println(mesaj.toUpperCase()); 
		System.out.println(mesaj.trim()); //ba�taki ve sondaki bo�luklar� al�r
		
	}

}
