
public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager= new NeroCustomerManager();
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setDateOfBirth(1994);
		customer.setFirstName("Zeliha");
		customer.setLastName("Arslan");
		customer.setNationalityId("1221232423");
	
	}
}
