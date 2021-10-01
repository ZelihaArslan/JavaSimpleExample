package classesWithAttiributes;

public class Main {

	public static void main(String[] args) {
		Product product =new Product(1,"Laptop","Lenovo",7000);
	
		/*
		 * product.setName("Laptop"); product.setId(1);
		 * product.setDescription("LENOVO"); product.setStockAmount(6);
		 * product.setPrice(7000);
		 */
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println();
		
	
	}

}
