package staticDemo;

public class ProductManager {
	public void add(Product product) {
	
				if(ProductValidator.IsValid(product)) {
					System.out.println("eklendi");
				}else {
					System.out.println("ürün bilgileri geçersizdir");
				}
		
	}
}
