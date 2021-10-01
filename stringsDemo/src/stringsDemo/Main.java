package stringsDemo;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = "Bugün hava çok güzel";
		
		System.out.println(mesaj);
		
		
		  System.out.println("Eleman sayýsý:" +mesaj.length());
		  System.out.println("5.eleman:" + mesaj.charAt(4)); //dizinin 4. elemaný
		  System.out.println(mesaj.concat(" Yaþasýn!")); //bu kelime ile cümleyi birleþtir 
		  System.out.println(mesaj.startsWith("B"));
		  System.out.println(mesaj.endsWith(".")); //cümlenin sonu nokta ile bitiyorsa  true bitmiyorsa false 
		  char[] karakterler =new char[25]; mesaj.getChars(0, 5,karakterler, 0); //karakterler adýndaki diziye ilk 5 karakteri getir
		  System.out.println(karakterler); 
		  System.out.println(mesaj.indexOf('a')); //mesajýn içinde kaçýncý eleman ilk bulduðu
		  System.out.println(mesaj.lastIndexOf('a')); //aramaya saðdan baþlar
		 	
	
		String yeniMesaj =mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5)); //2.indexten itibarenini alýr 5 e kadar
		
		for(String kelime: mesaj.split(" ")) { //boþluklara kadar olan kelimeleri tek tek alýr
			System.out.println(kelime); 
		}
		
		System.out.println(mesaj.toLowerCase()); //küçük harfe çevir
		System.out.println(mesaj.toUpperCase()); 
		System.out.println(mesaj.trim()); //baþtaki ve sondaki boþluklarý alýr
		
	}

}
