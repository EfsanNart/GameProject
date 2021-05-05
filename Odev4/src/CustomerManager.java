
public class CustomerManager implements CustomerService{
	
	 AuthorizeService authorizeService;

	    public CustomerManager(AuthorizeService authorizeService) {
	        this.authorizeService = authorizeService;
	    }
	
	
	

	@Override
	public void login(Customer customer) {
		
		  if (authorizeService.verify(customer))
	        {
	            System.out.println("Kullanýcý Giriþi Baþarýlý!");

	        }
	        else {
	            System.out.println("Kullanýcý giriþi baþarýsýz!");
	        }
	}

	@Override
	public void update(Customer customer) {
		 System.out.println(customer.getFirstName()+" "+ customer.getLastName()+" isimli kullanýcýnýn güncellemesi yapýldý.");
	}

	@Override
	public void delete(Customer customer) {
		 System.out.println(customer.getFirstName()+" "+ customer.getLastName()+" isimli kullanýcý silindi.");
		
	}

}
