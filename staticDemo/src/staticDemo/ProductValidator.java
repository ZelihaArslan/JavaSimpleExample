package staticDemo;

public class ProductValidator {
	
	public static boolean IsValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public static class guncelle{
		public static void Sil() {
			
		}
	}
	
}
