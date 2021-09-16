package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'K';
		int i=0;
		int j=0;
		
		char inceSesli[]= {'E','Ý','Ö','Ü'};
		char kalinSesli[]= {'A','I','O','U'};
		
	  for(i=0;i<inceSesli.length;i++) {
		  if(harf==inceSesli[i]) {
			  System.out.println("ince seslidir");
			  return;
		  }
	  }
	  for(j=0;j<kalinSesli.length;j++) {
		  if(harf==kalinSesli[j]) {
			  System.out.println("kalýn seslidir");
			  return;
		  }
		
	  }
	  if(harf!=inceSesli.length && harf!=kalinSesli.length) {
		  System.out.println("sesli harf deðildir");
		  return;
	  }

	}

}
